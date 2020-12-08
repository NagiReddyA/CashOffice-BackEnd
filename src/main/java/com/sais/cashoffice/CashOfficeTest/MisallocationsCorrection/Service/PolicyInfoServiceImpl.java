package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.PolicyInfo;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Repository.PolicyInfoRepository;


@Service
public class PolicyInfoServiceImpl implements PolicyInfoService{
	
	
	
	@Autowired
	public PolicyInfoRepository policyinfo;

	@Override
	public List<PolicyInfo> fetchallpolicyinfodetails(String policycode) {
		
		List<PolicyInfo> policyinfodetails = new ArrayList<PolicyInfo>();
		
		List<Object[]> appi = policyinfo.getallpolicyinfodetails(policycode);
		
		if (appi != null & !appi.isEmpty()) {
			
			
			for(Object[] object:appi) {
				
				PolicyInfo policyinfomodel = new PolicyInfo();
				
				
//				private String policycode;
//				private BigDecimal policyId;
//				private String firstName;
//				private double expectedAMOUNT;
//				private Date due_date;
//				private int purpose_id;
//				private String purpose;
//				private String postingStatus;
//				private int liabilityStatus;
//				private String statusName;
				
				
				policyinfomodel.setPolicycode((String) object[0]);
				policyinfomodel.setPolicyId((BigDecimal)  object[1]);
				policyinfomodel.setPartyid((BigDecimal) object[2]);
				policyinfomodel.setPartyName((String) object[3]);
				policyinfomodel.setExpectedAMOUNT((double) object[4]);
				policyinfomodel.setDue_date((Date) object[5]);
				policyinfomodel.setPurpose_id((int) object[6]);
				policyinfomodel.setPurpose((String) object[7]);
				policyinfomodel.setPostingStatus((String) object[8]);
				policyinfomodel.setLiabilityStatus((int) object[9]);
				policyinfomodel.setStatusName((String) object[10]);
				
				
				policyinfodetails.add(policyinfomodel);
			
				
			}
			
			
		}
		
		return policyinfodetails;
	}

}
