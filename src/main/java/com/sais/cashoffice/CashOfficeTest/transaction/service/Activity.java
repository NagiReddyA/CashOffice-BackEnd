package com.sais.cashoffice.CashOfficeTest.transaction.service;

import java.util.List;

import javax.validation.Valid;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffActivity1;
import com.sais.cashoffice.CashOfficeTest.transaction.model.ActivityForm;
import com.sais.cashoffice.CashOfficeTest.transaction.model.ActivityForm1;

public interface Activity {
	
	public List<ActivityForm> getAllActivityDetails(String userID) throws Exception;
	public List<ActivityForm> getUserActivityDetails(String userID);
	public List<ActivityForm1> getTillActivityDetails() throws Exception;
	public TCashOffActivity1 openActivity(@Valid ActivityForm activity) throws Exception;
	public TCashOffActivity1 authorizeTillCashiers(double cashierActivityId,@Valid ActivityForm1 activity);
	public TCashOffActivity1 closeActivity(String userID,@Valid ActivityForm activity);	
	public List<ActivityForm> getCheckActivity(String userID);
	
}
