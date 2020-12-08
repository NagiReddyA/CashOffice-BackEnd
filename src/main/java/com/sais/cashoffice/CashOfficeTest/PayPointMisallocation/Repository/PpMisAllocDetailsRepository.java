package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.PpMisAllocDetails;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface PpMisAllocDetailsRepository extends JpaRepository<User,Integer>{
	
	
	@Query(value="call pe_Get_PP_MisAlloc_Details(?1)",nativeQuery=true)
	List<Object[]> getppmisallocationdetails(double rellocationhdrid);

}
