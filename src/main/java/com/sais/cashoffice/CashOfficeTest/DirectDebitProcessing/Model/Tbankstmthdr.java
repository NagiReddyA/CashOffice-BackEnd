package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model;

import java.util.Date;

public class Tbankstmthdr {
	
	private String paymentmode;
	private String bankname;
	private String accountnumber;
	private Date creationdate;
	private Date modifiedate;
	private String bankstmtnumber;
	private String postingstatus;
	private Date datefrom;
	private Date dateto;
	private String loginname;
	private double openingbalance;
	private double closingbalance;
	private String branch;
	private Date reversalperiod;
	private String createdby;
	
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
	public Date getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	public Date getModifiedate() {
		return modifiedate;
	}
	public void setModifiedate(Date modifiedate) {
		this.modifiedate = modifiedate;
	}
	public String getBankstmtnumber() {
		return bankstmtnumber;
	}
	public void setBankstmtnumber(String bankstmtnumber) {
		this.bankstmtnumber = bankstmtnumber;
	}
	public String getPostingstatus() {
		return postingstatus;
	}
	public void setPostingstatus(String postingstatus) {
		this.postingstatus = postingstatus;
	}
	public Date getDatefrom() {
		return datefrom;
	}
	public void setDatefrom(Date datefrom) {
		this.datefrom = datefrom;
	}
	public Date getDateto() {
		return dateto;
	}
	public void setDateto(Date dateto) {
		this.dateto = dateto;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Date getReversalperiod() {
		return reversalperiod;
	}
	public void setReversalperiod(Date reversalperiod) {
		this.reversalperiod = reversalperiod;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	
	
	

}
