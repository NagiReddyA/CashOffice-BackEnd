package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.Misallocpartialtodet;

public interface MisallocpartialtodetService {
	
	List<Misallocpartialtodet> fetchalltodetmisalloc(double misallocatedid);
	
	public int insertnewrecordtomisallocpartialtodet(double misalloparialhdrid,String policycode,
            Date period,String policystatus,BigDecimal amount,
            BigDecimal arrears,String payourname,String postingstatus,
            String purpose,Double partyid,Double policyid,String recepitno,
            Date creationdate,String createdby,Date modified,String modifiedby);

}
