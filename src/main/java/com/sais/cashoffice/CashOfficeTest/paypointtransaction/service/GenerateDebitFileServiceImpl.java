package com.sais.cashoffice.CashOfficeTest.paypointtransaction.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Clob;
import java.sql.Date;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.CashOfficeTestApplication;
import com.sais.cashoffice.CashOfficeTest.entities.TPpCrFileFormatHdr;
import com.sais.cashoffice.CashOfficeTest.entities.TPpTemplate;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.PaypointTemplateRepository;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.TPpCrFileFormatHdrRepository;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.GenDebitFileForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.GenerateDebitFileResponse;
import com.sais.cashoffice.exception.Response;

@Service
public class GenerateDebitFileServiceImpl implements GenerateDebitFileService {

	private static final Logger LOGGER = LogManager.getLogger(GenerateDebitFileServiceImpl.class);
	public static final Path tempDebits = Paths.get("Tempdebits");

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	PaypointTemplateRepository ppTmplrepo;

	@Override
	public ResponseEntity<?> generateManualDebitFile(GenDebitFileForm form) {
		GenerateDebitFileResponse response = new GenerateDebitFileResponse();
		// String xmlDir = strTemplatePath;
		String xmlDir = tempDebits.toUri().toString();

		try {
			response = fetchXmlResultSet(form, xmlDir);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}

	private GenerateDebitFileResponse fetchXmlResultSet(GenDebitFileForm form, String xmlDir) throws Exception {
		Reader clobReader = null;
		FileWriter xmlFileWriter = null;
		TPpTemplate templateDetails = ppTmplrepo.findByPaypointId(form.getPaypointId());
		GenerateDebitFileResponse result = new GenerateDebitFileResponse();
		try {
			// "PE_GENERATE_DR_RECS" this is the name of your procedure
			StoredProcedureQuery query = entityManager.createStoredProcedureQuery("PE_GENERATE_DR_RECS");

			// Declare the parameters in the same order
			query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(2, Date.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(3, Date.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(5, Double.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(6, Double.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(7, Character.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(8, Character.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(9, Long.class, ParameterMode.OUT);
			query.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);
			query.registerStoredProcedureParameter(11, Double.class, ParameterMode.OUT);
			query.registerStoredProcedureParameter(12, Integer.class, ParameterMode.OUT);
			query.registerStoredProcedureParameter(13, String.class, ParameterMode.OUT);
			query.registerStoredProcedureParameter(14, String.class, ParameterMode.OUT);

			// Pass the parameter values
			query.setParameter(1, form.getPaypointId());
			query.setParameter(2, form.getPeriod());
			query.setParameter(3, form.getStrikeDateFrom());
			query.setParameter(4, form.getStrikeDateTo());

			query.setParameter(5, templateDetails.getPpTemplateId());
			query.setParameter(6, templateDetails.getPpAttributeId());
			query.setParameter(7, templateDetails.getPensionOnlyYn());
			query.setParameter(8, templateDetails.getOtherPremOnlyYn());

			// Execute query
			query.execute();

			// Get output parameters
			Clob debitData = (Clob) query.getOutputParameterValue(9);
			String FileName = (String) query.getOutputParameterValue(10);
			Long headerId = (Long) query.getOutputParameterValue(11);
			Long status = (Long) query.getOutputParameterValue(12);
			String message = (String) query.getOutputParameterValue(13);
			String outMessage = (String) query.getOutputParameterValue(14);

			result.setErrorMsg(message);
			result.setStatus(status);
			result.setHeaderId(headerId);

			if (status == 1) {
				char[] clobVal = new char[4096];
				int read = 0;
				clobReader = debitData.getCharacterStream();
				File reportFileDir = new File(xmlDir);
				if (!reportFileDir.exists()) {
					boolean createReportDir = reportFileDir.mkdir();
					LOGGER.debug("Created Reports Dir : " + createReportDir);
				}
				LOGGER.debug("XML FILE    ---------------->" + xmlDir + File.separator + FileName);
				xmlFileWriter = new FileWriter(xmlDir + File.separator + FileName);

				while ((read = clobReader.read(clobVal)) != -1) {
					xmlFileWriter.write(clobVal, 0, read);

				}

				if (clobReader != null) {
					clobReader.close();
				}

				if (xmlFileWriter != null) {
					xmlFileWriter.close();
				}

			} else {
				// generateDebitResponseDTO.setErrorMsg(errorMsg);
				throw new Exception("Not able to Generate Debit File. Please Check Log file");
			}
			return result;
		} catch (SQLException e) {
			LOGGER.error("Error Occured1 : ", e);
			e.printStackTrace();
			throw new Exception("Error Occured while Generating XML information.");
		} catch (IOException e) {
			LOGGER.error("Error Occured : ", e);
			e.printStackTrace();
			throw new Exception("Error Occured while writing XML  result set.");
		}

	}

}
