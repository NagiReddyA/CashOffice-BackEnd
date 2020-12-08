package com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TPayPoint;


@Repository
public interface PaypointcollectionHistoryRepository extends JpaRepository<TPayPoint,Integer> {
	
	
	@Query(value=" SELECT bktl.Paypoint_Due_Date, SUM(bktl.amount) Expected_Amount , " 
			+ " fn_PP_Collection_Status (?1,bktl.Paypoint_Due_Date) Status FROM T_BANK_TEXT_LINE bktl " 
			+ "  WHERE bktl.Paypoint_Id =?1  GROUP BY bktl.Paypoint_Due_Date ,bktl.Paypoint_Id  ORDER BY  1;",nativeQuery=true)
	List<Object[]> getalldetailsofpaypointcollectionhistory(BigDecimal paypoint_id);
	
	

}
