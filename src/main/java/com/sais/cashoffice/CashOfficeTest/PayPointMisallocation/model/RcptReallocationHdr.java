package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class RcptReallocationHdr {

	private double rcptReallId;

	private double cashOfficeId;

	private double cashierId;


	private String comments;

	private String createdBy;

	private Date creationDate;

	private String modifiedBy;

	private Date modifiedDatetime;


	private String postToGl;

	
	private String postedBy;

	
	private Date postingDatetime;

	private Date postingDatetimeGl;

	private BigDecimal postingReference;

	private BigDecimal postingReferenceGl;

	private String postingStatus;

	
	private double rcptAllocAmt;

	

	private Date reallDate;

	
	private Date receiptDate;

	
	private double receiptNo;


	public double getRcptReallId() {
		return rcptReallId;
	}


	public void setRcptReallId(double rcptReallId) {
		this.rcptReallId = rcptReallId;
	}


	public double getCashOfficeId() {
		return cashOfficeId;
	}


	public void setCashOfficeId(double cashOfficeId) {
		this.cashOfficeId = cashOfficeId;
	}


	public double getCashierId() {
		return cashierId;
	}


	public void setCashierId(double cashierId) {
		this.cashierId = cashierId;
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


	public String getPostToGl() {
		return postToGl;
	}


	public void setPostToGl(String postToGl) {
		this.postToGl = postToGl;
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


	public Date getPostingDatetimeGl() {
		return postingDatetimeGl;
	}


	public void setPostingDatetimeGl(Date postingDatetimeGl) {
		this.postingDatetimeGl = postingDatetimeGl;
	}


	public BigDecimal getPostingReference() {
		return postingReference;
	}


	public void setPostingReference(BigDecimal postingReference) {
		this.postingReference = postingReference;
	}


	public BigDecimal getPostingReferenceGl() {
		return postingReferenceGl;
	}


	public void setPostingReferenceGl(BigDecimal postingReferenceGl) {
		this.postingReferenceGl = postingReferenceGl;
	}


	public String getPostingStatus() {
		return postingStatus;
	}


	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}


	public double getRcptAllocAmt() {
		return rcptAllocAmt;
	}


	public void setRcptAllocAmt(double rcptAllocAmt) {
		this.rcptAllocAmt = rcptAllocAmt;
	}


	public Date getReallDate() {
		return reallDate;
	}


	public void setReallDate(Date reallDate) {
		this.reallDate = reallDate;
	}


	public Date getReceiptDate() {
		return receiptDate;
	}


	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}


	public double getReceiptNo() {
		return receiptNo;
	}


	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}
	


}
