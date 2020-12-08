package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import com.sais.cash.entities.CashierAssignment;
import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.CollectionDetail;

public interface CollectionDetailRepository extends JpaRepository<CollectionDetail, Long> {
		
	@Query(value = "SELECT * FROM vw_coldetail WHERE branch_code = :branch_code AND receipt_date BETWEEN DATE(:fromDate) AND DATE(:toDate)", nativeQuery = true )
	public List<CollectionDetail> getDetailCollection(@Param("branch_code") String branch_code, 
			@Param("fromDate") String fromDate, @Param("toDate") String toDate);
	
	// move this to a abstract parent class
	@Query(value = "SELECT distinct branch_code FROM vw_branch ORDER BY branch_code", nativeQuery = true )
	public List<Object> getBranchCodes() ;
	
}