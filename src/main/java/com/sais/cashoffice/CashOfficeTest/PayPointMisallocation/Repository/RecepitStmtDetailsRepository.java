package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.RecepitStmtDetails;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface RecepitStmtDetailsRepository extends JpaRepository<User,Double> {
	
	
	
	@Query(value="call pe_Get_Rcpt_Stmt_Details(?1)",nativeQuery=true)
	List<Object[]> getallstmtdetails(double recepitno);

}
