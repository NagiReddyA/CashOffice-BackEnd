package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.RecepitStmtDetails;

public interface RecepitStmtDetailsService {
	
	List<RecepitStmtDetails> getallstmtdetails(double recepitno);

}
