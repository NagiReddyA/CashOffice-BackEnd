package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository;



import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface MisallocpartialtodetRepository extends JpaRepository<User,Integer>{
	
	
	// used to fetch details
	@Query(value="call pe_Get_Partial_Misalloc_ToDtl(?1)",nativeQuery=true)
	List<Object[]> getallmisallocpartialtodetdetails(double misallocpartialhdrid);
	
   // insert a new record into misallocpartialtodet
	
	@Query(value="call pe_Partial_Misalloc_To_Det(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13,?14,?15,?16)",nativeQuery=true)
	int insertnewrecordtomisallocpartialtodet(double misalloparialhdrid,String policycode,
			                                  Date period,String policystatus,BigDecimal amount,
			                                  BigDecimal arrears,String payourname,String postingstatus,
			                                  String purpose,Double partyid,Double policyid,String recepitno,
			                                  Date creationdate,String createdby,Date modified,String modifiedby);
	

}
