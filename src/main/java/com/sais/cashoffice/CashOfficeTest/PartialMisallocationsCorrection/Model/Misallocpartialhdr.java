package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Misallocpartialhdr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private double polParMisallocHdrId;
	private double totalReversalAmt;
	private double totalAllocatedAmt;
	private String transactionType;
	private Date creationDate;
	private String createdBy;
	private Date modifiedDatetime;
	private String modifiedBy;
	private String postingStatus;
	private String postedBy;
	private Date postingDatetime;
	
	
	public double getPolParMisallocHdrId() {
		return polParMisallocHdrId;
	}
	public void setPolParMisallocHdrId(double polParMisallocHdrId) {
		this.polParMisallocHdrId = polParMisallocHdrId;
	}
	public double getTotalReversalAmt() {
		return totalReversalAmt;
	}
	public void setTotalReversalAmt(double totalReversalAmt) {
		this.totalReversalAmt = totalReversalAmt;
	}
	public double getTotalAllocatedAmt() {
		return totalAllocatedAmt;
	}
	public void setTotalAllocatedAmt(double totalAllocatedAmt) {
		this.totalAllocatedAmt = totalAllocatedAmt;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifiedDatetime() {
		return modifiedDatetime;
	}
	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getPostingStatus() {
		return postingStatus;
	}
	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
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
	

}
