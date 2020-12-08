package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface PnewmanualPcodeRepository extends JpaRepository<User,Integer> {
	
	@Query(value="call pe_Get_NewManuals_PCode_Period(?1,?2);",nativeQuery=true)
	List<Object[]> getnewmanualpolicydetails(String policycode,Date period);
	
	@Query(value="call pe_Get_NewManuals_PCode(?1);",nativeQuery=true)
	List<Object[]> getnewmanualpolicydetails1(String policycode);
	
	

}
