package com.sais.cashoffice.CashOfficeTest.cashofficeReports.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORReprintReceipt;
import com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository.CORReprintReceiptRepository;

@CrossOrigin(origins = {"http://localhost:4200", "*"} , allowedHeaders = "*")
@RestController
@RequestMapping("/api/cor_reprint-receipt")
public class CORReprintReceiptController {
	
	@Autowired
	CORReprintReceiptRepository reprintReceiptRepos ;
	
	@GetMapping("/{receipt_number}")
	public List<CORReprintReceipt> getCash(@PathVariable("receipt_number") String receipt_number){
		return reprintReceiptRepos.getReprintReceipt(receipt_number) ;  
	}
	
//	@GetMapping()
//	public List<Object> getCodes(){
//		
//		return reprintReceiptRepos.getBranchCodes() ;  
//	}

}

