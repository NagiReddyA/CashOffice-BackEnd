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
public interface UnspecifiedRepository extends JpaRepository<TBankStmtHdr,Long> {
	
	
	@Query(value="SELECT tunsp.BK_STMT_DET_UNSP_ID,tunsp.BK_TRANSACTION_TYPE,tunsp.PERIOD,tunsp.ALLOCATED_AMOUNT,tunsptr.CREDIT_YN,tunsptr.BK_TRANSACTION_DESC"
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
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO T_BK_STMT_DET_UNSPECIFIED(BK_STMT_DET_UNSP_ID,BANK_STMT_ID,PERIOD,ALLOCATED_AMOUNT,CREATION_DATE,BK_TRANSACTION_TYPE) VALUES (?1,?2,?3,?4,?5,?6) ",nativeQuery=true)
	int unspecifiedrecordinsert(double unspecifiedid,double bankstmtid,Date period,BigDecimal allocatedamount,Date Creationdate,String transcationtype);

	@Query(value="select max(BK_STMT_DET_UNSP_ID) from T_BK_STMT_DET_UNSPECIFIED ",nativeQuery=true)
	double unspecifiedmax();
	
	@Modifying
	@Transactional
	@Query(value="DELETE FROM T_BK_STMT_DET_UNSPECIFIED WHERE BK_STMT_DET_UNSP_ID=?1",nativeQuery=true)
	int unspecifiedrecorddeleted(double unspecifiedid);
	
	
	
}
