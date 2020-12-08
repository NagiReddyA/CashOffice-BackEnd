package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model.PpMisAllocDetails;

public interface PpMisAllocDetailsService {
	
	List<PpMisAllocDetails> getppmisallocationdetails(double rellocationhdrid);

}
