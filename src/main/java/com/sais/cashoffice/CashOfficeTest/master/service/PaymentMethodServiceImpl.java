package com.sais.cashoffice.CashOfficeTest.master.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.master.model.CashierDetailsForm;
import com.sais.cashoffice.CashOfficeTest.master.repository.PaymentMethodRepository;
import com.sais.cashoffice.CashOfficeTest.entities.TPaymentMethod;

@Service
public class PaymentMethodServiceImpl implements PaymentMethdService {
	
	@Autowired
	private PaymentMethodRepository payMethodRepo;

	
	@Override
	public List<TPaymentMethod> fetchAllPaymentDetails() {		
		List<TPaymentMethod> appFormList1 = new ArrayList<TPaymentMethod>();
	    List<Object[]> appList = payMethodRepo.getPayMtdDtls();
	    if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				TPaymentMethod appForm = new TPaymentMethod();
				appForm.setPayMethodId((int) object[0]);
				appForm.setPayMethodCode((String) object[1]);
				appForm.setPayMethodDesc((String) object[2]);
				appForm.setEnabled((char) object[3]);
				appFormList1.add(appForm);				
			}	
	    }
		return appFormList1;			
	}


}
