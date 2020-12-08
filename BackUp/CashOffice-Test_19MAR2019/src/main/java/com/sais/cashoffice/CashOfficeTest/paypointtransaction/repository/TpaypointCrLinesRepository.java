package com.sais.cashoffice.CashOfficeTest.paypointtransaction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sais.cashoffice.CashOfficeTest.entities.TPaypointCrLine;

public interface TpaypointCrLinesRepository extends JpaRepository<TPaypointCrLine, Long>{

	@Query(value="select * from T_PAYPOINT_CR_LINES where PP_CR_HDR_ID=?1",nativeQuery=true)
	List<TPaypointCrLine> findByCreditHdrid(long ppCrHdrId);

}
