package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.Bankdetails;

public interface BankdetailsService {

	public List<Bankdetails> getbankstmtdetails(double bankstmtid);
	
	
}
