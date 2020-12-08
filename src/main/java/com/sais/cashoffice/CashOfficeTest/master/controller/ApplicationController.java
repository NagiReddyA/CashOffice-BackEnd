package com.sais.cashoffice.CashOfficeTest.master.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sais.cashoffice.CashOfficeTest.entities.TAppActivity;
import com.sais.cashoffice.CashOfficeTest.entities.TPaymentMethod;
import com.sais.cashoffice.CashOfficeTest.master.model.AppActivitiesForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AppSetUpForm;
import com.sais.cashoffice.CashOfficeTest.master.repository.ApplicationSetUpRepository;
import com.sais.cashoffice.CashOfficeTest.master.service.ApplicationSetUpService;
import com.sais.cashoffice.CashOfficeTest.transaction.model.QueryReceiptForm;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ApplicationController {

	@Autowired
	private ApplicationSetUpService appSetUpService;
	
	@Autowired
	private ApplicationSetUpRepository appSetUpRepo;
	
	@GetMapping(path = "/appSetUpDetails", produces = "application/json")
	public List<AppSetUpForm> getApplications() {
		return appSetUpService.getAllApplications();
	}

	// this is for request type /getActivities/ACL --recommended rest usage
	@GetMapping(path = "/getActivities/{code}", produces = "application/json")
	public List<AppActivitiesForm> getActivitesByAppId(@PathVariable String code) {
		//System.out.println("APP CODE: "+code);
		return appSetUpService.getActivitesByAppId(code);
	}

	/*
	 * //this is for request type /getActivities?appCode='ACL'
	 * 
	 * @GetMapping(path = "/getActivities", produces = "application/json") public
	 * List<AppActivitiesForm> getActivitesByAppId(@RequestParam("appCode") String
	 * code) { return appSetUpService.getActivitesByAppId(code); }
	 */
	@PostMapping(path = "/saveActivity", consumes = "application/json", produces = "application/json")
	public List<AppActivitiesForm> saveActivity(@RequestBody AppActivitiesForm appActivity) {		
//		System.out.println(appActivity.getAppActivityCode());
//		System.out.println(appActivity.getAppActivityDesc());		
//		System.out.println(appActivity.isEnabled());
//		System.out.println(appActivity.getAppId());
//		System.out.println(appActivity.getCreatedBy());
		 return appSetUpService.createActivity(appActivity);
	}
	
	@PostMapping(path="/saveApplication",consumes = "application/json", produces = "application/json")
	public List<AppSetUpForm> saveApplication(@RequestBody AppSetUpForm appDtls) {			
		if (appDtls.getEnabled() == 1)
			appDtls.setEnabled('1');
		else
			appDtls.setEnabled('0');
		 return appSetUpService.InsertUpdateApplication(appDtls.getApplicationCode(),
				 appDtls.getApplicationDesc(),
				 appDtls.getEnabled(),
				 appDtls.getcreatedBy());
	}

}
