package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_RCPT_REALLOCATION database table.
 * 
 */
@Entity
@Table(name="T_RCPT_REALLOCATION")
@NamedQuery(name="TRcptReallocation.findAll", query="SELECT t FROM TRcptReallocation t")
public class TRcptReallocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RCPT_REALL_ID")
	private double rcptReallId;

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

	@Column(name="CASH_OFFICE_ID")
	private double cashOfficeId;

	@Column(name="CASHIER_ID")
	private double cashierId;

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

	@Column(name="RCPT_ALLOC_AMT")
	private double rcptAllocAmt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REALL_DATE")
	private Date reallDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECEIPT_DATE")
	private Date receiptDate;

	@Column(name="RECEIPT_NO")
	private double receiptNo;

	//bi-directional many-to-one association to TRcptFromReallocationDet
	@OneToMany(mappedBy="TRcptReallocation")
	private List<TRcptFromReallocationDet> TRcptFromReallocationDets;

	//bi-directional many-to-one association to TRcptToReallocationDet
	@OneToMany(mappedBy="TRcptReallocation")
	private List<TRcptToReallocationDet> TRcptToReallocationDets;

	public TRcptReallocation() {
	}

	public double getRcptReallId() {
		return this.rcptReallId;
	}

	public void setRcptReallId(double rcptReallId) {
		this.rcptReallId = rcptReallId;
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

	public double getCashOfficeId() {
		return this.cashOfficeId;
	}

	public void setCashOfficeId(double cashOfficeId) {
		this.cashOfficeId = cashOfficeId;
	}

	public double getCashierId() {
		return this.cashierId;
	}

	public void setCashierId(double cashierId) {
		this.cashierId = cashierId;
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

	public double getRcptAllocAmt() {
		return this.rcptAllocAmt;
	}

	public void setRcptAllocAmt(double rcptAllocAmt) {
		this.rcptAllocAmt = rcptAllocAmt;
	}

	public Date getReallDate() {
		return this.reallDate;
	}

	public void setReallDate(Date reallDate) {
		this.reallDate = reallDate;
	}

	public Date getReceiptDate() {
		return this.receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public double getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}

	public List<TRcptFromReallocationDet> getTRcptFromReallocationDets() {
		return this.TRcptFromReallocationDets;
	}

	public void setTRcptFromReallocationDets(List<TRcptFromReallocationDet> TRcptFromReallocationDets) {
		this.TRcptFromReallocationDets = TRcptFromReallocationDets;
	}

	public TRcptFromReallocationDet addTRcptFromReallocationDet(TRcptFromReallocationDet TRcptFromReallocationDet) {
		getTRcptFromReallocationDets().add(TRcptFromReallocationDet);
		TRcptFromReallocationDet.setTRcptReallocation(this);

		return TRcptFromReallocationDet;
	}

	public TRcptFromReallocationDet removeTRcptFromReallocationDet(TRcptFromReallocationDet TRcptFromReallocationDet) {
		getTRcptFromReallocationDets().remove(TRcptFromReallocationDet);
		TRcptFromReallocationDet.setTRcptReallocation(null);

		return TRcptFromReallocationDet;
	}

	public List<TRcptToReallocationDet> getTRcptToReallocationDets() {
		return this.TRcptToReallocationDets;
	}

	public void setTRcptToReallocationDets(List<TRcptToReallocationDet> TRcptToReallocationDets) {
		this.TRcptToReallocationDets = TRcptToReallocationDets;
	}

	public TRcptToReallocationDet addTRcptToReallocationDet(TRcptToReallocationDet TRcptToReallocationDet) {
		getTRcptToReallocationDets().add(TRcptToReallocationDet);
		TRcptToReallocationDet.setTRcptReallocation(this);

		return TRcptToReallocationDet;
	}

	public TRcptToReallocationDet removeTRcptToReallocationDet(TRcptToReallocationDet TRcptToReallocationDet) {
		getTRcptToReallocationDets().remove(TRcptToReallocationDet);
		TRcptToReallocationDet.setTRcptReallocation(null);

		return TRcptToReallocationDet;
	}

}