package com.sais.cashoffice.CashOfficeTest.allocations.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.BankstmtDetails;
import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.CrAllocationDetails;
import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.PayPointCrFileFormates;
import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.ReceiptDetails;
import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service.BankstmtDetailsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service.CrAllocationDetailsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service.PayPointCrFileFormatesServiceImpl;
import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service.ReceiptDetailsServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class ElectronicAllocationController {
	
	
	@Autowired
	private PayPointCrFileFormatesServiceImpl pp;
	
	@Autowired
	private CrAllocationDetailsServiceImpl crd;
	
	
	@Autowired
	private ReceiptDetailsServiceImpl rds;
	
	
	@Autowired 
	private BankstmtDetailsServiceImpl bds;
	
	 @GetMapping(path="/allocations/electronicallocations/paypoint")
	 public List<PayPointCrFileFormates> getpaypointdeatailscrf(){ 
		 
		 return pp.getpaypointdetails();
		 
	 }
	 
	 
	 @GetMapping(path="/allocations/electronicallocations/creditfiles")
	 public List<CrAllocationDetails> getcerditfiledetails(@RequestParam BigDecimal paypointid){
		 
		 
		 return  crd.getcreditallocdetails(paypointid);
	 }
	
	 
	 @GetMapping(path="/allocations/electronicallocations/recepitdetails")
	 public List<ReceiptDetails> getrecepitdetails(@RequestParam BigDecimal paypointid){
		
		 return  rds.getreceiptdetails(paypointid);
	 }
	 
	 
	 
	 @GetMapping(path="/allocations/electronicallocations/bankstmtdetails")
	 public List<BankstmtDetails> getbankstmtdetails(@RequestParam BigDecimal paypointid){
		 
		 return bds.getbankstmtdetails(paypointid);
		 
	 }
     
}
