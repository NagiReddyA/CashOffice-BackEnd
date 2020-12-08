package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model.BsoPremium;

public interface BsoPremiumService {
	
	List<BsoPremium> getbsopremiumdetails(double bankstmthdrid);
	
	int insertintobsopremium(double bankstmthdrid,
            String transcationtype,
            Date period,
            String policycode,
            String policystatus,
            String payor,
            BigDecimal exceptedpremium,
            BigDecimal allocatedamount,
            Date creationtime,
            Date modifiedtime);

}
