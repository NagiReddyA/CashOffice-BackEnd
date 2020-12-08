package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Repository;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface ManualAllocationFromdetRepository extends JpaRepository<User,Double> {
	
	
	@Query(value="call insertrecordtoT_POL_MANUAL_FROM_DTL(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12)",nativeQuery=true)
	public int insertintomanalallocfromdet(double manualhdrid,BigDecimal paypointid,
			                                Date period,BigDecimal allocatedamount,
			                                BigDecimal unallocatedamount,BigDecimal grossamount,
			                                BigDecimal receiptamount,String postingstatus,
			                                Date creationdate, String createdby,
			                                Date Modifieddate,String modifiedby);
	
	

}
