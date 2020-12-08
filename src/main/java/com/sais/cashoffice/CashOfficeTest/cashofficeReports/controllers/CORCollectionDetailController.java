package com.sais.cashoffice.CashOfficeTest.cashofficeReports.controllers;

//import java.util.Base64; // dbg. Base64 Encoder Things
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORCollectionDetail;
import com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository.CORCollectionDetailRepository;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/cor_collection-detail")
public class CORCollectionDetailController {
	
	@Autowired
	CORCollectionDetailRepository colDetailRepos ;
	
	// how do you pass more than one parameter
	@GetMapping("/{branch_code}&{fromDate}&{toDate}")
	public List<CORCollectionDetail> getCash(
			@PathVariable("branch_code") String branch_code,
			@PathVariable("fromDate") String fromDate,
			@PathVariable("toDate") String toDate){
		
//		byte[] decodedBytes = Base64.getUrlDecoder().decode(branch_code) ; // dbg. Base64 Encoder Things
//		String decodedUrl = new String(decodedBytes) ; // dbg. Base64 Encoder Things 
		
//		System.out.println("Decoded string is " + decodedUrl.trim() + " of length " + decodedUrl.length() ) ; // dbg. Base64 Encoder Things
		
		return colDetailRepos.getDetailCollection(branch_code, fromDate, toDate) ;  
	}
	
	@GetMapping()
	public List<Object> getCodes(){
		
		return colDetailRepos.getBranchCodes() ;  
	}

}

