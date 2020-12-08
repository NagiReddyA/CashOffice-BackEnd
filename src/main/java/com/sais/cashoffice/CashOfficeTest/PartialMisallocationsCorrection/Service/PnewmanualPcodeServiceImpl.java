package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.PnewmanualPcode;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository.PnewmanualPcodeRepository;


@Service
public class PnewmanualPcodeServiceImpl implements PnewmanualPcodeService {
	
	
	@Autowired
	public PnewmanualPcodeRepository pnpr;
	

	@Override
	public List<PnewmanualPcode> fetchalldetailsnewmanualpcode(String policycode, Date period){
		
		
		List<PnewmanualPcode> PnewmanualPcode = new ArrayList<PnewmanualPcode>();
		
		List<Object[]> appi = pnpr.getnewmanualpolicydetails(policycode, period);
		
		System.out.println("we are in service implementation");
		System.out.println();
		
if (appi != null & !appi.isEmpty()) {
			
			for(Object[] object:appi) {
				
				PnewmanualPcode pnpc = new PnewmanualPcode();
				
				pnpc.setPolicycode((String) object[0]);
				pnpc.setPolicyid((int) object[1]);
				pnpc.setPartyid((BigDecimal) object[2]);
				pnpc.setPartyname((String) object[3]);
				pnpc.setExceptedamount((BigInteger) object[4]);
				pnpc.setDuedate((String) object[5]);
				pnpc.setPurposeid((BigInteger) object[6]);
				pnpc.setPurpose((String) object[7]);
				pnpc.setPostingstatus((String) object[8]);
				pnpc.setLiabilitystatus((int) object[9]);
				pnpc.setStatusname((String) object[10]);
				
				PnewmanualPcode.add(pnpc);
				
				
			}
			
}
		
		
		
		
		
		
		return PnewmanualPcode;
		
	//	return null;
	}
	
	
	
	


	@Override
	public List<PnewmanualPcode> getnewmanualpolicydetails1(String policycode) {
		
		
		List<PnewmanualPcode> PnewmanualPcode = new ArrayList<PnewmanualPcode>();
		
		
		List<Object[]> appi = pnpr.getnewmanualpolicydetails1(policycode);
		
		String purpose=null;
		
         
		for(Object[] object:appi) {
			PnewmanualPcode pnpc1 = new PnewmanualPcode();
			pnpc1.setPurpose((String) object[7]);
			System.out.println(pnpc1.getPurpose());
			purpose = pnpc1.getPurpose();
			
			
		}
		
		if(purpose.equals("00")){
			System.out.println("yes ");
			
			for(Object[] object:appi) {
				
				
				PnewmanualPcode pnpc = new PnewmanualPcode();
				BigInteger i = new BigInteger("0");
				
				pnpc.setPolicycode("00");
				pnpc.setPolicyid(0);
				pnpc.setPartyid(new BigDecimal(0));
				pnpc.setPartyname("");
				pnpc.setExceptedamount(i);
				pnpc.setDuedate("null");
				pnpc.setPurposeid(i);
				pnpc.setPurpose("");
				pnpc.setPostingstatus("");
				pnpc.setLiabilitystatus(0);
				pnpc.setStatusname("");
				
				PnewmanualPcode.add(pnpc);
				
				
			}
			
			return PnewmanualPcode;
			
		}else{
			
			
			
			if (appi != null & !appi.isEmpty()) {
			
				
					for(Object[] object:appi) {
						
						PnewmanualPcode pnpc = new PnewmanualPcode();
						
						pnpc.setPolicycode((String) object[0]);
						pnpc.setPolicyid((int) object[1]);
						pnpc.setPartyid((BigDecimal) object[2]);
						pnpc.setPartyname((String) object[3]);
						pnpc.setExceptedamount((BigInteger) object[4]);
						pnpc.setDuedate((String) object[5]);
						pnpc.setPurposeid((BigInteger) object[6]);
						pnpc.setPurpose((String) object[7]);
						pnpc.setPostingstatus((String) object[8]);
						pnpc.setLiabilitystatus((int) object[9]);
						pnpc.setStatusname((String) object[10]);
						
						PnewmanualPcode.add(pnpc);
						
						
					}
					
		      }
				
				
				return PnewmanualPcode;
			
			
		}
		
		
		
		
			
		

		
		
	}	
			


	
	
	
	
}
