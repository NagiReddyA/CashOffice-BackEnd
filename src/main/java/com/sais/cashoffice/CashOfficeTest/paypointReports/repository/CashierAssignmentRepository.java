package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.CashierAssignment;

public interface CashierAssignmentRepository extends JpaRepository<CashierAssignment, Long> {
	
	
	@Query(value = "SELECT * FROM v_ca ORDER BY id", nativeQuery = true )
	public List<CashierAssignment> getCa();//@Param("branch_code") String branch, @Param("cash_office_code") String office);
	
}
