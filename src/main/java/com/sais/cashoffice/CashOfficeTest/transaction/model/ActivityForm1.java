package com.sais.cashoffice.CashOfficeTest.transaction.model;

public class ActivityForm1 {
	
	private String cashierCode;
	private int cashOffActivityId;
	private String cashierName;
	private String loginId;
	private String branchCode;
	private char tillActivityStatus;
	private String authorize;
	private double cashOfficeId;
	private double cashierActivityId;
	
	
	
	public int getCashOffActivityId() {
		return cashOffActivityId;
	}
	public void setCashOffActivityId(int cashOffActivityId) {
		this.cashOffActivityId = cashOffActivityId;
	}
	public double getCashierActivityId() {
		return cashierActivityId;
	}
	public void setCashierActivityId(double cashierActivityId) {
		this.cashierActivityId = cashierActivityId;
	}
	public double getCashOfficeId() {
		return cashOfficeId;
	}
	public void setCashOfficeId(double cashOfficeId) {
		this.cashOfficeId = cashOfficeId;
	}
	public String getCashierCode() {
		return cashierCode;
	}
	public void setCashierCode(String cashierCode) {
		this.cashierCode = cashierCode;
	}
	public String getCashierName() {
		return cashierName;
	}
	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public char getTillActivityStatus() {
		return tillActivityStatus;
	}
	public void setTillActivityStatus(char tillActivityStatus) {
		this.tillActivityStatus = tillActivityStatus;
	}
	public String getAuthorize() {
		return authorize;
	}
	public void setAuthorize(String authorize) {
		this.authorize = authorize;
	}
	public void add(ActivityForm1 form1) {
		// TODO Auto-generated method stub
		
	}
	
	
}
