package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Repository.MisallcationFromDetRepository;




@Service
public class MisallcationFromDetServiceImpl implements MisallcationFromDetService {
	
	
	
	@Autowired
   public MisallcationFromDetRepository misfr;

	@Override
	public double misallocationfrmdetinsertrecord(double misallocationhdrid, double policyid, String policycode,
			Date period, String policystatus, BigDecimal amount, double partyid, String payername, double receiptno,
			BigDecimal listid, String postingstatus, String collectionflag, Date creationdate, String createdby,
			Date modifieddate, String modifiedname) {
		
		return misfr.misallocationfrmdetinsertrecord(misallocationhdrid, policyid, policycode,
				                                          period, policystatus, amount,
				                                          partyid, payername, receiptno, 
				                                         listid, postingstatus, collectionflag,
				                                          creationdate, createdby, modifieddate, modifiedname);
	}

	@Override
	public BigInteger getmisalloctedfromdetid() {
		
		return misfr.getmisalloctedfromdetid();
	}


}
