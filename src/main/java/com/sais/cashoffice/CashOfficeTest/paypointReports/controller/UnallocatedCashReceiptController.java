package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.sais.cash.entities.CollectionBranch;
import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.UnallocatedCashReceipt;
//import com.sais.cash.repos.CollectionBranchRepository;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.UnallocatedCashReceiptRepository;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/paypoint-reports/unallocated-cash-receipts")
public class UnallocatedCashReceiptController {
	
	@Autowired
	UnallocatedCashReceiptRepository ucrRepos ;
		
	@GetMapping("/{startDate}&{endDate}")
	public List<UnallocatedCashReceipt> getUCRs(@PathVariable("startDate") String startDate, @PathVariable("endDate") String endDate){ 
		
		return ucrRepos.getUnallocatedCashReceipts(startDate, endDate) ;  
	}

}

