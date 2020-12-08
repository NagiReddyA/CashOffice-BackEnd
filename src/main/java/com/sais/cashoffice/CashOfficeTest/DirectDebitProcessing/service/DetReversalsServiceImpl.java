package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.DetReversals;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository.ReversalRepository;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository.TBankStmtHdrRepository;

@Service
public class DetReversalsServiceImpl implements DetReversalsService {
	
	@Autowired
	private ReversalRepository thr;
	
	Date date = new Date(0);

	@Override
	public List<DetReversals> fetchDetReversals(double sr) {
		
	
		List<DetReversals> tbankhdr = new ArrayList<DetReversals>();
		List<Object[]> appi = thr.getalldetailsDetReversals(sr);

		for(Object[] object:appi) {
	        System.out.println(" OUTSIDE REVERSAL--------");
		}
			
		
		if (appi != null ) {
			for(Object[] object:appi) {
				
				DetReversals dr = new DetReversals();
				
				 System.out.println("inside  REVERSAL------");
				
				dr.setbK_STMT_DET_REV_ID((double) object[0]);
				dr.setbK_TRANSACTION_TYPE((String) object[1]);
				dr.setpERIOD_FOR_REVERSALS((Date) object[2]);
				dr.setpOLICY_CODE((String) object[3]);
				dr.setpAYOR((String) object[4]);
				dr.setpOLICY_STATUS_ID((int) object[5]);
				dr.seteXPECTED_PREMIUM((BigDecimal) object[6]);
				dr.setaLLOCATED_AMOUNT((BigDecimal) object[7]);
				
				tbankhdr.add(dr);
			}
		}
		
		
		return tbankhdr;
	}

	@Override
	public int rversalrecordinsert(double revid, double stmtid, String transcationtype, Date period, String policycode,
			String payor, int policystatusid, BigDecimal exceptedamount, BigDecimal allocatedamount,
			Date creationdate) {
		
		return thr.reversalrecordinsert(revid, stmtid, transcationtype, period, policycode, payor, policystatusid, exceptedamount, allocatedamount, creationdate);
				
	}

	@Override
	public double fetchreversalsidmax() {
		// TODO Auto-generated method stub
		return thr.getmaxofdetreversals();
	}

	@Override
	public int deletereversalrecord(String payor, String policycode, BigDecimal exceptedamount,
			BigDecimal allocatedamount) {
		// TODO Auto-generated method stub
		return thr.deletereversalrecord(payor, policycode, exceptedamount, allocatedamount);
	}

	
		

	}


