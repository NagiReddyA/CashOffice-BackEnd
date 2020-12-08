package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.ReprintReceipt;

public interface ReprintReceiptRepository extends JpaRepository<ReprintReceipt, Long> {
		
	@Query( 
			value = "select * from vw_reprint_receipt where receipt_no = :receipt_number" , 
					nativeQuery = true )
	public List<ReprintReceipt> getReprintReceipt(@Param("receipt_number") String receipt_number) ;
		
}