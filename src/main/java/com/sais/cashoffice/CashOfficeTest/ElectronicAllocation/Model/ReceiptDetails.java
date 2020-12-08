package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model;

import java.math.BigDecimal;
import java.util.Date;

public class ReceiptDetails {
	
	private BigDecimal paypointid;
	private double receiptno;
	private BigDecimal amount;
	private Date period;
	
	public BigDecimal getPaypointid() {
		return paypointid;
	}
	public void setPaypointid(BigDecimal paypointid) {
		this.paypointid = paypointid;
	}
	public double getReceiptno() {
		return receiptno;
	}
	public void setReceiptno(double receiptno) {
		this.receiptno = receiptno;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	
	

}
