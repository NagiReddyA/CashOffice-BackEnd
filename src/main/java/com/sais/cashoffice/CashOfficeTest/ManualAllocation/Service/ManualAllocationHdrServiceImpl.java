package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Repository.ManualAllocationHdrRepository;
@Service
public class ManualAllocationHdrServiceImpl implements ManualAllocationHdrService {
	
	@Autowired
	private ManualAllocationHdrRepository mar;
	

	@Override
	public int insertintomanualallochdr(double receiptno, BigDecimal totalallocatedamount,
			BigDecimal totalunallocatedamount, BigDecimal totalpoliciesamount, Date creationdate, String createdby,
			Date modifieddate, String modifiedby, String attribute, String bankstmtflag,String postingstatus) {
		
		return mar.insertintomanualallochdr(receiptno, totalallocatedamount, totalunallocatedamount,
				                              totalpoliciesamount, creationdate, createdby, modifieddate,
				                              modifiedby, attribute, bankstmtflag,postingstatus);
	}


	@Override
	public Object deletemanualallocationtodetrecord(double manualhdrid, double manualtodelid,
			BigDecimal totalallocatedamount, BigDecimal totalunallocatedamount, BigDecimal totalpoliciesamount,
			String modifiedby, Date modifieddate) {
	
		return mar.deletemanualallocationtodetrecord(manualhdrid, manualtodelid, totalallocatedamount,
				                                      totalunallocatedamount, totalpoliciesamount,
				                                       modifiedby, modifieddate);
	}


	@Override
	public Object getmanualhdrid(double receipt) {
		
		return mar.getmanualhdrid(receipt);
	}


	@Override
	public Object updatetpomanualhdr(double manualhdrid, BigDecimal totalallocatedamount,
			BigDecimal totalunallocatedamount, BigDecimal totalpoliciesamount, String modifiedby, Date modifieddate) {
		
		return mar.updatetpomanualhdr(manualhdrid, totalallocatedamount, totalunallocatedamount, totalpoliciesamount, modifiedby, modifieddate);
	}

}
