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
import com.sais.cashoffice.CashOfficeTest.entities.TRcptReallocation;

public class RcptFromReallocDet {
	
	private double rcptFromReallDetId;

	private BigDecimal amount;

	private double appActivityId;

	private String comments;

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

	private double rcptAppUniqueId;

	private String reallocate;

	private String referenceNo;
	
	private String referenceStatus;
	
    private double app_id;

     private double rcptreallocatonhdrid;

	public double getRcptFromReallDetId() {
		return rcptFromReallDetId;
	}

	public void setRcptFromReallDetId(double rcptFromReallDetId) {
		this.rcptFromReallDetId = rcptFromReallDetId;
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

	public double getRcptAppUniqueId() {
		return rcptAppUniqueId;
	}

	public void setRcptAppUniqueId(double rcptAppUniqueId) {
		this.rcptAppUniqueId = rcptAppUniqueId;
	}

	public String getReallocate() {
		return reallocate;
	}

	public void setReallocate(String reallocate) {
		this.reallocate = reallocate;
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


	public double getApp_id() {
		return app_id;
	}

	public void setApp_id(double app_id) {
		this.app_id = app_id;
	}

	public double getRcptreallocatonhdrid() {
		return rcptreallocatonhdrid;
	}

	public void setRcptreallocatonhdrid(double rcptreallocatonhdrid) {
		this.rcptreallocatonhdrid = rcptreallocatonhdrid;
	}
	

	

}
