package com.sais.cashoffice.CashOfficeTest.allocations.controller;

import java.math.BigDecimal;
import java.text.ParseException;
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

import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.MisallcationFromPol;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.MisallcationToDet;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.MisallocationHdr;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.PolicyInfo;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.VwMisallocatedPolicy;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Repository.PolicyInfoRepository;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Repository.VwMisallocatedPolicyRepository;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service.MisallcationFromDetServiceImpl;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service.MisallcationToDetServiceImpl;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service.MisallocationHdrServiceImpl;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service.PolicyInfoServiceImpl;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service.VwMisallocatedPolicyServiceImpl;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.Misallocpartialtodet;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class MisallocationCorrectionController {
	
	// calling all service implementations
	
	@Autowired
	public VwMisallocatedPolicyServiceImpl vwaps;
	
	
	@Autowired
	public PolicyInfoServiceImpl policyinfoservice;
	
	
	@Autowired
	public MisallocationHdrServiceImpl MisallocatHdrServiceImpl;
	
	
	@Autowired
	public MisallcationToDetServiceImpl MisallcaToDetServiceImpl;
	
	@Autowired
	public MisallcationFromDetServiceImpl MisallcaFromDetServiceImpl;
	
	
	// repository 
	
	@Autowired
	public VwMisallocatedPolicyRepository vwpr;
	
	@Autowired
	public PolicyInfoRepository policyinfor;
	
	
	

	// code used for fetching the VwMisallocatedPolicydetails
	
	@GetMapping(path="/allocations/misallocationcorrection/misallocpolicy")
	public List<VwMisallocatedPolicy> fetchallVwMisallocatedPolicy(@RequestParam("policycode") String policycode){
		
		
		return vwaps.fetchallvwallocatedpolicy(policycode);
		
		//return vwpr.getvwallocatedpolicy(policycode);
		
	}
	
	
	
	@GetMapping(path="/allocations/misallocationcorrection/policyinfo")
	public List<PolicyInfo> fetchallpolicyinfodetails(@RequestParam("policycode") String policycode){
		
		return policyinfoservice.fetchallpolicyinfodetails(policycode);
		
		//return policyinfor.getallpolicyinfodetails(policycode);
		}
	
	
	
	
	@GetMapping(path="/allocations/misallocationcorrection/misallocationdettoget")
	public List<MisallcationToDet> fetchdetailsfrommisallocationtodet(@RequestParam("misallocationhdrid") double misallocationhdrid ){
		
		return MisallcaToDetServiceImpl.fetchallmisalltodet(misallocationhdrid);
		
		
	}
	
	
	
	
	@PostMapping(path="/allocations/misallocationcorrection/misallocationtodetinsertnewrecord")
	public ResponseEntity<?> insertarecordintomisallocationtodet(@RequestParam("misallocidhdr") double hdrid,@RequestBody MisallcationToDet[] mistd ){
		
		
   
	   
	   Date creationdate = new Date();
	   Date modifieddate = new Date();
       
	   mistd[0].setCreatedBy("Naveen");
	   mistd[0].setModifiedBy("Naveen");
	   mistd[0].setPostingstatus("U");
	   
	   System.out.println( mistd[0].getPolicystatus()+"------policystatus");
	  
	   
		
double misallocationtodetrecord = MisallcaToDetServiceImpl.misalltoderecord(hdrid, mistd[0].getPolicyCode(),mistd[0].getPeriod(), 
				                                                           mistd[0].getPolicystatus(), mistd[0].getAmount(), mistd[0].getArrears(), mistd[0].getPartyname(),
				                                                           mistd[0].getPostingstatus(), mistd[0].getPurpose(), mistd[0].getPartyid(), mistd[0].getPolicyid(), 
				                                                           mistd[0].getRecepitNumber(),creationdate, mistd[0].getCreatedBy(),
			                                                           modifieddate, mistd[0].getModifiedBy());

System.out.println("record is saved sucessfull if we get out as 1 or else not saved ----->  "+misallocationtodetrecord);
				
		
		return ResponseEntity.ok().body(misallocationtodetrecord);
	   //return null;
	}
	
	
	
	// used to save a record in misallocationfromdet table
	
	@PostMapping(path="/allocations/misallocationcorrection/misallocationfromdetinsertnewrecord")
	public ResponseEntity<?> insertnewrecordintomisallfromdet(@RequestParam("misallocidhdr") double hdrid,@RequestBody MisallcationFromPol[] misallfrm ){
		
          
		
		  Date creationdate = new Date();
		   Date modifieddate = new Date();
		   
		   misallfrm[0].setCreatedBy("Naveen");
		   misallfrm[0].setModifiedBy("Naveen");
		   misallfrm[0].setPostingstatus("U");
		   
		   
		   System.out.println(hdrid+"intially print misallocation input");
		   System.out.println(misallfrm[0].getRecepitNumber()+"----->getRecepitNumber");
		   System.out.println(misallfrm[0].getId()+"----->getId");
		   System.out.println(misallfrm[0].getCollectionflag()+"---->getCollectionflag");
		   
		 
		   
		   
		   
		   
		  double misallocatedfrmdet = MisallcaFromDetServiceImpl.misallocationfrmdetinsertrecord(hdrid, misallfrm[0].getPolicyid(),misallfrm[0].getPolicyCode(),
				                                                                                  misallfrm[0].getPeriod(), misallfrm[0].getPolicystatus(), misallfrm[0].getAmount(),misallfrm[0].getPartyid(),
				                                                                                   misallfrm[0].getPartyname(), misallfrm[0].getRecepitNumber(), misallfrm[0].getId(), 
				                                                                                   misallfrm[0].getPostingstatus(), misallfrm[0].getCollectionflag(),
				                                                                                   creationdate, misallfrm[0].getCreatedBy(), 
				                                                                                   modifieddate, misallfrm[0].getModifiedBy());
		  System.out.println( "resulted ------->"+misallocatedfrmdet);
		   
		
		return ResponseEntity.ok().body(misallocatedfrmdet);
		   
//		   return null;
		
	}
	
	
	
	// use to save a record in misallocationhdr table
	
	
	@PostMapping(path="/allocations/misallocationcorrection/misallocationhdrrecordinsert")
	public ResponseEntity<?> insertnewrecordmisallochdr(@RequestBody MisallocationHdr mhr){
		
		
		System.out.println(mhr.getTotalReversalAmt());
		
		  Date creationdate = new Date();
		   Date modifieddate = new Date();
		
		
		double misallhdrid = MisallocatHdrServiceImpl.misallochdrnewrecord(mhr.getTotalReversalAmt(), mhr.getTotalAllocatedAmt(), mhr.getPostingStatus(),
				                                                          creationdate, mhr.getCreatedBy(), modifieddate,mhr.getModifiedBy());
		
		
		return ResponseEntity.ok().body(misallhdrid);
		
	}
	
	
	// testing for array object 
	
	@PostMapping(path="/allocations/misallocationcorrection/misallocationhdrrecordinsert22222")
	public ResponseEntity<?> insertnewrecordmisallochdr2(@RequestBody Misallocpartialtodet[] mhr){
		
		System.out.println("enterd");
		System.out.println(mhr[0].getAmount());
		
//		
//		  Date creationdate = new Date();
//		   Date modifieddate = new Date();
//		
//		
//		double misallhdrid = MisallocatHdrServiceImpl.misallochdrnewrecord(mhr.getTotalReversalAmt(), mhr.getTotalAllocatedAmt(), mhr.getPostingStatus(),
//				                                                          creationdate, mhr.getCreatedBy(), modifieddate,mhr.getModifiedBy());
//		
//		
//		return ResponseEntity.ok().body(misallhdrid);
		
		return null;
//		
	}
	

}
