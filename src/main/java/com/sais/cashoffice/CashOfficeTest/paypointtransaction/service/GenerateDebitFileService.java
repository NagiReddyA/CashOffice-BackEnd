package com.sais.cashoffice.CashOfficeTest.paypointtransaction.service;

import org.springframework.http.ResponseEntity;

import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.GenDebitFileForm;

public interface GenerateDebitFileService {

	ResponseEntity<?> generateManualDebitFile(GenDebitFileForm form);

}
