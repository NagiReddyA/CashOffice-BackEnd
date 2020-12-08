package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Dde_model implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String   pay_point_name ; 
	public String getPay_point_name() {
		return pay_point_name;
	}
	public void setPay_point_name(String pay_point_name) {
		this.pay_point_name = pay_point_name;
	}
	private String  bk_transaction_type;
	private Date  period;
	private BigDecimal  paypoint_id;
	private Date  strike_date;
	private BigDecimal  gross_amount;
	private BigDecimal  allocated_amount;
	private String description;
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
