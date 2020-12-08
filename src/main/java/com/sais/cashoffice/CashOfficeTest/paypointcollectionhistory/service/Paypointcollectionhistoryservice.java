package com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.model.PaypointCollectionHistory;


public interface Paypointcollectionhistoryservice {

	
	List<PaypointCollectionHistory> getpaypointdetailscollection(BigDecimal paypoint);
}
