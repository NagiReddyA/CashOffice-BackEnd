package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model;

import java.math.BigDecimal;

public class CrAllocationDetails {
	
	private BigDecimal paypointid;
	private String filename;
	private double crhhdrid;
	private BigDecimal amount;
	
	
	public BigDecimal getPaypointid() {
		return paypointid;
	}
	public void setPaypointid(BigDecimal paypointid) {
		this.paypointid = paypointid;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public double getCrhhdrid() {
		return crhhdrid;
	}
	public void setCrhhdrid(double crhhdrid) {
		this.crhhdrid = crhhdrid;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	

}
