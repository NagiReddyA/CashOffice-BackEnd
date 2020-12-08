package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RecepitStmtDetails implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String recepitno;
	private char postingstatus;
	private Date period;
	private BigDecimal paypointid;
	private String paypointname;
	private BigDecimal amount;
	
	
	public String getRecepitno() {
		return recepitno;
	}
	public void setRecepitno(String recepitno) {
		this.recepitno = recepitno;
	}
	
	
	public char getPostingstatus() {
		return postingstatus;
	}
	public void setPostingstatus(char postingstatus) {
		this.postingstatus = postingstatus;
	}
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	public BigDecimal getPaypointid() {
		return paypointid;
	}
	public void setPaypointid(BigDecimal paypointid) {
		this.paypointid = paypointid;
	}
	public String getPaypointname() {
		return paypointname;
	}
	public void setPaypointname(String paypointname) {
		this.paypointname = paypointname;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	

}
