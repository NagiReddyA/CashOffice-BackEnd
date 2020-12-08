package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.VwMisallocatedPolicy;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface VwMisallocatedPolicyRepository extends JpaRepository<User,Integer> {

	
	
	@Query(value="call pe_Get_MisAllocated_Policy(?1) ",nativeQuery=true)
	List<Object[]> getvwallocatedpolicy(String policyCode);
	
	
}
