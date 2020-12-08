package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface MisallocpartialfromdetRepository extends JpaRepository<User,Integer> {
	
	@Query(value="call pe_Partial_Misalloc_From_Det(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13,?14,?15,?16)",nativeQuery=true)
	int insertnewrecordmisallparitalfrmdet(double partialmisallhdrid,double policyid,
			                                String policycode,Date period,String policystatus,double amount,double partyid,
			                                String payorname,double recepitno,double listid,String postingstatus,String collectionflag,
			                                Date creationdate,String createdby,Date modifieddate,String modifiedby);
	

}
