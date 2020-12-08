package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service;

import java.util.Date;

public interface RcptToReallocDetService {
        
	int insertrecordrcpttoreallocdet(double reallochdrid,double appid,
            double appactid,String referenceno,
            Date period,String creditfile,
            double creditamount,double credithdrid,
            Date creationdate,String createdby,
            Date modifieddate,String modifiedby,String postingstatus);
	
	int  updaterecordrcpttoreallocdet(String paypointid,Date period,String creditfilename, double creditamount,
            double credithdrid,String modifiedby,Date modifiedtime,double rcpttoid);
}
