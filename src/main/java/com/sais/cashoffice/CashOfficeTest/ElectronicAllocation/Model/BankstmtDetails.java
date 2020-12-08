package com.sais.cashoffice.CashOfficeTest.ElectronicAllocation.Model;

import java.math.BigDecimal;
import java.util.Date;

public class BankstmtDetails {
	
	private BigDecimal paypointid;
	private double bankstmtid;
	private Date period;
	private BigDecimal allocatedamount;
	
	
	public BigDecimal getPaypointid() {
		return paypointid;
	}
	public void setPaypointid(BigDecimal paypointid) {
		this.paypointid = paypointid;
	}
	public double getBankstmtid() {
		return bankstmtid;
	}
	public void setBankstmtid(double bankstmtid) {
		this.bankstmtid = bankstmtid;
	}
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	public BigDecimal getAllocatedamount() {
		return allocatedamount;
	}
	public void setAllocatedamount(BigDecimal allocatedamount) {
		this.allocatedamount = allocatedamount;
	}
	
	
	

}
