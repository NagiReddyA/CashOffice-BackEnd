package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_ppr_ucr")
public class UnallocatedCashReceipt {

	@Id
	private Long id ;
	
	private String receipt_no, 
	  bobi_rec_no, 
	  pay_mode, 
	  paypoint_id, 
	  pay_point_name, 
	  paypoint_due_date, 
	  branch, rcpt_date, 
	  rcpt_date_1, 
	  no_of_days, 
	  gross_amount, 
	  receipt_amount, 
	  allocated_amount, 
	  status, 
	  temp_value, 
	  start_date,
	  end_date ;

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

	public String getBobi_rec_no() {
		return bobi_rec_no;
	}

	public void setBobi_rec_no(String bobi_rec_no) {
		this.bobi_rec_no = bobi_rec_no;
	}

	public String getPay_mode() {
		return pay_mode;
	}

	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}

	public String getPaypoint_id() {
		return paypoint_id;
	}

	public void setPaypoint_id(String paypoint_id) {
		this.paypoint_id = paypoint_id;
	}

	public String getPay_point_name() {
		return pay_point_name;
	}

	public void setPay_point_name(String pay_point_name) {
		this.pay_point_name = pay_point_name;
	}

	public String getPaypoint_due_date() {
		return paypoint_due_date;
	}

	public void setPaypoint_due_date(String paypoint_due_date) {
		this.paypoint_due_date = paypoint_due_date;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getRcpt_date() {
		return rcpt_date;
	}

	public void setRcpt_date(String rcpt_date) {
		this.rcpt_date = rcpt_date;
	}

	public String getRcpt_date_1() {
		return rcpt_date_1;
	}

	public void setRcpt_date_1(String rcpt_date_1) {
		this.rcpt_date_1 = rcpt_date_1;
	}

	public String getNo_of_days() {
		return no_of_days;
	}

	public void setNo_of_days(String no_of_days) {
		this.no_of_days = no_of_days;
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

	public String getAllocated_amount() {
		return allocated_amount;
	}

	public void setAllocated_amount(String allocated_amount) {
		this.allocated_amount = allocated_amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemp_value() {
		return temp_value;
	}

	public void setTemp_value(String temp_value) {
		this.temp_value = temp_value;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "UnallocatedCashReceipt [id=" + id + ", receipt_no=" + receipt_no + ", bobi_rec_no=" + bobi_rec_no
				+ ", pay_mode=" + pay_mode + ", paypoint_id=" + paypoint_id + ", pay_point_name=" + pay_point_name
				+ ", paypoint_due_date=" + paypoint_due_date + ", branch=" + branch + ", rcpt_date=" + rcpt_date
				+ ", rcpt_date_1=" + rcpt_date_1 + ", no_of_days=" + no_of_days + ", gross_amount=" + gross_amount
				+ ", receipt_amount=" + receipt_amount + ", allocated_amount=" + allocated_amount + ", status=" + status
				+ ", temp_value=" + temp_value + ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}

}
