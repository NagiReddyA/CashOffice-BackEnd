package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.Unspecifieddetails;

public interface UnspecifieddetailsService {
	
	public List<Unspecifieddetails> getunspecifieddetails(double bankstmtid);

}
