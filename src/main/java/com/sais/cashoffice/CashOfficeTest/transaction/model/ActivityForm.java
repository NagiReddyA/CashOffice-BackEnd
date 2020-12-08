package com.sais.cashoffice.CashOfficeTest.transaction.model;

import java.time.LocalDate;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffActivity1;

public class ActivityForm  {
	
	
	private int cashOffActivityId;
	private char status;
	private LocalDate receiptDate;	
	private String branchCode;
	private String cashOfficeCode;
	private double cashOfficeId;
	private char seniorCashierYn;
	private double cashierId;
	private String cashierCode;
	private String loginId;
	private double cashierActivityId;
	
	
	public double getCashierActivityId() {
		return cashierActivityId;
	}

	public void setCashierActivityId(double cashierActivityId) {
		this.cashierActivityId = cashierActivityId;
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

	public double getCashOfficeId() {
		return cashOfficeId;
	}

	public void setCashOfficeId(double cashOfficeId) {
		this.cashOfficeId = cashOfficeId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	
	
	
	public String getCashierCode() {
		return cashierCode;
	}

	public void setCashierCode(String cashierCode) {
		this.cashierCode = cashierCode;
	}

	public double getCashierId() {
		return cashierId;
	}

	public void setCashierId(double cashierId) {
		this.cashierId = cashierId;
	}

	
	
	
	public char getSeniorCashierYn() {
		return seniorCashierYn;
	}

	public void setSeniorCashierYn(char seniorCashierYn) {
		this.seniorCashierYn = seniorCashierYn;
	}



	public int getCashOffActivityId() {
		return cashOffActivityId;
	}

	public void setCashOffActivityId(int cashOffActivityId) {
		this.cashOffActivityId = cashOffActivityId;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public LocalDate getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(LocalDate date) {
		this.receiptDate = date;
	}



	public ActivityForm() {
		
	}

	public void add(TCashOffActivity1 cashoffactivityEntity) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * public ActivityForm(String cashierCode, double cashOffActivityId, boolean
	 * enabled,int appId) { super(); this.appActivityCode = appActivityCode;
	 * this.appActivityDesc = appActivityDesc; this.enabled = enabled;
	 * this.appId=appId; }
	 */
	
	

	
}
