package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.CreditFilesmisallocDetails;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface CreditFilesmisallocDetailsRepository extends JpaRepository<User,Double>{

	@Query(value="call pe_Get_Cr_MisAlloc_Details()",nativeQuery=true)
	List<Object[]> getallcreditfiledetails();
	
	
}
