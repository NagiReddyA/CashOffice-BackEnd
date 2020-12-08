package com.sais.cashoffice.CashOfficeTest.allocations.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
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

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.BankAcoountDetails;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.BankDetails;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Dde_model;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.DetExclusions;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.DetReversals;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.DetUnspecified;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Det_Sundry;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Tbank_join;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Tbankstmthdr;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Vw_PayPoints;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository.TBankStmtHdrRepository;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service.BankAcoountDetailsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service.BankDetailsService;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service.Dde_service_impl;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service.DetExclusionsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service.DetReversalsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service.DetUnspecifiedServiceImpl;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service.Det_Sundry_Serviceimpl;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service.TBankHrdServiceimpl;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service.paypointserviceimpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class DirectDebitProcessingController {

  
		@Autowired
		private TBankHrdServiceimpl tbankhrd;
		
		@Autowired
		private DetExclusionsServiceImpl tbkexculsion;
		
		@Autowired
		private DetReversalsServiceImpl tbreversal;
		
		@Autowired
		private Det_Sundry_Serviceimpl sundry;
		
		@Autowired
		private DetUnspecifiedServiceImpl unspec;
		
		@Autowired
		private paypointserviceimpl  paypoint;
		
		@Autowired
		private TBankStmtHdrRepository tr;
		
		
		@Autowired
		private Dde_service_impl ddeservice;
		
		@Autowired
		private BankDetailsService bankservice;
		
		@Autowired
		private BankAcoountDetailsServiceImpl accountservice;
		
		
		
		
		@GetMapping(path="/allocations/paypoint")
		public List<Vw_PayPoints> fetchallpaypoints(){
			return paypoint.fetchalldetailsofpaypoint();
		}
		
		
		
		 @GetMapping(path="/allocations/stmt", produces = "application/json")
		 
		 public List<Tbank_join> fetchallgroupusers(@RequestParam("Bankstmt") double code){
			 
			 System.out.println("printing bt stmt details");
			 
			 return tbankhrd.getdatafrommultipletables(code);
			 
		 }
		 
 @GetMapping(path="/allocations/stmt/ddedetails", produces = "application/json")
		 
		 public List<Dde_model> fetchalldde(@RequestParam("Bankstmt") double code){
			 
			 System.out.println("printing bt dde details");
			 return ddeservice.getalldee(code);
			 
		 }
		 
		
        @GetMapping(path="/allocations/stmt/exclusions", produces = "application/json")
		 
		 public List<DetExclusions> fetchstmtdetexclusions(@RequestParam("Bankstmtexclusions") double exclusions){
			 
			 return tbkexculsion.getdetailsexclusions(exclusions);
			 
		 } 
	
        @GetMapping(path="/allocations/stmt/DetReversals")
		 
		 public List<DetReversals> fetchstmtDetReversals(@RequestParam("BankstmtexclusionsDetReversals") double DetReversals){
			 
			 return tbreversal.fetchDetReversals(DetReversals);
			 
		 } 
	
         
        @GetMapping(path="/allocations/stmt/sundry")
		 
		 public List<Det_Sundry> fetchstmtDetSundy(@RequestParam("Bankstmtexclusionssundry1") double sundry1){
			 
			 return sundry.fetchallDet_Sundry(sundry1);
			 
		 } 
		 
		 
     @GetMapping(path="/allocations/stmt/unspecified") 
     
     public List<DetUnspecified> fetchstmtDetunspecified(@RequestParam("Bankstmtexclusionsunspecified") double unsp){
			
    	 return unspec.fetchallDetUnspecified(unsp);
			 
			
			 
		 } 
     
     
     
     
     // fetching the bank details 
     
     @GetMapping(path="/allocations/stmt/bankdetails") 
     public List<BankDetails> fetchbankdetails(){
    	 
    	 return bankservice.getbankdetails();
     }
     
     // fetch the account details 
     
     @GetMapping(path="/allocations/stmt/accountdetails")
     public List<BankAcoountDetails> fetchaccountdetails(){
    	 
    	 return accountservice.getallbankaccountdetails();
     }
     
     
     //post to t_bank_stmt_hdr to generate bank stmt id 
     
     @PostMapping(path="/allocations/tbankstmthdr")
     public ResponseEntity<?> inseringdetailstostmthdr(@RequestBody Tbankstmthdr tbi){
    	 
    	 double stmthdrid = ddeservice.insertintobankstmthdr(tbi.getPaymentmode(),tbi.getBankname(),tbi.getAccountnumber() ,
    			                                            tbi.getCreationdate(),tbi.getModifiedate(),tbi.getBankstmtnumber(),
    			                                            tbi.getPostingstatus(),tbi.getDatefrom() ,tbi.getDateto() ,
    			                                            tbi.getCreatedby() ,tbi.getOpeningbalance(), 
    			                                           tbi.getClosingbalance() ,tbi.getBranch() ,
    			                                           tbi.getReversalperiod() ,tbi.getCreatedby());
    	 
    	 return ResponseEntity.ok().body("succesfully recored is inserted");
     }
     
     
     
     // post to DDE
     
     @PostMapping(path="/allocations/dde",consumes = "application/json", produces = "application/json")
     public ResponseEntity<?>  postingddedetails(@RequestBody Tbank_join v ){
    	
    	 
       
    	  
    	 
    	 
    	 
    	
   	    System.out.println("bankstmt id in dde------>"+v.getBank_stmt_id());
    	System.out.println("transction type-------->"+v.getBk_transaction_type());
        System.out.println("paypoint id ------>"+v.getPaypoint_id());
        System.out.println("strike date----------->"+v.getStrike_date());
    	System.out.println("gross amount------------->"+v.getGross_amount());
    	System.out.println("allocated amount----------->"+v.getAllocated_amount());
    	System.out.println("period-------------->"+v.getPeriod());
    	
        int bankstmtid = ((int) v.getBank_stmt_id());
    	
    	System.out.println(bankstmtid);
    	
    	System.out.println("NOW WE ARE CONVERTING DATE FORMATTE");
    	
    	System.out.println("now we are changing long formatte date to string ------>stage one ");
    	
    	
    	Date date = new Date();
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
    	System.out.println(formatter.format(date));
    	
    	String d1 = formatter.format(date);
    	
    	  double dde_id = tr.getmaxofdde();
    	  
    
    	System.out.println("get max of dde value ---------->"+dde_id+1);
    	 
    	tr.insertingdde(bankstmtid, v.getBk_transaction_type(), v.getPeriod(), v.getPaypoint_id(), v.getStrike_date(), v.getGross_amount(), v.getAllocated_amount(),d1,dde_id+1);
    	
    	 return ResponseEntity.ok().body("succesfully recored is inserted");
     }
     
     
     // deleteing the record of dde 
     
     @DeleteMapping(path="/allocations/dde/deletedde")
     public ResponseEntity<?> deleteRecordDde(@RequestParam("grossamount") BigDecimal Grossamount,@RequestParam("allocatedamount") BigDecimal allocatedamount){
    	
    	 int dderecord = tr.DeleteDdeByAmount(Grossamount,allocatedamount);
    	  
    	 System.out.println("receving this data because repository is running------->"+dderecord);
    
    			
    			return ResponseEntity.ok().body(dderecord);
     }
    

     //posting to reversal
     
     
     @PostMapping(path="/allocations/reversalposting/posting",consumes = "application/json", produces = "application/json")
     public ResponseEntity<?>  postingreversaldetails (@RequestBody DetReversals v ){
    	 
    	 DetReversals DRE = new DetReversals();
    	 Date date = new Date();
    	 
    	double reversalsid = tbreversal.fetchreversalsidmax();
    	
    	System.out.println("max reversal id primary key--->"+reversalsid);
    	 
    int insertedrvrecord =	 tbreversal.rversalrecordinsert(reversalsid+1, v.getBk_stmt_id(), v.getbK_TRANSACTION_TYPE(), v.getpERIOD_FOR_REVERSALS(), v.getpOLICY_CODE(), v.getpAYOR(), v.getpOLICY_STATUS_ID(), v.geteXPECTED_PREMIUM(),v.getaLLOCATED_AMOUNT() ,date );
    	 
    	 
      System.out.println("record inserted successfully"+insertedrvrecord);
          
    	 
    	
    	 return ResponseEntity.ok().body(insertedrvrecord);
     }
     
     
     // delete reversal
     
     @DeleteMapping(path="/allocations/dde/deletereversal")
   //  pAYOR=${dde.pAYOR}&pOLICY_CODE=${dde.pOLICY_CODE}&eXPECTED_PREMIUM=${dde.eXPECTED_PREMIUM}&aLLOCATED_AMOUNT=${dde.aLLOCATED_AMOUNT}
    // String payor,String policycode,BigDecimal exceptedamount, BigDecimal allocatedamount
     public ResponseEntity<?> deleteRecordrevrsal(@RequestParam("pAYOR")  String payor,@RequestParam("pOLICY_CODE") String policycode ,@RequestParam("eXPECTED_PREMIUM") BigDecimal exceptedamount,@RequestParam("aLLOCATED_AMOUNT") BigDecimal allocatedamount ){
    	
    	int reversalrecorddeleted = tbreversal.deletereversalrecord(payor,policycode,exceptedamount,allocatedamount);
    	  
    	System.out.println("record is sucessfull deleted------->"+reversalrecorddeleted);
    
    			
    	return ResponseEntity.ok().body(reversalrecorddeleted);
    	 
     }
    
     
     
     //post sundry
     
     @PostMapping(path="/allocations/sundry/post",consumes = "application/json", produces = "application/json")
     public ResponseEntity<?>  postingsundrydetails (@RequestBody Det_Sundry v ){
    	 
          System.out.println("this details are from sundry----?"+v.getbK_TRANSACTION_TYPE());
    	 
          double sundryid = sundry.sundryidmax();
          
          Date date = new Date();
    	
    	 int sundryinsertvalue = sundry.sundrydateinsert(sundryid+1, v.getBk_stmt_id(), v.getbK_TRANSACTION_TYPE(), v.getpERIOD(), v.getaLLOCATED_AMOUNT(), date);
    	 
    	 System.out.println("now we are print sundry id ");
    	 System.out.println(sundryinsertvalue);
    	 
    	 return ResponseEntity.ok().body("succesfully recorded has been saved");
     }
     
     // delete a sundry record
     
     @DeleteMapping(path="/allocations/dde/deletesundry")
    // String transtype,Date period,BigDecimal allocatedamount,double bankstmtid
    // bK_TRANSACTION_TYPE=${dde.bK_TRANSACTION_TYPE}&pERIOD=${dde.pERIOD}&aLLOCATED_AMOUNT=${dde.aLLOCATED_AMOUNT}&bk_stmt_id=${dde.bk_stmt_id}
       public ResponseEntity<?> deleteRecordsundry(@RequestParam("sundryid")   double surdryid){
      	
    	 
    	  
    	  
    	 
    	 
      	int sundryrecorddeleted = sundry.sundrydeletearecord(surdryid);
      			
      	  
      	System.out.println("record is sucessfull deleted---if result is 0 not deleted---->"+sundryrecorddeleted);
      
      			
      	//return ResponseEntity.ok().body(sundryrecorddeleted);
    	 
    	 return null;
      	 
       }
     
     
     
   // post to unspecified
     
     @PostMapping(path="/allocations/unspecified/post",consumes = "application/json", produces = "application/json")
     public ResponseEntity<?>  postingunspecifieddetails (@RequestBody DetUnspecified v ){
    	 
  
      Date date = new Date();
    	 double maxunspecifiedid= unspec.unspecifiedmax();
    		 System.out.print("maxunspecifiedid------->"+maxunspecifiedid);
    		 System.out.println("bankstmtid---->"+v.getBk_stmt_id());
    		 System.out.println("period-->"+v.getpERIOD());
    	    System.out.println("allocatedamount---->"+v.getaLLOCATED_AMOUNT());
    	    System.out.print("transcation type--->"+v.getbK_TRANSACTION_TYPE());
    	    
    	    int unspecifiedinsert = unspec.unspecifiedrecordinsert(maxunspecifiedid+1, v.getBk_stmt_id(), v.getpERIOD(), v.getaLLOCATED_AMOUNT(), date,v.getbK_TRANSACTION_TYPE());
    	
    	    System.out.println("unspecifiedinsert---->"+unspecifiedinsert);
    	 return null;
     }
     
     //delete the unspecified record 
     @DeleteMapping(path="/allocations/dde/deleteunspecified")
     // String transtype,Date period,BigDecimal allocatedamount,double bankstmtid
     // bK_TRANSACTION_TYPE=${dde.bK_TRANSACTION_TYPE}&pERIOD=${dde.pERIOD}&aLLOCATED_AMOUNT=${dde.aLLOCATED_AMOUNT}&bk_stmt_id=${dde.bk_stmt_id}
        public ResponseEntity<?> deleteRecordunspecified(@RequestParam("bK_STMT_DET_UNSP_ID")   double bK_STMT_DET_UNSP_ID){
       	
     	 
     	  
     	  
     	 
     	 
       	int unspecifiedrecorddeleted = unspec.unspecifiedrecorddeleted(bK_STMT_DET_UNSP_ID);
       			
       	  
       	System.out.println("record is sucessfull deleted---if result is 0 not deleted---->"+unspecifiedrecorddeleted);
       
       			
       	//return ResponseEntity.ok().body(sundryrecorddeleted);
     	 
     	 return null;
       	 
        }
      
	
}
