package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository.MisallocpartialfromdetRepository;

@Service
public class MisallocpartialfromdetServiceImpl implements MisallocpartialfromdetService {

	@Autowired
	public MisallocpartialfromdetRepository mpfr;
	
	
	
	@Override
	public int insertnewrecordmisallparitalfrmdet(double partialmisallhdrid, double policyid, String policycode,
			Date period, String policystatus, double amount, double partyid, String payorname, double recepitno,
			double listid, String postingstatus, String collectionflag, Date creationdate, String createdby,
			Date modifieddate, String modifiedby) {
		
		return mpfr.insertnewrecordmisallparitalfrmdet(partialmisallhdrid, policyid, policycode,
				period, policystatus, amount, partyid, payorname,
				recepitno, listid, postingstatus, collectionflag, 
				creationdate, createdby, modifieddate, modifiedby);
	}

}
