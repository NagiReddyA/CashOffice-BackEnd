package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Service;

import java.util.Date;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model.BycodeperiodProcedure;

public interface BycodeperiodProcedureService {
	
	
	List<BycodeperiodProcedure> getpcodeperioddetails(String policycode,Date period);

}
