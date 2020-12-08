package com.sais.cashoffice.CashOfficeTest.cashofficeReports.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORReprintDeposit;
import com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository.CORReprintDepositRepository;

@CrossOrigin(origins = {"http://localhost:4200", "*"} , allowedHeaders = "*")
@RestController
@RequestMapping("/api/cor_reprint-deposit")
public class CORReprintDepositController {
	
	@Autowired
	CORReprintDepositRepository reprintDepositRepos ;
	
	@GetMapping("/{deposit_number}")
	public List<CORReprintDeposit> getCash(@PathVariable("deposit_number") String deposit_number){
		return reprintDepositRepos.getReprintDeposit(deposit_number) ;  
	}
	
//	@GetMapping()
//	public List<Object> getCodes(){
//		
//		return reprintReceiptRepos.getBranchCodes() ;  
//	}

}

