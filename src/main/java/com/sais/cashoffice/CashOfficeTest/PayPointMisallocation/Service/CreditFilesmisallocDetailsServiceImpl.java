package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository.CreditFilesmisallocDetailsRepository;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.CreditFilesmisallocDetails;


@Service
public class CreditFilesmisallocDetailsServiceImpl implements CreditFilesmisallocDetailsService {

	@Autowired
	public CreditFilesmisallocDetailsRepository cfr;
	
	
	@Override
	public List<CreditFilesmisallocDetails> getallcreditfiledetails() {
		
		List<Object[]> appi = cfr.getallcreditfiledetails();
		
		List<CreditFilesmisallocDetails> CreditFilesmisallocDetails = new ArrayList<CreditFilesmisallocDetails>();
		
		
		if( appi != null && !appi.isEmpty() ){
			  
			  for(Object[] object:appi){
				  
//				  private double credithdrid;
//					private double cramount;
				  
				  CreditFilesmisallocDetails cfr = new CreditFilesmisallocDetails();
				  
				  cfr.setCreditfilename((String) object[0]);
				  cfr.setCredithdrid((double) object[1]);
				  cfr.setCramount((BigDecimal) object[2]);
				  
				  CreditFilesmisallocDetails.add(cfr);
				  
				  
			  }
			  
			  
			  
		}

		
		return CreditFilesmisallocDetails;
	}

}
