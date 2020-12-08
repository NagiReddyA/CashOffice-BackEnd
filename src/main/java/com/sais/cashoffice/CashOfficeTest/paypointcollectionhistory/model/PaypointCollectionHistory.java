package com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PaypointCollectionHistory implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Date paypoint_due_date;
	
	private BigDecimal expected_amount;
	
	private String status;
	
	
	public PaypointCollectionHistory() {
		
	}


	public Date getPaypoint_due_date() {
		return paypoint_due_date;
	}


	public void setPaypoint_due_date(Date paypoint_due_date) {
		this.paypoint_due_date = paypoint_due_date;
	}


	public BigDecimal getExpected_amount() {
		return expected_amount;
	}


	public void setExpected_amount(BigDecimal expected_amount) {
		this.expected_amount = expected_amount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
