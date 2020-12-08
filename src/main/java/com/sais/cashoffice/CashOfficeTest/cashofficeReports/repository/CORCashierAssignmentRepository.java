package com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORCashierAssignment;

public interface CORCashierAssignmentRepository extends JpaRepository<CORCashierAssignment, Long> {

	// when no input
	@Query(nativeQuery = true, value = "select * from v_cashierassignment")
	List<CORCashierAssignment> getAllCa() ; // @Param("branch_code") ; // String branch_code, @Param("cash_office_code") String cash_office_code);@Query(nativeQuery = true, value = "select distinct * from v_cashierassignment where branch_code=:branch_code AND cash_office_code=:cash_office_code group by pay_method_code,cash_office_code order by cash_office_code"); 

	// PAYMENT METHOD
	// ##########################################################################################################################################################################################################################################

	// Payment Method Repository with both fields filled
	@Query(nativeQuery = true, value = "select distinct * from v_cashierassignment where branch_code=:branch_code AND cash_office_code=:cash_office_code group by pay_method_code,cash_office_code order by cash_office_code")
	List<CORCashierAssignment> getCa(@Param("branch_code") String branch_code, @Param("cash_office_code") String cash_office_code);

	// Payment Method Repository with one field complete
	@Query(nativeQuery = true, value = "select distinct * from v_cashierassignment where branch_code=106 group by pay_method_id,cash_office_desc")
	List<Object[]> getPay(@Param("branch_code") String branch_code);

	// Payment Method Repository with no fields
	@Query(nativeQuery = true, value = "select distinct * from v_cashierassignment group by pay_method_id,cash_office_desc order by cash_office_desc")
	List<CORCashierAssignment> getPayment();

	// ##########################################################################################################################################################################################################################################
	// APPLICATION

	// Application Repository with both fields filled
	@Query(nativeQuery = true, value = "select distinct app_code,app_desc,app_start_date,app_end_date from v_cashierassignment where branch_code=:branch_code AND cash_office_code=:cash_office_code")
	List<Object[]> getApplication(@Param("branch_code") String branch_code,
			@Param("cash_office_code") String cash_office_code);

	// Application Repository with one field complete
	@Query(nativeQuery = true, value = "select distinct app_code,app_desc,app_start_date,app_end_date from v_cashierassignment where branch_code=:branch_code")
	List<Object[]> getAppOne(@Param("branch_code") String branch_code);

	// Application Repository with one field complete
	@Query(nativeQuery = true, value = "select distinct app_code,app_desc,app_start_date,app_end_date from v_cashierassignment")
	List<Object[]> getAppZero();

	// ##########################################################################################################################################################################################################################################
	// CASHIERS
	// Cashier Repository both fields
	@Query(nativeQuery = true, value = "select distinct cashier_code,cashier_name,senior_cashier_yn,ca_start_date,ca_end_date from v_cashierassignment where branch_code=:branch_code AND cash_office_code=:cash_office_code")
	List<Object[]> getCashiers(@Param("branch_code") String branch_code,
			@Param("cash_office_code") String cash_office_code);

	// Cashier Repository one field
	@Query(nativeQuery = true, value = "select distinct cashier_code,cashier_name,senior_cashier_yn,ca_start_date,ca_end_date from v_cashierassignment where branch_code=:branch_code")
	List<Object[]> getCashiersOne(@Param("branch_code") String branch_code);

	// Cashier Repository one field
	@Query(nativeQuery = true, value = "select distinct * from v_cashierassignment group by pay_method_code,cash_office_code")
	List<CORCashierAssignment> getCashiersZero();
	
	// ##########################################################################################################################################################################################################################################
	

	// Branch Codes Repository
	@Query(nativeQuery = true, value = "select distinct branch_code 'Branch_Code' from vw_branch order by branch_code asc")
	List<Object[]> getBranchCode();

	// Cash Office Code Repository
	@Query(nativeQuery = true, value = "select distinct cash_office_code from v_cashierassignment where branch_code=:branch_code order by cash_office_code asc")
	List<Object[]> getCashCode(@Param("branch_code") String branch_code);

}
