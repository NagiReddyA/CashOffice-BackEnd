package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.ReferenceNumberDetails;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Repository.ReferenceNumberDetailsRepository;

@Service
public class ReferenceNumberDetailsServiceImpl implements ReferenceNumberDetailsService {
	
	@Autowired
	private ReferenceNumberDetailsRepository rdr;

	@Override
	public List<ReferenceNumberDetails> referencenumberdetails(String applicationcode, String referencenumber) {
	
		List<ReferenceNumberDetails> referencedetails = new ArrayList<ReferenceNumberDetails>();
		
		List<Object[]>  appi= rdr.referencenumberdetails(applicationcode, referencenumber);
		
	try{
		if (appi != null & !appi.isEmpty()) {
			
			
		      for(Object[] object:appi) {
		    	  
		    	  ReferenceNumberDetails rd = new ReferenceNumberDetails();
		    	  
		    	  rd.setStatusname((String) object[0]);
		    	  rd.setPartyname((String) object[1]);
		    	  
		    	  referencedetails.add(rd) ;
		    	  
		      }
		      
		   
		}
		   return referencedetails;  
		
	}catch(NullPointerException e){
		
	return null;
			
		
	}
		
		
	}
}
