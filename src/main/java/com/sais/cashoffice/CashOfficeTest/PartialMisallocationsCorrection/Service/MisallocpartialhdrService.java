package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service;

import java.util.Date;

public interface MisallocpartialhdrService {
	
	public int insertnewrecordmisallpartialhdr(double totalrevamount,double totalamount,
            String transcationtype,String postingstatus,Date creationdate,
            String createdby,Date modifieddate,String modifiedby);

}
