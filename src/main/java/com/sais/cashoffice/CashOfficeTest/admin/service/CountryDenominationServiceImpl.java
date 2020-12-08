package com.sais.cashoffice.CashOfficeTest.admin.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.admin.model.CountryDenominationForm;
import com.sais.cashoffice.CashOfficeTest.admin.repository.CountryDenominationRepository;


@Service
public class CountryDenominationServiceImpl implements CountryDenominationService{
	
	@Autowired
	private CountryDenominationRepository countryDemnRepo;

	@Override
	public List<CountryDenominationForm> getCountryDetails() {
	
		List<CountryDenominationForm> appFormList = new ArrayList<CountryDenominationForm>();

		List<Object[]> appList = countryDemnRepo.getCountryDetails();
		if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				CountryDenominationForm appForm = new CountryDenominationForm();
				appForm.setCountryName((String) object[1]);
				appForm.setCurrencyCode((String) object[2]);
				appFormList.add(appForm);
			}
		} else {
			System.out.println("unknown error");
		}
		return appFormList;
	
	}

	@Override
	public List<CountryDenominationForm> getDenominationCodeDetails(String countryName) {
		
		List<CountryDenominationForm> appFormList = new ArrayList<CountryDenominationForm>();

		List<Object[]> appList = countryDemnRepo.getDenominationCodeDetails(countryName);
		if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				CountryDenominationForm appForm = new CountryDenominationForm();
				appForm.setDenominationCode((String) object[1]);
				appForm.setEnabled((char) object[2]);
				appFormList.add(appForm);
			}
		} else {
			System.out.println("unknown error");
		}
		return appFormList;
	}

}
