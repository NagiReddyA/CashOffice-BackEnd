package com.sais.cashoffice.CashOfficeTest.BankStatementPosting.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface BankStmtPostingRepository extends JpaRepository<User,Double> {
	
	@Query(value="call pe_Get_Bkstmt_Post_DetbyId(?1)",nativeQuery=true)
    List<Object[]> getbankstmtpostdetails(double bankstmtid);
}
