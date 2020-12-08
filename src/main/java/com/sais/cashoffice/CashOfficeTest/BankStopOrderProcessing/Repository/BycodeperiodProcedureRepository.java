package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface BycodeperiodProcedureRepository  extends JpaRepository<User,Double> {
	
	@Query(value="call pe_Get_Manuals_ByPCode_Period(?1,?2)",nativeQuery=true)
	List<Object[]> getpcodeperioddetails(String policycode,Date period);
	
	

}
