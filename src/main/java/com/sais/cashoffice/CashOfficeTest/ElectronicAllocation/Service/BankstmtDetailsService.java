package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service;

import java.math.BigDecimal;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.BankstmtDetails;

public interface BankstmtDetailsService {
	
	List<BankstmtDetails> getbankstmtdetails(BigDecimal paypointid);

}
