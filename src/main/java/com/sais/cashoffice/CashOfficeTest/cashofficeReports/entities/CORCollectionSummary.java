package com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_colsummary")
public class CORCollectionSummary {

	@Id
	private Long id ;
	
	private String branch_code,
		branch_name,
		receipt_count,
		pay_method_id,
		pay_method_code,
		pay_method_desc,
		app_id,
		app_code,
		app_desc,
		allocated_amount ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getReceipt_count() {
		return receipt_count;
	}

	public void setReceipt_count(String receipt_count) {
		this.receipt_count = receipt_count;
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

	@Override
	public String toString() {
		return "CollectionSummary [id=" + id + ", branch_code=" + branch_code + ", branch_name=" + branch_name
				+ ", receipt_count=" + receipt_count + ", pay_method_id=" + pay_method_id + ", pay_method_code="
				+ pay_method_code + ", pay_method_desc=" + pay_method_desc + ", app_id=" + app_id + ", app_code="
				+ app_code + ", app_desc=" + app_desc + ", allocated_amount=" + allocated_amount + "]";
	}
}
