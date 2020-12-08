package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.DetUnspecified;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Det_Sundry;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository.TBankStmtHdrRepository;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository.UnspecifiedRepository;

@Service
public class DetUnspecifiedServiceImpl implements DetUnspecifiedService {

	@Autowired
	private UnspecifiedRepository UnspecifiedRepository;
	Date date = new Date(0);
	
	
	@Override
	public List<DetUnspecified> fetchallDetUnspecified(double sr) {
	     List<DetUnspecified> DetUnspecified = new ArrayList<DetUnspecified>();
	     List<Object[]> appi = UnspecifiedRepository.getallDetUnspecified(sr);
	     
	     
	     
	     if(appi != null ) {
				for(Object[] object:appi) {
					 Date date = new Date(((Timestamp) object[2]).getTime());
					DetUnspecified tsd =new DetUnspecified();
					
					
					tsd.setbK_STMT_DET_UNSP_ID((double)object[0]);
					tsd.setbK_TRANSACTION_TYPE((String) object[1]);
					tsd.setpERIOD(date);
					tsd.setaLLOCATED_AMOUNT((BigDecimal) object[3]);
					tsd.setcREDIT_YN((char) object[4]);
					tsd.setbK_TRANSACTION_DESC((String) object[5]);
					
					DetUnspecified.add(tsd);
				}
			}
			
	     
			return DetUnspecified;
	
	}


	


	@Override
	public double unspecifiedmax() {
		// TODO Auto-generated method stub
		return UnspecifiedRepository.unspecifiedmax();
	}


	@Override
	public int unspecifiedrecorddeleted(double unspecifiedid) {
		// TODO Auto-generated method stub
		return UnspecifiedRepository.unspecifiedrecorddeleted(unspecifiedid);
	}





	@Override
	public int unspecifiedrecordinsert(double unspecifiedid, double bankstmtid, java.util.Date period,
			BigDecimal allocatedamount, java.util.Date Creationdate, String transcationtype) {
		
		return UnspecifiedRepository.unspecifiedrecordinsert(unspecifiedid, bankstmtid, period, allocatedamount, Creationdate, transcationtype);
	}
	
	


}
