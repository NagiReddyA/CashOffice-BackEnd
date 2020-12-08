package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffApp;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOfficeCashier;

@Repository
public interface CashOfficeAppRepository extends JpaRepository<TCashOffApp, Long>{
	
	@Query(
			value="select * from T_CASH_OFF_APP where cash_office_id=:coId",
			nativeQuery=true)
	List<TCashOffApp> findByCashOfficeId(@Param(value = "coId")long cashOfficeId);	
	
	@Query(value=" SELECT CASH_OFFICE_CODE, CASH_OFFICE_DESC, BRANCH_CODE, COMPANY_NAME, CASH_OFFICE_ID  FROM T_CASH_OFFICE " + 
	     	 	 " LEFT OUTER JOIN T_COMPANY_ORGAN ON BRANCH_CODE=ORGAN_CODE ORDER BY CASH_OFFICE_CODE"  ,nativeQuery=true)
	public List<Object[]> getCashOfficeDtls();	
	
	@Query(value="select * from T_CASH_OFF_APP WHERE APP_ID=?1 and cash_office_id=?2",nativeQuery=true)
	public List<TCashOffApp> findByAppIdAndCashOfficeId(long appId,long cashOfficeId);
	

}
