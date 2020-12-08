package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Repository.BycodeperiodProcedureRepository;

import com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model.BycodeperiodProcedure;


@Service
public class BycodeperiodProcedureServiceImpl implements BycodeperiodProcedureService {
	
	@Autowired
	private BycodeperiodProcedureRepository bpr;

	@Override
	public List<BycodeperiodProcedure> getpcodeperioddetails(String policycode, Date period) {
		
		List<BycodeperiodProcedure> Bsopcode = new ArrayList<BycodeperiodProcedure>();
		List<Object[]>  appi = bpr.getpcodeperioddetails(policycode, period);
		
		 if (appi != null & !appi.isEmpty()) {
				
				
				for(Object[] object:appi) {
					
					BycodeperiodProcedure bpc = new BycodeperiodProcedure();
					
//					private String policycode;
//					private BigDecimal policyid;
//					private BigDecimal partyid;
//					private String partyname;
//					private double exceptedamount;
//					private Date duedate;
//					private int purposeid;
//					private String purpose;
//					private char postingstatus;
//					private String liabilitystatus;
//					private String stattusname;
					
					bpc.setPolicycode((String) object[0]);
					bpc.setPolicyid((BigDecimal) object[1]);
					bpc.setPartyid((BigDecimal)  object[2]);
					bpc.setPartyname((String) object[3]);
					bpc.setExceptedamount((double) object[4]);
					bpc.setDuedate((String) object[5]);
					bpc.setPurposeid((int) object[6]);
					bpc.setPurpose((String) object[7]);
					bpc.setPostingstatus((String) object[8]);
					bpc.setLiabilitystatus((int) object[9]);
					bpc.setStattusname((String) object[10]);
					
					Bsopcode.add(bpc);
					
				}
				
				
		 }
		
		
		
		return Bsopcode;
	}

}
