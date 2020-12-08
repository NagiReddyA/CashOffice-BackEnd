package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service;

import java.util.Date;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.PnewmanualPcode;

public interface PnewmanualPcodeService {
	
	List<PnewmanualPcode> fetchalldetailsnewmanualpcode(String policycode,Date period);
	List<PnewmanualPcode> getnewmanualpolicydetails1(String policycode);

}
