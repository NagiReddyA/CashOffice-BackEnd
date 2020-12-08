package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service;

import java.util.Date;

public interface RcptFromReallocDetService {

	
	int insertrecordrcptfromrealloc(double reallochdrid,double appid,
            double appactid,String referenceno,
            Date period,Date creationdate,
            String createdby,Date modifieddate,
            String modifiedby, String postingstatus);
	
	int updaterecordrcptfromrealloc(String paypointid ,Date period,String modifiedby,Date modifiedtime,double reallocfromid);
}
