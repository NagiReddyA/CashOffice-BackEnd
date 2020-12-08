package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Repository.BankStatementDetailsRepository;
import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model.BankStatementDetails;


@Service
public class BankStatementDetailsServiceImpl implements BankStatementDetailsService {

	@Autowired
	private BankStatementDetailsRepository bdr;
	
	
	@Override
	public List<BankStatementDetails> getstatementdetails(double bankstmthdrid) {
		
		List<BankStatementDetails> BsoPremium = new ArrayList<BankStatementDetails>();
		List<Object[]>  appi = bdr.getstatementdetails(bankstmthdrid);
		
if (appi != null & !appi.isEmpty()) {
			
			
			for(Object[] object:appi) {
				
				BankStatementDetails bsd = new BankStatementDetails();
				
//				private String paymentmode;
//				private String bankname;
//				private String accountnumber;
//				private String description;
//				private Date creationdate;
//				private Date modifieddate;
//				private String bankstatementnumber;
//				private String postingstatus;
//				private Date stmtstartdate;
//				private Date stmtenddate;
//				private String capatureby;
//				private double openingbalance;
//				private double closingbalance;
//				private String capaturebybranch;
//				private Date periodofreversal;
				
				bsd.setPaymentmode((String) object[0]);
				bsd.setBankname((String) object[1]);
				bsd.setAccountnumber((String) object[2]);
				bsd.setDescription((String) object[3]);
				bsd.setCreationdate((Date) object[4]);
				bsd.setModifieddate((Date) object[5]);
				bsd.setBankstatementnumber((String) object[6]);
				bsd.setPostingstatus((char) object[7]);
				bsd.setStmtstartdate((Date) object[8]);
				bsd.setStmtenddate((Date) object[9]);
				bsd.setCapatureby((String) object[10]);
				bsd.setOpeningbalance((double) object[11]);
				bsd.setClosingbalance((double) object[12]);
				bsd.setCapaturebybranch((String) object[13]);
				bsd.setPeriodofreversal((Date) object[14]);
				
				BsoPremium.add(bsd);
				
				
				
			}
      }
	
		return BsoPremium ;
	}

}
