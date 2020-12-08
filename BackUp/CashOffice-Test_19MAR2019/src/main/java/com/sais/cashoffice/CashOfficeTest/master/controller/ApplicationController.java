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
import com.sais.cashoffice.CashOfficeTest.master.service.ApplicationSetUpService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ApplicationController {

	@Autowired
	private ApplicationSetUpService appSetUpService;

	@GetMapping(path = "/appSetUpDetails", produces = "application/json")
	public List<AppSetUpForm> getApplications() {
		return appSetUpService.getAllApplications();
	}

	// this is for request type /getActivities/ACL --recommended rest usage
	@GetMapping(path = "/getActivities/{code}", produces = "application/json")
	public List<AppActivitiesForm> getActivitesByAppId(@PathVariable String code) {
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
	public ResponseEntity<?> saveActivity(@RequestBody AppActivitiesForm appActivity) {
		return appSetUpService.createActivity(appActivity);
	}

}
