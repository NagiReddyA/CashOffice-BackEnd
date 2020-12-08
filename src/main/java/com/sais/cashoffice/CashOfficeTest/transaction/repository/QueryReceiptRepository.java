package com.sais.cashoffice.CashOfficeTest.transaction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;
import com.sais.cashoffice.CashOfficeTest.entities.TPaymentMethod;
@Repository
public interface QueryReceiptRepository extends JpaRepository<TPaymentMethod,Long> {
	
	@Query(value=" SELECT CASHIER_CODE, CASHIER_NAME, LOGIN_ID, BRANCH_CODE " + 
		     " FROM T_CASHIERS ORDER BY CASHIER_CODE "  ,nativeQuery=true)
	public List<Object[]> cashierdetails();

	@Query(value=" SELECT TR.RECEIPT_NO, TR.RECEIPT_DATE, TR.CASHIER_ID, TR.POSTING_STATUS, TC.CASHIER_NAME " + 
			 " FROM T_RECEIPT TR LEFT OUTER JOIN T_CASHIERS TC ON TR.CASHIER_ID=TC.CASHIER_ID "  +
			 " WHERE TR.RECEIPT_NO=?1",nativeQuery=true)
	public List<Object[]> searchDetailswithID(double No);
	//QueryReceiptForm searchDetailswithID(double No);

	//List<QueryReceiptForm> findAll();


	@Query(value=" SELECT TR.RECEIPT_NO, TR.RECEIPT_DATE, TR.CASHIER_ID, TR.POSTING_STATUS, TC.CASHIER_NAME " + 
		 	 	 " FROM T_RECEIPT TR LEFT OUTER JOIN T_CASHIERS TC ON TR.CASHIER_ID=TC.CASHIER_ID ?1 "  +
		 	 	 "  "  ,nativeQuery=true)
	public List<Object[]> getRcptList(String cond);
	
	@Query(value=" SELECT TR.RECEIPT_NO, TR.RECEIPT_DATE, TC.CASHIER_NAME, TR.POSTING_STATUS, TR.CASHIER_ID  " + 
		 	 	 " FROM T_RECEIPT TR LEFT OUTER JOIN T_CASHIERS TC ON TR.CASHIER_ID=TC.CASHIER_ID " ,nativeQuery=true)
	public List<Object[]> receiptdetails();
	
