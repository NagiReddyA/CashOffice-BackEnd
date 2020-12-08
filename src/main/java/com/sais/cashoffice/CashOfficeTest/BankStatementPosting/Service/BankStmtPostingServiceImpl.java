package com.sais.cashoffice.CashOfficeTest.BankStatementPosting.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.BankStatementPosting.Model.BankStmtPosting;
import com.sais.cashoffice.CashOfficeTest.BankStatementPosting.Repository.BankStmtPostingRepository;

@Service
public class BankStmtPostingServiceImpl implements BankStmtPostingService {
	
	@Autowired
	private BankStmtPostingRepository bpr;

	@Override
	public List<BankStmtPosting> getbankstmtpostdetails(double bankstmtid) {
		
		List<BankStmtPosting> BankStmtPosting = new ArrayList<BankStmtPosting>();
		
		List<Object[]> appi = bpr.getbankstmtpostdetails(bankstmtid);
		
		
		if (appi != null & !appi.isEmpty()) {
			
			
		      for(Object[] object:appi) {
		    	  
	
		    		
		    		BankStmtPosting bsp = new BankStmtPosting();
		    		
		    		bsp.setBankstmtid((double) object[0]);
		    		bsp.setPaymentmode((String) object[1]);
		    		bsp.setAccountnumber((String) object[2]);
		    		bsp.setAccountdescription((String) object[3]);
		    		bsp.setBankname((String) object[4]);
		    		bsp.setBankstmtnumber((String) object[5]);
		    		bsp.setModifieddate((Date) object[6]);
		    		bsp.setStmtstartdate((Date) object[7]);
		    		bsp.setStmtenddata((Date) object[8]);
		    		bsp.setPostingstatus((char) object[9]);
		    		bsp.setStmtbalstatus((char) object[10]);
		    		
		    		BankStmtPosting.add(bsp);
		    	  
		      }
		      
		}
		
		
		
		return BankStmtPosting;
	}

}
