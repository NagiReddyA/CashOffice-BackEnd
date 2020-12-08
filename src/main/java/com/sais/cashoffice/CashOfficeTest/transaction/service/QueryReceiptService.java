package com.sais.cashoffice.CashOfficeTest.transaction.service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.transaction.model.QueryReceiptForm;

public interface QueryReceiptService {
	
	public List<QueryReceiptForm> getReceipt();
	
	public List<QueryReceiptForm> getCashierDetails();
	
	public List<QueryReceiptForm> getRcptDetails(String cond);
	
	public List<QueryReceiptForm> getRcptDetailsWithID(double No);
	
	public List<QueryReceiptForm> getRcptDtlsWithID(double No);
	
	
}
