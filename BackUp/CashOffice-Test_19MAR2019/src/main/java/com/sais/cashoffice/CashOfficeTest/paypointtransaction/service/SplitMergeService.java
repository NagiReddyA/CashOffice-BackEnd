package com.sais.cashoffice.CashOfficeTest.paypointtransaction.service;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sais.cashoffice.CashOfficeTest.entities.TPaypointDrHdr;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.SplitDebitFileForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.SplitMergeSearchForm;


public interface SplitMergeService {

	ResponseEntity<?> splitDebitFile(SplitDebitFileForm form);

	ResponseEntity<?> mergeDebitFiles(SplitDebitFileForm form) throws Exception;

	List<SplitDebitFileForm> getEligibleDebitFilesForSplitMerge(Date date);

	List<SplitMergeSearchForm> getSplitFiles(Date period, String paypointId);
	List<SplitMergeSearchForm> getMergeFiles(Date period, String paypointId);
}
