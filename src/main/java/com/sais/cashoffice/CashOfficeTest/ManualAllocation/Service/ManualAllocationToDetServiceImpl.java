package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Repository.ManualAllocationToDetRepository;


@Service
public class ManualAllocationToDetServiceImpl implements ManualAllocationToDetService {
	
	@Autowired
	private ManualAllocationToDetRepository mtr;

	@Override
	public int insertintomanualalloctodet(double manualhdrid, String policycode, double policyid, Date period,
			BigDecimal partyid, String payorname, String purposeid, String purposename, BigDecimal exceptedamount,
			BigDecimal allocatedamount, String postingstatus, Date creationdate, String createdby, Date modifieddate,
			String modifiedby) {
		
		return mtr.insertintomanualalloctodet(manualhdrid, policycode, policyid,
				                                 period, partyid, payorname, purposeid, purposename,
				                                 exceptedamount, allocatedamount, postingstatus, 
				                                 creationdate, createdby, modifieddate, modifiedby);
	}

}
