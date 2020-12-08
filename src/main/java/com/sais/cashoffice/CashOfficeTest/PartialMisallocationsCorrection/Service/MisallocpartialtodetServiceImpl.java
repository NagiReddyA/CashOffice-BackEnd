package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.Misallocpartialtodet;
import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository.MisallocpartialtodetRepository;

@Service
public class MisallocpartialtodetServiceImpl implements MisallocpartialtodetService {

	
	@Autowired
	public MisallocpartialtodetRepository mptdr;
	
	
	
	@Override
	public List<Misallocpartialtodet> fetchalltodetmisalloc(double misallocatedid) {
		
		List<Misallocpartialtodet> 	 Misallocpartialtodet = new ArrayList<Misallocpartialtodet>();
		List<Object[]>  appi = mptdr.getallmisallocpartialtodetdetails(misallocatedid);
		
if (appi != null & !appi.isEmpty()) {
			
			
			for(Object[] object:appi) {
				
				Misallocpartialtodet mpd = new Misallocpartialtodet();
				
				mpd.setPolicyCode((String) object[0]);
				mpd.setPeriod((Date) object[1]);
				mpd.setPolicyStatus((String) object[2]);
				mpd.setAmount((BigDecimal) object[3]);
				mpd.setPartyId((double) object[4]);
				mpd.setPayorName((String) object[5]);
				mpd.setArrears((BigDecimal) object[6]);
				mpd.setPurpose((String) object[7]);
				mpd.setPolicyId((double) object[8]);
				mpd.setReceiptNumber((String) object[9]);
				mpd.setPostingStatus((String) object[10]);
				mpd.setPolParMisallocToId((double) object[11]);
				mpd.setPolparmisallochdrid((double) object[12]);
				mpd.setTotalreversalamount((BigDecimal) object[13]);
				mpd.setAllocatedammmount((BigDecimal) object[14]);
				mpd.setTotalunallocated((BigDecimal) object[15]);
				
				
				Misallocpartialtodet.add(mpd);
				
			}
}
		
		
		
		return Misallocpartialtodet;
	}



	@Override
	public int insertnewrecordtomisallocpartialtodet(double misalloparialhdrid, String policycode, Date period,
			String policystatus, BigDecimal amount, BigDecimal arrears, String payourname, String postingstatus, String purpose,
			Double partyid, Double policyid, String recepitno, Date creationdate, String createdby, Date modified,
			String modifiedby) {
		
		return mptdr.insertnewrecordtomisallocpartialtodet(misalloparialhdrid, policycode, period,
				                                           policystatus, amount,
				                                           arrears, payourname, postingstatus,
				                                           purpose, partyid,
				                                           policyid, recepitno, creationdate,
				                                           createdby, modified, modifiedby);
	}



	

	
	

}
