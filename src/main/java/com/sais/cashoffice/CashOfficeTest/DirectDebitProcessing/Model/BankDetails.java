package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_BANK")
public class BankDetails implements Serializable {

	@Id
	@Column(name = "BANK_ID")
	private double bankid;
	
	@Column(name = "BANK_NAME")
	private String bankname;
	
	@Column(name = "BANK_CODE")
	private String bankcode;
	
	@Column(name = "PARENT_BANK")
	private String parentbank;
	
	
	
	public double getBankid() {
		return bankid;
	}
	public void setBankid(double bankid) {
		this.bankid = bankid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankcode() {
		return bankcode;
	}
	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}
	
	
	
	
	
}
