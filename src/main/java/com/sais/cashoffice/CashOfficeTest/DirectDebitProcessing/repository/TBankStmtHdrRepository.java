package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Vw_PayPoints;
import com.sais.cashoffice.CashOfficeTest.entities.TBankStmtHdr;


@Repository
public interface TBankStmtHdrRepository extends JpaRepository<TBankStmtHdr,Long>{
	
	
	@Query(value="select bks.PAYMENT_MODE,tpp.PAY_POINT_NAME,bks.ACCOUNT_NUMBER, "
			+" bks.CREATION_DATE,bks.MODIFIED_DATETIME,bks.BANK_STMT_NUMBER,bks.POSTING_STATUS,"
			+" bks.STMT_START_DATE,bks.STMT_END_DATE,bks.CAPTURED_BY,bks.STMT_OPENING_BALANCE,bks.STMT_CLOSING_BALANCE," 
			+"  bks.CAPTURED_BY_BRANCH,bks.PERIOD_FOR_REVERSALS,tdde.BK_TRANSACTION_TYPE,tdde.PERIOD,"
			+" tdde.PAYPOINT_ID,tdde.STRIKE_DATE,tdde.GROSS_AMOUNT,tdde.ALLOCATED_AMOUNT,vwbai.description"
			+" from T_BANK_STMT_HDR bks LEFT JOIN (T_BK_STMT_DET_DDE tdde" 
			
			+" INNER JOIN T_PAY_POINT tpp"  
			+"    ON tdde.PAYPOINT_ID = tpp.PAY_POINT_ID" 
			+" INNER JOIN T_BK_TRANSACTION_TYPES tddetr" 
			+" ON tdde.BK_TRANSACTION_TYPE = tddetr.BK_TRANSACTION_CODE) ON bks.BANK_STMT_ID = tdde.BANK_STMT_ID,"
			+" T_APPLIC_REF_VALUES refVal, VW_BANK_ACCOUNTS_INFO vwbai"
			+" WHERE bks.BANK_STMT_ID =?1"
			+" AND bks.POSTING_STATUS = refVal.VALUE_CODE"
			+" AND refVal.VALUE_CODE = bks.POSTING_STATUS"
			+" AND vwbai.cash_account_id = bks.ACCOUNT_ID"
			
			
			
			,nativeQuery=true)
   List<Object[]> findAllDetails(double sr);
   
   
 
   
   @Query(value="select"  
   		+ " tsun.BK_TRANSACTION_TYPE,"
   		+ " tsun.PERIOD,"
   		+ " tsun.ALLOCATED_AMOUNT,"
   		+ " tsuntr.BK_TRANSACTION_DESC" 
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
		  
		   
		   
	@Query(value="SELECT tunsp.BK_TRANSACTION_TYPE,tunsp.PERIOD,tunsp.ALLOCATED_AMOUNT,tunsptr.BK_TRANSACTION_DESC"
			+ " FROM T_BANK_STMT_HDR bks "
			+ " LEFT JOIN(T_BK_STMT_DET_UNSPECIFIED tunsp"
			+ " INNER JOIN T_BK_TRANSACTION_TYPES tunsptr"
			+ " ON tunsp.BK_TRANSACTION_TYPE = tunsptr.BK_TRANSACTION_CODE) ON bks.BANK_STMT_ID = tunsp.BANK_STMT_ID,"
			+ " T_APPLIC_REF_VALUES refVal, VW_BANK_ACCOUNTS_INFO vwbai"
			+ " WHERE bks.BANK_STMT_ID =?1"
			+ " AND bks.POSTING_STATUS = refVal.VALUE_CODE"
			+" AND refVal.VALUE_CODE = bks.POSTING_STATUS"
			+" AND vwbai.cash_account_id = bks.ACCOUNT_ID",nativeQuery=true)
	List<Object[]> getallDetUnspecified(double sr);
	
		   
 // code for calling vw_paypoints
	
	@Query(value="select * from VW_PAYPOINTS",nativeQuery=true)
	List<Object[]> getdetailspaypoint();
		   
  // 	Code for saving dde
	@Modifying
	@Transactional
	@Query(value="INSERT INTO T_BK_STMT_DET_DDE(BANK_STMT_ID,BK_TRANSACTION_TYPE,PERIOD,PAYPOINT_ID,STRIKE_DATE,GROSS_AMOUNT,ALLOCATED_AMOUNT,CREATION_DATE,BK_STMT_DET_DDE_ID) VALUES (?1,?2,?3,?4,?5,?6,?7,str_to_date(?8,'%d-%m-%Y %H:%i:%s'),?9)",nativeQuery=true)
	void insertingdde(double id,
			           String trans_type,
			           Date period,
			           BigDecimal paypoiint_id,
			           Date strikedate,
			           BigDecimal grossamount,
			           BigDecimal allocated,
			           String creationdate,
			           double dde_id);
	
	@Query(value="SELECT max(BK_STMT_DET_DDE_ID) FROM T_BK_STMT_DET_DDE",nativeQuery=true)
   double getmaxofdde();
	
	
	@Modifying
	@Transactional
	@Query(value="DELETE FROM T_BK_STMT_DET_DDE WHERE GROSS_AMOUNT=?1 AND ALLOCATED_AMOUNT=?2",nativeQuery=true)
   int DeleteDdeByAmount(BigDecimal Grossamount,BigDecimal allocatedamount);
}
