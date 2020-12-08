package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.ReceiptAllocationStatus;

public interface ReceiptAllocationStatusRepository extends JpaRepository<ReceiptAllocationStatus, Long> {
		
	@Query( 
			value = "select * from vw_receipt_allocation_status_report where receipt_no = :receipt" , 
					nativeQuery = true )
	public List<ReceiptAllocationStatus> getReceiptAllocationStati(@Param("receipt") String receipt ) ;
		
}