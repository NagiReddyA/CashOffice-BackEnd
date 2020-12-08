package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.ManualAdjustment;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.ManualAdjustmentRepository;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/paypoint-reports/manual-adjustment")
public class ManualAdjustmentController {
	
	@Autowired
	ManualAdjustmentRepository mandjRepos ;
		
	@GetMapping("/{from_date}&{to_date}")
	public List<ManualAdjustment> getManAdjs(@PathVariable("from_date") String from_date, 
			@PathVariable("to_date") String to_date){ 
		
		System.out.println(); // dbg. 
		System.out.println("::: FROM " + from_date + " TO " + to_date ) ; // dbg. 
		System.out.println(); // dbg. 
		
		return mandjRepos.getManualAdjustment(from_date, to_date) ; 
	}

}

