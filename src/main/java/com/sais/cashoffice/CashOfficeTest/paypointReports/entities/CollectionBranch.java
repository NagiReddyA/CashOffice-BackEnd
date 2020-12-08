package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_colbranch")
public class CollectionBranch {

	@Id
	private Long id ;
	
	private String 
		receipt_no, 
		receipt_date, 
		receipt_amount, 
		cash_office_code, 
		cash_office_desc, 
		branch_code, 
		branch_name ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReceipt_no() {
		return receipt_no;
	}

	public void setReceipt_no(String receipt_no) {
		this.receipt_no = receipt_no;
	}

	public String getReceipt_date() {
		return receipt_date;
	}

	public void setReceipt_date(String receipt_date) {
		this.receipt_date = receipt_date;
	}

	public String getReceipt_amount() {
		return receipt_amount;
	}

	public void setReceipt_amount(String receipt_amount) {
		this.receipt_amount = receipt_amount;
	}

	public String getCash_office_code() {
		return cash_office_code;
	}

	public void setCash_office_code(String cash_office_code) {
		this.cash_office_code = cash_office_code;
	}

	public String getCash_office_desc() {
		return cash_office_desc;
	}

	public void setCash_office_desc(String cash_office_desc) {
		this.cash_office_desc = cash_office_desc;
	}

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
}
