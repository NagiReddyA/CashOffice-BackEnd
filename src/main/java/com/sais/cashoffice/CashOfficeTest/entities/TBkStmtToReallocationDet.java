package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_BK_STMT_TO_REALLOCATION_DET database table.
 * 
 */
@Entity
@Table(name="T_BK_STMT_TO_REALLOCATION_DET")
@NamedQuery(name="TBkStmtToReallocationDet.findAll", query="SELECT t FROM TBkStmtToReallocationDet t")
public class TBkStmtToReallocationDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BK_STMT_TO_REALL_DET_ID")
	private double bkStmtToReallDetId;

	@Column(name="ALLOCATED_Y_N")
	private String allocatedYN;

	@Column(name="AMOUNT")
	private BigDecimal amount;

	@Column(name="APP_ACTIVITY_ID")
	private double appActivityId;

	@Column(name="APP_ID")
	private double appId;

	@Column(name="ATTRIBUTE1")
	private String attribute1;

	@Column(name="ATTRIBUTE2")
	private String attribute2;

	@Column(name="ATTRIBUTE3")
	private String attribute3;

	@Column(name="ATTRIBUTE4")
	private String attribute4;

	@Column(name="ATTRIBUTE5")
	private String attribute5;

	@Column(name="ATTRIBUTE6")
	private String attribute6;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="PAYOR")
	private String payor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PERIOD")
	private Date period;

	@Column(name="POST_TO_GL")
	private String postToGl;

	@Column(name="POSTED_BY")
	private String postedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="POSTING_DATETIME")
	private Date postingDatetime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="POSTING_DATETIME_GL")
	private Date postingDatetimeGl;

	@Column(name="POSTING_REFERENCE")
	private BigDecimal postingReference;

	@Column(name="POSTING_REFERENCE_GL")
	private BigDecimal postingReferenceGl;

	@Column(name="POSTING_STATUS")
	private String postingStatus;

	@Column(name="REFERENCE_NO")
	private String referenceNo;

	@Column(name="REFERENCE_STATUS")
	private String referenceStatus;

	@Column(name="TRANSACTION_CODE")
	private String transactionCode;

	//bi-directional many-to-one association to TBankStmtReallocation
	@ManyToOne
	@JoinColumn(name="BK_STMT_REALLOC_ID")
	private TBankStmtReallocation TBankStmtReallocation;

	public TBkStmtToReallocationDet() {
	}

	public double getBkStmtToReallDetId() {
		return this.bkStmtToReallDetId;
	}

	public void setBkStmtToReallDetId(double bkStmtToReallDetId) {
		this.bkStmtToReallDetId = bkStmtToReallDetId;
	}

	public String getAllocatedYN() {
		return this.allocatedYN;
	}

	public void setAllocatedYN(String allocatedYN) {
		this.allocatedYN = allocatedYN;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public double getAppActivityId() {
		return this.appActivityId;
	}

	public void setAppActivityId(double appActivityId) {
		this.appActivityId = appActivityId;
	}

	public double getAppId() {
		return this.appId;
	}

	public void setAppId(double appId) {
		this.appId = appId;
	}

	public String getAttribute1() {
		return this.attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return this.attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return this.attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return this.attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return this.attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	public String getAttribute6() {
		return this.attribute6;
	}

	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDatetime() {
		return this.modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public String getPayor() {
		return this.payor;
	}

	public void setPayor(String payor) {
		this.payor = payor;
	}

	public Date getPeriod() {
		return this.period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public String getPostToGl() {
		return this.postToGl;
	}

	public void setPostToGl(String postToGl) {
		this.postToGl = postToGl;
	}

	public String getPostedBy() {
		return this.postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public Date getPostingDatetime() {
		return this.postingDatetime;
	}

	public void setPostingDatetime(Date postingDatetime) {
		this.postingDatetime = postingDatetime;
	}

	public Date getPostingDatetimeGl() {
		return this.postingDatetimeGl;
	}

	public void setPostingDatetimeGl(Date postingDatetimeGl) {
		this.postingDatetimeGl = postingDatetimeGl;
	}

	public BigDecimal getPostingReference() {
		return this.postingReference;
	}

	public void setPostingReference(BigDecimal postingReference) {
		this.postingReference = postingReference;
	}

	public BigDecimal getPostingReferenceGl() {
		return this.postingReferenceGl;
	}

	public void setPostingReferenceGl(BigDecimal postingReferenceGl) {
		this.postingReferenceGl = postingReferenceGl;
	}

	public String getPostingStatus() {
		return this.postingStatus;
	}

	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}

	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getReferenceStatus() {
		return this.referenceStatus;
	}

	public void setReferenceStatus(String referenceStatus) {
		this.referenceStatus = referenceStatus;
	}

	public String getTransactionCode() {
		return this.transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public TBankStmtReallocation getTBankStmtReallocation() {
		return this.TBankStmtReallocation;
	}

	public void setTBankStmtReallocation(TBankStmtReallocation TBankStmtReallocation) {
		this.TBankStmtReallocation = TBankStmtReallocation;
	}

}