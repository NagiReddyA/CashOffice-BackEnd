package com.sais.cashoffice.CashOfficeTest.allocations.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Repository.BsoPremiumRepository;
import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Service.BankStatementDetailsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Service.BsoPremiumServiceImpl;
import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Service.BycodeperiodProcedureServiceImpl;
import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model.BankStatementDetails;
import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model.BsoPremium;
import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model.BycodeperiodProcedure;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class BankStopOrderProcessingController {
	
	@Autowired
	private BsoPremiumServiceImpl bs;
	
  @Autowired
  private BankStatementDetailsServiceImpl bsd;
  
  @Autowired
  private BycodeperiodProcedureServiceImpl bpsi;
	
	
	
  
  @GetMapping(path="/allocations/bankstoporderprocessing/bankstmtdetails")
  public List<BankStatementDetails> fetchbankstmtdetails(@RequestParam("stmtid") double stmtid){
	  
	  System.out.println(stmtid);
	  
	  return bsd.getstatementdetails(stmtid);
	  
  }
  
  
  
	@GetMapping(path="/allocations/bankstoporderprocessing/bsopremium")
	public List<BsoPremium>  fetchbsopremium(@RequestParam("stmtid") double stmtid){
		
		System.out.println(stmtid);
		
		
		
		return bs.getbsopremiumdetails(stmtid);
	}
	
	
	@GetMapping(path="/allocations/bankstoporderprocessing/bsopcodeperiod")
	public List<BycodeperiodProcedure>  fetchbsopcodeproceduredetails(@RequestParam("policycode") String policycode,@RequestParam("period") String period){
		java.sql.Date ts = null;
		
		
		System.out.println(policycode);
		System.out.println(period);
		
		Date period1 = ts.valueOf(period);
		System.out.println(period1);
		return bpsi.getpcodeperioddetails(policycode, period1);
		
	}
	
	// inserting a record into bsopremium table
	
	@PostMapping(path="/allocations/bankstoporderprocessing/bsopremiumssave")
	public ResponseEntity<?> insertintobsopremium(@RequestBody BsoPremium bp){
		
		Date creationdate = new Date();
		   //Date creationdate = new Date();
		
		
		bs.insertintobsopremium(bp.getBankstmtid(),bp.getBkTransactionType(),bp.getPeriod(),bp.getPolicyCode(),
				                bp.getPolicyStatusId(),bp.getPayor(),bp.getExpectedPremium(), bp.getAllocatedAmount(),
				                creationdate, creationdate);
		
		return ResponseEntity.ok().body("successfully recored is saved");
		
		
	}

}
