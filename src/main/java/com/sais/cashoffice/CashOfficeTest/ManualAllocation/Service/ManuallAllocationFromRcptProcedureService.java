package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model.ManuallAllocationFromRcptProcedure;

public interface ManuallAllocationFromRcptProcedureService {
	
	public List<ManuallAllocationFromRcptProcedure>  getmanualallocationfrmdet(String bankstmtflag,double receiptnum);

}
