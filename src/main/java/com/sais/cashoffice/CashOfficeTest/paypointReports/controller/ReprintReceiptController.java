package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.ReprintReceipt;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.ReprintReceiptRepository;

@CrossOrigin(origins = {"http://localhost:4200", "*"} , allowedHeaders = "*")
@RestController
@RequestMapping("/api/reprint-receipt")
public class ReprintReceiptController {
	
	@Autowired
	ReprintReceiptRepository reprintReceiptRepos ;
	
	@GetMapping("/{receipt_number}")
	public List<ReprintReceipt> getCash(@PathVariable("receipt_number") String receipt_number){
		return reprintReceiptRepos.getReprintReceipt(receipt_number) ;  
	}
	
//	@GetMapping()
//	public List<Object> getCodes(){
//		
//		return reprintReceiptRepos.getBranchCodes() ;  
//	}

}

