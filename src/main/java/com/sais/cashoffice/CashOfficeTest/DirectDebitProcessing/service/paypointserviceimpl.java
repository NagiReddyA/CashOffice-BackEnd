package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Det_Sundry;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Vw_PayPoints;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository.TBankStmtHdrRepository;

@Service
public class paypointserviceimpl implements paypointservice {

	
	@Autowired
	private TBankStmtHdrRepository hdrrepository;
	
	
	@Override
	public List<Vw_PayPoints> fetchalldetailsofpaypoint() {
		
		
		List<Vw_PayPoints> vwp = new ArrayList<Vw_PayPoints>();
		List<Object[]> appi = hdrrepository.getdetailspaypoint();
		
		if(appi != null && !appi.isEmpty()) {
			for(Object[] object:appi) {
				
				Vw_PayPoints vw = new Vw_PayPoints();
				
				vw.setPaypoint_id((BigDecimal) object[0]);
				
				vw.setPayPoint_Name((String) object[1]);
				
				vw.setPay_Point_Type_id((char) object[2]);
				
				vw.setPAY_MODE_ID((int) object[3]);
				
				vw.setPAY_MODE_NAME((String) object[4]);
				
				vw.setPay_mode_short_name((String) object[5]);
				vwp.add(vw);
			}
			
		}
		
		return vwp;
			}
		
	}

