package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_BANK_ACCOUNTS_INFO")
public class BankAcoountDetails {
	
	
	@Column(name = "cash_bank")
	private String cashbank;
	
	@Id
	@Column(name = "cash_account_id")
	private double cashaccountid;
	
	@Column(name = "Bank_Code")
	private String bankcode;
	
	@Column(name = "Bank_Name")
	private String bankname;
	
	@Column(name = "bank_id")
	private double bankid;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "cash_account")
	private String cashaccount ;
	
	@Column(name = "parent_bank")
	private String parentBank;

	public String getCashbank() {
		return cashbank;
	}

	public void setCashbank(String cashbank) {
		this.cashbank = cashbank;
	}

	public double getCashaccountid() {
		return cashaccountid;
	}

	public void setCashaccountid(double cashaccountid) {
		this.cashaccountid = cashaccountid;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public double getBankid() {
		return bankid;
	}

	public void setBankid(double bankid) {
		this.bankid = bankid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCashaccount() {
		return cashaccount;
	}

	public void setCashaccount(String cashaccount) {
		this.cashaccount = cashaccount;
	}

	public String getParentBank() {
		return parentBank;
	}

	public void setParentBank(String parentBank) {
		this.parentBank = parentBank;
	}
	
	
	

}
