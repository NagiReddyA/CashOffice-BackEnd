package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository.PpMisAllocDetailsRepository;
import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.PpMisAllocDetails;


@Service
public class PpMisAllocDetailsServiceImpl implements PpMisAllocDetailsService {
	
	
	
	@Autowired
	public PpMisAllocDetailsRepository ppmdr;

	@Override
	public List<PpMisAllocDetails> getppmisallocationdetails(double rellocationhdrid) {
		
		List<Object[]> appi = ppmdr.getppmisallocationdetails(rellocationhdrid);
		
		List<PpMisAllocDetails> ParpMisAllocDetails = new ArrayList<PpMisAllocDetails>();
		
		  if( appi != null && !appi.isEmpty() ){
			  
			  for(Object[] object:appi){
				  
				  PpMisAllocDetails pp = new PpMisAllocDetails();
				  
				  
//				  private double receiptresllocationid;
//					private double receiptno;
//					private double rcptallocamount;
//					private Date realldate;
//					private String postingstatus;
//					private double rcptfromrealldetid;
//					private Date period;
//					private String referencenumber;
//					private String paypointname;
//					private String ppname;
//					private double rcpttorealldetid;
//					private String toreferenceno;
//					private Date toperiod;
//					private String creditfilename;
//					private double totalcreditamount;
//					private double credithdrid;
				  
				  pp.setReceiptresllocationid((double) object[0]);
				  pp.setReceiptno((double) object[1]);
				  pp.setRcptallocamount((double) object[2]);
				  pp.setRealldate((Date) object[3]);
				  pp.setPostingstatus((String) object[4]);
				  pp.setRcptfromrealldetid((double) object[5]);
				  pp.setPeriod((Date) object[6]);
				  pp.setReferencenumber((String) object[7]);
				  pp.setPaypointname((String) object[8]);
				  pp.setPpname((String) object[9]);
				  pp.setRcpttorealldetid((double) object[10]);
				  pp.setToreferenceno((String) object[11]);
				  pp.setToperiod((Date) object[12]);
				  pp.setCreditfilename((String) object[13]);
				  pp.setTotalcreditamount((double) object[14]);
				  pp.setCredithdrid((double) object[15]);
				  
				  
				  ParpMisAllocDetails.add(pp);
	
				  
			  }
			  
			  
			  
			  
		  }
		
		
		return ParpMisAllocDetails;
	}

}
