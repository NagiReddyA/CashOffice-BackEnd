package com.sais.cashoffice.CashOfficeTest.transaction.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sais.cashoffice.CashOfficeTest.transaction.model.QueryReceiptForm;
import com.sais.cashoffice.CashOfficeTest.transaction.repository.CancelReceiptRepository;

@Service
public class CancelReceiptImpl implements CancelReceiptService{

	@Autowired
	private CancelReceiptRepository cancelRepository;
	
	@Override
	public void CancelReceipt(double No, String Reason, String User) {	
		cancelRepository.CancelReceipt(No, Reason, User); 
	}
	
	@Override
	public void ApproveCancelReceipt(double No, String Status, String User) {	
		cancelRepository.ApproveCancelReceipt(No, Status, User); 
	}

	@Override
	public List<QueryReceiptForm> ApprCancelQuery() {		
		List<QueryReceiptForm> appFormList1 = new ArrayList<QueryReceiptForm>();
		List<Object[]> appList = cancelRepository.ApprCancelQuery();
		if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				QueryReceiptForm appForm = new QueryReceiptForm();
				appForm.setRECEIPT_NO((double) object[0]);
				appForm.setRECEIPT_DATE((Date) object[1]);
				appForm.setCASHIER_NAME((String) object[2]); 
				appForm.setPOSTING_STATUS((char) object[3]);
				
				appFormList1.add(appForm);				
			}	
		}	
		return appFormList1;
	}
}
