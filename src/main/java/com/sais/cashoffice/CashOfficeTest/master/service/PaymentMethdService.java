package com.sais.cashoffice.CashOfficeTest.master.service;

import java.util.List;
import javax.validation.Valid;

import com.sais.cashoffice.CashOfficeTest.entities.TPaymentMethod;
import com.sais.cashoffice.CashOfficeTest.entities.TCashier;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignCashierForm;
import com.sais.cashoffice.CashOfficeTest.master.model.CashierDetailsForm;

public interface PaymentMethdService {
	
	List<TPaymentMethod> fetchAllPaymentDetails();

}
