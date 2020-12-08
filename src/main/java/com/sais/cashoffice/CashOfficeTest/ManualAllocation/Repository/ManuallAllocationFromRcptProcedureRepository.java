package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface ManuallAllocationFromRcptProcedureRepository extends JpaRepository<User,Double>{
	
	
	
	@Query(value="call pe_Get_ManualAlloc_FromRcpt(?1,?2)",nativeQuery=true)
	public List<Object[]>  getmanualallocationfrmdet(String bankstmtflag,double receiptnum);

}
