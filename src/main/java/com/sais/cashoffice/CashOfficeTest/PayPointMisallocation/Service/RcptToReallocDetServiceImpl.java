package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository.RcptToReallocDetRepository;

@Service
public class RcptToReallocDetServiceImpl implements RcptToReallocDetService {
	
	
	
	@Autowired
	public RcptToReallocDetRepository rtrd;

	@Override
	public int insertrecordrcpttoreallocdet(double reallochdrid, double appid, double appactid, String referenceno,
			Date period, String creditfile, double creditamount, double credithdrid, Date creationdate,
			String createdby, Date modifieddate, String modifiedby,String postingstatus) {
		
		return rtrd.insertrecordrcpttoreallocdet(reallochdrid, appid, appactid,
				                                 referenceno, period, creditfile,
				                                 creditamount, credithdrid, creationdate, 
				                                 createdby, modifieddate, modifiedby,postingstatus);
	}

	@Override
	public int updaterecordrcpttoreallocdet(String paypointid, Date period, String creditfilename, double creditamount,
			double credithdrid, String modifiedby, Date modifiedtime, double rcpttoid) {
	
		return rtrd.updaterecordrcpttoreallocdet(paypointid, period, creditfilename, creditamount, credithdrid, modifiedby, modifiedtime, rcpttoid);
	}

}
