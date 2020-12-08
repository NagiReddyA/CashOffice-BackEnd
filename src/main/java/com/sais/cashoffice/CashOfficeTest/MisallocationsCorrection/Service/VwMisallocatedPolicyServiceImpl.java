package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.VwMisallocatedPolicy;


import  com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Repository.VwMisallocatedPolicyRepository;


@Service
public class VwMisallocatedPolicyServiceImpl implements VwMisallocatedPolicyService {

	
	@Autowired
	public VwMisallocatedPolicyRepository vwmpr;
	
	
	@Override
	public List<VwMisallocatedPolicy> fetchallvwallocatedpolicy(String policyCode) {
		
		List<VwMisallocatedPolicy> vwmisallocated = new ArrayList<VwMisallocatedPolicy>();
		
		List<Object[]> appi = vwmpr.getvwallocatedpolicy(policyCode);
		
		if (appi != null & !appi.isEmpty()) {
			
			for(Object[] object:appi) {
				
				VwMisallocatedPolicy vwp = new VwMisallocatedPolicy();
				
//				private Double misallocationId;
//				private BigInteger id; 
//				private String policyCode;
//				private Date period;
//				private String payer;
//				private BigInteger recepitNumber;
//				private BigDecimal amount;
//				private String postingstatus;
//				private String policystatus;
				
				vwp.setMisallocationId((double) object[0]);
				vwp.setId((double) object[1]);
				vwp.setPolicyid((double) object[2]);
			vwp.setPolicyCode((String) object[3]);
			  vwp.setAmount((BigDecimal) object[4]);
			vwp.setPeriod((Date) object[5]);
			vwp.setPartyid((double) object[6]);
			vwp.setPartyname((String) object[7]);
			vwp.setRecepitNumber((double) object[8]);
              vwp.setCollectionflag((String) object[9]);
			vwp.setPostingstatus((String) object[10]);
				vwp.setPolicystatus((String)object[11]);
				
				
				vwmisallocated.add(vwp);
				
				
			}
			

			
		}
		
		
		return vwmisallocated;
	}
	
	
	
	
	
}
