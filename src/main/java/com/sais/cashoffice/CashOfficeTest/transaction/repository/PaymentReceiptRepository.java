package com.sais.cashoffice.CashOfficeTest.transaction.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;
import com.sais.cashoffice.CashOfficeTest.entities.TPaymentMethod;

@Repository
public interface PaymentReceiptRepository extends JpaRepository<TPaymentMethod,Long> {
	
	@Query(value="SELECT TA.CASHIER_ACTIVITY_ID, TA.CASH_OFF_ACTIVITY_ID, TA.CASH_OFFICE_ID, TA.CASHIER_ID, "  + 
	 	 	 	 "TC.CASHIER_NAME, CO.CASH_OFFICE_CODE FROM T_CASH_TILL_ACTIVITY TA "  +
	 	 	 	 "LEFT OUTER JOIN T_CASH_OFFICE CO ON CO.CASH_OFFICE_ID = TA.CASH_OFFICE_ID "  +
	 	 	 	 "LEFT OUTER JOIN T_CASHIERS TC ON TC.CASHIER_ID=TA.CASHIER_ID  " +
	 	 	 	 "WHERE TA.TILL_ACTIVITY_STATUS='O' AND TA.CASHIER_ID=?1" ,nativeQuery=true)
	public List<Object[]> getRcptDtls(double cashierId);
	
	@Query(value=" SELECT TA.APP_ID, TA.APP_CODE, TAA.APP_ACTIVITY_ID, TAA.APP_ACTIVITY_CODE, TAA.APP_ACTIVITY_DESC " +
	 	 	 " FROM T_APPLICATION TA LEFT OUTER JOIN T_APP_ACTIVITY TAA ON TAA.APP_ID=TA.APP_ID " ,nativeQuery=true)
	public List<Object[]> getApplicationDtls();	
	
	@Query(value=" SELECT BANK_CODE, BANK_NAME FROM T_BANK_ORG " +
	 	 	 	 " WHERE BANK_CODE IS NOT NULL ORDER BY BANK_NAME " ,nativeQuery=true)
	public List<Object[]> getBankDtls();
	
	@Query(value=" SELECT PARENT_BANK, BANK_NAME FROM T_BANK " +
				 " WHERE PARENT_BANK=?1 ORDER BY BANK_NAME; " ,nativeQuery=true)
	public List<Object[]> getBankBranchDtls(String bankId);	
	
	@Query(value="SELECT PAY_METHOD_ID, MODE_NAME FROM T_CASH_OFF_PYMT_MTHD " +
				 "LEFT OUTER JOIN T_PAY_MODE PM ON MODE_ID= PAY_METHOD_ID " +
	 	 	  	 "WHERE CASH_OFFICE_ID=?1" ,nativeQuery=true)
	public List<Object[]> PayModeDtls(int Id);
	
		
	@Query(value=" SELECT RECEIPT_NO, RECEIPT_DATE, RECEIPT_AMOUNT, POSTING_STATUS FROM T_RECEIPT  " +
				 " WHERE POSTING_STATUS='U' AND CASHIER_ID=(SELECT CASHIER_ID FROM T_CASHIERS " +
				 " WHERE CASHIER_NAME=?1) ORDER BY RECEIPT_DATE DESC " ,nativeQuery=true)
	public List<Object[]> getRcptPostDtls(String Id);	

	
	@Query(value="CALL pe_Create_Receipt(?1,?2,?3,?4,?5,?6,?7,?8,?9)",nativeQuery=true)
	public  Object InsertRcptDtls(String Amt, String From, double Pay_Id, double Coff_Id, double Cashier_Id, 
										String Create_By, double App_Id, double All_amt, double Un_All_Amt);              
	
		  
	 @Transactional
 	 @Modifying(clearAutomatically = true)
 	 @Query(value= " UPDATE T_RECEIPT SET POSTING_STATUS='P' WHERE RECEIPT_NO=?1 " ,nativeQuery=true)
 	 public void updateRcptPostStatus(double Id);
	 
	 
	 @Query(value=" SELECT POLICYCODE, DUEDATE, PAYERNAME ,AMOUNT, BALANCE, STATUS_NAME  " +
			 	  " FROM V_CO_TRN_PENDINGS LEFT OUTER JOIN T_LIABILITY_STATUS ON POLICYSTATUS=STATUS_ID " +
			 	  " WHERE POLICYCODE=?1 ORDER BY DUEDATE DESC " ,nativeQuery=true)
	 public List<Object[]> getRcptArrearDtls(String Id);	
	
}
