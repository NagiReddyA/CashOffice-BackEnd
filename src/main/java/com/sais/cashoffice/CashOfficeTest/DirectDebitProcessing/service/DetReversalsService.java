package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.DetReversals;

public interface DetReversalsService {
    
	List<DetReversals> fetchDetReversals(double sr);
	
	int rversalrecordinsert(double revid,double stmtid,String transcationtype,
            Date period,String policycode,String payor,
            int policystatusid,BigDecimal exceptedamount,
            BigDecimal allocatedamount,Date creationdate);
	
	double fetchreversalsidmax();
	
	int deletereversalrecord(String payor,String policycode,BigDecimal exceptedamount, BigDecimal allocatedamount);
}
