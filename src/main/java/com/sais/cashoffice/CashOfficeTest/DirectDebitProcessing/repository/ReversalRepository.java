package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TBankStmtHdr;

@Repository
public interface ReversalRepository extends JpaRepository<TBankStmtHdr,Long>{
	
	  @Query(value=" SELECT   trev.BK_STMT_DET_REV_ID," 
		   		+ "trev.BK_TRANSACTION_TYPE    revTransactionType,"  
		   		+ "trev.PERIOD_FOR_REVERSALS," 
		   		+ "trev.POLICY_CODE,"  
		   		+ "trev.PAYOR,"  
		   		+ "trev.POLICY_STATUS_ID," 
		   		+ "trev.EXPECTED_PREMIUM," 
		   		+ "trev.ALLOCATED_AMOUNT"  
		   		+ " FROM T_BANK_STMT_HDR bks"  
		   		+ " LEFT JOIN(T_BK_STMT_DET_REVERSALS trev" 
		   		+ " INNER JOIN T_BK_TRANSACTION_TYPES trevtr"
		   		+ "    ON trev.BK_TRANSACTION_TYPE = trevtr.BK_TRANSACTION_CODE) ON bks.BANK_STMT_ID = trev.BANK_STMT_ID,"  
		   		+ "    T_APPLIC_REF_VALUES refVal, VW_BANK_ACCOUNTS_INFO vwbai"  
		   		+ "     WHERE bks.BANK_STMT_ID =?1" 
		   		+ "      AND bks.POSTING_STATUS = refVal.VALUE_CODE"  
		   		+ "      AND refVal.VALUE_CODE = bks.POSTING_STATUS"  
		   		+ "      AND vwbai.cash_account_id = bks.ACCOUNT_ID",nativeQuery=true)
		   List<Object[]> getalldetailsDetReversals(double sr);

		   @Modifying
			@Transactional
		   @Query(value="INSERT INTO T_BK_STMT_DET_REVERSALS(BK_STMT_DET_REV_ID,BANK_STMT_ID,BK_TRANSACTION_TYPE,PERIOD_FOR_REVERSALS,POLICY_CODE,PAYOR,POLICY_STATUS_ID,EXPECTED_PREMIUM,ALLOCATED_AMOUNT,CREATION_DATE) values (?1,?2,?3,?4,?5,?6,?7,?8,?9,?10)",nativeQuery=true)
		   int reversalrecordinsert(double revid,double stmtid,String transcationtype,
				                        Date period,String policycode,String payor,
				                        int policystatusid,BigDecimal exceptedamount,
				                        BigDecimal allocatedamount,Date creationdate);

		   
		   @Query(value="select max(BK_STMT_DET_REV_ID) from T_BK_STMT_DET_REVERSALS",nativeQuery=true)
		   double getmaxofdetreversals();
		   
		  
		   @Modifying
			@Transactional
		   @Query(value="delete from T_BK_STMT_DET_REVERSALS where PAYOR=?1 and POLICY_CODE=?2 and EXPECTED_PREMIUM=?3 and ALLOCATED_AMOUNT=?4 ",nativeQuery=true)
		   int deletereversalrecord(String payor,String policycode,BigDecimal exceptedamount, BigDecimal allocatedamount);
}
