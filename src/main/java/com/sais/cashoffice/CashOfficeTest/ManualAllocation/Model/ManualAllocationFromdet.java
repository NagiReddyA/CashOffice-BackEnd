package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sais.cashoffice.CashOfficeTest.entities.TPolMisallocationHdr;

public class ManualAllocationFromdet {
	
	
	private double misallocationhdrid;
	

	private double manualAllFromId;

	private BigDecimal allocatedAmount;


	private String attribute1;

	
	private String createdBy;

	private Date creationDate;

	
	private BigDecimal grossAmount;

	private String modifiedBy;

	private Date modifiedDatetime;

	
	private BigDecimal paypointId;


	private Date period;

	private String postedBy;


	private Date postingDatetime;

	private String postingStatus;

	private BigDecimal receiptAmount;

	private double receiptNo;

	private BigDecimal unallocatedAmount;

	public double getMisallocationhdrid() {
		return misallocationhdrid;
	}

	public void setMisallocationhdrid(double misallocationhdrid) {
		this.misallocationhdrid = misallocationhdrid;
	}

	public double getManualAllFromId() {
		return manualAllFromId;
	}

	public void setManualAllFromId(double manualAllFromId) {
		this.manualAllFromId = manualAllFromId;
	}

	public BigDecimal getAllocatedAmount() {
		return allocatedAmount;
	}

	public void setAllocatedAmount(BigDecimal allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
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

	public BigDecimal getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(BigDecimal grossAmount) {
		this.grossAmount = grossAmount;
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

	public BigDecimal getPaypointId() {
		return paypointId;
	}

	public void setPaypointId(BigDecimal paypointId) {
		this.paypointId = paypointId;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public Date getPostingDatetime() {
		return postingDatetime;
	}

	public void setPostingDatetime(Date postingDatetime) {
		this.postingDatetime = postingDatetime;
	}

	public String getPostingStatus() {
		return postingStatus;
	}

	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}

	public BigDecimal getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(BigDecimal receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public double getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}

	public BigDecimal getUnallocatedAmount() {
		return unallocatedAmount;
	}

	public void setUnallocatedAmount(BigDecimal unallocatedAmount) {
		this.unallocatedAmount = unallocatedAmount;
	}
	
	
	
}
