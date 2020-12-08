package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service;

import java.math.BigDecimal;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.CrAllocationDetails;

public interface CrAllocationDetailsService {
	
	public  List<CrAllocationDetails> getcreditallocdetails(BigDecimal paypointid);

}
