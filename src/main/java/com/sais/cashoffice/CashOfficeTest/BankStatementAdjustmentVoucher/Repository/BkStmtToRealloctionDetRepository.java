package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Repository;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface BkStmtToRealloctionDetRepository extends JpaRepository<User,Double> {
	
	
	@Query(value="call insertrecordintoT_BK_STMT_TO_REALLOCATION_DET(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12)",nativeQuery=true)
	int insertnewrecrealloc(double reallocid,String appcode,String appactivitycode,
			                 String referencenum,String referencestatus,Date period,
			                 String payor,String transcationcode,BigDecimal amount,
			                 Date creationdate,String createdby,char postingstatus);
	
	
	@Query(value="call deleterecordT_BK_STMT_TO_REALLOCATION_DET(?1)",nativeQuery=true)
	Object deleterecordrealloc(double reallocid);

}
