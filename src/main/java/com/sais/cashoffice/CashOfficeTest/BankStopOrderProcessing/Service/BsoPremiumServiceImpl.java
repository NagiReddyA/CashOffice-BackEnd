package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Repository.BsoPremiumRepository;
import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model.BsoPremium;


@Service
public class BsoPremiumServiceImpl implements BsoPremiumService {

	@Autowired
	private BsoPremiumRepository bpr;
	
	@Override
	public List<BsoPremium> getbsopremiumdetails(double bankstmthdrid) {
		
		List<BsoPremium> BsoPremium = new ArrayList<BsoPremium>();
		List<Object[]>  appi = bpr.getbsopremiumdetails(bankstmthdrid);
             if (appi != null & !appi.isEmpty()) {
			
			
			for(Object[] object:appi) {
				
				BsoPremium bp = new BsoPremium();
				
				bp.setBkStmtDetBsoId((double) object[0]);
				bp.setBkTransactionType((String) object[1]);
				bp.setPeriod((Date) object[2]);
				bp.setPolicyCode((String) object[3]);
				bp.setPayor((String) object[4]);
				bp.setAllocatedAmount((BigDecimal) object[5]);
				bp.setPolicyStatusId((String) object[6]);
				bp.setExpectedPremium((BigDecimal) object[7]);
				bp.setCredityn((char) object[8]);
				
				
				BsoPremium.add(bp);
				
			}
		
             }
		return BsoPremium;
	}

	@Override
	public int insertintobsopremium(double bankstmthdrid, String transcationtype, Date period, String policycode,
			String policystatus, String payor, BigDecimal exceptedpremium, BigDecimal allocatedamount, Date creationtime,
			Date modifiedtime) {
		
		return bpr.insertintobsopremium(bankstmthdrid, transcationtype, 
				                          period, policycode, policystatus,
				                          payor, exceptedpremium, allocatedamount, creationtime, 
				                          modifiedtime);
	}

}
