package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model;

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

public class BkStmtToRealloctionDet {


	private double bkStmtToReallDetId;
	private double bkstmtreallocid;
	private String allocatedYN;
	private BigDecimal amount;
	private double appActivityId;
	private double appId;
	private String comments;
	private String createdBy;
	private Date creationDate;
	private String modifiedBy;
	private Date modifiedDatetime;
	private String payor;
    private Date period;
	private String postToGl;
	private String postedBy;
	private Date postingDatetime;
	private Date postingDatetimeGl;
	private BigDecimal postingReference;
	private BigDecimal postingReferenceGl;
	private String postingStatus;
	private String referenceNo;
	private String referenceStatus;
	private String transactionCode;
	public double getBkStmtToReallDetId() {
		return bkStmtToReallDetId;
	}
	public void setBkStmtToReallDetId(double bkStmtToReallDetId) {
		this.bkStmtToReallDetId = bkStmtToReallDetId;
	}
	public double getBkstmtreallocid() {
		return bkstmtreallocid;
	}
	public void setBkstmtreallocid(double bkstmtreallocid) {
		this.bkstmtreallocid = bkstmtreallocid;
	}
	public String getAllocatedYN() {
		return allocatedYN;
	}
	public void setAllocatedYN(String allocatedYN) {
		this.allocatedYN = allocatedYN;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public double getAppActivityId() {
		return appActivityId;
	}
	public void setAppActivityId(double appActivityId) {
		this.appActivityId = appActivityId;
	}
	public double getAppId() {
		return appId;
	}
	public void setAppId(double appId) {
		this.appId = appId;
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
	public String getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
	public String getReferenceStatus() {
		return referenceStatus;
	}
	public void setReferenceStatus(String referenceStatus) {
		this.referenceStatus = referenceStatus;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	
	
	
	
	
	


	
	
}
