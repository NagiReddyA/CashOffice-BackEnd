package com.sais.cashoffice.CashOfficeTest.transaction.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.transaction.model.QueryReceiptForm;
import com.sais.cashoffice.CashOfficeTest.transaction.repository.QueryReceiptRepository;
@Service
public class QueryServiceImpl implements QueryReceiptService{
	
	@Autowired
	private QueryReceiptRepository queryRepository;

//	@Override
//	public List<QueryReceiptForm> getReceipt(String rcptno, String fd, String td, String cashier) {		
//		List<QueryReceiptForm> appFormList1 = new ArrayList<QueryReceiptForm>();
//	     List<Object[]> appList = queryRepository.receiptdetails(rcptno,fd, td, cashier);
//	
//	
	@Override
	public List<QueryReceiptForm> getReceipt() {		
		List<QueryReceiptForm> appFormList1 = new ArrayList<QueryReceiptForm>();
	     List<Object[]> appList = queryRepository.receiptdetails();
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
	
//	@Autowired
//	private QueryReceiptRepository queryRepository;
//	
	@Override
	public List<QueryReceiptForm> getCashierDetails() {		
		List<QueryReceiptForm> appFormList2 = new ArrayList<QueryReceiptForm>();
		//System.out.println("Call QR SERVICE");
	    List<Object[]> appList = queryRepository.cashierdetails();
	    	if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				QueryReceiptForm appForm = new QueryReceiptForm();
				appForm.setCASHIER_CODE((String) object[0]);
				appForm.setCASHIER_NAME((String) object[1]); 
				appForm.setLOGIN_ID((String) object[2]); 
				appForm.setBRANCH_CODE((String) object[3]);
				
				appFormList2.add(appForm);		
			
			}	
			}
		
		return appFormList2;
	}
	
	@Override
	public List<QueryReceiptForm> getRcptDetails(String cond) {		
		List<QueryReceiptForm> appFormList2 = new ArrayList<QueryReceiptForm>();
		System.out.println("Call RCPT SERVICE"+cond);
	    List<Object[]> appList = queryRepository.getRcptList(cond);
	    	if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				QueryReceiptForm appForm = new QueryReceiptForm();
				appForm.setRECEIPT_NO((double) object[0]);
				appForm.setRECEIPT_DATE((Date) object[1]);
				appForm.setCASHIER_NAME((String) object[2]); 
				appForm.setPOSTING_STATUS((char) object[3]);
				
				appFormList2.add(appForm);				
			}	
			}
		
		return appFormList2;
	}
	
	@Override
	public List<QueryReceiptForm> getRcptDetailsWithID(double No) {		
		List<QueryReceiptForm> appFormList2 = new ArrayList<QueryReceiptForm>();
		System.out.println("Call QR SERVICE RCPT NO:" + No);
	    List<Object[]> appList = queryRepository.searchDetailswithID(No);
	    System.out.println(appList);
	    	if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				QueryReceiptForm appForm = new QueryReceiptForm();
				appForm.setRECEIPT_NO((double) object[0]);
				appForm.setRECEIPT_DATE((Date) object[1]);
				appForm.setCASHIER_NAME((String) object[2]); 
				appForm.setPOSTING_STATUS((char) object[3]);
				
				appFormList2.add(appForm);		
			
			}	
			}
		
		return appFormList2;
	}
	
	public List<QueryReceiptForm> getRcptDtlsWithID(double No) {	
		
		List<QueryReceiptForm> appFormList1 = new ArrayList<QueryReceiptForm>();
	     List<Object[]> appList = queryRepository.receiptDetailsWithID(No);
	    	if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				QueryReceiptForm appForm = new QueryReceiptForm();
				appForm.setRCPT_TRN_ID((double) object[0]);
				appForm.setRECEIPT_NO((double) object[1]);
				appForm.setRECEIPT_DATE((Date) object[2]);
				appForm.setRECEIPT_AMOUNT((BigDecimal) object[3]);
				appForm.setRECEIVED_FROM((String) object[4]);
				appForm.setPAY_METHOD_ID((double) object[5]);
				appForm.setCASH_OFFICE_ID((double) object[6]);
				appForm.setCASHIER_ID((double) object[7]);
				appForm.setPOSTING_STATUS((char) object[8]);
				appForm.setPOSTING_REFERENCE((BigDecimal) object[9]);
				appForm.setPOSTING_DATETIME((Date) object[10]); 
				appForm.setCANCELLATION_REASON((String) object[11]);
				appForm.setCOMMENTS((String) object[12]);
				appForm.setPAY_METHOD_CODE((String) object[13]); 
				appForm.setCASH_OFFICE_CODE((String) object[14]);
				appForm.setCASHIER_CODE((String) object[15]);
				appForm. setCASHIER_NAME((String) object[16]); 
				appForm.setLOGIN_ID((String) object[17]); 
				//appForm.setPYMT_DET_TRN_ID((double) object[18]);
				appForm.setREFERENCE_NUMBER((String) object[19]);
				appForm. setREFERENCE_DATE((Date) object[20]); 
				appForm. setBANK_ID((BigDecimal) object[21]); 
				appForm.setBANK_BRANCH_ID((BigDecimal) object[22]); 
				appForm.setDRAWEE((String) object[23]);
				appForm.setRCPT_ALL_ID((double) object[24]);
				appForm. setAPP_ID((double) object[25]); 
				appForm.setALLOCATED_AMOUNT((BigDecimal) object[26]);
				appForm.setAPP_CODE((String) object[27]);
				appForm. setAPP_DESC((String) object[28]); 
				appForm. setVALUE_MEANING((String) object[29]);
				
				appFormList1.add(appForm);
			
			
			  }	
			}
		
		return appFormList1;		
	}	
}



