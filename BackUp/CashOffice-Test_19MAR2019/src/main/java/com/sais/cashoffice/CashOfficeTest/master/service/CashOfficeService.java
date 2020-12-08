package com.sais.cashoffice.CashOfficeTest.master.service;


import java.util.List;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffApp;
import com.sais.cashoffice.CashOfficeTest.entities.TCompanyOrgan;
import com.sais.cashoffice.CashOfficeTest.master.model.AppActivitiesForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignApplicationForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignPaymentMethodForm;
import com.sais.cashoffice.CashOfficeTest.master.model.CashOfficeDetForm;

public interface CashOfficeService {

	public List<CashOfficeDetForm> getCashOfficeDetails();

	public List<TCompanyOrgan> getBranchesDetails();

	public long createCashOffice(CashOfficeDetForm coDetails);

	public List<AssignApplicationForm> fetchAllApplicationsAssignedToCashOffice(String code);

	public long assignAppToCashOffice(AssignApplicationForm assignForm);

	public List<AssignPaymentMethodForm> fetchAllPaymentMethodsAsgndToCashOffice(String code);

	public long assignPymtMethodToCashOffice(AssignPaymentMethodForm assignForm);

}
