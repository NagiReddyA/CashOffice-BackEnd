package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.CollectionSummary;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.CollectionSummaryRepository;

@CrossOrigin(origins = {"http://localhost:4200", "*"} , allowedHeaders = "*")
@RestController
@RequestMapping("/api/collection-summary")
public class CollectionSummaryController {
	
	@Autowired
	CollectionSummaryRepository colSummaryRepos ;
	
	@GetMapping("/{branch_code}&{fromDate}&{toDate}")
	public List<CollectionSummary> getCash(
			@PathVariable("branch_code") String branch_code,
			@PathVariable("fromDate") String fromDate,
			@PathVariable("toDate") String toDate){
		return colSummaryRepos.getSummaryCollection(branch_code, fromDate, toDate) ;  
	}
	
	@GetMapping()
	public List<Object> getCodes(){
		
		return colSummaryRepos.getBranchCodes() ;  
	}

}

