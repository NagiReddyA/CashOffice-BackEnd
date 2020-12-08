package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_ppr_ub")
public class UnspecifiedBank {

	@Id
	private Long id ;
	
	private String pay_mode,
	bank_stmt_id,
	bank_stmt_number,
	bank_ac_no,
	bank_code,
	bank_name,
	stmt_start_date,
	stmt_end_date,
	posting_status,
	creation_date,
	stmt_opening_balance,
	stmt_closing_balance,
	trans_type,
	trans_desc,
	payment_mode,
	period,
	alloc_amt,
	fromdate,
	todate ;

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

	public String getBank_stmt_id() {
		return bank_stmt_id;
	}

	public void setBank_stmt_id(String bank_stmt_id) {
		this.bank_stmt_id = bank_stmt_id;
	}

	public String getBank_stmt_number() {
		return bank_stmt_number;
	}

	public void setBank_stmt_number(String bank_stmt_number) {
		this.bank_stmt_number = bank_stmt_number;
	}

	public String getBank_ac_no() {
		return bank_ac_no;
	}

	public void setBank_ac_no(String bank_ac_no) {
		this.bank_ac_no = bank_ac_no;
	}

	public String getBank_code() {
		return bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getStmt_start_date() {
		return stmt_start_date;
	}

	public void setStmt_start_date(String stmt_start_date) {
		this.stmt_start_date = stmt_start_date;
	}

	public String getStmt_end_date() {
		return stmt_end_date;
	}

	public void setStmt_end_date(String stmt_end_date) {
		this.stmt_end_date = stmt_end_date;
	}

	public String getPosting_status() {
		return posting_status;
	}

	public void setPosting_status(String posting_status) {
		this.posting_status = posting_status;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getStmt_opening_balance() {
		return stmt_opening_balance;
	}

	public void setStmt_opening_balance(String stmt_opening_balance) {
		this.stmt_opening_balance = stmt_opening_balance;
	}

	public String getStmt_closing_balance() {
		return stmt_closing_balance;
	}

	public void setStmt_closing_balance(String stmt_closing_balance) {
		this.stmt_closing_balance = stmt_closing_balance;
	}

	public String getTrans_type() {
		return trans_type;
	}

	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}

	public String getTrans_desc() {
		return trans_desc;
	}

	public void setTrans_desc(String trans_desc) {
		this.trans_desc = trans_desc;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getAlloc_amt() {
		return alloc_amt;
	}

	public void setAlloc_amt(String alloc_amt) {
		this.alloc_amt = alloc_amt;
	}

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	@Override
	public String toString() {
		return "UnspecifiedBank [id=" + id + ", pay_mode=" + pay_mode + ", bank_stmt_id=" + bank_stmt_id
				+ ", bank_stmt_number=" + bank_stmt_number + ", bank_ac_no=" + bank_ac_no + ", bank_code=" + bank_code
				+ ", bank_name=" + bank_name + ", stmt_start_date=" + stmt_start_date + ", stmt_end_date="
				+ stmt_end_date + ", posting_status=" + posting_status + ", creation_date=" + creation_date
				+ ", stmt_opening_balance=" + stmt_opening_balance + ", stmt_closing_balance=" + stmt_closing_balance
				+ ", trans_type=" + trans_type + ", trans_desc=" + trans_desc + ", payment_mode=" + payment_mode
				+ ", period=" + period + ", alloc_amt=" + alloc_amt + ", fromdate=" + fromdate + ", todate=" + todate
				+ "]";
	}

	
}
