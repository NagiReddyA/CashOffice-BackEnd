package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Repository;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface ManualAllocationToDetRepository extends JpaRepository<User,Double> {
	
	@Query(value="call insertnewrecodtoT_POL_MANUAL_TO_DTL(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13,?14,?15)",nativeQuery=true)
	public int insertintomanualalloctodet(double manualhdrid,String policycode,
			                               double policyid,Date period,
			                               BigDecimal partyid,String payorname,
			                               String purposeid,String purposename,
			                               BigDecimal exceptedamount,BigDecimal allocatedamount,
			                               String postingstatus,Date creationdate,
			                               String createdby,Date modifieddate,
			                               String modifiedby);

}
