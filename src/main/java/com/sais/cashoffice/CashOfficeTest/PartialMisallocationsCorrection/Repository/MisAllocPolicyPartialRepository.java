package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model.MisAllocPolicyPartial;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface MisAllocPolicyPartialRepository extends JpaRepository<User,Integer>{

	
	@Query(value="call pe_Get_MisAlloc_Policy_Partial(?1,?2)",nativeQuery=true)
List<Object[]> getmisallocpolicypartial(String policycode,Date period);
	
	
	
	
	
}
