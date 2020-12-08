package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.MisAllocPolicyPartial;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository.MisAllocPolicyPartialRepository;

@Service
public class MisAllocPolicyPartialServiceImpl implements MisAllocPolicyPartialService {

	@Autowired
	public MisAllocPolicyPartialRepository mppr;
	
	
	
	
	@Override
	public List<MisAllocPolicyPartial> getmisallocpolicypartial(String policycode, Date period) {
	
		
		List<MisAllocPolicyPartial> PolicyPartial = new ArrayList<MisAllocPolicyPartial>();
		
		List<Object[]> appi = mppr.getmisallocpolicypartial(policycode, period);
		
		
if (appi != null & !appi.isEmpty()) {
			
			for(Object[] object:appi) {
				
				MisAllocPolicyPartial pp = new MisAllocPolicyPartial();
				
				pp.setMisallocationid((double) object[0]);
				pp.setId((double) object[1]);
				pp.setPolicyid((double) object[2]);
				pp.setPolicycode((String) object[3]);
				pp.setAmount((BigDecimal) object[4]);
				pp.setPeriod((Date) object[5]);
				pp.setPartyid((double) object[6]);
				pp.setPartyname((String) object[7]);
				pp.setRecepitnumber((double) object[8]);
				pp.setFlag((String) object[9]);
				pp.setPostingstatus((String) object[10]);
				pp.setTranscationtype((String) object[11]);
				
				
				
				PolicyPartial.add(pp);
				
				
				
			}
			
}

		
		return PolicyPartial;
	}

	
	
	
	
	
	
	
	
	

}
