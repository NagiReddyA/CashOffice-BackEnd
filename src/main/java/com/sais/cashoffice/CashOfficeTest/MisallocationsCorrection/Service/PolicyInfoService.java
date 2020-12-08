package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.PolicyInfo;

public interface PolicyInfoService {
	
	
	public List<PolicyInfo> fetchallpolicyinfodetails(String policycode);

}
