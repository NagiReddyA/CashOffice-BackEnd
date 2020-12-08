package com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ReceiptDetails implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private double receiptno;
	
	private BigDecimal receiptamount;
	
	private Date recepitdate;
	
	public ReceiptDetails() {
		
	}

	public double getReceiptno() {
		return receiptno;
	}

	public void setReceiptno(double receiptno) {
		this.receiptno = receiptno;
	}

	public BigDecimal getReceiptamount() {
		return receiptamount;
	}

	public void setReceiptamount(BigDecimal receiptamount) {
		this.receiptamount = receiptamount;
	}

	public Date getRecepitdate() {
		return recepitdate;
	}

	public void setRecepitdate(Date recepitdate) {
		this.recepitdate = recepitdate;
	}
	
	

}
