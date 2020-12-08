package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Service;

import java.math.BigDecimal;
import java.util.Date;

public interface BkStmtToRealloctionDetService {
	
	public int insertnewrecrealloc(double reallocid,String appcode,String appactivitycode,
            String referencenum,String referencestatus,Date period,
            String payor,String transcationcode,BigDecimal amount,
            Date creationdate,String createdby,char postingstatus);

	public Object deleterecordrealloc(double reallocid);
}
