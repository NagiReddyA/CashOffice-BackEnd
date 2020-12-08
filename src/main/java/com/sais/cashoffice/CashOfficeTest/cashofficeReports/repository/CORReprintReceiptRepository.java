package com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORReprintReceipt;

public interface CORReprintReceiptRepository extends JpaRepository<CORReprintReceipt, Long> {
		
	@Query( 
			value = "select * from vw_reprint_receipt where receipt_no = :receipt_number" , 
					nativeQuery = true )
	public List<CORReprintReceipt> getReprintReceipt(@Param("receipt_number") String receipt_number) ;
		
}