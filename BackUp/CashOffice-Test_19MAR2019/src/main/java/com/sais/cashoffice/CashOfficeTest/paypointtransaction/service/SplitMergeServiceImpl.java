package com.sais.cashoffice.CashOfficeTest.paypointtransaction.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.entities.TPayPoint;
import com.sais.cashoffice.CashOfficeTest.entities.TPaypointDrHdr;
import com.sais.cashoffice.CashOfficeTest.entities.TSplitMergeFile;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.PaypointRepository;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.SplitDebitFileForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.SplitMergeSearchForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.repository.TpaypointDrHdrRepository;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.repository.TsplitMergeFilesRepository;
import com.sais.cashoffice.exception.ErrorDetails;
import com.sais.cashoffice.exception.Response;

@Service
public class SplitMergeServiceImpl implements SplitMergeService {
	private static final Logger LOGGER = LogManager.getLogger(SplitMergeServiceImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	ModelMapper modelmapper;

	@Autowired
	TsplitMergeFilesRepository smFileRepo;

	@Autowired
	TpaypointDrHdrRepository drHdrRepo;

	@Autowired
	PaypointRepository ppRepo;
	
	// this method converts angular date string to java date
		public static Date convertToDate(String period) throws Exception {
			Date date = null;
			try {
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				date = df.parse(period);
			} catch (Exception e) {
				throw new Exception("Date Conversion Error");
			}
			return date;
		}

	@Override
	@Transactional
	public ResponseEntity<?> splitDebitFile(SplitDebitFileForm form) {
		LOGGER.debug("ONCLICK split files INVOKED");

		try {

			int noOfRecordsPerFile = form.getFilesize();
			LOGGER.debug("File Size : " + noOfRecordsPerFile);

			Map<String, String> splitFileMap = FileSplit.getSplitFilePath();
			LOGGER.debug("Split File Map : " + splitFileMap);

			Collection<String> splitFileNames = FileSplit.splitFiles(noOfRecordsPerFile, form.getFileName(),
					splitFileMap);

			if (splitFileNames.isEmpty()) {
				LOGGER.warn("Cannot Insert");
				// this.alert("Cannot split the selected file");
				return null;
			}

			this.insertSplitFileName(form, noOfRecordsPerFile, splitFileNames);

			// this.alert("Splitted Successfully");

		} catch (IOException e) {
			LOGGER.error("Error Occured : ", e);
			// this.alert("File Not Found");
		}
		return null;
	}

	@Transactional
	public void insertSplitFileName(SplitDebitFileForm form, int noOfRecPerFile, Collection<String> splitFileNames) {
		LOGGER.info("InsertSpliteFileName Method Invoked");

		for (Iterator<String> itr = splitFileNames.iterator(); itr.hasNext();) {
			String fileName = itr.next();
			TSplitMergeFile tsm = modelmapper.map(form, TSplitMergeFile.class);
			tsm.setFilename(fileName);
			tsm.setPeriod(form.getPeriod());
			tsm.setStrikeDateFrom(form.getStrikeDayFrom());
			tsm.setStrikeDateTo(form.getStrikeDayTo());
			tsm.setMerged("N");
			tsm.setSplit("Y");
			tsm.setNumberOfRecords(noOfRecPerFile);
			tsm.setPaypointId(form.getPayPointId());
			tsm.setCreationDate(new Date());
			tsm.setModifiedDatetime(new Date());

			// TSplitMergeFile id=smFileRepo.findByFilename(fileName);

			smFileRepo.save(tsm);
		}

	}

	@Override
	@Transactional
	public ResponseEntity<?> mergeDebitFiles(SplitDebitFileForm requestForm) throws Exception {
		int noOfLinesAfterMerge = 0;
		String message = "";
		// String mergeFileName = null;
		List<SplitDebitFileForm> filesList = requestForm.getFileNames();
		SplitDebitFileForm form = filesList.get(0);
		long paypointId = form.getPayPointId();
		for (SplitDebitFileForm tpdh : filesList) {
			if (paypointId != tpdh.getPayPointId()) {
				message = "Cannot merge files across paypoints";
				throw new Exception(message);
			}
			noOfLinesAfterMerge = noOfLinesAfterMerge + tpdh.getNoOfAvailableRecords();
		}
		try {

			Map<String, String> mergeFileMap = FileMerge.getMergeFilePath();

			FileMerge.mergeFiles(filesList, form.getFileName(), mergeFileMap);

			insertMergeFileName(form, noOfLinesAfterMerge);

			message = "Successfully merged Debit files";
			Response res = new Response(200, message);
			return new ResponseEntity<>(res, HttpStatus.OK);
		}

		catch (IOException e) {
			// this.alert("File Not Found");
			LOGGER.error("Error occured in during SplitFiles Operation", e);
			message = "File Not Found !";
			ErrorDetails error = new ErrorDetails(new Date(), message, null);
			return new ResponseEntity<>(error, HttpStatus.EXPECTATION_FAILED);
		}

		catch (DataAccessException dae) {
			LOGGER.error("Error Occured : ", dae);
			message = "Error while merging DebitFiles ";
			ErrorDetails error = new ErrorDetails(new Date(), message, null);
			return new ResponseEntity<>(error, HttpStatus.EXPECTATION_FAILED);
		}
	}

	@Transactional
	private void insertMergeFileName(SplitDebitFileForm splitDebitFileForm, int noOfLinesAfterMerge) {

		TSplitMergeFile tsm = modelmapper.map(splitDebitFileForm, TSplitMergeFile.class);
		tsm.setFilename(splitDebitFileForm.getFileName());
		tsm.setPeriod(splitDebitFileForm.getPeriod());
		tsm.setStrikeDateFrom(splitDebitFileForm.getStrikeDayFrom());
		tsm.setStrikeDateTo(splitDebitFileForm.getStrikeDayTo());
		tsm.setMerged("Y");
		tsm.setSplit("N");
		tsm.setNumberOfRecords(noOfLinesAfterMerge);
		tsm.setPaypointId(splitDebitFileForm.getPayPointId());
		tsm.setCreationDate(new Date());
		tsm.setModifiedDatetime(new Date());

		smFileRepo.save(tsm);
	}

	@Override
	public List<SplitDebitFileForm> getEligibleDebitFilesForSplitMerge(Date date) {
		List<SplitDebitFileForm> result = new ArrayList<SplitDebitFileForm>();
		List<TPaypointDrHdr> list = drHdrRepo.findByPeriodAndFileStatus(date, "G");
		list.sort(Comparator.comparing(TPaypointDrHdr::getPaypointId));
		for (TPaypointDrHdr rec : list) {
			TPayPoint pp = ppRepo.findByPayPointId(rec.getPaypointId());
			if (pp != null) {
				SplitDebitFileForm sdf = new SplitDebitFileForm();
				sdf.setPayPointId(rec.getPaypointId());
				sdf.setPaypointName(pp.getPayPointName());
				sdf.setFileName(rec.getFileName());
				sdf.setStrikeDayFrom(rec.getStrikeDateFrom());
				sdf.setStrikeDayTo(rec.getStrikeDateTo());
				sdf.setPeriod(date);
				sdf.setNoOfAvailableRecords((int) rec.getNoOfAvailableRecs());
				sdf.setPpHdrId(rec.getPpDrHdrId());
				result.add(sdf);
			}
		}
		return result;
	}

	@Override
	public List<SplitMergeSearchForm> getSplitFiles(Date period, String paypointId) {

		List<TSplitMergeFile> result = smFileRepo.findByPeriodAndPaypointIdAndSplit(period, Long.valueOf(paypointId),
				"Y");
		List<SplitMergeSearchForm> response = new ArrayList<SplitMergeSearchForm>();
		for (TSplitMergeFile ts : result) {
			TPayPoint pp = ppRepo.findByPayPointId(ts.getPaypointId());
			if (pp != null) {
				SplitMergeSearchForm sf = new SplitMergeSearchForm();
				sf = modelmapper.map(ts, SplitMergeSearchForm.class);
				sf.setPaypointName(pp.getPayPointName());
				sf.setSplitmergeFileName(ts.getFilename());
				sf.setFilename(drHdrRepo.findByPaypointIdAndPeriodAndStrikeDateFromAndStrikeDateTo(ts.getPaypointId(), ts.getPeriod(),ts.getStrikeDateFrom(),ts.getStrikeDateTo()).getFileName());
				response.add(sf);
			}
		}
		return response;
	}

	@Override
	public List<SplitMergeSearchForm> getMergeFiles(Date period, String paypointId) {
		
		List<TSplitMergeFile> result = smFileRepo.findByPeriodAndPaypointIdAndMerged(period, Long.valueOf(paypointId),
				"Y");
		List<SplitMergeSearchForm> response = new ArrayList<SplitMergeSearchForm>();
		for (TSplitMergeFile ts : result) {
			TPayPoint pp = ppRepo.findByPayPointId(ts.getPaypointId());
			if (pp != null) {
				SplitMergeSearchForm sf = new SplitMergeSearchForm();
				sf = modelmapper.map(ts, SplitMergeSearchForm.class);
				sf.setPaypointName(pp.getPayPointName());
				sf.setSplitmergeFileName(ts.getFilename());
				sf.setFilename(drHdrRepo.findByPaypointIdAndPeriodAndStrikeDateFromAndStrikeDateTo(ts.getPaypointId(), ts.getPeriod(),ts.getStrikeDateFrom(),ts.getStrikeDateTo()).getFileName());
				response.add(sf);
			}
		}
		return response;
	}

}
