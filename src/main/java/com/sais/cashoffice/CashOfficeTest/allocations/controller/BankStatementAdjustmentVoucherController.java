package com.sais.cashoffice.CashOfficeTest.allocations.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.Bankdetails;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.ReallocationDetails;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.ReferenceNumberDetails;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.Unspecifieddetails;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Repository.ReferenceNumberDetailsRepository;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service.BankdetailsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service.BkStmtToRealloctionDetServiceImpl;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service.ReallocationDetailsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service.ReferenceNumberDetailsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service.UnspecifieddetailsServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class BankStatementAdjustmentVoucherController {
	
	@Autowired 
	private BankdetailsServiceImpl bds;
	
	@Autowired
	private UnspecifieddetailsServiceImpl uds;
	
	@Autowired
	private ReallocationDetailsServiceImpl rds;
	
	@Autowired
	private BkStmtToRealloctionDetServiceImpl brd;
	
   @Autowired
   private ReferenceNumberDetailsServiceImpl rnds;
   

	
	// fetching bank stmt details 
	
	@GetMapping(path="/allocations/bankstmtadjustmentvoucher/bankstmtdetails")
	public List<Bankdetails> fetchbankstmtdetails(@RequestParam("bankstmtid") double bankstmtid){
		
		return bds.getbankstmtdetails(bankstmtid);
	}
	
	
    // fetching unspecified details for respective bank stmt id
	@GetMapping(path="/allocations/bankstmtadjustmentvoucher/unspecifieddetails")
	 public List<Unspecifieddetails> fetchunspecifieddetails(@RequestParam("bankstmtid") double bankstmtid){
		 
		 return uds.getunspecifieddetails(bankstmtid);
		 
	 }
	
	
	// fetching the reallocation details 
	@GetMapping(path="/allocations/bankstmtadjustmentvoucher/reallocation")
	 public List<ReallocationDetails> fetchreallocationdetails(@RequestParam("bankstmtid") double bankstmtid){
		 
		 return rds.getreallocationdetails(bankstmtid);
		 
	 }
	
	// inserting a record into T_BK_STMT_TO_REALLOCATION_DET
	
	@PostMapping(path="/allocations/bankstmtadjustmentvoucher/insertreallocationtodetrecord")
	public ResponseEntity<?> insertrecordtoreallocationdet(@RequestBody ReallocationDetails[] rd,@RequestParam("createdby") String createdby){
		
		
		System.out.println("system is ready for saving purposes");
        System.out.println(rd[0].getAppCode());
	    System.out.println(rd[0].getAppActivityCode());
	    System.out.println(rd[0].getReferenceNo());
	   System.out.println(rd[0].getReferenceStatus());
	    System.out.println(rd[0].getToreallocateperiod());
	    System.out.println(rd[0].getPayor());
	    System.out.println(rd[0].getTransactionCode());
	    System.out.println(rd[0].getAmount());
	    System.out.println(rd[0].getBkstmtreallocid());
	    Date creationdate = new Date();
	
		double reallocationdetid= brd.insertnewrecrealloc(rd[0].getBkstmtreallocid(), rd[0].getAppCode(), rd[0].getAppActivityCode(), rd[0].getReferenceNo(), 
			                                             rd[0].getReferenceStatus(), rd[0].getToreallocateperiod(), rd[0].getPayor(),
				                                             rd[0].getTransactionCode(), rd[0].getAmount(),creationdate, createdby,rd[0].getToreallocpostingStatus());
		
	    System.out.println(reallocationdetid);
	    return ResponseEntity.ok().body(reallocationdetid);
		
		//return null;
	}
	
	
	
	// delete record from T_BK_STMT_TO_REALLOCATION_DET by using realloc id 
	
	@GetMapping(path="/allocations/bankstmtadjustmentvoucher/deleterecordtbkreallocation")
	public ResponseEntity<?> deleterecordbkstmttorealloc(@RequestParam("reallocidtodet") double reallocidtodet){
		
		System.out.println(reallocidtodet);
		
      String message =	(String) brd.deleterecordrealloc(reallocidtodet);
		
	System.out.println("after deleting----->"+message);
		
		return ResponseEntity.ok().body(message);
		
	}
	
	
	// get reference number details
	@GetMapping(path="/allocations/bankstmtadjustmentvoucher/referencedetails")
	public List<ReferenceNumberDetails> fetchrefrencedetails(@RequestParam("referencenumber") String referencenumber,@RequestParam("applicationcode") String applicationcode){
		
		 System.out.println(referencenumber);
		 System.out.println(applicationcode);
		
		
		 
		 return rnds.referencenumberdetails(applicationcode, referencenumber);
	}
	

	
	
}
