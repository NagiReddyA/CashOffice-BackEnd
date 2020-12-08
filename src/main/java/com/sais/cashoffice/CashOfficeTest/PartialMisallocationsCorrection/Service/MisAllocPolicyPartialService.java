package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service;

import java.util.Date;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.MisAllocPolicyPartial;

public interface MisAllocPolicyPartialService {
	
	
	
	List<MisAllocPolicyPartial> getmisallocpolicypartial(String policycode,Date period);

}
