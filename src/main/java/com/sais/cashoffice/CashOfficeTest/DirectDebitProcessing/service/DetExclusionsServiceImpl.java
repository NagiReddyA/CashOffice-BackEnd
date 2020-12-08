package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.DetExclusions;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository.DetExclusionsRepository;

@Service
public class DetExclusionsServiceImpl implements DetExclusionsService {
	
	@Autowired
	private DetExclusionsRepository tbser;
	
	Date date = new Date(0);

	@Override
	public List<DetExclusions> getdetailsexclusions(double sr) {
		
		List<DetExclusions> bsd = new ArrayList();
		List<Object[]> bkdet = tbser.getallDetailsfromTBkStmtDetExclusion(sr);
		
		if (bkdet != null && "null".equals(bkdet)) {
		for(Object[] object:bkdet) {
			
			DetExclusions tbk = new DetExclusions();
			
		     System.out.println("inside object"+object[0]);
			  if(object != null && object.equals("null")) {
				  System.out.println("inside 2nd object"+object[0]);
			  
			tbk.setPERIOD((Date) object[0]);
			tbk.setPOLICY_CODE((String) object[1] );
			tbk.setPOLICY_STATUS_ID((int) object[2]);
			tbk.setEXPECTED_PREMIUM((BigDecimal) object[3]);
		    tbk.setALLOCATED_AMOUNT((BigDecimal) object[4]);	
		   
		    bsd.add(tbk);
			  }
		}
			
		}
		
	
		
		return bsd;
		
		
	}
	
	

}
