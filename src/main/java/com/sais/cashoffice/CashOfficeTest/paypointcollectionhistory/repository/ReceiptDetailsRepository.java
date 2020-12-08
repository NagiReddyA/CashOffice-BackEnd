package com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TPayPoint;


@Repository
public interface ReceiptDetailsRepository extends JpaRepository<TPayPoint,Integer> {
	
	
	
	@Query(value="call pe_PP_Receipt(?1,?2)",nativeQuery=true)
	List<Object[]> getReceiptdetails(BigDecimal paypointid,Date period);

}
