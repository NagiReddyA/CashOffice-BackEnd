package com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.model.PaypointCollectionHistory;
import com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.repository.PaypointcollectionHistoryRepository;


@Service
public class Paypointcollectionhistoryserviceimpl implements Paypointcollectionhistoryservice {
	
	@Autowired
	private PaypointcollectionHistoryRepository pchr;
	

	@Override
	public List<PaypointCollectionHistory> getpaypointdetailscollection(BigDecimal paypoint) {
		
		List<PaypointCollectionHistory> pch = new ArrayList<PaypointCollectionHistory>();
		
		List<Object[]> ob = pchr.getalldetailsofpaypointcollectionhistory(paypoint);
		
		
		if (ob != null) {
			
			
			for(Object[] object:ob) {
				
				PaypointCollectionHistory pcollection = new PaypointCollectionHistory();
				
				pcollection.setPaypoint_due_date((Date) object[0] );
		//System.out.println( (Date)object[0]+"<---------this is coming query paypointduedate");
		//System.out.println( object[0]+"<---------this is coming query paypointduedate");		
				pcollection.setExpected_amount((BigDecimal) object[1]);
				
				pcollection.setStatus((String) object[2]);
				
				pch.add(pcollection);
				
				
			}
			
		}
			
		
		return pch;
	}

}
