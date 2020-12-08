package com.sais.cashoffice.CashOfficeTest.transaction.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.transaction.model.PaymentReceipt;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PolicyForm;
import com.sais.cashoffice.CashOfficeTest.transaction.repository.PaymentReceiptRepository;

@Service
public class PaymentReceiptImpl implements PaymentReceiptService{

	@Autowired
	private PaymentReceiptRepository PaymentReceiptRepository;
	
	public List<PaymentReceipt> getRcptDtls(double Id){		
		List<PaymentReceipt> appFormList1 = new ArrayList<PaymentReceipt>();
	     List<Object[]> appList = PaymentReceiptRepository.getRcptDtls(Id);
	     if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				PaymentReceipt appForm = new PaymentReceipt();
				appForm.setcashierActId((double) object[0]);
				appForm.setcashOffActId((int) object[1]);
				appForm.setcashOffId((double) object[2]); 
				appForm.setcashierId((double) object[3]);
				appForm.setcashierName((String) object[4]);
				appForm.setcashOffCode((String) object[5]);
				
				appFormList1.add(appForm);				
			}	
		}		
		return appFormList1;
	}
	
	
	public List<PaymentReceipt> getApplicationDtls(){		
		List<PaymentReceipt> appFormList1 = new ArrayList<PaymentReceipt>();
	     List<Object[]> appList = PaymentReceiptRepository.getApplicationDtls();
	     if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				PaymentReceipt appForm = new PaymentReceipt();
				appForm.setappId((int) object[0]);
				appForm.setappCode((String) object[1]);
				appForm.setappActId((int) object[2]); 
				appForm.setappActCode((String) object[3]);
				appForm.setappActDesc((String) object[4]);				
				appFormList1.add(appForm);				
			}	
		}		
		return appFormList1;
	}
	
	public List<PaymentReceipt> getBankDtls(){		
		List<PaymentReceipt> appFormList1 = new ArrayList<PaymentReceipt>();
	     List<Object[]> appList = PaymentReceiptRepository.getBankDtls();
	     if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				PaymentReceipt appForm = new PaymentReceipt();
				appForm.setbankCode((String) object[0]);
				appForm.setbankName((String) object[1]);			
				appFormList1.add(appForm);				
			}	
		}		
		return appFormList1;
	}
	
	public List<PaymentReceipt> getBankBranchDtls(String bankId){		
		List<PaymentReceipt> appFormList1 = new ArrayList<PaymentReceipt>();
	     List<Object[]> appList = PaymentReceiptRepository.getBankBranchDtls(bankId);
	     if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				PaymentReceipt appForm = new PaymentReceipt();
				appForm.setbranchCode((String) object[0]);
				appForm.setbranchName((String) object[1]);			
				appFormList1.add(appForm);				
			}	
		}		
		return appFormList1;
	}
	
	public List<PaymentReceipt> getPayModeDtls(int Id){		
		List<PaymentReceipt> appFormList1 = new ArrayList<PaymentReceipt>();
	     List<Object[]> appList = PaymentReceiptRepository.PayModeDtls(Id);
	     if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				PaymentReceipt appForm = new PaymentReceipt();
				appForm.setpayMtdId((double) object[0]);
				appForm.setmodeName((String) object[1]);				
				appFormList1.add(appForm);				
			}	
		}		
		return appFormList1;
	}
		
	public List<PolicyForm> getPolicyDtls(String Id){		
		List<PolicyForm> appFormList1 = new ArrayList<PolicyForm>();
	     List<Object[]> appList = PaymentReceiptRepository.getRcptArrearDtls(Id);
	     if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				PolicyForm appForm = new PolicyForm();
				appForm.setPOLICY_CODE((String) object[0].toString());
				appForm.setDUE_DATE((String) object[1]);
				appForm.setPAYOR((String) object[2]);
				appForm.setARREARS((double) object[3]);
				appForm.setEXPECTED_PREMIUM((double) object[4]);
				appForm.setSTATUS((String) object[5]);
				appFormList1.add(appForm);				
			}	
		}		
		return appFormList1;
	}
	
	
	
	public List<PaymentReceipt> getRcptPostDtls(String usrId){		
		List<PaymentReceipt> appFormList1 = new ArrayList<PaymentReceipt>();
	     List<Object[]> appList = PaymentReceiptRepository.getRcptPostDtls(usrId);
	     if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				PaymentReceipt appForm = new PaymentReceipt();
				//System.out.println("UnAllocated Amount	:", appForm.setrcptNo((double) object[0]));
				appForm.setrcptNo((double) object[0]);
				appForm.setrcptDate((Date) object[1]);	
				appForm.setrcptAmount((String) object[2].toString());
				appForm.setpostStatus((String) object[3].toString());	
				appFormList1.add(appForm);				
			}	
		}		
		return appFormList1;
	}
	
	
	public void updateRcptPostStatus(double Id){		
		PaymentReceiptRepository.updateRcptPostStatus(Id);		
	}


	@Override
	public List<PolicyForm> getPolicyDtls(int Id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object InsertRcptDtls(String Amt, String From, double Pay_Id, double Coff_Id, double Cashier_Id,
			String Create_By, double App_Id, double All_amt, double Un_All_Amt) {
			Object obj=PaymentReceiptRepository.InsertRcptDtls(Amt, From, Pay_Id, Coff_Id, Cashier_Id, Create_By, App_Id, All_amt, Un_All_Amt);
			return obj;	
	}
	
}
