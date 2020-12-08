package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface BankStatementDetailsRepository extends JpaRepository<User,Double> {
	
	@Query(value="call p_get_bso_bk_details(?1)",nativeQuery=true)
	List<Object[]> getstatementdetails(double bankstmthdrid);

}
