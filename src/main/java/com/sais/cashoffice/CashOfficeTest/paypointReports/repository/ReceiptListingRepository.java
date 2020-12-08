package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.ReceiptListing;

public interface ReceiptListingRepository extends JpaRepository<ReceiptListing, Long> {
		
	@Query( 
			value = "select * from vw_daily_receipt_listing where date(receipt_date) = date(:receipt_date) and cash_office_id = :cash_office_id and branch_code = :branch_code and cashier_code = :cashier_code" , 
					nativeQuery = true )
	public List<ReceiptListing> getReceiptListing(@Param("receipt_date") String receipt_date,
			@Param("cash_office_id") String cash_office_id,
			@Param("branch_code") String branch_code,
			@Param("cashier_code") String cashier_code ) ;
		
}