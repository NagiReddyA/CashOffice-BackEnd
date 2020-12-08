package com.sais.cashoffice.CashOfficeTest.paypointtransaction.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.AssignDbtFileTmpt;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.CreditFileUploadForm;

public interface CreditFileUploadService {

	ResponseEntity<?> uploadCreditFile(CreditFileUploadForm formData, MultipartFile file) throws Exception;

}
