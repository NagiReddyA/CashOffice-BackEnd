package com.sais.cashoffice.CashOfficeTest.transaction.repository;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffActivity1;
@Repository
public interface ActivityRepository extends JpaRepository<TCashOffActivity1, Long> {


	@Query(value="call sp_get_co_details(?)",nativeQuery = true)
	public List<Object[]> getAllActivityDetails(String userID);

	@Query(value="call sp_get_till_details(?1)",nativeQuery = true)
	public List<Object[]> getTillActivityDetails(@Param(value = "CASHIER_ACTIVITY_ID")double cashierActivityId);


	//It is used in ActivityImplDe service class implementation
	@Query(value=" SELECT  CASHIER_ACTIVITY_ID, "
			+ " CASH_OFF_ACTIVITY_ID, "+
			"  TILL_ACTIVITY_STATUS,"
			+ " CASHIER_NAME,CASHIER_CODE ,"
			+ " LOGIN_ID, "
			+ " T_CASH_TILL_ACTIVITY.BRANCH_CODE "+
			"  FROM T_CASH_TILL_ACTIVITY  "+
			"  LEFT JOIN T_CASHIERS CA  " + 
			"    ON  T_CASH_TILL_ACTIVITY.CASHIER_ID = CA.CASHIER_ID " + 
			"  WHERE  TILL_ACTIVITY_STATUS='O'  AND  CA.LOGIN_ID=?1 ",nativeQuery=true)
	public List<Object[]> findBytill(String userID);

	@Query(value=" SELECT ca.CASHIER_ID, "+
			" ca.CASHIER_CODE, "+
			" ca.CASHIER_NAME, "+
			" coca.CO_CASHIER_ID, "+  
			" coca.CASH_OFFICE_ID, "+ 
			" coca.SENIOR_CASHIER_YN,"+
			" coa.STATUS, " +
			" co.CASH_OFFICE_CODE, "+
			" co.CASH_OFFICE_DESC, "+
			" copm.CO_PYMT_MTHD_ID, "+
			" copm.PAY_METHOD_ID, "+
			" pm.PAY_METHOD_CODE, "+
			" pm.PAY_METHOD_DESC, "+
			" coap.CO_APP_ID, "+
			" coap.APP_ID, "+
			" app.APP_CODE, "+
			" app.APP_DESC "+
			" FROM T_CASHIERS    ca, "+
			" T_CASH_OFFICE_CASHIER   coca, "+
			" T_CASH_OFF_ACTIVITY coa, "+
			" T_CASH_OFFICE         co, "+
			" T_CASH_OFF_PYMT_MTHD  copm,"+
			" T_PAYMENT_METHODS      pm,"+
			" T_CASH_OFF_APP        coap,"+
			" T_APPLICATION         app "+
			"  WHERE coca.CASHIER_ID = ca.CASHIER_ID "+
			//"   AND (coca.END_DATE IS NULL OR coca.END_DATE >= sysdate()) "+
			"  AND coca.CASH_OFFICE_ID = co.CASH_OFFICE_ID "+
			" AND co.CASH_OFFICE_ID = copm.CASH_OFFICE_ID "+
			" AND co.CASH_OFFICE_ID = coap.CASH_OFFICE_ID "+
			" AND copm.PAY_METHOD_ID = pm.PAY_METHOD_ID "+
			//" AND (copm.END_DATE IS NULL OR copm.END_DATE >= sysdate()) "+
			" AND coap.app_id = app.app_id"+
			//" AND (coap.END_DATE IS NULL OR coap.END_DATE >= sysdate()) "+
			" AND ca.LOGIN_ID =?1 limit 1 ",nativeQuery=true)
	public List<Object[]> findByuserId(@Param(value = "userID") String userID);

