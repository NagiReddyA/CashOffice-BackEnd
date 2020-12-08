package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_POL_MANUAL_FROM_DTL database table.
 * 
 */
@Entity
@Table(name="T_POL_MANUAL_FROM_DTL")
@NamedQuery(name="TPolManualFromDtl.findAll", query="SELECT t FROM TPolManualFromDtl t")
public class TPolManualFromDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MANUAL_ALL_FROM_ID")
	private double manualAllFromId;

	@Column(name="ALLOCATED_AMOUNT")
	private BigDecimal allocatedAmount;

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

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="GROSS_AMOUNT")
	private BigDecimal grossAmount;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="PAYPOINT_ID")
	private BigDecimal paypointId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PERIOD")
	private Date period;

	@Column(name="POSTED_BY")
	private String postedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="POSTING_DATETIME")
	private Date postingDatetime;

	@Column(name="POSTING_STATUS")
	private String postingStatus;

	@Column(name="RECEIPT_AMOUNT")
	private BigDecimal receiptAmount;

	@Column(name="RECEIPT_NO")
	private double receiptNo;

	@Column(name="UNALLOCATED_AMOUNT")
	private BigDecimal unallocatedAmount;

	//bi-directional many-to-one association to TPolManualHdr
	@ManyToOne
	@JoinColumn(name="MANUAL_ALL_HDR_ID")
	private TPolManualHdr TPolManualHdr;

	public TPolManualFromDtl() {
	}

	public double getManualAllFromId() {
		return this.manualAllFromId;
	}

	public void setManualAllFromId(double manualAllFromId) {
		this.manualAllFromId = manualAllFromId;
	}

	public BigDecimal getAllocatedAmount() {
		return this.allocatedAmount;
	}

	public void setAllocatedAmount(BigDecimal allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
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

	public BigDecimal getGrossAmount() {
		return this.grossAmount;
	}

	public void setGrossAmount(BigDecimal grossAmount) {
		this.grossAmount = grossAmount;
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

	public BigDecimal getPaypointId() {
		return this.paypointId;
	}

	public void setPaypointId(BigDecimal paypointId) {
		this.paypointId = paypointId;
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

	public String getPostingStatus() {
		return this.postingStatus;
	}

	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}

	public BigDecimal getReceiptAmount() {
		return this.receiptAmount;
	}

	public void setReceiptAmount(BigDecimal receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public double getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}

	public BigDecimal getUnallocatedAmount() {
		return this.unallocatedAmount;
	}

	public void setUnallocatedAmount(BigDecimal unallocatedAmount) {
		this.unallocatedAmount = unallocatedAmount;
	}

	public TPolManualHdr getTPolManualHdr() {
		return this.TPolManualHdr;
	}

	public void setTPolManualHdr(TPolManualHdr TPolManualHdr) {
		this.TPolManualHdr = TPolManualHdr;
	}

}