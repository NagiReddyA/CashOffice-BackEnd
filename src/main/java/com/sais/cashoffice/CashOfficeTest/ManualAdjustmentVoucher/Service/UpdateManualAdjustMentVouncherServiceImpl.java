package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.Service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.repository.UpdateManualAdjustMentVouncherRepository;


@Service
public class UpdateManualAdjustMentVouncherServiceImpl implements UpdateManualAdjustMentVouncherService {

	@Autowired
	private UpdateManualAdjustMentVouncherRepository umr;
	
	
	
	@Override
	public int updatemanualadjustemtvouncher(String policycode, char transcationtype, Date period, BigDecimal amount,
			String comments, String bobirefernecenumber, Date modifieddate, String modifiedby, double manualadjid) {
		
		return umr.updatemanualadjustemtvouncher(policycode, transcationtype,
				                                  period, amount, comments, bobirefernecenumber,
				                                  modifieddate, modifiedby, manualadjid);
				
	}

}
