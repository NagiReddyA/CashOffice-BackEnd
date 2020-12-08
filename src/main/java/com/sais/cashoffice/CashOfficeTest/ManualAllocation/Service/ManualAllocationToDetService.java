package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service;

import java.math.BigDecimal;
import java.util.Date;

public interface ManualAllocationToDetService {
	
	public int insertintomanualalloctodet(double manualhdrid,String policycode,
            double policyid,Date period,
            BigDecimal partyid,String payorname,
            String purposeid,String purposename,
            BigDecimal exceptedamount,BigDecimal allocatedamount,
            String postingstatus,Date creationdate,
            String createdby,Date modifieddate,
            String modifiedby);
	
	

}
