package com.sais.cashoffice.CashOfficeTest.master.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sais.cashoffice.CashOfficeTest.entities.TAppActivity;
import com.sais.cashoffice.CashOfficeTest.master.model.AppActivitiesForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AppSetUpForm;

public interface ApplicationSetUpService {
	
	public List<AppSetUpForm> getAllApplications();

	public List<AppActivitiesForm> getActivitesByAppId(String appCode);

	public ResponseEntity<?> createActivity(AppActivitiesForm appActivity);

}
