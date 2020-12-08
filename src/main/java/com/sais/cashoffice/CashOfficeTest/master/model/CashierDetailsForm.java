package com.sais.cashoffice.CashOfficeTest.master.model;

import java.util.Date;

public class CashierDetailsForm {

	private double cashierId;
	private String cashierCode;
	private String cashierName;
	private String loginId;
	private double branchId;
	private String branchCode;
	private String branchName;
	private Date startDate;
	private Date endDate;
	private String createdBy;
	

	public double getCashierId() {
		return cashierId;
	}

	public void setCashierId(double cashierId) {
		this.cashierId = cashierId;
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

	public double getBranchId() {
		return branchId;
	}

	public void setBranchId(double branchId) {
		this.branchId = branchId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String getcreatedBy() {
		return createdBy;
	}

	public void setcreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
}
