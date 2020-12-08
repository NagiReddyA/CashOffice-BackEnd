package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class CreditFilesmisallocDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String creditfilename;
	private double credithdrid;
	private BigDecimal cramount;
	
	
	
	public String getCreditfilename() {
		return creditfilename;
	}
	public void setCreditfilename(String creditfilename) {
		this.creditfilename = creditfilename;
	}
	public double getCredithdrid() {
		return credithdrid;
	}
	public void setCredithdrid(double credithdrid) {
		this.credithdrid = credithdrid;
	}
	public BigDecimal getCramount() {
		return cramount;
	}
	public void setCramount(BigDecimal cramount) {
		this.cramount = cramount;
	}
	
	
	
	
	

}
