package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Repository.BkStmtToRealloctionDetRepository;

@Service
public class BkStmtToRealloctionDetServiceImpl implements BkStmtToRealloctionDetService {

	@Autowired
	private BkStmtToRealloctionDetRepository brp;
	
	
	@Override
	public int insertnewrecrealloc(double reallocid, String appcode, String appactivitycode, String referencenum,
			String referencestatus, Date period, String payor, String transcationcode, BigDecimal amount, Date creationdate,
			String createdby,char postingstatus) {
		
		return brp.insertnewrecrealloc(reallocid, appcode, appactivitycode,
				                        referencenum, referencestatus, period, payor,
				                        transcationcode, amount,
				                        creationdate, createdby,postingstatus);
	}


	@Override
	public Object deleterecordrealloc(double reallocid) {
		
		return brp.deleterecordrealloc(reallocid);
	}



	

}
