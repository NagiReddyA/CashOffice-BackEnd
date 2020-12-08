package com.sais.cashoffice.CashOfficeTest.master.model;

public class CashOfficeDetForm {

	private double cashOfficeId;
	private String branchCode;
	private String cashOfficeCode;
	private String cashOfficeDesc;
	private String branchName;

	public CashOfficeDetForm() {
	}

	public CashOfficeDetForm(long cashOfficeId, String branchCode, String cashOfficeCode, String cashOfficeDesc,String branchName) {
		super();
		this.cashOfficeId = cashOfficeId;
		this.branchCode = branchCode;
		this.cashOfficeCode = cashOfficeCode;
		this.cashOfficeDesc = cashOfficeDesc;
		this.branchName=branchName;
	}

	public double getCashOfficeId() {
		return cashOfficeId;
	}

	public void setCashOfficeId(double cashOfficeId) {
		this.cashOfficeId = cashOfficeId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCashOfficeCode() {
		return cashOfficeCode;
	}

	public void setCashOfficeCode(String cashOfficeCode) {
		this.cashOfficeCode = cashOfficeCode;
	}

	public String getCashOfficeDesc() {
		return cashOfficeDesc;
	}

	public void setCashOfficeDesc(String cashOfficeDesc) {
		this.cashOfficeDesc = cashOfficeDesc;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
