package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.CollectionSummary;

public interface CollectionSummaryRepository extends JpaRepository<CollectionSummary, Long> {
		
	@Query(
			value = "SELECT row_number() OVER ()  AS 'id', \r\n" + 
					"	co.branch_code, br.branch_name, COUNT(re.receipt_no) receipt_count, re.pay_method_id\r\n" + 
					"                               , pm.pay_method_code\r\n" + 
					"                               , pm.pay_method_desc\r\n" + 
					"                               , ra.app_id\r\n" + 
					"                               , ap.app_code\r\n" + 
					"                               , ap.app_desc\r\n" + 
					"                               , SUM(ra.allocated_amount) allocated_amount\r\n" + 
					"                               , re.receipt_date\r\n" + 
					"                          FROM t_receipt re\r\n" + 
					"                             , t_payment_methods pm\r\n" + 
					"                             , t_rcpt_allocation ra\r\n" + 
					"                             , t_application ap\r\n" + 
					"                             , t_cash_office co\r\n" + 
					"                             , vw_branch br\r\n" + 
					"                          WHERE re.pay_method_id = pm.pay_method_id\r\n" + 
					"                          	AND re.rcpt_trn_id = ra.rcpt_trn_id\r\n" + 
					"                            AND ra.app_id = ap.app_id\r\n" + 
					"                            AND re.cash_office_id = co.cash_office_id\r\n" + 
					"                            AND co.branch_code = br.branch_code\r\n" + 
					"							   AND re.receipt_date BETWEEN DATE(:fromDate) AND DATE(:toDate)\r\n" + 
					"                               AND co.branch_code = :branch_code \r\n" + 
					"                          GROUP BY \r\n" + 
					"                          		     co.branch_code\r\n" + 
					"                                 , br.branch_name\r\n" + 
					"                              \r\n" + 
					"                                 , re.pay_method_id\r\n" + 
					"                                 , pm.pay_method_code\r\n" + 
					"                                 , pm.pay_method_desc\r\n" + 
					"                                 , ra.app_id\r\n" + 
					"                                 , ap.app_code\r\n" + 
					"                                 , ap.app_desc\r\n" + 
					"                          ORDER BY ra.app_id", 
					nativeQuery = true )
	public List<CollectionSummary> getSummaryCollection(@Param("branch_code") String branch_code, 
			@Param("fromDate") String fromDate, @Param("toDate") String toDate);
	
	// move this to a abstract parent class
	@Query(value = "SELECT distinct branch_code FROM vw_branch ORDER BY branch_code", nativeQuery = true )
	public List<Object> getBranchCodes() ;
	
}