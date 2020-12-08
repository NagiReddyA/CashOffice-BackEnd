package com.sais.cashoffice.CashOfficeTest.transaction.model;

import java.time.LocalDate;
import java.util.Date;




public class TillActivityForm {
	

	
	private double cashierId;
	
	private String cashierCode;
	
	private String cashierName;
	
	private String branchCode;
	
	private String branchName;
	
	private double cashOfficeId;
	
	private String cashOfficeDesc;
	
	private String cashOfficeCode;
	
	private double cashOffActivityId;
	
	private char status;
	
	private char tillActivityStatus;
	
	private LocalDate receiptDate;
	
	private double cashierActivityId;
	
	
	
	
	public char getTillActivityStatus() {
		return tillActivityStatus;
	}

	public void setTillActivityStatus(char tillActivityStatus) {
		this.tillActivityStatus = tillActivityStatus;
	}

	public double getCashierActivityId() {
		return cashierActivityId;
	}

	public void setCashierActivityId(double cashierActivityId) {
		this.cashierActivityId = cashierActivityId;
	}

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

	public double getCashOfficeId() {
		return cashOfficeId;
	}

	public void setCashOfficeId(double cashOfficeId) {
		this.cashOfficeId = cashOfficeId;
	}

	public String getCashOfficeDesc() {
		return cashOfficeDesc;
	}

	public void setCashOfficeDesc(String cashOfficeDesc) {
		this.cashOfficeDesc = cashOfficeDesc;
	}

	public String getCashOfficeCode() {
		return cashOfficeCode;
	}

	public void setCashOfficeCode(String cashOfficeCode) {
		this.cashOfficeCode = cashOfficeCode;
	}

	public double getCashOffActivityId() {
		return cashOffActivityId;
	}

	public void setCashOffActivityId(double cashOffActivityId) {
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

	
	
	

}
