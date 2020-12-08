package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface RcptToReallocDetRepository extends JpaRepository<User,Double> {
	
	@Query(value="call pe_Create_PP_MisAll_To_Det(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13)",nativeQuery=true)
	int insertrecordrcpttoreallocdet(double reallochdrid,double appid,
			                            double appactid,String referenceno,
			                            Date period,String creditfile,
			                            double creditamount,double credithdrid,
			                            Date creationdate,String createdby,
			                            Date modifieddate,String modifiedby,
			                            String postingstatus);
	
	
	
	@Query(value="call updateT_RCPT_TO_REALLOCATION_DET(?1,?2,?3,?4,?5,?6,?7,?8)",nativeQuery=true)
	int  updaterecordrcpttoreallocdet(String paypointid,Date period,String creditfilename, double creditamount,
			                          double credithdrid,String modifiedby,Date modifiedtime,double rcpttoid);
	
}
