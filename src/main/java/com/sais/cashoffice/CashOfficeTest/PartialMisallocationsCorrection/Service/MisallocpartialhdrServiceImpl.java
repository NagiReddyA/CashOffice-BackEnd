package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository.MisallocpartialhdrRepository;

@Service
public class MisallocpartialhdrServiceImpl implements MisallocpartialhdrService{

	
	@Autowired
	public MisallocpartialhdrRepository mphr;
	
	
	@Override
	public int insertnewrecordmisallpartialhdr(double totalrevamount, double totalamount, String transcationtype,
			String postingstatus, Date creationdate, String createdby, Date modifieddate, String modifiedby) {
		
		return mphr.insertnewrecordmisallpartialhdr(totalrevamount, 
				                                   totalamount, transcationtype, postingstatus,
				                                   creationdate, createdby, modifieddate, modifiedby)
				
				;
	}

}
