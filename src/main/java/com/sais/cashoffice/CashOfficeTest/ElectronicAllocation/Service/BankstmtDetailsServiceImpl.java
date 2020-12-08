package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.BankstmtDetails;
import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Repository.BankstmtDetailsRepository;

@Service
public class BankstmtDetailsServiceImpl implements BankstmtDetailsService{
	
	@Autowired
	private BankstmtDetailsRepository bdr;

	@Override
	public List<BankstmtDetails> getbankstmtdetails(BigDecimal paypointid) {
		
		List<BankstmtDetails> BankstmtDetails = new ArrayList<BankstmtDetails>();
		
		List<Object[]> appi = bdr.getbankstmtdetails(paypointid);
		
		if (appi != null & !appi.isEmpty()) {
			
			
			   for(Object[] object:appi) {
				   
				   BankstmtDetails bd = new BankstmtDetails();
				
					
				   bd.setPaypointid((BigDecimal) object[0]);
				   bd.setBankstmtid((double) object[1]);
				   bd.setPeriod((Date) object[2]);
				   bd.setAllocatedamount((BigDecimal) object[3]);
				   
				   BankstmtDetails.add(bd);  
				   
			   }
		}
		
		return BankstmtDetails;
	}

}
