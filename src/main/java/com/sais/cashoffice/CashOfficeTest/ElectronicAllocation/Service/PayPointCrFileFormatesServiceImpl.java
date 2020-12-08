package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.PayPointCrFileFormates;
import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Repository.PayPointCrFileFormatesRepository;

@Service
public class PayPointCrFileFormatesServiceImpl implements PayPointCrFileFormatesService {
	
	@Autowired
	private PayPointCrFileFormatesRepository ppfr;

	@Override
	public List<PayPointCrFileFormates> getpaypointdetails() {
	
		List<PayPointCrFileFormates> PayPointCrFileFormates = new ArrayList<PayPointCrFileFormates>();
		
		List<Object[]> appi = ppfr.getpaypointdetails();
		
       if (appi != null & !appi.isEmpty()) {
			
			
			   for(Object[] object:appi) {
				   
				   PayPointCrFileFormates ppc = new PayPointCrFileFormates();
				   
				   ppc.setPaypointid((BigInteger) object[0]);
				   ppc.setPaypointname((String) object[1]);
				   
				   PayPointCrFileFormates.add(ppc);
				   
				   
			   }
       }
		return PayPointCrFileFormates;
	}

}
