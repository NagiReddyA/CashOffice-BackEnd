package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.Service;

import java.math.BigDecimal;
import java.util.Date;

public interface UpdateManualAdjustMentVouncherService {
	
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
