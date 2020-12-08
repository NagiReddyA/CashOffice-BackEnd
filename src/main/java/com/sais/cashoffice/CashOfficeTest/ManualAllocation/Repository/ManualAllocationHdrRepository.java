package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Repository;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface ManualAllocationHdrRepository extends JpaRepository<User,Double> {
	
	
	@Query(value="call insertrecordtoT_POL_MANUAL_HDR(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11)",nativeQuery=true)
	public int insertintomanualallochdr(double receiptno,BigDecimal totalallocatedamount,
			                           BigDecimal totalunallocatedamount,BigDecimal totalpoliciesamount,
			                           Date creationdate,String createdby,
			                           Date modifieddate,String modifiedby,
			                           String attribute,String bankstmtflag,String postingstatus);
	
	
	@Query(value="call deletemanualallocationrecord(?1,?2,?3,?4,?5,?6,?7)",nativeQuery=true)
	public Object deletemanualallocationtodetrecord(double manualhdrid,double manualtodelid,BigDecimal totalallocatedamount,
			                                    BigDecimal totalunallocatedamount,BigDecimal totalpoliciesamount,
			                                    String modifiedby,Date modifieddate);

	
	@Query(value="select (MANUAL_ALL_HDR_ID) from  T_POL_MANUAL_HDR where RECEIPT_NO=?1",nativeQuery=true)
	public Object getmanualhdrid(double receipt);
	
	
	@Query(value="call updateT_POL_MANUAL_HDR(?1,?2,?3,?4,?5,?6)",nativeQuery=true)
	public Object updatetpomanualhdr(double manualhdrid,BigDecimal totalallocatedamount,
            BigDecimal totalunallocatedamount,BigDecimal totalpoliciesamount,
            String modifiedby,Date modifieddate);
	
	
}
