package com.sais.cashoffice.CashOfficeTest.transaction.service;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.transaction.model.QueryReceiptForm;


public interface CancelReceiptService {
	
	public void CancelReceipt(double No, String Reason, String User);
	
	public void ApproveCancelReceipt(double No, String Status, String User);
	
	public List<QueryReceiptForm> ApprCancelQuery();

}
