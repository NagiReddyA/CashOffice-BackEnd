package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service;

import java.util.Date;

public interface RcptReallocationHdrService {
	
	int insertrecordtoreallocationhdr(double recepitno,Date reallocdate,
            String postingstatus,String postedby,
            Date posteddate,double recepitamount,
            Date creationdate,String createdby,
            Date modifieddate,String modifiedby);
	
	int updatetreallochdr(double receiptno,double rcptamount, 
            String modifiedby,Date modifiedtime,double reallhdrid  );

}
