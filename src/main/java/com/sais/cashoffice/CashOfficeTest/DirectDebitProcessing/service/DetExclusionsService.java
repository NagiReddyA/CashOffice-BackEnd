package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.DetExclusions;

public interface DetExclusionsService {
       
	List<DetExclusions> getdetailsexclusions(double sr);
}
