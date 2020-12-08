package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.UnmatchedCredits;

public interface UnmatchedCreditsRepository extends JpaRepository<UnmatchedCredits, Long> {
		
	@Query(value="call prd_unmatched_credits(:ppid, :ppname, :period)", nativeQuery=true )
	public List<UnmatchedCredits> getUnmatchedCredits(@Param("ppid") String ppid, 
			@Param("ppname") String ppname,
			@Param("period") String period ) ;
	
}
