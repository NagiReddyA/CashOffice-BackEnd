package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_daily_receipt_listing")
public class ReceiptListing {

	@Id
	private Long id ;
	
	private String receipt_no,
    receipt_date,
    received_from,
    pay_method_id,
    receipt_amount,
    pay_method_code,
    pay_method_desc,
    branch_code,
    sh_office_id,
    sh_office_code,
    sh_office_desc,
    posting_status,
    posting_reference,
    branch_name,
    app_id,
    app_code,
    app_desc,
    rcpt_all_id,
    rcpt_trn_id,
    rec_alloted_amount,
    reallotion_status,
    app_activity_id,
    app_activity_code,
    app_activity_desc,
    period,
    policy_code,
    payor,
    product_code,
    paypoint_id,
    paypoint_name,
    loan_type,
    deal_number,
    units_enshed,
    act_alloted_amount,
    shier_id,
    shier_code,
    shier_name,
    reference_number,
    reference_date,
    drawee ;

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

	public String getSh_office_id() {
		return sh_office_id;
	}

	public void setSh_office_id(String sh_office_id) {
		this.sh_office_id = sh_office_id;
	}

	public String getSh_office_code() {
		return sh_office_code;
	}

	public void setSh_office_code(String sh_office_code) {
		this.sh_office_code = sh_office_code;
	}

	public String getSh_office_desc() {
		return sh_office_desc;
	}

	public void setSh_office_desc(String sh_office_desc) {
		this.sh_office_desc = sh_office_desc;
	}

	public String getPosting_status() {
		return posting_status;
	}

	public void setPosting_status(String posting_status) {
		this.posting_status = posting_status;
	}

	public String getPosting_reference() {
		return posting_reference;
	}

	public void setPosting_reference(String posting_reference) {
		this.posting_reference = posting_reference;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
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

	public String getRec_alloted_amount() {
		return rec_alloted_amount;
	}

	public void setRec_alloted_amount(String rec_alloted_amount) {
		this.rec_alloted_amount = rec_alloted_amount;
	}

	public String getReallotion_status() {
		return reallotion_status;
	}

	public void setReallotion_status(String reallotion_status) {
		this.reallotion_status = reallotion_status;
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

	public String getUnits_enshed() {
		return units_enshed;
	}

	public void setUnits_enshed(String units_enshed) {
		this.units_enshed = units_enshed;
	}

	public String getAct_alloted_amount() {
		return act_alloted_amount;
	}

	public void setAct_alloted_amount(String act_alloted_amount) {
		this.act_alloted_amount = act_alloted_amount;
	}

	public String getShier_id() {
		return shier_id;
	}

	public void setShier_id(String shier_id) {
		this.shier_id = shier_id;
	}

	public String getShier_code() {
		return shier_code;
	}

	public void setShier_code(String shier_code) {
		this.shier_code = shier_code;
	}

	public String getShier_name() {
		return shier_name;
	}

	public void setShier_name(String shier_name) {
		this.shier_name = shier_name;
	}

	public String getReference_number() {
		return reference_number;
	}

	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}

	public String getReference_date() {
		return reference_date;
	}

	public void setReference_date(String reference_date) {
		this.reference_date = reference_date;
	}

	public String getDrawee() {
		return drawee;
	}

	public void setDrawee(String drawee) {
		this.drawee = drawee;
	}

	@Override
	public String toString() {
		return "ReceiptListing [id=" + id + ", receipt_no=" + receipt_no + ", receipt_date=" + receipt_date
				+ ", received_from=" + received_from + ", pay_method_id=" + pay_method_id + ", receipt_amount="
				+ receipt_amount + ", pay_method_code=" + pay_method_code + ", pay_method_desc=" + pay_method_desc
				+ ", branch_code=" + branch_code + ", sh_office_id=" + sh_office_id + ", sh_office_code="
				+ sh_office_code + ", sh_office_desc=" + sh_office_desc + ", posting_status=" + posting_status
				+ ", posting_reference=" + posting_reference + ", branch_name=" + branch_name + ", app_id=" + app_id
				+ ", app_code=" + app_code + ", app_desc=" + app_desc + ", rcpt_all_id=" + rcpt_all_id
				+ ", rcpt_trn_id=" + rcpt_trn_id + ", rec_alloted_amount=" + rec_alloted_amount + ", reallotion_status="
				+ reallotion_status + ", app_activity_id=" + app_activity_id + ", app_activity_code="
				+ app_activity_code + ", app_activity_desc=" + app_activity_desc + ", period=" + period
				+ ", policy_code=" + policy_code + ", payor=" + payor + ", product_code=" + product_code
				+ ", paypoint_id=" + paypoint_id + ", paypoint_name=" + paypoint_name + ", loan_type=" + loan_type
				+ ", deal_number=" + deal_number + ", units_enshed=" + units_enshed + ", act_alloted_amount="
				+ act_alloted_amount + ", shier_id=" + shier_id + ", shier_code=" + shier_code + ", shier_name="
				+ shier_name + ", reference_number=" + reference_number + ", reference_date=" + reference_date
				+ ", drawee=" + drawee + "]";
	}

	
}
