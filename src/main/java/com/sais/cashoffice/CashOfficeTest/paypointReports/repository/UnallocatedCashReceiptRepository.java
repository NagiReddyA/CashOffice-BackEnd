package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import com.sais.cash.entities.CashierAssignment;
import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.UnallocatedCashReceipt;

public interface UnallocatedCashReceiptRepository extends JpaRepository<UnallocatedCashReceipt, Long> {
		
//	@Query(value = "SELECT * FROM vw_colbranch where branch_code = :branch_code ORDER BY id", nativeQuery = true )
//	public List<CollectionBranch> getBranchCollection(@Param("branch_code") String branch); // , @Param("cash_office_code") String office);
//	
//	@Query(value = "SELECT distinct branch_code FROM vw_branch ORDER BY branch_code", nativeQuery = true )
//	public List<Object> getBranchCodes() ;
//	
//	@Query(value = "select distinct cash_office_code from t_cash_office where branch_code = :branch_code order by cash_office_code", nativeQuery = true )
//	public List<Object> getCashOfficeCodes(@Param("branch_code") String branch) ;
//	
//	@Query(value = "select distinct cashier_code from t_cashiers where branch_code = :branch_code order by cashier_code", nativeQuery = true )
//	public List<Object> getCashierCodes(@Param("branch_code") String branch_code ) ;
//	
//	@Query(value = "SELECT distinct paypoint_id, paypoint_name FROM vw_paypoints ORDER BY paypoint_id", nativeQuery = true )
//	public List<Object> getPaypointIDs() ;
//	
//	@Query(value="call vw_ucr_q1('2000-10-07','2019-10-07')", nativeQuery=true)
//	public List<Object> getUCR() ;

	@Query(value="call prd_unallocated_cash_receipts(:start_date, :end_date)", nativeQuery=true )
	public List<UnallocatedCashReceipt> getUnallocatedCashReceipts(@Param("start_date") String start_date, @Param("end_date") String end_date) ;
	
}
