package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository.RcptFromReallocDetRepository;

@Service
public class RcptFromReallocDetServiceImpl implements RcptFromReallocDetService{

	
	@Autowired
	public RcptFromReallocDetRepository rfrd;
	
	
	@Override
	public int insertrecordrcptfromrealloc(double reallochdrid, double appid, double appactid, String referenceno,
			Date period, Date creationdate, String createdby, Date modifieddate, String modifiedby, String postingstatus) {
		
		return rfrd.insertrecordrcptfromrealloc(reallochdrid, appid,
				                                appactid, referenceno, period,
				                                creationdate, createdby, modifieddate, modifiedby,postingstatus);
	}


	@Override
	public int updaterecordrcptfromrealloc(String paypointid, Date period, String modifiedby, Date modifiedtime,
			double reallocfromid) {
		
		return rfrd.updaterecordrcptfromrealloc(paypointid, period, modifiedby, modifiedtime, reallocfromid);
	}

}
