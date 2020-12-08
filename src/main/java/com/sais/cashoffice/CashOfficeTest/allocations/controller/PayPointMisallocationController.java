package com.sais.cashoffice.CashOfficeTest.allocations.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service.CreditFilesmisallocDetailsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service.PpMisAllocDetailsServiceImpl;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service.RcptFromReallocDetServiceImpl;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service.RcptReallocationHdrServiceImpl;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service.RcptToReallocDetServiceImpl;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service.RecepitStmtDetailsServiceImp;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.CreditFilesmisallocDetails;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.PpMisAllocDetails;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.RcptFromReallocDet;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.RcptReallocationHdr;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.RcptToReallocDet;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.RecepitStmtDetails;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class PayPointMisallocationController {
	
	@Autowired
	private RecepitStmtDetailsServiceImp rsd;
	
	@Autowired
	private CreditFilesmisallocDetailsServiceImpl cds;
	
	@Autowired
	private RcptReallocationHdrServiceImpl rrh;
	
	@Autowired
	private RcptFromReallocDetServiceImpl rrd;
	
	@Autowired
	private RcptToReallocDetServiceImpl  rtr;
	
	@Autowired
	private PpMisAllocDetailsServiceImpl ppm;
	
	
	// used to fetch the receipt or bank stmt details 
	@GetMapping(path="/allocations/paypointmisallocations/receiptorbkstmtdetails")
	public List<RecepitStmtDetails> fetchreceiptorbankstmtdetails(@RequestParam double receiptnum){
		
		
		System.out.println(receiptnum);
		
		
		return rsd.getallstmtdetails(receiptnum);
	}
	
	
	// credit files  details
	
	@GetMapping(path="/allocations/paypointmisallocations/creditfiledetails")
	public List<CreditFilesmisallocDetails> fetchcreditfilestopaypoint(){
		
		return cds.getallcreditfiledetails();
		
	}
	
	
	// saving the record into reallocation hdr 
	
	@PostMapping(path="/allocations/paypointmisallocations/inserttoreceiptrealloc")
	public ResponseEntity<?> insertrecordtotrcptrealloc(@RequestBody RcptReallocationHdr rrhd){
		
		
		System.out.println(rrhd.getReceiptNo());
		
		Date reallocdate = new Date();
		rrhd.setPostingStatus("P");
		rrhd.setPostedBy("naveen");
		Date posteddate = new Date();
		System.out.println(rrhd.getRcptAllocAmt());
		Date creationdate = new Date();
		rrhd.setCreatedBy("naveen");
		rrhd.setModifiedBy("naveen");
		
		
		double reallochdrid = rrh.insertrecordtoreallocationhdr(rrhd.getReceiptNo(), reallocdate,
				                                                 rrhd.getPostingStatus(), rrhd.getPostedBy(),
				                                                 posteddate, rrhd.getRcptAllocAmt() ,
				                                                 creationdate, rrhd.getCreatedBy(),
				                                                 creationdate, rrhd.getModifiedBy());
		
		return ResponseEntity.ok().body(reallochdrid);
		
	}
	
	
	// updatin receiptreallocation table
	@PutMapping(path="/allocations/paypointmisallocations/updatereceiptrealloc")
	public ResponseEntity<?> updaterecordtotrcptrealloc(@RequestBody RcptReallocationHdr rrhd,@RequestParam("reallochdrid") double reallochdrid){
		
		System.out.println(reallochdrid);
		System.out.println(rrhd.getReceiptNo());
	
		System.out.println(rrhd.getRcptAllocAmt());
	
		rrhd.setModifiedBy("test");
		
		Date modifiedtime = new Date();
		
		
	  double reallochdridre = rrh.updatetreallochdr( rrhd.getReceiptNo(), rrhd.getRcptAllocAmt(),rrhd.getModifiedBy() , modifiedtime, reallochdrid);
		
	 System.out.println(reallochdridre);
	  
		return ResponseEntity.ok().body("successfully updated");
		
	}
	
	
	// insert into t_receiptfromreallocation table
	
 @PostMapping(path="/allocations/paypointmisallocations/inserttoreceiptreallofromdet")
 public ResponseEntity<?> inserttofromdetreallocation(@RequestBody RcptFromReallocDet rrf,@RequestParam double reallochdrid){
	 
	  System.out.println(reallochdrid);
	  System.out.println(rrf.getReferenceNo());
	  System.out.println(rrf.getPeriod()); 
	  Date creationdate = new Date();
	  Date modifieddate = new Date();
	  rrf.setPostingStatus("U");
	  
	  
	  double reallocfromddet = rrd.insertrecordrcptfromrealloc(reallochdrid, rrf.getApp_id(),rrf.getAppActivityId(), rrf.getReferenceNo(),
			                                                   rrf.getPeriod(), creationdate,
		                                                      rrf.getCreatedBy(), modifieddate, 
			                                                      rrf.getModifiedBy(),rrf.getPostingStatus());
			  
 
	 
	 return ResponseEntity.ok().body(reallocfromddet);
	 
  }
 
 
 // update t_receipt_from_reallocation table
 
 @PutMapping(path="/allocations/paypointmisallocations/updatetoreceiptreallofromdet")
 public ResponseEntity<?> updatefromdetreallocation(@RequestBody RcptFromReallocDet rrf,@RequestParam("reallocfromid") double reallocfromid){
	 
	 Date modified = new Date();
	 rrf.setModifiedBy("test");
	 
	 double reallofromid = rrd.updaterecordrcptfromrealloc(rrf.getReferenceNo(),rrf.getPeriod() ,rrf.getModifiedBy() ,modified,reallocfromid);
	 
	 System.out.println(reallofromid);
	 return ResponseEntity.ok().body("updated sucessfully");
	 
 }
	
 
 
 
	 
// insert record into reallocation todet
 
 @PostMapping(path="/allocations/paypointmisallocations/inserttoreceiptreallotodet")
 public ResponseEntity<?> inserttotodetreallocation(@RequestBody RcptToReallocDet rrt,@RequestParam double reallochdrid){
	 
	 Date creationdate = new Date();
	 Date modifieddate = new Date();
	 
	 rrt.setPostingStatus("U");
	 
	 
	 System.out.println( rrt.getReferenceNo());
	 System.out.println(rrt.getPeriod());
	 System.out.println(rrt.getCrFileName());
	 System.out.println(rrt.getTotCrAmt());
	 System.out.println(rrt.getTotCrAmt());

 
	 double realloctoid = rtr.insertrecordrcpttoreallocdet(reallochdrid, rrt.getApp_id(), rrt.getAppActivityId(),
	                                                       rrt.getReferenceNo(), rrt.getPeriod(), rrt.getCrFileName(),
			                                               rrt.getTotCrAmt(), rrt.getCrHdrId(), 
			                                               creationdate, rrt.getCreatedBy(), 
		                                                   modifieddate, rrt.getModifiedBy(),rrt.getPostingStatus());

	 return ResponseEntity.ok().body(realloctoid);
 }
 
 
 // update treceipttoreallocation table record
 @PutMapping(path="/allocations/paypointmisallocations/updatetoreceiptreallotodet")
 public ResponseEntity<?> updatetodetreallocation(@RequestBody RcptToReallocDet rrt,@RequestParam("realloctoid") double realloctoid){
	
	 System.out.println(realloctoid);
	 System.out.println(rrt.getReferenceNo());
	 System.out.println(rrt.getPeriod());
	 System.out.println(rrt.getCrFileName());
	 System.out.println(rrt.getTotCrAmt());
	 System.out.println(rrt.getCrHdrId());
	 
	 
	 
	 
	 
	 double Toreallocid = rtr.updaterecordrcpttoreallocdet( rrt.getReferenceNo(),  rrt.getPeriod(), 
			                                        rrt.getCrFileName(),  rrt.getTotCrAmt(),rrt.getCrHdrId() ,
			                                       rrt.getModifiedBy() ,rrt.getModifiedDatetime() ,realloctoid );
	 
	 System.out.println(Toreallocid);
	 return ResponseEntity.ok().body("sucessfully updated");
 }

  
 
 
 // fetching all the treceiptrealloca using reallochdrid 
 
  @GetMapping(path="/allocations/paypointmisallocations/reallocationdetails")
  public  List<PpMisAllocDetails> getalltreceiptreallocationdetails(@RequestParam("reallochdrid") double reallochdrid ){
	
	  return ppm.getppmisallocationdetails(reallochdrid);
	  
	 
  }
  
  
 
 
 
 
 
}
