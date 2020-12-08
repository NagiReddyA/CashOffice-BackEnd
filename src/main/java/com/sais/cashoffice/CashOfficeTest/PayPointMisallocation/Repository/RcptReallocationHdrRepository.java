package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface RcptReallocationHdrRepository extends JpaRepository<User,Double> {
	
	@Query(value="call pe_Create_PP_MisAlloc_HDR(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10)",nativeQuery=true)
	int insertrecordtoreallocationhdr(double recepitno,Date reallocdate,
			                          String postingstatus,String postedby,
			                          Date posteddate,double recepitamount,
			                          Date creationdate,String createdby,
			                          Date modifieddate,String modifiedby);
	
	@Query(value="call updateT_RCPT_REALLOCATION(?1,?2,?3,?4,?5)",nativeQuery=true)
	int updatetreallochdr(double receiptno,double rcptamount, 
			               String modifiedby,Date modifiedtime,double reallhdrid  );

}
