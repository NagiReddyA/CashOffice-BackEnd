package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.ReprintDeposit;

public interface ReprintDepositRepository extends JpaRepository<ReprintDeposit, Long> {
		
	@Query( 
			value = "select * from vw_reprint_deposit where deposit_slip_id = :deposit_number" , 
					nativeQuery = true )
	public List<ReprintDeposit> getReprintDeposit(@Param("deposit_number") String deposit_number) ;
		
}