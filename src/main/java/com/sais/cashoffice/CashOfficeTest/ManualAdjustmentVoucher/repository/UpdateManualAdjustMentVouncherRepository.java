package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.repository;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.model.ManualAdjumentVoucherRecordModel;


@Repository
public interface UpdateManualAdjustMentVouncherRepository extends JpaRepository<ManualAdjumentVoucherRecordModel,Long>{

	
	
	@Query(value="call updateT_MANUAL_ADJUSTMENT(?1,?2,?3,?4,?5,?6,?7,?8,?9)",nativeQuery=true)
	int updatemanualadjustemtvouncher(String policycode,
             char transcationtype,
            Date period,
            BigDecimal amount,
            String comments,
            String bobirefernecenumber,
            Date modifieddate,
            String modifiedby,
            double manualadjid
           );
	
	
}
