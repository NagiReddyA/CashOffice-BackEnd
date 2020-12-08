package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Vw_PayPoints;

public interface paypointservice {
	
	List<Vw_PayPoints> fetchalldetailsofpaypoint();

}
