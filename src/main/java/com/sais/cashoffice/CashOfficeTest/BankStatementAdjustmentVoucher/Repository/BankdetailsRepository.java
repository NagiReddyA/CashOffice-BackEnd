package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface BankdetailsRepository extends JpaRepository<User,Double>{
	
	@Query(value="call pe_get_bkstmtadjustmentvouncher_by_stmt_id(?1)",nativeQuery=true)
	public List<Object[]> getbankstmtdetails(double bankstmtid);

}
