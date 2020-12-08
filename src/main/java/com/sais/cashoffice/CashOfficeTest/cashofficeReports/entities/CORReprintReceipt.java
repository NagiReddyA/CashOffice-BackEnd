package com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_reprint_receipt")
public class CORReprintReceipt {

	@Id
	private Long id ;
	
	private String receipt_no, receipt_date, received_from, pay_method_id, 
		receipt_amount, pay_method_code, pay_method_desc, branch_code, 
		cash_office_code, cash_office_desc, branch_name, cashier_code, 
		cashier_name, app_id, app_code, app_desc, rcpt_all_id, rcpt_trn_id, 
		rec_allocated_amount, reallocation_status, app_activity_id, 
		app_activity_code, app_activity_desc, period, policy_code, payor, 
		product_code, paypoint_id, paypoint_name, loan_type, deal_number, 
		units_encashed, act_allocated_amount ;

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

	public String getReceived_from() {
		return received_from;
	}

	public void setReceived_from(String received_from) {
		this.received_from = received_from;
	}

	public String getPay_method_id() {
		return pay_method_id;
	}

	public void setPay_method_id(String pay_method_id) {
		this.pay_method_id = pay_method_id;
	}

	public String getReceipt_amount() {
		return receipt_amount;
	}

	public void setReceipt_amount(String receipt_amount) {
		this.receipt_amount = receipt_amount;
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

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
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

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getCashier_code() {
		return cashier_code;
	}

	public void setCashier_code(String cashier_code) {
		this.cashier_code = cashier_code;
	}

	public String getCashier_name() {
		return cashier_name;
	}

	public void setCashier_name(String cashier_name) {
		this.cashier_name = cashier_name;
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

	public String getRcpt_all_id() {
		return rcpt_all_id;
	}

	public void setRcpt_all_id(String rcpt_all_id) {
		this.rcpt_all_id = rcpt_all_id;
	}

	public String getRcpt_trn_id() {
		return rcpt_trn_id;
	}

	public void setRcpt_trn_id(String rcpt_trn_id) {
		this.rcpt_trn_id = rcpt_trn_id;
	}

	public String getRec_allocated_amount() {
		return rec_allocated_amount;
	}

	public void setRec_allocated_amount(String rec_allocated_amount) {
		this.rec_allocated_amount = rec_allocated_amount;
	}

	public String getReallocation_status() {
		return reallocation_status;
	}

	public void setReallocation_status(String reallocation_status) {
		this.reallocation_status = reallocation_status;
	}

	public String getApp_activity_id() {
		return app_activity_id;
	}

	public void setApp_activity_id(String app_activity_id) {
		this.app_activity_id = app_activity_id;
	}

	public String getApp_activity_code() {
		return app_activity_code;
	}

	public void setApp_activity_code(String app_activity_code) {
		this.app_activity_code = app_activity_code;
	}

	public String getApp_activity_desc() {
		return app_activity_desc;
	}

	public void setApp_activity_desc(String app_activity_desc) {
		this.app_activity_desc = app_activity_desc;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPolicy_code() {
		return policy_code;
	}

	public void setPolicy_code(String policy_code) {
		this.policy_code = policy_code;
	}

	public String getPayor() {
		return payor;
	}

	public void setPayor(String payor) {
		this.payor = payor;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getPaypoint_id() {
		return paypoint_id;
	}

	public void setPaypoint_id(String paypoint_id) {
		this.paypoint_id = paypoint_id;
	}

	public String getPaypoint_name() {
		return paypoint_name;
	}

	public void setPaypoint_name(String paypoint_name) {
		this.paypoint_name = paypoint_name;
	}

	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	public String getDeal_number() {
		return deal_number;
	}

	public void setDeal_number(String deal_number) {
		this.deal_number = deal_number;
	}

	public String getUnits_encashed() {
		return units_encashed;
	}

	public void setUnits_encashed(String units_encashed) {
		this.units_encashed = units_encashed;
	}

	public String getAct_allocated_amount() {
		return act_allocated_amount;
	}

	public void setAct_allocated_amount(String act_allocated_amount) {
		this.act_allocated_amount = act_allocated_amount;
	}

	@Override
	public String toString() {
		return "ReprintReceipt [id=" + id + ", receipt_no=" + receipt_no + ", receipt_date=" + receipt_date
				+ ", received_from=" + received_from + ", pay_method_id=" + pay_method_id + ", receipt_amount="
				+ receipt_amount + ", pay_method_code=" + pay_method_code + ", pay_method_desc=" + pay_method_desc
				+ ", branch_code=" + branch_code + ", cash_office_code=" + cash_office_code + ", cash_office_desc="
				+ cash_office_desc + ", branch_name=" + branch_name + ", cashier_code=" + cashier_code
				+ ", cashier_name=" + cashier_name + ", app_id=" + app_id + ", app_code=" + app_code + ", app_desc="
				+ app_desc + ", rcpt_all_id=" + rcpt_all_id + ", rcpt_trn_id=" + rcpt_trn_id + ", rec_allocated_amount="
				+ rec_allocated_amount + ", reallocation_status=" + reallocation_status + ", app_activity_id="
				+ app_activity_id + ", app_activity_code=" + app_activity_code + ", app_activity_desc="
				+ app_activity_desc + ", period=" + period + ", policy_code=" + policy_code + ", payor=" + payor
				+ ", product_code=" + product_code + ", paypoint_id=" + paypoint_id + ", paypoint_name=" + paypoint_name
				+ ", loan_type=" + loan_type + ", deal_number=" + deal_number + ", units_encashed=" + units_encashed
				+ ", act_allocated_amount=" + act_allocated_amount + "]";
	}	    
}
