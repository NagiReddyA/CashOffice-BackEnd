package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Tbank_join;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository.TBankStmtHdrRepository;
import com.sais.cashoffice.CashOfficeTest.master.model.AppActivitiesForm;


@Service
public class TBankHrdServiceimpl implements TBankHrdService {
	
	@Autowired
	private TBankStmtHdrRepository tr;

	@Override
	public List<Tbank_join> getdatafrommultipletables(double kr) {
		
		List<Tbank_join> tbankhdr = new ArrayList<Tbank_join>();
		List<Object[]> appi = tr.findAllDetails(kr);
		
//		for(Object[] object:appi) {
//			System.out.println("this value is coming from before assignibg the values"+object[0]);
//		}
//		
		
		if (appi != null && !appi.isEmpty()) {
		for(Object[] object:appi) {
			

			Tbank_join bank_join = new 	Tbank_join();
			
			bank_join.setPayment_mode((String) object[0]);
			bank_join.setPay_point_name((String) object[1]);
			bank_join.setAccount_number((String) object[2]);
			bank_join.setCreation_date((Date) object[3]);
			bank_join.setModified_datetime((Date) object[4]);
			bank_join.setBank_stmt_nummber((String) object[5]);
			bank_join.setPosting_status((char) object[6]);
			bank_join.setStmt_start_date((Date) object[7]);
			bank_join.setStmt_end_date((Date) object[8]);
			bank_join.setCaptured_by((String) object[9]);
			bank_join.setStmt_opening_balance((double) object[10]);
			bank_join.setStmt_closing_balance((double) object[11]);
			bank_join.setCaptured_by_branch ((String) object[12]);
			bank_join.setPeriod_for_reversals((Date) object[13]);
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

}
