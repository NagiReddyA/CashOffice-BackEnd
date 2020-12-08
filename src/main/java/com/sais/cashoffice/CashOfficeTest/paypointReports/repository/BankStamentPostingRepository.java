package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.BankStatementPosting;


public interface BankStamentPostingRepository extends JpaRepository<BankStatementPosting, Long> {
	
	@Query(nativeQuery = true, value = "call p_bank_statemnt_posting(:bankstmntID)")
	List<BankStatementPosting> getReport(@Param("bankstmntID") int bsID);
	
	

}
