package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TBkStmtDetExclusion;


@Repository
public interface DetExclusionsRepository extends JpaRepository<TBkStmtDetExclusion,Long> {
	
	
	
	
	
	@Query(value=" SELECT tex.PERIOD,"
			+ " tex.POLICY_CODE," 
			+"  tex.POLICY_STATUS_ID," 
			+"  tex.PAYOR,"
			+" tex.EXPECTED_PREMIUM," 
			+" tex.ALLOCATED_AMOUNT" 
			+" FROM T_BANK_STMT_HDR bks" 
			+" LEFT JOIN T_BK_STMT_DET_EXCLUSIONS tex"  
			+" ON bks.BANK_STMT_ID = tex.BANK_STMT_ID,"
			+" T_APPLIC_REF_VALUES refVal, VW_BANK_ACCOUNTS_INFO vwbai" 
			+"  WHERE bks.BANK_STMT_ID =?1" 
			+"   AND bks.POSTING_STATUS = refVal.VALUE_CODE"
			+"   AND refVal.VALUE_CODE = bks.POSTING_STATUS"
			+"   AND vwbai.cash_account_id = bks.ACCOUNT_ID"
			,nativeQuery=true)
	List<Object[]> getallDetailsfromTBkStmtDetExclusion(double sr);

	
	
	
	
}
