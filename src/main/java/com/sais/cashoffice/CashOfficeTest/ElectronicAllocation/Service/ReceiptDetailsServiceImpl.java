package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.ReceiptDetails;

import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Repository.ReceiptDetailsforElectronicallocationRepository;


@Service
public class ReceiptDetailsServiceImpl implements ReceiptDetailsService {
	
	@Autowired
	private ReceiptDetailsforElectronicallocationRepository rdr;

	@Override
	public List<ReceiptDetails> getreceiptdetails(BigDecimal paypointid) {
         
		List<ReceiptDetails> ReceiptDetails = new ArrayList<ReceiptDetails>();
		
		List<Object[]> appi = rdr.getreceiptdetails(paypointid);
		
		if (appi != null & !appi.isEmpty()) {
			
			
			   for(Object[] object:appi) {
				   
			
					
					ReceiptDetails rd = new ReceiptDetails();
					
					rd.setPaypointid((BigDecimal) object[0]);
					rd.setReceiptno((double) object[1]);
					rd.setAmount((BigDecimal) object[2]);
					rd.setPeriod((Date) object[3]);
					
					ReceiptDetails.add(rd);
					
				   
			   }
			   
			   
		}
		
		return ReceiptDetails;
	}

}
