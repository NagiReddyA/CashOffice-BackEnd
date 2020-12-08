package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class ManuallAllocationFromRcptProcedure {
	
	private double recepitno;
	private BigDecimal paypoint;
	private Date period;
	private BigInteger allocatedamount;
	private BigDecimal grossamount;
	private BigDecimal recepitamount;
	private BigDecimal unallocatedamount;
	private String postingstatus;
	private String hdrpostingstatus;
	
	
	public double getRecepitno() {
		return recepitno;
	}
	public void setRecepitno(double recepitno) {
		this.recepitno = recepitno;
	}
	public BigDecimal getPaypoint() {
		return paypoint;
	}
	public void setPaypoint(BigDecimal paypoint) {
		this.paypoint = paypoint;
	}
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	public BigInteger getAllocatedamount() {
		return allocatedamount;
	}
	public void setAllocatedamount(BigInteger allocatedamount) {
		this.allocatedamount = allocatedamount;
	}
	public BigDecimal getGrossamount() {
		return grossamount;
	}
	public void setGrossamount(BigDecimal grossamount) {
		this.grossamount = grossamount;
	}
	public BigDecimal getRecepitamount() {
		return recepitamount;
	}
	public void setRecepitamount(BigDecimal recepitamount) {
		this.recepitamount = recepitamount;
	}
	public BigDecimal getUnallocatedamount() {
		return unallocatedamount;
	}
	public void setUnallocatedamount(BigDecimal unallocatedamount) {
		this.unallocatedamount = unallocatedamount;
	}
	public String getPostingstatus() {
		return postingstatus;
	}
	public void setPostingstatus(String postingstatus) {
		this.postingstatus = postingstatus;
	}
	public String getHdrpostingstatus() {
		return hdrpostingstatus;
	}
	public void setHdrpostingstatus(String hdrpostingstatus) {
		this.hdrpostingstatus = hdrpostingstatus;
	}
	
	
	

}
