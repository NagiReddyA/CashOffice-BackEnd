package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.ReferenceNumberDetails;

public interface ReferenceNumberDetailsService {

	
	List<ReferenceNumberDetails> referencenumberdetails(String applicationcode,String referencenumber);
}
