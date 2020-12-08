package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface PayPointCrFileFormatesRepository extends JpaRepository<User,Double> {
	
	
	@Query(value="call pe_Get_PpId_Cr_Fileformats()",nativeQuery=true)
    public List<Object[]> getpaypointdetails();
    
}
