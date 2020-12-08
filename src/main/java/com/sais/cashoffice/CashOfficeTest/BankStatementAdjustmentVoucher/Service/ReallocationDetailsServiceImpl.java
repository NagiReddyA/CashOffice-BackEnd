package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.ReallocationDetails;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Repository.ReallocationDetailsRepository;

@Service
public class ReallocationDetailsServiceImpl  implements ReallocationDetailsService{
	
	@Autowired
	private ReallocationDetailsRepository rdr;
	

	@Override
	public List<ReallocationDetails> getreallocationdetails(double bankstmtid) {
		
		List<ReallocationDetails> ReallocationDetails = new ArrayList<ReallocationDetails>();
		
		List<Object[]> appi = rdr.getreallocationdetails(bankstmtid);
		
		if (appi != null & !appi.isEmpty()) {
			
			
		      for(Object[] object:appi) {
		    	  
		    	  ReallocationDetails rd = new ReallocationDetails();
		    	  
		 
		    		
		    		rd.setBkStmtToReallDetId((double) object[0]);
		    		rd.setAppId((double) object[1]);
		    		rd.setAppActivityId((double) object[2]);
		    		rd.setAppActivityCode((String) object[3]);
		    		rd.setReferenceNo((String) object[4]);
		    		rd.setReferenceStatus((String) object[5]);
		    		rd.setToreallocateperiod((Date) object[6]);
		    		rd.setPayor((String) object[7]);
		    		rd.setAmount((BigDecimal) object[8]);
		    		rd.setTransactionCode((String) object[9]);
		    		rd.setToreallocpostingStatus((char) object[10]);
		    		rd.setToreallocpostmeaning((String) object[11]);
		    		rd.setAppCode((String) object[12]);
		    		rd.setBkstmtreallocid((double) object[13]);
		    	  
		    		ReallocationDetails.add(rd);
		      }
		}
		
		
		
		return ReallocationDetails;
	}

}
