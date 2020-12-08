package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Service;

import java.math.BigDecimal;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model.ReceiptDetails;

public interface ReceiptDetailsService {
	
	public List<ReceiptDetails> getreceiptdetails(BigDecimal paypointid);

}
