package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.MisallcationToDet;

public interface MisallcationToDetService { 
	
	
	public List<MisallcationToDet> fetchallmisalltodet(double misallocatedid);
	
	public 	double misalltoderecord(double misallid,String policycode,Date period,String policystatus,BigDecimal amount,
            BigDecimal arrears,String payourname,String postingstatus,String purpose,
            double partyid,double policyid,String receiptno,
            Date creationdate,String createdby,Date modifieddate,String modifiedby);
	
	public BigInteger misalltodeid();
	
	
	
	
	

}
