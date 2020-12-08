package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffice;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOfficeCashier;

@Repository
@Transactional
public interface CashOfficeCashierRepository extends JpaRepository<TCashOfficeCashier, Long> {

	@Query(value = "select * from T_CASH_OFFICE_CASHIER where CASH_OFFICE_ID=:coId ", nativeQuery = true)
	public List<TCashOfficeCashier> findByCashOfficeId(@Param(value = "coId") long cashOfficeId);

	public List<TCashOfficeCashier> findByCashier_CashierIdAndCashOffice_CashOfficeId(long cashierId,long cashOfficeId);
	

	@Transactional
	@Modifying()
	@Query(value = "update T_CASH_OFFICE_CASHIER set End_date =?1,senior_cashier_yn=?2 where Co_CASHIER_ID=?3", nativeQuery = true)
	public void updateEnddate(Date date,String seniorCashier, int coCashierId );
}
