package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_RCPT_TO_REALLOCATION_DET database table.
 * 
 */
@Entity
@Table(name="T_RCPT_TO_REALLOCATION_DET")
@NamedQuery(name="TRcptToReallocationDet.findAll", query="SELECT t FROM TRcptToReallocationDet t")
public class TRcptToReallocationDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RCPT_TO_REALL_DET_ID")
	private double rcptToReallDetId;

	@Column(name="AMOUNT")
	private BigDecimal amount;

	@Column(name="APP_ACTIVITY_ID")
	private double appActivityId;

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

	@Column(name="CR_FILE_NAME")
	private String crFileName;

	@Column(name="CR_HDR_ID")
	private double crHdrId;

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

	@Column(name="POSTED_BY")
	private String postedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="POSTING_DATETIME")
	private Date postingDatetime;

	@Column(name="POSTING_REFERENCE")
	private BigDecimal postingReference;

	@Column(name="POSTING_STATUS")
	private String postingStatus;

	@Column(name="REFERENCE_NO")
	private String referenceNo;

	@Column(name="REFERENCE_STATUS")
	private String referenceStatus;

	@Column(name="TOT_CR_AMT")
	private double totCrAmt;

	//bi-directional many-to-one association to TApplication
	@ManyToOne
	@JoinColumn(name="APP_ID")
	private TApplication TApplication;

	//bi-directional many-to-one association to TRcptReallocation
	@ManyToOne
	@JoinColumn(name="RCPT_REALL_ID")
	private TRcptReallocation TRcptReallocation;

	public TRcptToReallocationDet() {
	}

	public double getRcptToReallDetId() {
		return this.rcptToReallDetId;
	}

	public void setRcptToReallDetId(double rcptToReallDetId) {
		this.rcptToReallDetId = rcptToReallDetId;
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

	public String getCrFileName() {
		return this.crFileName;
	}

	public void setCrFileName(String crFileName) {
		this.crFileName = crFileName;
	}

	public double getCrHdrId() {
		return this.crHdrId;
	}

	public void setCrHdrId(double crHdrId) {
		this.crHdrId = crHdrId;
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

	public BigDecimal getPostingReference() {
		return this.postingReference;
	}

	public void setPostingReference(BigDecimal postingReference) {
		this.postingReference = postingReference;
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

	public double getTotCrAmt() {
		return this.totCrAmt;
	}

	public void setTotCrAmt(double totCrAmt) {
		this.totCrAmt = totCrAmt;
	}

	public TApplication getTApplication() {
		return this.TApplication;
	}

	public void setTApplication(TApplication TApplication) {
		this.TApplication = TApplication;
	}

	public TRcptReallocation getTRcptReallocation() {
		return this.TRcptReallocation;
	}

	public void setTRcptReallocation(TRcptReallocation TRcptReallocation) {
		this.TRcptReallocation = TRcptReallocation;
	}

}