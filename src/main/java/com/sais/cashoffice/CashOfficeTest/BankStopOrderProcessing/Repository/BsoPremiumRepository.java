package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface BsoPremiumRepository extends JpaRepository<User,Double> {
	
	
	// used for fetching  bso premium details
	@Query(value="call p_get_bso_premium(?1)",nativeQuery=true)
	List<Object[]> getbsopremiumdetails(double bankstmthdrid);
	
	
	
	@Query(value="call pe_insert_to_bsopremium(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10)",nativeQuery=true)
	int insertintobsopremium(double bankstmthdrid,
			                 String transcationtype,
			                 Date period,
			                 String policycode,
			                 String policystatus,
			                 String payor,
			                 BigDecimal exceptedpremium,
			                 BigDecimal allocatedamount,
			                 Date creationtime,
			                 Date modifiedtime);

}
