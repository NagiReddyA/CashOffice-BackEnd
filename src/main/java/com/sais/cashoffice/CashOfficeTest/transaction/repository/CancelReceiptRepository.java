package com.sais.cashoffice.CashOfficeTest.transaction.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;
import com.sais.cashoffice.CashOfficeTest.entities.TPaymentMethod;

@Repository
public interface CancelReceiptRepository extends JpaRepository<TPaymentMethod,Long> {
	
			
	
	 @Transactional
 	 @Modifying(clearAutomatically = true)
 	 @Query(value= " UPDATE T_RECEIPT SET POSTING_STATUS='W', MODIFIED_DATETIME=SYSDATE(), CANCELLATION_REASON=?2, " + 
 	 			   " MODIFIED_BY=?3 WHERE  RECEIPT_NO=?1" ,nativeQuery=true)
 	 public void CancelReceipt(double Id, String reason, String User);
	 
	 
	 @Transactional
 	 @Modifying(clearAutomatically = true)
 	 @Query(value= " UPDATE T_RECEIPT SET POSTING_STATUS=?2, MODIFIED_DATETIME=SYSDATE(), " + 
 	 			   " MODIFIED_BY=?3 WHERE  RECEIPT_NO=?1" ,nativeQuery=true)
 	 public void ApproveCancelReceipt(double Id, String Status, String User);
	 
	 
	 	 
	 @Query(value=" SELECT TR.RECEIPT_NO, TR.RECEIPT_DATE, TC.CASHIER_NAME, TR.POSTING_STATUS, TR.CASHIER_ID  " + 
	 	 	 	  " FROM T_RECEIPT TR LEFT OUTER JOIN T_CASHIERS TC ON TR.CASHIER_ID=TC.CASHIER_ID " +
	 	 	 	  " WHERE TR.POSTING_STATUS='W' ",nativeQuery=true)
	 public List<Object[]> ApprCancelQuery();
}
