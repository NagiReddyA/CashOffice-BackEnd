package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model;

import java.util.Date;

public class BankStatementDetails {

	private String paymentmode;
	
	private String bankname;
	private String accountnumber;
	private String description;
	private Date creationdate;
	private Date modifieddate;
	private String bankstatementnumber;
	private char postingstatus;
	private Date stmtstartdate;
	private Date stmtenddate;
	private String capatureby;
	private double openingbalance;
	private double closingbalance;
	private String capaturebybranch;
	private Date periodofreversal;
	
	
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
	public String getBankstatementnumber() {
		return bankstatementnumber;
	}
	public void setBankstatementnumber(String bankstatementnumber) {
		this.bankstatementnumber = bankstatementnumber;
	}
	public char getPostingstatus() {
		return postingstatus;
	}
	public void setPostingstatus(char postingstatus) {
		this.postingstatus = postingstatus;
	}
	public Date getStmtstartdate() {
		return stmtstartdate;
	}
	public void setStmtstartdate(Date stmtstartdate) {
		this.stmtstartdate = stmtstartdate;
	}
	public Date getStmtenddate() {
		return stmtenddate;
	}
	public void setStmtenddate(Date stmtenddate) {
		this.stmtenddate = stmtenddate;
	}
	public String getCapatureby() {
		return capatureby;
	}
	public void setCapatureby(String capatureby) {
		this.capatureby = capatureby;
	}
	public double getOpeningbalance() {
		return openingbalance;
	}
	public void setOpeningbalance(double openingbalance) {
		this.openingbalance = openingbalance;
	}
	public double getClosingbalance() {
		return closingbalance;
	}
	public void setClosingbalance(double closingbalance) {
		this.closingbalance = closingbalance;
	}
	public String getCapaturebybranch() {
		return capaturebybranch;
	}
	public void setCapaturebybranch(String capaturebybranch) {
		this.capaturebybranch = capaturebybranch;
	}
	public Date getPeriodofreversal() {
		return periodofreversal;
	}
	public void setPeriodofreversal(Date periodofreversal) {
		this.periodofreversal = periodofreversal;
	}
	
	
	
	
}
