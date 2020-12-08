package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sais.cashoffice.CashOfficeTest.entities.TBankStmtHdr;

public class BsoPremium {
	
	private double bkStmtDetBsoId;
	
	private double bankstmtid;
	

	private BigDecimal allocatedAmount;

	private String bkTransactionType;

	private String comments;

	private String createdBy;

	private Date creationDate;

	private BigDecimal expectedPremium;

	private String modifiedBy;

	private Date modifiedDatetime;

	private String payor;

	private Date period;

	private String policyCode;

	private String policyStatusId;

	private Date strikeDate;
	
	
	private char credityn;
	
	

	public char getCredityn() {
		return credityn;
	}

	public void setCredityn(char credityn) {
		this.credityn = credityn;
	}

	public double getBkStmtDetBsoId() {
		return bkStmtDetBsoId;
	}

	public void setBkStmtDetBsoId(double bkStmtDetBsoId) {
		this.bkStmtDetBsoId = bkStmtDetBsoId;
	}

	public BigDecimal getAllocatedAmount() {
		return allocatedAmount;
	}

	public void setAllocatedAmount(BigDecimal allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
	}

	public String getBkTransactionType() {
		return bkTransactionType;
	}

	public void setBkTransactionType(String bkTransactionType) {
		this.bkTransactionType = bkTransactionType;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public BigDecimal getExpectedPremium() {
		return expectedPremium;
	}

	public void setExpectedPremium(BigDecimal expectedPremium) {
		this.expectedPremium = expectedPremium;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDatetime() {
		return modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public String getPayor() {
		return payor;
	}

	public void setPayor(String payor) {
		this.payor = payor;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public String getPolicyCode() {
		return policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public String getPolicyStatusId() {
		return policyStatusId;
	}

	public void setPolicyStatusId(String policyStatusId) {
		this.policyStatusId = policyStatusId;
	}

	public Date getStrikeDate() {
		return strikeDate;
	}

	public void setStrikeDate(Date strikeDate) {
		this.strikeDate = strikeDate;
	}

	public double getBankstmtid() {
		return bankstmtid;
	}

	public void setBankstmtid(double bankstmtid) {
		this.bankstmtid = bankstmtid;
	}

	
	

}
