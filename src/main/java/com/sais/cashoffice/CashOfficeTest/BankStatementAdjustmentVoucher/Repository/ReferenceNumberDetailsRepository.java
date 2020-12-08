package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model.ReferenceNumberDetails;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface ReferenceNumberDetailsRepository extends JpaRepository<User,Double> {
	
	@Query(value="call pe_Find_Ref_Number_Details(?1,?2)",nativeQuery=true)
	List<Object[]> referencenumberdetails(String applicationcode,String referencenumber);

}
