package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Dde_model;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository.DetddeRepository;

@Service
public class Dde_service_impl implements Dde_service {
	
	
	@Autowired
	private DetddeRepository de;

	@Override
	public List<Dde_model> getalldee(double sr) {
		
		List<Dde_model> tbankhdr = new ArrayList<Dde_model>();
		
		List<Object[]> appi = de.findAllDDEDetails(sr);
		
		for(Object[] object:appi) {
			System.out.println("this value is coming from BEFORE"+object[1]);
		}
		
		
		if (appi != null & !appi.isEmpty()) {
			
			System.out.println("this value is coming  AFTER LOADING");
			
//			for(Object[] object:appi) {
//				System.out.println("this value is coming  AFTER LOADING"+object[1]);
//			}
//			
			for(Object[] object:appi) {
				
				Dde_model bank_join = new Dde_model();
				
				bank_join.setPay_point_name((String) object[1]);
				bank_join.setBk_transaction_type((String) object[14]);
				bank_join.setPeriod((Date) object[15]);
				bank_join.setPaypoint_id((BigDecimal) object[16]);
				bank_join.setStrike_date((Date) object[17]);
				bank_join.setGross_amount((BigDecimal) object[18]);
				bank_join.setAllocated_amount((BigDecimal) object[19]);
				bank_join.setDescription((String) object[20]);
				
				
				tbankhdr.add(bank_join);
			}
		 
			
		
		}
		
		return tbankhdr;
	}

	@Override
	public int insertintobankstmthdr(String paymentmode, String bankname, String accountnumber, Date creationdate,
			Date modifieddate, String bankstmtnumber, String postingstatus, Date stmtstartdate, Date stmtenddate,
			String captureby, double stmtopeningbalance, double stmtclosingbalance, String capturebybranch,
			Date periodforreversal, String createdby) {
		
		return de.insertintobankstmthdr(paymentmode, bankname, accountnumber, 
				                       creationdate, modifieddate, bankstmtnumber, 
				                       postingstatus, stmtstartdate, stmtenddate,
				                       captureby, stmtopeningbalance, stmtclosingbalance,
				                       capturebybranch, periodforreversal, createdby);
	}

}
