package com.sais.cashoffice.CashOfficeTest.BankStatementPosting.Model;

import java.util.Date;

public class BankStmtPosting {
	
	private double bankstmtid;
	private String paymentmode;
	private String accountnumber;
	private String accountdescription;
	private String bankname;
	private String bankstmtnumber;
	private Date modifieddate;
	private Date stmtstartdate;
	private Date stmtenddata;
	private char postingstatus;
	private char stmtbalstatus;
	
	
	public double getBankstmtid() {
		return bankstmtid;
	}
	public void setBankstmtid(double bankstmtid) {
		this.bankstmtid = bankstmtid;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccountdescription() {
		return accountdescription;
	}
	public void setAccountdescription(String accountdescription) {
		this.accountdescription = accountdescription;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankstmtnumber() {
		return bankstmtnumber;
	}
	public void setBankstmtnumber(String bankstmtnumber) {
		this.bankstmtnumber = bankstmtnumber;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
	public Date getStmtstartdate() {
		return stmtstartdate;
	}
	public void setStmtstartdate(Date stmtstartdate) {
		this.stmtstartdate = stmtstartdate;
	}
	public Date getStmtenddata() {
		return stmtenddata;
	}
	public void setStmtenddata(Date stmtenddata) {
		this.stmtenddata = stmtenddata;
	}
	public char getPostingstatus() {
		return postingstatus;
	}
	public void setPostingstatus(char postingstatus) {
		this.postingstatus = postingstatus;
	}
	public char getStmtbalstatus() {
		return stmtbalstatus;
	}
	public void setStmtbalstatus(char stmtbalstatus) {
		this.stmtbalstatus = stmtbalstatus;
	}
	
	

}
