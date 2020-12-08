package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TCashier;

@Repository
public interface CashierRepository extends JpaRepository<TCashier, Long> {

	TCashier findByCashierId(long employeeId);

	TCashier findByCashierCodeAndUser_UserId(String cashierCode, String loginId);

	TCashier findByCashierCodeAndCashierName(String cashierCode, String cashierName);
	
	@Query(value=" SELECT CASHIER_ID, ABBR_NAME, CASHIER_CODE, CASHIER_NAME, LOGIN_ID, COMPANY_NAME " + 
		     	 " FROM T_CASHIERS LEFT OUTER JOIN T_COMPANY_ORGAN ON BRANCH_CODE=ORGAN_CODE "  ,nativeQuery=true)
	public List<Object[]> getCashierDtls();

	
	@Query(value="CALL pe_Create_Cashier(?1,?2,?3,?4,?5)",nativeQuery=true)
	public String InsertUpdateCashier(String csh_code, String csh_name, String branch_code,
											String login_id, String created_by);
	
}
