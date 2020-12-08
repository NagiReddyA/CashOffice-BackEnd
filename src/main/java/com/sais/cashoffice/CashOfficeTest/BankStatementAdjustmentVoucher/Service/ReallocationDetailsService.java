package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.ReallocationDetails;

public interface ReallocationDetailsService {

	List<ReallocationDetails> getreallocationdetails(double bankstmtid);
	
}
