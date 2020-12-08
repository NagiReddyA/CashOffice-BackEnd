package com.sais.cashoffice.CashOfficeTest.transaction.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TCashTillActivity1;

@Repository
public interface TillActivityRepository  extends JpaRepository<TCashTillActivity1,Long> {

	@Query(value = "SELECT  "
			+ " ca.cashier_name,"
			+ " br.branch_name, "
			+" coac.branch_code,"
			+ " co.cash_office_desc,"
			+" coac.status as cash_office_status,"
			+" coac.receipt_date,"
			+" coac.cash_office_id,"
			+ " ca.cashier_id,ca.cashier_code,"
			+" coac.cash_off_activity_id, "
			+ "  cta.cashier_activity_id "
			+ "  from T_CASH_OFFICE_CASHIER coca,"
			+ " T_CASH_OFFICE co,"
			+ "  T_CASH_TILL_ACTIVITY cta,"
			+ " VW_BRANCH br,"
			+" T_CASHIERS ca,"
			+" T_CASH_OFF_ACTIVITY coac "
			+ " WHERE coac.cash_office_id = coca.cash_office_id"
			+ " AND coca.cash_office_id = co.cash_office_id "
			+ " AND ca.branch_code = br.branch_code"
			+ " AND coac.status ='O'"
			+ " AND ca.login_id =?1"
			+ "  ORDER  BY CASHIER_ACTIVITY_ID DESC LIMIT 1 ",nativeQuery=true)   
	public List<Object[]> findAllgetdetails(String LId); 


	@Query(value=
			"select max(cash_off_activity_id) from T_CASH_TILL_ACTIVITY ",nativeQuery=true)
	public int details6();

	@Query(value=
			"select max(cashier_activity_id) from T_CASH_TILL_ACTIVITY ",nativeQuery=true)
	public double details7();

	@Query(value=
			"select cash_office_id from T_CASH_OFFICE where CASH_OFFICE_CODE=?1 ",nativeQuery=true)
	public double getCASH_OFFICE_ID(@Param(value = "Cashofficecode")String Cashofficecode);


	@Query(value=
			"select  TILL_ACTIVITY_STATUS from T_CASH_TILL_ACTIVITY  where CASH_OFF_ACTIVITY_ID=?1 ",nativeQuery=true)
	public char getStatus(@Param(value = "CASH_OFF_ACTIVITY_ID")double cashOffActivityId);


	@Query(value="call sp_get_till_details(?1)",nativeQuery = true)
	public List<Object[]> getTillDetails(@Param(value = "CASHIER_ACTIVITY_ID")double cashierActivityId);

	@Query(value="select  CASHIER_ACTIVITY_ID,"
			+ " CASH_OFF_ACTIVITY_ID, "+
			"  TILL_ACTIVITY_STATUS,"
			+ " CASHIER_NAME,CASHIER_CODE ,"
			+ " LOGIN_ID, "
			+ " CTA.BRANCH_CODE "
			+ "  from T_CASH_TILL_ACTIVITY CTA LEFT  JOIN  T_CASHIERS CA "
			+ "  ON  CTA.CASHIER_ID = CA.CASHIER_ID "
			+ "  WHERE CA.LOGIN_ID =?1 AND TILL_ACTIVITY_DATE =?2  and TILL_ACTIVITY_STATUS='C' "
			+ " ORDER BY CTA.CASHIER_ACTIVITY_ID DESC LIMIT 1 ",nativeQuery = true)
	public List<Object[]> findTillDate(String lId,LocalDate date);


	@Query(value= " SELECT  CASHIER_ACTIVITY_ID,CASH_OFF_ACTIVITY_ID,CASH_OFFICE_ID," + 
			" T_CASH_TILL_ACTIVITY.BRANCH_CODE,TILL_ACTIVITY_STATUS "
			+ "  FROM T_CASH_TILL_ACTIVITY  LEFT JOIN T_CASHIERS CA ON " + 
			"  T_CASH_TILL_ACTIVITY.CASHIER_ID=CA.CASHIER_ID  where CA.LOGIN_ID=?1 " + 
			"  order by cashier_activity_id desc limit 1; ",nativeQuery = true)
	public List<Object[]> findTillStatus(String LId);


}
