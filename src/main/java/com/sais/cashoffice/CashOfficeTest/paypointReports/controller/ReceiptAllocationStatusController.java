package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.ReceiptAllocationStatus;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.ReceiptAllocationStatusRepository;

@CrossOrigin(origins = {"http://localhost:4200", "*"} , allowedHeaders = "*")
@RestController
@RequestMapping("/api/paypoint-reports")
public class ReceiptAllocationStatusController {
	
	@Autowired
	ReceiptAllocationStatusRepository rasRepos ;
	
	// query took ~27.4min for r_no = 1063
	@GetMapping("receipt-allocation-status/{receipt}")
	public List<ReceiptAllocationStatus> getStati(@PathVariable("receipt") String receipt){
		return rasRepos.getReceiptAllocationStati(receipt) ;  
	}
	
}

