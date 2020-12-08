package com.sais.cashoffice.CashOfficeTest.master.service;


import java.util.List;

import javax.validation.Valid;

import com.sais.cashoffice.CashOfficeTest.entities.TApplication;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOffApp;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOffPymtMthd;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOffice;
import com.sais.cashoffice.CashOfficeTest.entities.TCompanyOrgan;
import com.sais.cashoffice.CashOfficeTest.master.model.AppActivitiesForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AppSetUpForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignApplicationForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignPaymentMethodForm;
import com.sais.cashoffice.CashOfficeTest.master.model.CashOfficeDetForm;

public interface CashOfficeService {

	public List<CashOfficeDetForm> getCashOfficeDetails();

	public List<TCompanyOrgan> getBranchesDetails();

	public TCashOffice createCashOffice(CashOfficeDetForm coDetails) throws Exception;

	public List<AssignApplicationForm> fetchAllApplicationsAssignedToCashOffice(String code);

	public TCashOffApp assignAppToCashOffice(AssignApplicationForm assignForm) throws Exception;

	public List<AssignPaymentMethodForm> fetchAllPaymentMethodsAsgndToCashOffice(String code);

	public TCashOffPymtMthd assignPymtMethodToCashOffice(AssignPaymentMethodForm assignForm) throws Exception;

	

}
