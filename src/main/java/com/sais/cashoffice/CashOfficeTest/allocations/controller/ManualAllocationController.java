package com.sais.cashoffice.CashOfficeTest.allocations.controller;

import java.math.BigDecimal;
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
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model.ManualAllocationFromdet;
import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model.ManualAllocationHdr;
import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model.ManualAllocationToDet;
import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model.ManualAllocationToDtlProcedure;
import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model.ManuallAllocationFromRcptProcedure;
import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service.ManualAllocationFromdetServiceImpl;
import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service.ManualAllocationHdrServiceImpl;
import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service.ManualAllocationToDetServiceImpl;
import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service.ManualAllocationToDtlProcedureServiceImpl;
import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service.ManuallAllocationFromRcptProcedureServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class ManualAllocationController {
	
	@Autowired
	private ManuallAllocationFromRcptProcedureServiceImpl mar;
	
	@Autowired
	private ManualAllocationToDtlProcedureServiceImpl mad;
	
	
	@Autowired
	private ManualAllocationHdrServiceImpl mah;
	
	
	@Autowired
	private ManualAllocationFromdetServiceImpl mrf;
	
	
	@Autowired
	private ManualAllocationToDetServiceImpl matodet;
	
	
	
	// fetching the receipt/bk statment details 
	
	@GetMapping(path="/allocations/manualallocation/receiptdetailsflag")
	public List<ManuallAllocationFromRcptProcedure> fetchreceiptdetailsfromdtl(@RequestParam("bankstmtflag") String bankstmtflag,
			                                                            @RequestParam("receiptnum") double receiptnum){
		 System.out.println(bankstmtflag+"this flag is realted to frompaypoint ");
		 System.out.println(receiptnum);
		
		return mar.getmanualallocationfrmdet(bankstmtflag, receiptnum);
	}
	
	 
	@GetMapping(path="/allocations/manualallocation/receiptdetailsflagtodtl")
	public List<ManualAllocationToDtlProcedure>  fetchreceiptdetailstodl(@RequestParam("bankstmtflag") String bankstmtflag,
			                                                            @RequestParam("receiptnum") double receiptnum){
		
		System.out.println("this flag is realted to topoint"+bankstmtflag);

		 System.out.println(receiptnum);
		 
		 
		return mad.getmanualallocattodtl(bankstmtflag, receiptnum);
		}
	
	
	@GetMapping(path="/allocations/manualallocation/tpolmanualhdrid")
	public Object getmanualallocationhdriddetails(@RequestParam("receipt") double receipt){
		
		
		System.out.println(receipt);
		
		
		return mah.getmanualhdrid(receipt);
		
	}
	
	
	// saving the record into t_po_manual table
	
	@PostMapping(path="/allocations/manualallocation/inserttpolmanualhdr")
	public ResponseEntity<?> insertrecordtpomanualhdr(@RequestBody ManualAllocationHdr ma){
		
	 Date creationdate = new Date();
	 Date modifieddate = new Date();
	 
	 System.out.println(ma.getBankStmtFlag());
	 System.out.println(ma.getTotalAllocatedAmt());
	 System.out.println(ma.getTotalUnallocatedAmt());
	 
	 System.out.println(ma.getTotalPoliciesAmount());
	 System.out.println(ma.getReceiptNo());
	 
	 ma.setCreatedBy("Test");
	 ma.setModifiedBy("Test");
	 ma.setPostingStatus("U");
		
		
	double manualhadrid = mah.insertintomanualallochdr(ma.getReceiptNo(), ma.getTotalAllocatedAmt(),
			                                           ma.getTotalUnallocatedAmt(), ma.getTotalPoliciesAmount(), 
			                                           creationdate, ma.getCreatedBy(), modifieddate,
			                                           ma.getModifiedBy(), ma.getAttribute1(), ma.getBankStmtFlag(),ma.getPostingStatus());
	
	return ResponseEntity.ok().body(manualhadrid);
	
	}
	
	// update tpolmanual hdr table
	@GetMapping(path="/allocations/manualallocation/updatetpolmanualallochdr")
	public Object updatetpomanualhdr(@RequestParam("manualhdrid") double manualhdrid
                                    ,@RequestParam("totalallocatedamount") BigDecimal totalallocatedamount,
                                     @RequestParam("totalunallocatedamount") BigDecimal totalunallocatedamount,
                                     @RequestParam("totalpoliciesamount") BigDecimal totalpoliciesamount,
                                      @RequestParam("modifiedby") String modifiedby){
		
		System.out.println(manualhdrid);
		System.out.println(totalallocatedamount);
		System.out.println(totalunallocatedamount);
		System.out.println(totalpoliciesamount);
		System.out.println(modifiedby);
		
		Date modifieddate = new Date();
		
		
		
		
		return mah.updatetpomanualhdr(manualhdrid, totalallocatedamount, totalunallocatedamount, totalpoliciesamount, modifiedby, modifieddate);
		
	}
	
	// insert the record into t_pol_manual_frm_det
	
	@PostMapping(path="/allocations/manualallocation/inserttpolmanualfromdet")
	public ResponseEntity<?> insertrecordtpomanualfromdet(@RequestBody ManualAllocationFromdet maf,@RequestParam double manualhdrid ){
		
     System.out.println(manualhdrid);
     System.out.println(maf.getPaypointId());
     System.out.println(maf.getPeriod());
     System.out.println(maf.getAllocatedAmount());
     System.out.println(maf.getUnallocatedAmount());
     System.out.println(maf.getReceiptAmount());
     
     System.out.println(maf.getGrossAmount());
     Date creationdate = new Date();
     maf.setCreatedBy("test");
     maf.setPostingStatus("U");
		
		double manualfromid = mrf.insertintomanalallocfromdet(manualhdrid, maf.getPaypointId(), maf.getPeriod(),
				                                               maf.getAllocatedAmount(), maf.getUnallocatedAmount(), maf.getGrossAmount(),
				                                               maf.getReceiptAmount(), maf.getPostingStatus(), creationdate,
				                                               maf.getCreatedBy(), maf.getModifiedDatetime(), maf.getModifiedBy());
		
		return ResponseEntity.ok().body(manualfromid);
	}
	
	
	
	// insert into tpolmanualtodet
	
	@PostMapping(path="/allocations/manualallocation/inserttpolmanualtodet")
	public ResponseEntity<?> insertrecordtpomanualtodet(@RequestBody ManualAllocationToDet[] mtd,@RequestParam("manualhdrid") double manualhdrid,@RequestParam("stmtflag") String stmtflag ){
		
		
		System.out.println(manualhdrid);
		System.out.println(stmtflag);
		System.out.println(mtd[0].getPolicyCode());
		System.out.println(mtd[0].getPeriod());
		System.out.println(mtd[0].getPartyId());
		System.out.println(mtd[0].getPayorName());
		System.out.println(mtd[0].getPurposeName());
		System.out.println(mtd[0].getPurposeId());
		System.out.println(mtd[0].getExpectedAmount());
		System.out.println(mtd[0].getAllocatedAmount());
		
		Date creationdate = new Date();
		mtd[0].setPostedBy("test");
		mtd[0].setPostingStatus("U");
		
		double manualtodet = matodet.insertintomanualalloctodet(manualhdrid, mtd[0].getPolicyCode(), mtd[0].getPolicyId(), 
				                                                mtd[0].getPeriod(), mtd[0].getPartyId(), mtd[0].getPayorName(), mtd[0].getPurposeId(),
				                                                mtd[0].getPurposeName(), mtd[0].getExpectedAmount(), mtd[0].getAllocatedAmount(),
				                                                mtd[0].getPostingStatus(), creationdate, mtd[0].getPostedBy(),
				                                                mtd[0].getModifiedDatetime(), mtd[0].getModifiedBy());
		
		return ResponseEntity.ok().body(manualtodet);
	}
	
	
	
	// deleting the record from to ToDtl manual pol
	
	 @GetMapping(path="/allocations/manualallocation/deletetodtl")
	 public  ResponseEntity<?> deleterecordmanualtodet(@RequestParam("manualhdrid") double manualhdrid,
			                                           @RequestParam("manualToDtlId") double manualToDtlId
			                                           ,@RequestParam("totalallocatedamount") BigDecimal totalallocatedamount,
			                                           @RequestParam("totalunallocatedamount") BigDecimal totalunallocatedamount,
			                                           @RequestParam("totalpoliciesamount") BigDecimal totalpoliciesamount,
			                                           @RequestParam("modifiedby") String modifiedby){
		 
		 System.out.println(manualhdrid);
		 System.out.println(manualToDtlId);
		 Date modifieddate = new Date();
		  
		Object message = mah.deletemanualallocationtodetrecord(manualhdrid, manualToDtlId, totalallocatedamount, totalunallocatedamount, totalpoliciesamount, modifiedby, modifieddate);
	 
		System.out.println(message);
		 
		 return ResponseEntity.ok().body("deleted sucessfully");
	 }
	 
	
	
	
}
