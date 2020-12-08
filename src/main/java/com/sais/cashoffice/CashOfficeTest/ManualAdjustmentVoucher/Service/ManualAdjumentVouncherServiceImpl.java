package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.model.ManualAdjumentVoucherRecordModel;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.repository.ManualAdjumentVouncherRepository;


@Service
public class ManualAdjumentVouncherServiceImpl implements ManualAdjumentVouncherService{
	
	@Autowired
	private ManualAdjumentVouncherRepository mvr;

	@Override
	public List<ManualAdjumentVoucherRecordModel> fetchallunpostvouchers() {
		List<ManualAdjumentVoucherRecordModel> mr =mvr.finalallunpostvouchers();
		try{
			if(mr !=null && !mr.isEmpty()){
				 
				return mr;
			}
			
		}catch(NullPointerException e){
			
			return null;
		}
		return mr;
		
		
	}

}
