package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_receipt_allocation_status_report")
public class ReceiptAllocationStatus {

	@Id
	private Long id ;
	
	private String receipt_no,
	 receipt_date,
	 branch_code,
	 trn_narration,
	 payment_mode,
	 receipt_type_code,
	 receipt_type,
	 allocated,
	 receipt,
	 gross_receipted,
	 policy_num,
	 product_abbr,
	 status,
	 accounting_date,
	 premium,
	 amount,
	 payor_client_no,
	 party_name,
	 paypoint_id ;

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

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getTrn_narration() {
		return trn_narration;
	}

	public void setTrn_narration(String trn_narration) {
		this.trn_narration = trn_narration;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public String getReceipt_type_code() {
		return receipt_type_code;
	}

	public void setReceipt_type_code(String receipt_type_code) {
		this.receipt_type_code = receipt_type_code;
	}

	public String getReceipt_type() {
		return receipt_type;
	}

	public void setReceipt_type(String receipt_type) {
		this.receipt_type = receipt_type;
	}

	public String getAllocated() {
		return allocated;
	}

	public void setAllocated(String allocated) {
		this.allocated = allocated;
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	public String getGross_receipted() {
		return gross_receipted;
	}

	public void setGross_receipted(String gross_receipted) {
		this.gross_receipted = gross_receipted;
	}

	public String getPolicy_num() {
		return policy_num;
	}

	public void setPolicy_num(String policy_num) {
		this.policy_num = policy_num;
	}

	public String getProduct_abbr() {
		return product_abbr;
	}

	public void setProduct_abbr(String product_abbr) {
		this.product_abbr = product_abbr;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAccounting_date() {
		return accounting_date;
	}

	public void setAccounting_date(String accounting_date) {
		this.accounting_date = accounting_date;
	}

	public String getPremium() {
		return premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPayor_client_no() {
		return payor_client_no;
	}

	public void setPayor_client_no(String payor_client_no) {
		this.payor_client_no = payor_client_no;
	}

	public String getParty_name() {
		return party_name;
	}

	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}

	public String getPaypoint_id() {
		return paypoint_id;
	}

	public void setPaypoint_id(String paypoint_id) {
		this.paypoint_id = paypoint_id;
	}

	@Override
	public String toString() {
		return "ReceiptAllocationStatus [id=" + id + ", receipt_no=" + receipt_no + ", receipt_date=" + receipt_date
				+ ", branch_code=" + branch_code + ", trn_narration=" + trn_narration + ", payment_mode=" + payment_mode
				+ ", receipt_type_code=" + receipt_type_code + ", receipt_type=" + receipt_type + ", allocated="
				+ allocated + ", receipt=" + receipt + ", gross_receipted=" + gross_receipted + ", policy_num="
				+ policy_num + ", product_abbr=" + product_abbr + ", status=" + status + ", accounting_date="
				+ accounting_date + ", premium=" + premium + ", amount=" + amount + ", payor_client_no="
				+ payor_client_no + ", party_name=" + party_name + ", paypoint_id=" + paypoint_id + "]";
	}
	
}
