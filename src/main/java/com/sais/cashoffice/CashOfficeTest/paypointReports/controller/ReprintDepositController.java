package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.ReprintDeposit;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.ReprintDepositRepository;

@CrossOrigin(origins = {"http://localhost:4200", "*"} , allowedHeaders = "*")
@RestController
@RequestMapping("/api/reprint-deposit")
public class ReprintDepositController {
	
	@Autowired
	ReprintDepositRepository reprintDepositRepos ;
	
	@GetMapping("/{deposit_number}")
	public List<ReprintDeposit> getCash(@PathVariable("deposit_number") String deposit_number){
		return reprintDepositRepos.getReprintDeposit(deposit_number) ;  
	}
	
//	@GetMapping()
//	public List<Object> getCodes(){
//		
//		return reprintReceiptRepos.getBranchCodes() ;  
//	}

}

