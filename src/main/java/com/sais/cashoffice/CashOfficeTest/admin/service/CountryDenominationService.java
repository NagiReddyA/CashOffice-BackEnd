package com.sais.cashoffice.CashOfficeTest.admin.service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.admin.model.CountryDenominationForm;

public interface CountryDenominationService {
	
	public List<CountryDenominationForm> getCountryDetails();
	public List<CountryDenominationForm> getDenominationCodeDetails(String countryName);

}
