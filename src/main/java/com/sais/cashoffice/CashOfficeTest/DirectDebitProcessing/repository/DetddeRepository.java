package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.DetDdeModel;

@Repository
public interface DetddeRepository extends JpaRepository<DetDdeModel,Double> {
	
	
	
	//calling all dde details 
	
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
   List<Object[]> findAllDDEDetails(double sr);
	
	
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO T_BK_STMT_DET_DDE(BANK_STMT_ID,BK_TRANSACTION_TYPE,PERIOD,PAYPOINT_ID,STRIKE_DATE,GROSS_AMOUNT,ALLOCATED_AMOUNT,CREATION_DATE) VALUES (?1,?2,?3,?4,?5,?6,?7,str_to_date(?8,'%d-%m-%Y %H:%i:%s'))",nativeQuery=true)
	void insertingdde(double id,
			           String trans_type,
			           Date period,
			           BigDecimal paypoiint_id,
			           Date strikedate,
			           BigDecimal grossamount,
			           BigDecimal allocated,
			           String creationdate);
   
   
	 // used to insert the all new details and generate bank stmt id
	
	@Modifying
	@Transactional
	@Query(value="call pe_insert_newrecord_to_tbankstmthdr(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13,?14,?15)",nativeQuery=true)
	int insertintobankstmthdr(String paymentmode,String bankname,String accountnumber,
			                   Date creationdate,Date modifieddate,String bankstmtnumber,
			                   String postingstatus,Date stmtstartdate,Date stmtenddate,
			                   String captureby,double stmtopeningbalance,double stmtclosingbalance,
			                   String capturebybranch,Date periodforreversal,String createdby);
	


}
