package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Repository;

import java.math.BigDecimal;

import java.math.BigInteger;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model.MisallcationFromPol;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface MisallcationFromDetRepository extends JpaRepository<User,Integer> {
	
	
	@Query(value="call pe_Pol_Misalloc_From_Det(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13,?14,?15,?16)",nativeQuery=true)
	double misallocationfrmdetinsertrecord(double misallocationhdrid,double policyid,String policycode,
			                            Date period,String policystatus,BigDecimal amount,
			                            double partyid,String payername,double receiptno,
			                            BigDecimal listid,String postingstatus,String collectionflag,
			                            Date creationdate,String createdby,Date modifieddate,String modifiedname);
	
	
	@Query(value="select @P_OUT_ID",nativeQuery=true)
	BigInteger getmisalloctedfromdetid();

}
