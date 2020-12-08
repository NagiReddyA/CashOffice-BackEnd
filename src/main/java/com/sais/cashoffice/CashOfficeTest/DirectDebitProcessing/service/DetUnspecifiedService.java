package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.DetUnspecified;

public interface DetUnspecifiedService {
    
	List<DetUnspecified> fetchallDetUnspecified(double sr);
	int unspecifiedrecordinsert(double unspecifiedid,double bankstmtid,Date period,BigDecimal allocatedamount,Date Creationdate,String transcationtype);
	double unspecifiedmax();
	int unspecifiedrecorddeleted(double unspecifiedid);
}
