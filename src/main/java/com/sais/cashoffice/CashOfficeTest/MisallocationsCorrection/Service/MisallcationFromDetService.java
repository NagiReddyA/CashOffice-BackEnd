package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public interface MisallcationFromDetService {
	
	public double misallocationfrmdetinsertrecord(double misallocationhdrid,double policyid,String policycode,
            Date period,String policystatus,BigDecimal amount,
            double partyid,String payername,double receiptno,
            BigDecimal listid,String postingstatus,String collectionflag,
            Date creationdate,String createdby,Date modifieddate,String modifiedname);

	
	public BigInteger getmisalloctedfromdetid();

}
