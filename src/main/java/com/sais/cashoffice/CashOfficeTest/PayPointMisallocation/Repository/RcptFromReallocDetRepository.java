package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface RcptFromReallocDetRepository extends JpaRepository<User,Double> {
	
	@Query(value="call pe_Create_PP_MisAll_From_Det(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10)",nativeQuery=true)
	int insertrecordrcptfromrealloc(double reallochdrid,double appid,
			                         double appactid,String referenceno,
			                         Date period,Date creationdate,
			                         String createdby,Date modifieddate,
			                         String modifiedby,
			                         String postingstatus);
	
	
	@Query(value="call updateT_RCPT_FROM_REALLOCATION_DET(?1,?2,?3,?4,?5)",nativeQuery=true)
	int updaterecordrcptfromrealloc(String paypointid ,Date period,String modifiedby,Date modifiedtime,double reallocfromid);
	

}
