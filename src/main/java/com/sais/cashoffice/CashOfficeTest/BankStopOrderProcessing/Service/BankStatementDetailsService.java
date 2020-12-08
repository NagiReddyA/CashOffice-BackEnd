package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model.BankStatementDetails;

public interface BankStatementDetailsService {
	
	List<BankStatementDetails> getstatementdetails(double bankstmthdrid);

}
