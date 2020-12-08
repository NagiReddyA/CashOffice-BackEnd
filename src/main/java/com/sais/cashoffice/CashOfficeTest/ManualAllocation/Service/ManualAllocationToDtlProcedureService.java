package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model.ManualAllocationToDtlProcedure;

public interface ManualAllocationToDtlProcedureService {
	
	public List<ManualAllocationToDtlProcedure>  getmanualallocattodtl(String bankstmtflag,double receiptnum);

}