	@Query(value=" SELECT rec.RCPT_TRN_ID, rec.RECEIPT_NO, rec.RECEIPT_DATE, rec.RECEIPT_AMOUNT," + 
			 " rec.RECEIVED_FROM, rec.PAY_METHOD_ID, rec.CASH_OFFICE_ID, rec.CASHIER_ID," + 
			 " rec.POSTING_STATUS, rec.POSTING_REFERENCE, rec.POSTING_DATETIME, rec.CANCELLATION_REASON," + 
			 " rec.COMMENTS, pm.PAY_METHOD_CODE, co.CASH_OFFICE_CODE, c.CASHIER_CODE, c.CASHIER_NAME," + 
			 " c.LOGIN_ID, pd.PYMT_DET_TRN_ID, pd.REFERENCE_NUMBER, pd.REFERENCE_DATE, pd.BANK_ID," + 
			 " pd.BANK_BRANCH_ID, pd.DRAWEE, alloc.RCPT_ALL_ID, alloc.APP_ID, alloc.ALLOCATED_AMOUNT," + 
			 " app.APP_CODE, app.APP_DESC, refVal.VALUE_MEANING " + 
			 " FROM T_RECEIPT rec LEFT JOIN T_PAYMENT_DETAIL pd ON rec.RCPT_TRN_ID = pd.RCPT_TRN_ID," + 
			 " T_PAYMENT_METHODS pm, T_CASH_OFFICE co, T_CASHIERS c, T_RCPT_ALLOCATION alloc," + 
			 " T_APPLICATION app, T_APPLIC_REF_VALUES refVal " + 
			 " WHERE rec.PAY_METHOD_ID = pm.PAY_METHOD_ID  AND rec.CASH_OFFICE_ID = co.CASH_OFFICE_ID" + 
			 " AND rec.CASHIER_ID = c.CASHIER_ID  AND rec.RCPT_TRN_ID = alloc.RCPT_TRN_ID" + 
			 " AND alloc.APP_ID = app.APP_ID  AND rec.POSTING_STATUS = refVal.VALUE_CODE" + 
			 " AND rec.RECEIPT_NO =?1" ,nativeQuery=true)
	public List<Object[]> receiptDetailsWithID(double No);

		
	@Query(value=" SELECT rec.RECEIPT_NO, rec.CASH_OFFICE_ID, rec.CASHIER_ID,rec.COMMENTS, rec.RECEIPT_DATE, " + 
			 	 " co.CASH_OFFICE_CODE, c.CASHIER_CODE, rca.APP_ID, app.APP_CODE, " + 
			 	 " acl.RCPT_ALL_ACQ_LOAN_ID, acl.APP_ACTIVITY_ID aclAppActId, aclact.app_activity_code aclAppActCode, " + 
			 	 " acl.PERIOD aclAppActPeriod, acl.DEAL_NUMBER aclPolicyCode, acl.POLICY_STATUS, acl.ALLOCATED_AMOUNT aclAppActAmount, " + 
			 	 " gpl.RCPT_ALL_GRPLIFE_ID, gpl.APP_ACTIVITY_ID gplAppActId, gplact.app_activity_code gplAppActCode,  " + 
			 	 " gpl.PERIOD gplAppActPeriod, gpl.ALLOCATED_AMOUNT gplAppActAmount, " + 
			 	 " sun.RCPT_ALL_SUNDRY_ID, sun.APP_ACTIVITY_ID sunAppActId, sunact.app_activity_code sunAppActCode,  " + 
			 	 " sun.PERIOD sunAppActPeriod, sun.ALLOCATED_AMOUNT sunAppActAmount, " + 
			 	 " tpol.RCPT_ALL_THITO_POL_ID, tpol.APP_ACTIVITY_ID tpolAppActId, tpolact.APP_ACTIVITY_CODE tpolAppActCode,  " + 
			 	 " tpol.PERIOD tpolAppActPeriod, tpol.POLICY_CODE, tpol.POLICY_STATUS, tpol.ALLOCATED_AMOUNT tpolAppActAmount, " + 
			 	 " tpp.RCPT_ALL_THITO_PP_ID, tpp.APP_ACTIVITY_ID tppAppActId, tppact.APP_ACTIVITY_CODE tppAppActCode,  " + 
			 	 " tpp.PERIOD tppAppActPeriod, tpp.ALLOCATED_AMOUNT tppAppActAmount, " + 
			 	 " upr.RCPT_ALL_UPR_ID, upr.APP_ACTIVITY_ID uprAppActId, upract.app_activity_code uprAppActCode, " + 
			 	 " upr.PERIOD uprAppActPeriod, upr.ALLOCATED_AMOUNT uprAppActAmount " + 
			 	 " FROM T_RECEIPT rec INNER JOIN " + 
			 	 " ( T_RCPT_ALLOCATION rca INNER JOIN T_APPLICATION app ON rca.app_id = app.app_id " + 
			 	 " LEFT JOIN (T_RCPT_ALLOCATION_ACQ_LOAN acl INNER JOIN T_APP_ACTIVITY aclact ON acl.app_activity_id = aclact.app_activity_id)" + 
			 	 " ON rca.rcpt_all_id = acl.rcpt_all_id " + 
			 	 " LEFT JOIN (T_RCPT_ALLOCATION_GRPLIFE gpl INNER JOIN T_APP_ACTIVITY gplact ON gpl.app_activity_id = gplact.app_activity_id) " + 
			 	 " ON rca.rcpt_all_id = gpl.rcpt_all_id " + 
			 	 " LEFT JOIN (T_RCPT_ALLOCATION_SUNDRY sun INNER JOIN T_APP_ACTIVITY sunact ON sun.app_activity_id = sunact.app_activity_id) " + 
			 	 " ON rca.rcpt_all_id = sun.rcpt_all_id " + 
			 	 " LEFT JOIN (T_RCPT_ALLOCATION_THITO_POL tpol INNER JOIN T_APP_ACTIVITY tpolact ON tpol.app_activity_id = tpolact.app_activity_id) " + 
			 	 " ON rca.rcpt_all_id = tpol.rcpt_all_id " + 
			 	 " LEFT JOIN (T_RCPT_ALLOCATION_THITO_PP tpp INNER JOIN T_APP_ACTIVITY tppact ON tpp.app_activity_id = tppact.app_activity_id) " + 
			 	 " ON rca.rcpt_all_id = tpp.rcpt_all_id " + 
			 	 " LEFT JOIN (T_RCPT_ALLOCATION_UPR upr INNER JOIN T_APP_ACTIVITY upract ON upr.app_activity_id = upract.app_activity_id) " + 
			 	 " ON rca.rcpt_all_id = upr.rcpt_all_id  ) " + 
			 	 " ON rec.rcpt_trn_id = rca.rcpt_trn_id, " + 
			 	 " T_CASH_OFFICE co, T_CASHIERS c  " + 
			 	 " WHERE rec.cash_office_id = co.cash_office_id AND rec.cashier_id = c.cashier_id AND " + 
			 	 " rec.RECEIPT_NO =?1" ,nativeQuery=true)
	public List<Object[]> receiptAllocationDetails(double No);
	
	
	
}
