package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.ManualAdjustment;

public interface ManualAdjustmentRepository extends JpaRepository<ManualAdjustment, Long> {
		
	@Query(value="call prd_manual_adjustment(:from_date, :to_date)", nativeQuery=true )
	public List<ManualAdjustment> getManualAdjustment(@Param("from_date") String from_date, 
			@Param("to_date") String to_date ) ;
}
