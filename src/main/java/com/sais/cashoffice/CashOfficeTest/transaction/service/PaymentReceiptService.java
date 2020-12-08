package com.sais.cashoffice.CashOfficeTest.transaction.service;

import java.util.List;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PaymentReceipt;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PolicyForm;;

public interface PaymentReceiptService {
	
	public List<PaymentReceipt> getRcptDtls(double Id);
	
	public List<PaymentReceipt> getApplicationDtls();
	
	public List<PaymentReceipt> getBankDtls();
	
	public List<PaymentReceipt> getBankBranchDtls(String bankId);
	
	public List<PaymentReceipt> getPayModeDtls(int Id);
	
	public List<PolicyForm> getPolicyDtls(int Id);
	
	public  Object InsertRcptDtls(String Amt, String From, double Pay_Id, double Coff_Id, double Cashier_Id, 
			String Create_By, double App_Id, double All_amt, double Un_All_Amt );              

	
	public List<PaymentReceipt> getRcptPostDtls(String usrId);	
	
	public void updateRcptPostStatus(double Id);

}
