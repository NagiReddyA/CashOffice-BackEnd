package com.sais.cashoffice.CashOfficeTest.master.service;

import java.util.List;

import javax.validation.Valid;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOfficeCashier;
import com.sais.cashoffice.CashOfficeTest.entities.TCashier;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignCashierForm;
import com.sais.cashoffice.CashOfficeTest.master.model.CashierDetailsForm;


public interface CashierService {

	List<CashierDetailsForm> fetchAllCashierDetails();

	TCashier findByCashierId(Long employeeId);

	TCashier createCashier(@Valid CashierDetailsForm employee) throws Exception;

	TCashOfficeCashier assignCashier(AssignCashierForm cashier) throws Exception;

	List<AssignCashierForm> findAssignedCashiers(long cashOfficeId);

}
