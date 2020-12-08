package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service;

import java.math.BigDecimal;
import java.util.Date;

public interface ManualAllocationFromdetService {

	
	public int insertintomanalallocfromdet(double manualhdrid,BigDecimal paypointid,
            Date period,BigDecimal allocatedamount,
            BigDecimal unallocatedamount,BigDecimal grossamount,
            BigDecimal receiptamount,String postingstatus,
            Date creationdate, String createdby,
            Date Modifieddate,String modifiedby);
	
}
