package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.Service;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.repository.InsertRecordManualAdjumentVouncherRepository;


@Service
public class InsertRecordManualAdjumentVouncherImpl implements InsertRecordManualAdjumentVouncherService {

	@Autowired
	private InsertRecordManualAdjumentVouncherRepository imr;
	
	
	@Override
	public int insertrecordtmanualadjustment(String policycode, char transcationtype, Date period, BigDecimal amount,
			String comments, String bobirefernecenumber, Date creationdate, String createdby, Date modifieddate,
			String modifiedby, String postingstatus, Date posteddate) {
		
		return imr.insertrecordtmanualadjustment(policycode, transcationtype, period, amount, comments, bobirefernecenumber, creationdate, createdby, modifieddate, modifiedby, postingstatus, posteddate);
	}

}
