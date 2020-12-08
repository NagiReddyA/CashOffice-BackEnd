package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class MisallocationHdr implements Serializable  {

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;

	
	
	private double polMisallocationId;


	private String createdBy;

	
	private Date creationDate;


	private String modifiedBy;


	
	private Date modifiedDatetime;


	private String postedBy;

	
	private Date postingDatetime;


	private String postingStatus;


	private BigDecimal totalAllocatedAmt;


	private BigDecimal totalReversalAmt;


	public double getPolMisallocationId() {
		return polMisallocationId;
	}


	public void setPolMisallocationId(double polMisallocationId) {
		this.polMisallocationId = polMisallocationId;
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


	public BigDecimal getTotalAllocatedAmt() {
		return totalAllocatedAmt;
	}


	public void setTotalAllocatedAmt(BigDecimal totalAllocatedAmt) {
		this.totalAllocatedAmt = totalAllocatedAmt;
	}


	public BigDecimal getTotalReversalAmt() {
		return totalReversalAmt;
	}


	public void setTotalReversalAmt(BigDecimal totalReversalAmt) {
		this.totalReversalAmt = totalReversalAmt;
	}
	
	
	

}
