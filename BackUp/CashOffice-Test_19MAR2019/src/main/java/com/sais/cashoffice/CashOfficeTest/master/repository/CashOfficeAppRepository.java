package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffApp;

@Repository
public interface CashOfficeAppRepository extends JpaRepository<TCashOffApp, Long>{
	
	@Query(
			value="select * from T_CASH_OFF_APP where cash_office_id=:coId",
			nativeQuery=true)
	List<TCashOffApp> findByCashOfficeId(@Param(value = "coId")long cashOfficeId);	

}
