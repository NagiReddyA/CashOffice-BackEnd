package com.sais.cashoffice.CashOfficeTest.master.model;

public class AssignCashierForm extends CashierDetailsForm{

	private String cashOfficeCode;
	private String cashOfficeName;
	private String seniorCashierYn;
	private boolean isSenior;
	public String getCashOfficeCode() {
		return cashOfficeCode;
	}
	public void setCashOfficeCode(String cashOfficeCode) {
		this.cashOfficeCode = cashOfficeCode;
	}
	public String getCashOfficeName() {
		return cashOfficeName;
	}
	public void setCashOfficeName(String cashOfficeName) {
		this.cashOfficeName = cashOfficeName;
	}
	public String getSeniorCashierYn() {
		return seniorCashierYn;
	}
	public void setSeniorCashierYn(String seniorCashierYn) {
		this.seniorCashierYn = seniorCashierYn;
	}
	public boolean getIsSenior() {
		return isSenior;
	}
	public void setIsSenior(boolean isSenior) {
		this.isSenior = isSenior;
	}
}
