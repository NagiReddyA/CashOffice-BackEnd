package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Tbank_join implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String  payment_mode ;
	private String   pay_point_name ;   
	private String account_number; 
	private Date  creation_date;     
	private Date  modified_datetime;  
	private String bank_stmt_nummber;   
	private char  posting_status;    
	private Date  stmt_start_date;       
	private Date  stmt_end_date;
	private String  captured_by;
	private double stmt_opening_balance;
	private double  stmt_closing_balance;
	private String  captured_by_branch;
	private Date  period_for_reversals;
	private String  bk_transaction_type;
	private Date  period;
	private BigDecimal  paypoint_id;
	private Date  strike_date;
	private BigDecimal  gross_amount;
	private BigDecimal  allocated_amount;
	private String description;
	private double bank_stmt_id;
	private String bankname;
	
	
	
	
	public Tbank_join() {
		
	}
	
	
	

	public String getBankname() {
		return bankname;
	}




	public void setBankname(String bankname) {
		this.bankname = bankname;
	}




	public double getBank_stmt_id() {
		return bank_stmt_id;
	}



	public void setBank_stmt_id(double bank_stmt_id) {
		this.bank_stmt_id = bank_stmt_id;
	}



	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public String getPay_point_name() {
		return pay_point_name;
	}

	public void setPay_point_name(String pay_point_name) {
		this.pay_point_name = pay_point_name;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public Date getModified_datetime() {
		return modified_datetime;
	}

	public void setModified_datetime(Date modified_datetime) {
		this.modified_datetime = modified_datetime;
	}

	public String getBank_stmt_nummber() {
		return bank_stmt_nummber;
	}

	public void setBank_stmt_nummber(String bank_stmt_nummber) {
		this.bank_stmt_nummber = bank_stmt_nummber;
	}

	public char getPosting_status() {
		return posting_status;
	}

	public void setPosting_status(char posting_status) {
		this.posting_status = posting_status;
	}

	public Date getStmt_start_date() {
		return stmt_start_date;
	}

	public void setStmt_start_date(Date stmt_start_date) {
		this.stmt_start_date = stmt_start_date;
	}

	public Date getStmt_end_date() {
		return stmt_end_date;
	}

	public void setStmt_end_date(Date stmt_end_date) {
		this.stmt_end_date = stmt_end_date;
	}

	public String getCaptured_by() {
		return captured_by;
	}

	public void setCaptured_by(String captured_by) {
		this.captured_by = captured_by;
	}

	public double getStmt_opening_balance() {
		return stmt_opening_balance;
	}

	public void setStmt_opening_balance(double stmt_opening_balance) {
		this.stmt_opening_balance = stmt_opening_balance;
	}

	public double getStmt_closing_balance() {
		return stmt_closing_balance;
	}

	public void setStmt_closing_balance(double stmt_closing_balance) {
		this.stmt_closing_balance = stmt_closing_balance;
	}

	public String getCaptured_by_branch() {
		return captured_by_branch;
	}

	public void setCaptured_by_branch(String captured_by_branch) {
		this.captured_by_branch = captured_by_branch;
	}

	public Date getPeriod_for_reversals() {
		return period_for_reversals;
	}

	public void setPeriod_for_reversals(Date period_for_reversals) {
		this.period_for_reversals = period_for_reversals;
	}

	public String getBk_transaction_type() {
		return bk_transaction_type;
	}

	public void setBk_transaction_type(String bk_transaction_type) {
		this.bk_transaction_type = bk_transaction_type;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public BigDecimal getPaypoint_id() {
		return paypoint_id;
	}

	public void setPaypoint_id(BigDecimal paypoint_id) {
		this.paypoint_id = paypoint_id;
	}

	public Date getStrike_date() {
		return strike_date;
	}

	public void setStrike_date(Date strike_date) {
		this.strike_date = strike_date;
	}

	public BigDecimal getGross_amount() {
		return gross_amount;
	}

	public void setGross_amount(BigDecimal gross_amount) {
		this.gross_amount = gross_amount;
	}

	public BigDecimal getAllocated_amount() {
		return allocated_amount;
	}

	public void setAllocated_amount(BigDecimal allocated_amount) {
		this.allocated_amount = allocated_amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
  
	
	
	

	
}
