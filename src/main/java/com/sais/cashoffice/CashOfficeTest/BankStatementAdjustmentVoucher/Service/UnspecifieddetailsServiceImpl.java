package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.Unspecifieddetails;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Repository.UnspecifieddetailsRepository;


@Service
public class UnspecifieddetailsServiceImpl implements UnspecifieddetailsService {
	
	@Autowired
	private UnspecifieddetailsRepository usr;

	@Override
	public List<Unspecifieddetails> getunspecifieddetails(double bankstmtid) {
		
		List<Unspecifieddetails> unspecified = new ArrayList<Unspecifieddetails>();
		
		List<Object[]> appi = usr.getunspecifieddetails(bankstmtid);
		
		if (appi != null & !appi.isEmpty()) {
			
			
		      for(Object[] object:appi) {
		    	  
		    	  Unspecifieddetails us = new Unspecifieddetails();
		    	  
		    
		    	    
		    	    
		    	    us.setBankunspecifiedid((double) object[0]);
		    	    us.setBktranstype((String) object[1]);
		    	    us.setPeriod((Date) object[2]);
		    	    us.setAllocatedamount((BigDecimal) object[3]);
		    	    us.setBktranstypedesc((String) object[5]);
		    	    us.setCredityn((char) object[6]);
		    	    
		    	    unspecified.add(us);
		    	  
		    	  
		      }
		      
		}
		
		
		return unspecified;
	}

}