	@Query(value=
			" select co.CASH_OFFICE_CODE," + 
					"                          co.CASH_OFFICE_ID," + 
					"                          co.BRANCH_CODE," + 
					"                          ca.CASHIER_ID," + 
					"                           coac.RECEIPT_DATE   "+
					"                     from T_CASHIERS ca," + 
					"                          T_CASH_OFFICE_CASHIER cac," + 
					"                          T_CASH_OFFICE co,"
					+ "                    T_CASH_OFF_ACTIVITY coac" + 
					"                    where ca.CASHIER_ID = cac.CASHIER_ID" + 
					"                      and cac.CASH_OFFICE_ID = co.CASH_OFFICE_ID" + 
					"                      and (cac.END_DATE IS NULL OR cac.END_DATE >= DATE(sysdate()))" + 
					"                      and ca.LOGIN_ID=?1" + 
					"                  ORDER BY CASH_OFFICE_CODE limit 1"
					,nativeQuery=true)
	public List<Object[]> getCashoffDetails(@Param(value = "userID") String userID);

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value=
	" SELECT coac.cash_off_activity_id," + 
			"     coac.cash_office_id," + 
			"     coac.branch_code," + 
			"      coac.receipt_date," + 
			"      coac.status FROM T_CASH_OFF_ACTIVITY coac" + 
			"    WHERE coac.CASH_OFFICE_ID=?1 AND coac.STATUS='O'",nativeQuery=true)
	public List<Object[]> findByCashOfficeId(@Param(value = "CASH_OFFICE_ID")double cashOfficeId);


	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="select co.CASH_OFFICE_CODE," + 
			"                          co.BRANCH_CODE" + 
			"                     from T_CASHIERS ca," + 
			"                          T_CASH_OFFICE_CASHIER cac," + 
			"                          T_CASH_OFFICE co" + 
			"                    where ca.CASHIER_ID = cac.CASHIER_ID" + 
			"                      and cac.CASH_OFFICE_ID = co.CASH_OFFICE_ID" + 
			"                      and (cac.END_DATE IS NULL OR cac.end_date >= DATE(SYSDATE()))" + 
			"                      and ca.LOGIN_ID=?1" + 
			"                  ORDER BY CASH_OFFICE_CODE;	",nativeQuery=true)
	public List<Object[]> getCashofficeCode(@Param(value = "userID") String userID);	



	// 	  @Query(value=
	// 	 	  		"select max(cash_off_activity_id) from T_CASH_OFF_ACTIVITY ",nativeQuery=true)
	// 	  public double getCashOffActivityId();


	@Query(value=
			"select cash_office_id from T_CASH_OFFICE where CASH_OFFICE_CODE=?1 ",nativeQuery=true)
	public double getCashOfficeId(@Param(value = "Cashofficecode")String Cashofficecode);



	@Query(value=
			"select cashier_id from T_CASHIERS where LOGIN_ID=?1 ",nativeQuery=true)
	public double getCashierId(@Param(value = "LoginId")String LoginId);

	@Transactional
	@Modifying()
	@Query(value=
	"update T_CASH_TILL_ACTIVITY set TILL_ACTIVITY_STATUS ='C'  where CASHIER_ACTIVITY_ID=?1 and TILL_ACTIVITY_STATUS = 'O'",nativeQuery=true)
	public void updateTillStatus(@Param(value = "CASHIER_ACTIVITY_ID")double cashierActivityId);

	@Query(value=
			"select  TILL_ACTIVITY_STATUS from T_CASH_TILL_ACTIVITY  where CASHIER_ACTIVITY_ID=?1 ",nativeQuery=true)
	public char getTillStatus(@Param(value = "CASHIER_ACTIVITY_ID")double cashierActivityId);


	@Transactional
	@Modifying()
	@Query(value=
	"update T_CASH_OFF_ACTIVITY set STATUS ='C'  where CASH_OFF_ACTIVITY_ID =?1  and STATUS = 'O'",nativeQuery=true)
	public void closeactivity(@Param(value = "CASH_OFF_ACTIVITY_ID")int cashOffActivityId);



	@Query(value=
			"select  STATUS from T_CASH_OFF_ACTIVITY  where CASH_OFF_ACTIVITY_ID =?1 ",nativeQuery=true)
	public char saveActivityStatus(@Param(value = "CASH_OFF_ACTIVITY_ID")int cashOffActivityId);


	@Query(value=
			"select max(cashier_activity_id) from T_CASH_TILL_ACTIVITY ",nativeQuery=true)
	public double getCashierActivityId();

	@Query(value=
			" select CASH_OFF_ACTIVITY_ID,CASH_OFFICE_ID, "
					+ " COA.CASHIER_ID,COA.BRANCH_CODE,RECEIPT_DATE,STATUS  "
					+ " from T_CASH_OFF_ACTIVITY COA LEFT "
					+ "  JOIN T_CASHIERS CA ON  COA.CASHIER_ID=CA.CASHIER_ID "
					+ "  WHERE CA.LOGIN_ID=?1 AND RECEIPT_DATE=?2  and status='C' ",nativeQuery=true)
	public List<Object[]> findCheckActivityDate(String lId,LocalDate date);
}



