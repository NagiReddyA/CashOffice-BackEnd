package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.Service;

import java.math.BigDecimal;
import java.util.Date;




public interface InsertRecordManualAdjumentVouncherService {
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
