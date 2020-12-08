package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.UnspecifiedGso;

public interface UnspecifiedGsoRepository extends JpaRepository<UnspecifiedGso, Long> {
		
	@Query(value="call prd_unspecified_gso(:from_date, :to_date)", nativeQuery=true )
	public List<UnspecifiedGso> getUnspecifiedGso(@Param("from_date") String from_date, 
			@Param("to_date") String to_date ) ;
}
