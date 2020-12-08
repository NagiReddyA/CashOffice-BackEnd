package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Repository.ManualAllocationFromdetRepository;

@Service
public class ManualAllocationFromdetServiceImpl implements ManualAllocationFromdetService {
	
	@Autowired
	private ManualAllocationFromdetRepository fr;
	

	@Override
	public int insertintomanalallocfromdet(double manualhdrid, BigDecimal paypointid, Date period,
			BigDecimal allocatedamount, BigDecimal unallocatedamount, BigDecimal grossamount, BigDecimal receiptamount,
			String postingstatus, Date creationdate, String createdby, Date Modifieddate, String modifiedby) {
		
		return fr.insertintomanalallocfromdet(manualhdrid, paypointid, period, 
				                              allocatedamount, unallocatedamount, grossamount,
				                              receiptamount, postingstatus, creationdate,
				                              createdby, Modifieddate, modifiedby);
	}

}
