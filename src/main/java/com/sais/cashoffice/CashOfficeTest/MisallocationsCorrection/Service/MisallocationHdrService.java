package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public interface MisallocationHdrService {
	
	
	public int misallochdrnewrecord(BigDecimal totalreversalamount,BigDecimal totalamount,String postingstatus,Date creationdate,String createdby,Date modificationdate,String modifiedby);
	
	public BigInteger misallocationid();


}
