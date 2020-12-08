package com.sais.cashoffice.CashOfficeTest.admin.model;

import java.util.Date;

public class CountryDenominationForm {

	private int countryId;
	private String countryName;
	private Date date;
	private String countryCode;
	private String currencyCode;
	private char enabled;
	private String denominationCode;

	public String getDenominationCode() {
		return denominationCode;
	}

	public void setDenominationCode(String denominationCode) {
		this.denominationCode = denominationCode;
	}

	public char getEnabled() {
		return enabled;
	}

	public void setEnabled(char enabled) {
		this.enabled = enabled;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
