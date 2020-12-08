package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffPymtMthd;

@Repository
public interface CashOffPymtMethodRepository extends JpaRepository<TCashOffPymtMthd,Long> {

	@Query(
			value="select * from T_CASH_OFF_PYMT_MTHD where cash_office_id=:coId",
			nativeQuery=true)
	List<TCashOffPymtMthd> findByCashOfficeId(@Param(value="coId") long cashOfficeId);

}
