package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model;

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

import com.sais.cashoffice.CashOfficeTest.entities.TApplication;

public class RcptToReallocDet {
	
	private double rcptToReallDetId;

	private BigDecimal amount;

	private double appActivityId;

	private String comments;

	private String crFileName;

	private double crHdrId;

	private String createdBy;

	private Date creationDate;

	private String modifiedBy;

	private Date modifiedDatetime;

	private String payor;

	private Date period;

	private String postedBy;

	private Date postingDatetime;

	private BigDecimal postingReference;

	private String postingStatus;

	private String referenceNo;

	private String referenceStatus;

	private double totCrAmt;

	private double app_id;

	private double  rcpt_reall_id;

	public double getRcptToReallDetId() {
		return rcptToReallDetId;
	}

	public void setRcptToReallDetId(double rcptToReallDetId) {
		this.rcptToReallDetId = rcptToReallDetId;
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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCrFileName() {
		return crFileName;
	}

	public void setCrFileName(String crFileName) {
		this.crFileName = crFileName;
	}

	public double getCrHdrId() {
		return crHdrId;
	}

	public void setCrHdrId(double crHdrId) {
		this.crHdrId = crHdrId;
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

	public BigDecimal getPostingReference() {
		return postingReference;
	}

	public void setPostingReference(BigDecimal postingReference) {
		this.postingReference = postingReference;
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

	public double getTotCrAmt() {
		return totCrAmt;
	}

	public void setTotCrAmt(double totCrAmt) {
		this.totCrAmt = totCrAmt;
	}

	public double getApp_id() {
		return app_id;
	}

	public void setApp_id(double app_id) {
		this.app_id = app_id;
	}

	public double getRcpt_reall_id() {
		return rcpt_reall_id;
	}

	public void setRcpt_reall_id(double rcpt_reall_id) {
		this.rcpt_reall_id = rcpt_reall_id;
	}


	
	
	

}
