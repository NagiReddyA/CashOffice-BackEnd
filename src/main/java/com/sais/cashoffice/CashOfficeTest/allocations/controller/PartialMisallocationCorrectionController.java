package com.sais.cashoffice.CashOfficeTest.allocations.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.MisAllocPolicyPartial;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.Misallocpartialfromdet;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.Misallocpartialhdr;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.Misallocpartialtodet;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.PnewmanualPcode;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository.MisAllocPolicyPartialRepository;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository.PnewmanualPcodeRepository;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service.MisAllocPolicyPartialServiceImpl;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service.MisallocpartialfromdetServiceImpl;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service.MisallocpartialhdrServiceImpl;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service.MisallocpartialtodetServiceImpl;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service.PnewmanualPcodeServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class PartialMisallocationCorrectionController {
	
	// getting MisAllocPolicyPartial details
	
	@Autowired
	public MisAllocPolicyPartialServiceImpl mpps;
	
	// policycode new manual
	@Autowired
	public PnewmanualPcodeServiceImpl PcodeServiceImpl;
	
	
	// misalloccorrectionpartial hdr
	@Autowired
	public MisallocpartialhdrServiceImpl partialhdrServiceImpl;
	
	// misalloccorrectionpartial todet
	@Autowired
	public MisallocpartialtodetServiceImpl partialtodetServiceImpl;
	
	
	// misalloccorrectionpartial from det
	@Autowired
	public MisallocpartialfromdetServiceImpl partialfromdetServiceImpl;
	
	@Autowired
	public MisAllocPolicyPartialRepository mpr;
	
	@Autowired
	public PnewmanualPcodeRepository ppr;
	
	
	
	// fetching all partial misallocation details 
	@GetMapping(path="/allocations/partialmisallocationdetails/policycode")
	public List<MisAllocPolicyPartial> fetchallmisallocpartialdetails(@RequestParam("policycode") String policycode,@RequestParam("period") String perioddetails) throws ParseException{
		 java.sql.Date ds = null ;	
		System.out.println(policycode);
		System.out.println(perioddetails);
		 Date date=ds.valueOf(perioddetails);//converting string into sql date  
		    System.out.println(date);
		
		 
		
		//return null;
		
	return mpps.getmisallocpolicypartial(policycode, date);
	}
	
	
	//fetching newmanual policycode details
	@GetMapping(path="/allocations/partialmisallocationdetails/pnewpolicycode")
	public List<PnewmanualPcode> fetchallpnewmanualpolicydetails(@RequestParam("policycode") String policycode,@RequestParam("period") String perioddetails) throws Exception{
		PnewmanualPcode pp = new PnewmanualPcode();
		 java.sql.Date ds = null ;
		 
		
		
		
		 System.out.println(perioddetails.equals("null"));
		 
	
		 
		if(perioddetails==null || perioddetails.isEmpty() || perioddetails.equals("null")  ){
			
			System.out.println("if condition satsified then only policy code we will as input  ");
			
			
			System.out.println(policycode);
			
			
			return PcodeServiceImpl.getnewmanualpolicydetails1(policycode);
			
			
		} else{
			
			 Date date=ds.valueOf(perioddetails);//converting string into sql date  
			 
		 System.out.println(policycode);
		 
		    System.out.println(date);
		    
		return PcodeServiceImpl.fetchalldetailsnewmanualpcode(policycode,date);
		
		}
		 
	
	}
	
	
	// insert particalmisallocationhdr 
	@PostMapping(path="/allocations/partialmisallocationdetails/inserthdr")
	public ResponseEntity<?> insertnewtohdr(@RequestBody Misallocpartialhdr hdr){
		
		hdr.setPostingStatus("U");
		
		Date Creationdate = new Date();
		Date Modifieddate = new Date();
		hdr.setCreationDate(Creationdate);
		hdr.setModifiedDatetime(Modifieddate);
		hdr.setCreatedBy("Naveen");
		hdr.setModifiedBy("Naveen");
		System.out.println(hdr.getTotalReversalAmt());
		System.out.println(hdr.getTotalAllocatedAmt());
		System.out.print(hdr.getTransactionType());
		
		String transcationtype=hdr.getTransactionType();
		
		if(transcationtype.equals("reverse")){
			hdr.setTransactionType("R");
		}else{
			
			hdr.setTransactionType("A");
		}
		
		double hdrid = partialhdrServiceImpl.insertnewrecordmisallpartialhdr(hdr.getTotalReversalAmt(), hdr.getTotalAllocatedAmt(),
				                                                             hdr.getTransactionType(),hdr.getPostingStatus(), 
				                                                             hdr.getCreationDate(),hdr.getCreatedBy(), 
				                                                             hdr.getModifiedDatetime(),hdr.getModifiedBy());
		System.out.println("hdr id ---->"+hdrid);
	
		return ResponseEntity.ok().body(hdrid);
	}
	
	
	// insert  particalmisallocationfromdet 
	@PostMapping(path="/allocations/partialmisallocationdetails/inserfromdetr")
	public ResponseEntity<?> insertnewfromdet(@RequestBody Misallocpartialfromdet[] fdet,@RequestParam("pmishdrid") double hdrid ){
		
		Date Creationdate = new Date();
		Date Modifieddate = new Date();
		
		fdet[0].setCreationDate(Creationdate);
		fdet[0].setModifiedDatetime(Modifieddate);
		fdet[0].setCreatedBy("Naveen");
		fdet[0].setModifiedBy("Naveen");
		System.out.println(hdrid+"coming from front end ");
		System.out.println(fdet[0].getPolicyId()+"this policy code ");
		
		
	double hrdfromdet = partialfromdetServiceImpl.insertnewrecordmisallparitalfrmdet( hdrid,fdet[0].getPolicyId(),
				                                                                         fdet[0].getPolicyCode(),fdet[0].getPeriod(),
				                                                                         fdet[0].getPolicyStatus(),  fdet[0].getAmount(), 
				                                                                        fdet[0].getPartyId(),fdet[0].getPayorName(), 
				                                                                        fdet[0].getReceiptNo(),fdet[0].getListId(),
				                                                                       fdet[0].getPostingStatus(),fdet[0].getCollectionFlag(),
				                                                                        fdet[0].getCreationDate(), fdet[0].getCreatedBy(),
				                                                                        fdet[0].getModifiedDatetime(),fdet[0].getModifiedBy());
		
		System.out.println("misallocation partial from det---->"+hrdfromdet);
		
		return ResponseEntity.ok().body(hrdfromdet);
	}
	
	
	
	 // insert new recod todet
	@PostMapping(path="/allocations/partialmisallocationdetails/insertoetr")
	public ResponseEntity<?> insertnewtodet(@RequestBody Misallocpartialtodet[] tdet,@RequestParam("pmishdrid") double hdrid ){
		
		
		Date Creationdate = new Date();
		Date Modifieddate = new Date();
		
		tdet[0].setCreationDate(Creationdate);
		tdet[0].setModifiedDatetime(Modifieddate);
		tdet[0].setCreatedBy("Naveen");
		tdet[0].setModifiedBy("Naveen");
		tdet[0].setArrears(new BigDecimal(0.0) );
		//tdet[0].setPostingStatus("");
		//tdet[0].setPolicyStatus("null");
		
		System.out.println(hdrid+"coming from front end ");
		System.out.println(tdet[0].getPolicyCode()+"this policy code from to det  ");
		System.out.println(tdet[0].getPeriod()+"period  ");
		System.out.println(tdet[0].getPolicyStatus()+"policy status   ");
		System.out.println(tdet[0].getAmount()+"amount  ");
		System.out.println(tdet[0].getArrears()+"getArrears()  ");
		System.out.println(tdet[0].getPartyId()+"getPartyId()  ");
		System.out.println(tdet[0].getPolicyId()+"getPolicyId()  ");
		
		
	double hdrtodet = 	partialtodetServiceImpl.insertnewrecordtomisallocpartialtodet(hdrid , tdet[0].getPolicyCode(),
			                                                                          tdet[0].getPeriod(), tdet[0].getPolicyStatus(),
			                                                                          tdet[0].getAmount(), tdet[0].getArrears(),
			                                                                         tdet[0].getPayorName() ,tdet[0].getPostingStatus() ,
			                                                                          tdet[0].getPurpose(), tdet[0].getPartyId(),
			                                                                          tdet[0].getPolicyId() , tdet[0].getReceiptNumber(),
			                                                                         tdet[0].getCreationDate() ,tdet[0].getCreatedBy() ,
			                                                                         tdet[0].getModifiedDatetime(),tdet[0].getModifiedBy());
		
	
	      System.out.println("todet----->"+hdrtodet);
	
		return null;
	}
	
	
	// fetching partialmisallocationtodet details by using hdrid
	
	@GetMapping(path="/allocations/partialmisallocationdetails/todet")
	public List<Misallocpartialtodet> fetchtodetdetailsbyhrdid(@RequestParam("hdrid") double partialhdrid)	

{
		
		System.out.println("the input to todet-->"+partialhdrid);
		
		return partialtodetServiceImpl.fetchalltodetmisalloc(partialhdrid);
}
	
	
	
	
}
