package com.sais.cashoffice.CashOfficeTest.master.service;

import java.util.List;

import javax.validation.Valid;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOfficeCashier;
import com.sais.cashoffice.CashOfficeTest.entities.TCashier;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignCashierForm;
import com.sais.cashoffice.CashOfficeTest.master.model.CashierDetailsForm;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PolicyForm;


public interface CashierService {

	List<CashierDetailsForm> fetchAllCashierDetails();

	TCashier findByCashierId(Long employeeId);

	TCashier createCashier(@Valid CashierDetailsForm employee) throws Exception;

	TCashOfficeCashier assignCashier(AssignCashierForm cashier) throws Exception;

	List<AssignCashierForm> findAssignedCashiers(long cashOfficeId);
	
	public String InsertUpdateCashierDtls(String csh_code, String csh_name, String branch_code,
													String login_id, String created_by);

}
