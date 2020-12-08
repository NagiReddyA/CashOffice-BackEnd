package com.sais.cashoffice.CashOfficeTest.BankStatementPosting.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.BankStatementPosting.Model.BankStmtPosting;

public interface BankStmtPostingService {

	 List<BankStmtPosting> getbankstmtpostdetails(double bankstmtid);
	
	
}
