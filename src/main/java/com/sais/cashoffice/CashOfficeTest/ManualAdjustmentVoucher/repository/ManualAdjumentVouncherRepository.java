package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.model.ManualAdjumentVoucherRecordModel;

@Repository
public interface ManualAdjumentVouncherRepository extends JpaRepository<ManualAdjumentVoucherRecordModel,Long> {

	@Query(value=" select manual_adj_id,adj_transaction_type, period, policy_code,payor_id,amount,comments,purpose, posting_status, "
                   +" posted_by,posting_date,creation_date,created_by,modified_datetime,Policy_id, modified_by ,BOBI_REF_NUMBER from T_MANUAL_ADJUSTMENT "
			+ " where posting_status ='UNPOSTED' order by manual_adj_id desc ",nativeQuery=true)
	List<ManualAdjumentVoucherRecordModel> finalallunpostvouchers();

	
   
	
	
}
