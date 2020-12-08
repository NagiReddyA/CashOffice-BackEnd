package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.CrAllocationDetails;
import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Repository.CrAllocationDetailsRepository;


@Service
public class CrAllocationDetailsServiceImpl implements CrAllocationDetailsService{
	
	@Autowired
	private CrAllocationDetailsRepository crp;
	

	@Override
	public List<CrAllocationDetails> getcreditallocdetails(BigDecimal paypointid) {
		
		List<CrAllocationDetails> CrAllocationDetails = new ArrayList<CrAllocationDetails>();
		
		List<Object[]> appi = crp.getcreditallocdetails(paypointid);
		
		 if (appi != null & !appi.isEmpty()) {
				
				
			   for(Object[] object:appi) {
				   
				   CrAllocationDetails cra = new   CrAllocationDetails();
				   
				   cra.setPaypointid((BigDecimal) object[0]);
				   cra.setFilename((String) object[1]);
				   cra.setCrhhdrid((double) object[2]);
				   cra.setAmount((BigDecimal) object[3]);
				   
				   CrAllocationDetails.add(cra);
				   
			   }
		 }
		
		return CrAllocationDetails;
	}

}
