package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.repository;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.model.ManualAdjumentVoucherRecordModel;

@Repository
public interface InsertRecordManualAdjumentVouncherRepository extends JpaRepository<ManualAdjumentVoucherRecordModel,Long> {
	
	
	@Query(value="call pe_Create_Manual_Adj_Details(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12)",nativeQuery=true)
    int insertrecordtmanualadjustment(String policycode,
    		                          char transcationtype,
    		                          Date period,
    		                          BigDecimal amount,
    		                          String comments,
    		                          String bobirefernecenumber,
    		                          Date creationdate,
    		                          String createdby,
    		                          Date modifieddate,
    		                          String modifiedby,
    		                          String postingstatus,
    		                          Date posteddate);
}
