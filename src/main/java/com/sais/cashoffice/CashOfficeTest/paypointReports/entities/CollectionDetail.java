package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_coldetail")
public class CollectionDetail {

	@Id
	private Long id ;
	
	private String 
		cash_office_id, 
		branch_code, 
		branch_name,
		receipt_date,
		receipt_no, 
		receipt_amount,
		pay_method_id,
	    pay_method_code,
	    pay_method_desc,
	    app_id,
	    app_code,
	    app_desc,
	    allocated_amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCash_office_id() {
		return cash_office_id;
	}

	public void setCash_office_id(String cash_office_id) {
		this.cash_office_id = cash_office_id;
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

	public String getReceipt_date() {
		return receipt_date;
	}

	public void setReceipt_date(String receipt_date) {
		this.receipt_date = receipt_date;
	}

	public String getReceipt_no() {
		return receipt_no;
	}

	public void setReceipt_no(String receipt_no) {
		this.receipt_no = receipt_no;
	}

	public String getReceipt_amount() {
		return receipt_amount;
	}

	public void setReceipt_amount(String receipt_amount) {
		this.receipt_amount = receipt_amount;
	}

	public String getPay_method_id() {
		return pay_method_id;
	}

	public void setPay_method_id(String pay_method_id) {
		this.pay_method_id = pay_method_id;
	}

	public String getPay_method_code() {
		return pay_method_code;
	}

	public void setPay_method_code(String pay_method_code) {
		this.pay_method_code = pay_method_code;
	}

	public String getPay_method_desc() {
		return pay_method_desc;
	}

	public void setPay_method_desc(String pay_method_desc) {
		this.pay_method_desc = pay_method_desc;
	}

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public String getApp_code() {
		return app_code;
	}

	public void setApp_code(String app_code) {
		this.app_code = app_code;
	}

	public String getApp_desc() {
		return app_desc;
	}

	public void setApp_desc(String app_desc) {
		this.app_desc = app_desc;
	}

	public String getAllocated_amount() {
		return allocated_amount;
	}

	public void setAllocated_amount(String allocated_amount) {
		this.allocated_amount = allocated_amount;
	}

}
