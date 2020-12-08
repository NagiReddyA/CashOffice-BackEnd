package com.sais.cashoffice.CashOfficeTest.cashofficeReports.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORCollectionSummary;
import com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository.CORCollectionSummaryRepository;

@CrossOrigin(origins = {"http://localhost:4200", "*"} , allowedHeaders = "*")
@RestController
@RequestMapping("/api/cor_collection-summary")
public class CORCollectionSummaryController {
	
	@Autowired
	CORCollectionSummaryRepository colSummaryRepos ;
	
	@GetMapping("/{branch_code}&{fromDate}&{toDate}")
	public List<CORCollectionSummary> getCash(
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

