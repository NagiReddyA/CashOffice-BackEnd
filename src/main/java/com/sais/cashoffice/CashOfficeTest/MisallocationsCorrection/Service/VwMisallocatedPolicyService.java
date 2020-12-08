package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.VwMisallocatedPolicy;

public interface VwMisallocatedPolicyService {

	
	public List<VwMisallocatedPolicy> fetchallvwallocatedpolicy(String policyCode);
	
	
}
