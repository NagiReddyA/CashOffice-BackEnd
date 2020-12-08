package com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORCollectionSummary;

public interface CORCollectionSummaryRepository extends JpaRepository<CORCollectionSummary, Long> {
		
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
					"                          FROM T_RECEIPT re\r\n" + 
					"                             , T_PAYMENT_METHODS pm\r\n" + 
					"                             , T_RCPT_ALLOCATION ra\r\n" + 
					"                             , T_APPLICATION ap\r\n" + 
					"                             , T_CASH_OFFICE co\r\n" + 
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
	public List<CORCollectionSummary> getSummaryCollection(@Param("branch_code") String branch_code, 
			@Param("fromDate") String fromDate, @Param("toDate") String toDate);
	
	// move this to a abstract parent class
	@Query(value = "SELECT distinct branch_code FROM vw_branch ORDER BY branch_code", nativeQuery = true )
	public List<Object> getBranchCodes() ;
	
}