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
public interface sundryrepository extends JpaRepository<TBankStmtHdr,Long> {
	
	   @Query(value="select "  
		   		+ " tsun.BK_TRANSACTION_TYPE,"
		   		+ " tsun.PERIOD,"
		   		+ " tsun.ALLOCATED_AMOUNT,"
		   		+ " tsuntr.BK_TRANSACTION_DESC,tsun.BK_STMT_DET_SUN_ID " 
		   		+ "  FROM T_BANK_STMT_HDR bks" 
		   		+ "  LEFT JOIN(T_BK_STMT_DET_SUNDRY tsun" 
		   		+ " INNER JOIN T_BK_TRANSACTION_TYPES tsuntr" 
		   		+ "  ON tsun.BK_TRANSACTION_TYPE = tsuntr.BK_TRANSACTION_CODE) ON bks.BANK_STMT_ID = tsun.BANK_STMT_ID," 
		   		+ "   T_APPLIC_REF_VALUES refVal, VW_BANK_ACCOUNTS_INFO vwbai" 
		   		+ "   WHERE bks.BANK_STMT_ID = ?1" 
		   		+ "   AND bks.POSTING_STATUS = refVal.VALUE_CODE" 
		   		+ "    AND refVal.VALUE_CODE = bks.POSTING_STATUS"
		   		+ "    AND vwbai.cash_account_id = bks.ACCOUNT_ID ",nativeQuery=true)
		   
		   List<Object[]> getallDet_Sundry(double sr);
	
	
		   // insert a record 
		   
		   @Modifying
			@Transactional
			@Query(value="INSERT INTO T_BK_STMT_DET_SUNDRY(BK_STMT_DET_SUN_ID,BANK_STMT_ID,BK_TRANSACTION_TYPE,PERIOD,ALLOCATED_AMOUNT,CREATION_DATE) VALUES (?1,?2,?3,?4,?5,?6)",nativeQuery=true)
	         int sundrydateinsert(double bksunid,double bkstmtid,String transtype,Date period,BigDecimal allocatedamount,Date creationdate);
	
	// to find the max side of sundry 
		   
		   @Query(value="select max(BK_STMT_DET_SUN_ID) from T_BK_STMT_DET_SUNDRY",nativeQuery=true)
           double sundryidmax();
		   
		 // to delete a record from sundry
		   
		   @Modifying
			@Transactional
		   @Query(value="Delete from T_BK_STMT_DET_SUNDRY where BK_STMT_DET_SUN_ID=?1  ",nativeQuery=true)
		   int sundrydeletearecord(double sundryid);
}
