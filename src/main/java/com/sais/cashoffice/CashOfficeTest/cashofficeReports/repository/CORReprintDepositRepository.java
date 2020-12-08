package com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORReprintDeposit;

public interface CORReprintDepositRepository extends JpaRepository<CORReprintDeposit, Long> {
		
	@Query( 
			value = "select * from vw_reprint_deposit where deposit_slip_id = :deposit_number" , 
					nativeQuery = true )
	public List<CORReprintDeposit> getReprintDeposit(@Param("deposit_number") String deposit_number) ;
		
}