package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Tbank_join;

public interface TBankHrdService {
	
	List<Tbank_join> getdatafrommultipletables(double sr);
	

}
