package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_ppr_ugso")
public class UnspecifiedGso {

	@Id
	private Long id ;
	
	private String pay_mode,
	received_from_name,
	bank_branch,
	receipt_no,
	rcpt_date,
	no_of_days,
	allocated_amount,
	gross_amount,
	receipt_amount,
	unallocated_amount ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPay_mode() {
		return pay_mode;
	}

	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}

	public String getReceived_from_name() {
		return received_from_name;
	}

	public void setReceived_from_name(String received_from_name) {
		this.received_from_name = received_from_name;
	}

	public String getBank_branch() {
		return bank_branch;
	}

	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}

	public String getReceipt_no() {
		return receipt_no;
	}

	public void setReceipt_no(String receipt_no) {
		this.receipt_no = receipt_no;
	}

	public String getRcpt_date() {
		return rcpt_date;
	}

	public void setRcpt_date(String rcpt_date) {
		this.rcpt_date = rcpt_date;
	}

	public String getNo_of_days() {
		return no_of_days;
	}

	public void setNo_of_days(String no_of_days) {
		this.no_of_days = no_of_days;
	}

	public String getAllocated_amount() {
		return allocated_amount;
	}

	public void setAllocated_amount(String allocated_amount) {
		this.allocated_amount = allocated_amount;
	}

	public String getGross_amount() {
		return gross_amount;
	}

	public void setGross_amount(String gross_amount) {
		this.gross_amount = gross_amount;
	}

	public String getReceipt_amount() {
		return receipt_amount;
	}

	public void setReceipt_amount(String receipt_amount) {
		this.receipt_amount = receipt_amount;
	}

	public String getUnallocated_amount() {
		return unallocated_amount;
	}

	public void setUnallocated_amount(String unallocated_amount) {
		this.unallocated_amount = unallocated_amount;
	}

	@Override
	public String toString() {
		return "UnspecifiedGso [id=" + id + ", pay_mode=" + pay_mode + ", received_from_name=" + received_from_name
				+ ", bank_branch=" + bank_branch + ", receipt_no=" + receipt_no + ", rcpt_date=" + rcpt_date
				+ ", no_of_days=" + no_of_days + ", allocated_amount=" + allocated_amount + ", gross_amount="
				+ gross_amount + ", receipt_amount=" + receipt_amount + ", unallocated_amount=" + unallocated_amount
				+ "]";
	}

		
}
