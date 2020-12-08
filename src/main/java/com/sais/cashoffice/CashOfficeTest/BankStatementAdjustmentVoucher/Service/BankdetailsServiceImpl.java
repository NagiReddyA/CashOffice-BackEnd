package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.Bankdetails;
import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Repository.BankdetailsRepository;

@Service
public class BankdetailsServiceImpl implements BankdetailsService {
	
	@Autowired
	private BankdetailsRepository bdr;

	@Override
	public List<Bankdetails> getbankstmtdetails(double bankstmtid) {
		
		List<Bankdetails>  Bankdetails = new ArrayList<Bankdetails>();
		
		List<Object[]> appi = bdr.getbankstmtdetails(bankstmtid);
		
          if (appi != null & !appi.isEmpty()) {
			
			
			      for(Object[] object:appi) {
			    	  
			    	  Bankdetails bd = new Bankdetails();
			    	  
			    	
			    
			    		
			    		bd.setBankstmtreallocid((double) object[0]);
			    		bd.setBankstmtid((double) object[1]);
			    		bd.setBankid((BigDecimal) object[2]);
			    		bd.setDescription((String) object[3]);
			    		bd.setCreationdate((Date) object[4]);
			    		bd.setModifieddate((Date) object[5]);
			    		bd.setAccountnumber((String) object[6]);
			    		bd.setBankstatementnumber((String) object[7]);
			    		bd.setPaymentmode((String) object[8]);
			    		bd.setStmtstartdate((Date) object[9]);
			    		bd.setStmtenddate((Date) object[10]);
			    		bd.setOpeningbalance((double) object[11]);
			    		bd.setClosingbalance((double) object[12]);
			    		bd.setCapatureby((String) object[13]);
			    		bd.setCapaturebybranch((String) object[14]);
			    		bd.setPostingstatus((char) object[15]);
			    		bd.setPostingval((String) object[16]);
			    		bd.setPosttogl((char) object[17]);
			    		bd.setGlpostingvalue((String) object[18]);
			    		bd.setBankname((String) object[19]);
			    		
			    		
			    		
			    		Bankdetails.add(bd);
			    	  
			    	  
			    	  
			      }
			      
			      
          }	
		
		return Bankdetails;
	}

}
