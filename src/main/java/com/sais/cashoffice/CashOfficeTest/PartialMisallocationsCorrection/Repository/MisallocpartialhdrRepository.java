package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface MisallocpartialhdrRepository extends JpaRepository<User,Integer>{
	
	
	
	
	 @Query(value="call cash_office.pe_Partial_Misallocation_Hdr(?1,?2,?3,?4,?5,?6,?7,?8)",nativeQuery=true)
		int insertnewrecordmisallpartialhdr(double totalrevamount,double totalamount,
				                             String transcationtype,String postingstatus,Date creationdate,
				                             String createdby,Date modifieddate,String modifiedby);

}
