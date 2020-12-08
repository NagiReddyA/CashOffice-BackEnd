package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.model.MigTranscationbobiModel;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.repository.BibotranscationRepository;


@Service
public class BibotranscationServiceImpl implements BibotranscationService{

	
	@Autowired
	private BibotranscationRepository br;
	
	@Override
	public MigTranscationbobiModel getallbibodetails(double stmt) {
		
		MigTranscationbobiModel mm = br.getallbibodetails(stmt);
		
		try{
			if(mm !=null ){
				 
				return mm;
			}
			
		}catch(NullPointerException e){
			
			return null;
		}
		return mm;
		
	}

}
