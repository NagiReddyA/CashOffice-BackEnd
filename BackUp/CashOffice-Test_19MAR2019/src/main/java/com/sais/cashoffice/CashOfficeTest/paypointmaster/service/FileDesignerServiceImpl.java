package com.sais.cashoffice.CashOfficeTest.paypointmaster.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sais.cashoffice.CashOfficeTest.entities.TPpCrFileFormatHdr;
import com.sais.cashoffice.CashOfficeTest.entities.TPpCrFileFormatLine;
import com.sais.cashoffice.CashOfficeTest.entities.TPpTemplate;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.FileDesignerHdrForm;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.FileDesignerhdrLinesForm;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.TPpCrFileFormatHdrRepository;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.TPpCrFileFormatLineRepository;
import com.sais.cashoffice.exception.ErrorDetails;
import com.sais.cashoffice.exception.Response;

@Service
public class FileDesignerServiceImpl implements FileDesignerService {

	@Autowired
	ModelMapper modelmapper;

	@Autowired
	TPpCrFileFormatHdrRepository hdrRepo;

	@Autowired
	TPpCrFileFormatLineRepository ffLinesRepo;

	@Override
	@Transactional
	public ResponseEntity<?> saveFileFormatHdrDetails(FileDesignerhdrLinesForm form) {
		String message = "";
		Response resp = null;
		TPpCrFileFormatHdr id = null;
		TPpCrFileFormatLine flId = null;
		try {
			TPpCrFileFormatHdr ffh = modelmapper.map(form, TPpCrFileFormatHdr.class);
			ffh.setNoOfCreditHdrLines(Long.valueOf(form.getNoOfCrHdrLines()));
			ffh.setPaypointId(form.getPpId());
			ffh.setPaypointName(form.getPpName());
			ffh.setCreationDate(new Date());
			TPpCrFileFormatHdr tpt = hdrRepo.findByPaypointId(form.getPpId());
			if (tpt != null) {
				ffh.setPaypointFileId(tpt.getPaypointFileId());
				id = hdrRepo.save(ffh);
				message = message + "Updated data into T_PP_CR_FILE_FORMAT_HDR for paypoint " + id.getPaypointId();
			} else {
				id = hdrRepo.save(ffh);
				message = message + "Inserted data into T_PP_CR_FILE_FORMAT_HDR for paypoint " + id.getPaypointId()
						+ " generated record id :" + id.getPaypointFileId();
			}
			if (form.getFieldName() != null) {
				TPpCrFileFormatLine ffl = modelmapper.map(form, TPpCrFileFormatLine.class);
				ffl.setPaypointId(id.getPaypointId());
				ffl.setPaypointName(id.getPaypointName());
				ffl.setPpFileId(id.getPaypointFileId());
				ffl.setLineType("LINES");
				TPpCrFileFormatLine tffl = ffLinesRepo.findByPpFileIdAndFieldName(id.getPaypointFileId(),
						ffl.getFieldName());
				if (tffl != null) {
					ffl.setPpFileFormatId(tffl.getPpFileFormatId());
					ffl.setFieldSequence(tffl.getFieldSequence());
					flId = ffLinesRepo.save(ffl);
					message = message + " Updated data into T_PP_CR_FILE_FORMAT_LINE for fileFormat Id "
							+tffl.getPpFileFormatId();
				} else {
					ffl.setFieldSequence(ffLinesRepo.getMaxSequenceByFileId(id.getPaypointFileId()) + 1);
					flId = ffLinesRepo.save(ffl);
					message = message + " inserted data into T_PP_CR_FILE_FORMAT_LINES for paypoint "
							+ flId.getPaypointId() + " generated record id :" + flId.getPpFileFormatId();
				}

			}
			resp=new Response(200, message);
			return new ResponseEntity<>(resp, HttpStatus.OK);
		} catch (Exception e) {
			
			message = "Failed to Assign File to paypoint" + form.getPpId() + " !";
			ErrorDetails error = new ErrorDetails(new Date(), message, null);
			return new ResponseEntity<>(error, HttpStatus.EXPECTATION_FAILED);
		}
	}

	@Override
	public List<FileDesignerHdrForm> findAllAssignedFileDetails() {
		List<FileDesignerHdrForm> list = new ArrayList<FileDesignerHdrForm>();
		hdrRepo.findAll().forEach((hdr) -> {
			FileDesignerHdrForm fdhf = new FileDesignerHdrForm();
			fdhf.setPpId(hdr.getPaypointId());
			fdhf.setPpName(hdr.getPaypointName());
			fdhf.setPaypointFileId(hdr.getPaypointFileId());
			fdhf.setFileName(hdr.getFileName());
			fdhf.setCurrency(hdr.getCurrency());
			fdhf.setNoOfCrHdrLines(String.valueOf(hdr.getNoOfCreditHdrLines()));
			list.add(fdhf);
		});
		return list;

	}

	@Override
	public List<FileDesignerhdrLinesForm> findAllAssignedFieldDetails(long ppId) {
		List<FileDesignerhdrLinesForm> list = new ArrayList<FileDesignerhdrLinesForm>();
		ffLinesRepo.findByPpFileId(hdrRepo.findByPaypointId(ppId).getPaypointFileId()).forEach((hdrl) -> {
			FileDesignerhdrLinesForm fdhl = new FileDesignerhdrLinesForm();
			fdhl.setFieldSequence((long) hdrl.getFieldSequence());
			fdhl.setFieldName(hdrl.getFieldName());
			fdhl.setDelimiter(hdrl.getDelimiter());
			fdhl.setStartPosition(hdrl.getStartPosition());
			fdhl.setEndPosition(hdrl.getEndPosition());
			fdhl.setLength(hdrl.getLength());
			fdhl.setDatatype(hdrl.getDataType());
			fdhl.setConstants(hdrl.getConstants());
			fdhl.setPpFileFormatId(hdrl.getPpFileFormatId());
			fdhl.setPpId(ppId);
			fdhl.setPaypointFileId(hdrRepo.findByPaypointId(ppId).getPaypointFileId());
			list.add(fdhl);
		});
		return list;
	}

	@Override
	public ResponseEntity<String> deleteFieldWithId(long id) {
		try {
			ffLinesRepo.deleteById(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}

	}
}
