package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_POL_MANUAL_TO_DTL database table.
 * 
 */
@Entity
@Table(name="T_POL_MANUAL_TO_DTL")
@NamedQuery(name="TPolManualToDtl.findAll", query="SELECT t FROM TPolManualToDtl t")
public class TPolManualToDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MANUAL_ALL_TO_ID")
	private double manualAllToId;

	@Column(name="ALLOCATED_AMOUNT")
	private BigDecimal allocatedAmount;

	@Column(name="ARREARS_AMOUNT")
	private BigDecimal arrearsAmount;

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

	@Column(name="COLLECTION_FLAG")
	private String collectionFlag;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="EXPECTED_AMOUNT")
	private BigDecimal expectedAmount;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="PARTY_ID")
	private BigDecimal partyId;

	@Column(name="PAYOR_NAME")
	private String payorName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PERIOD")
	private Date period;

	@Column(name="POLICY_CODE")
	private String policyCode;

	@Column(name="POLICY_ID")
	private double policyId;

	@Column(name="POLICY_STATUS")
	private String policyStatus;

	@Column(name="POSTED_BY")
	private String postedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="POSTING_DATETIME")
	private Date postingDatetime;

	@Column(name="POSTING_STATUS")
	private String postingStatus;

	@Column(name="PURPOSE_ID")
	private String purposeId;

	@Column(name="PURPOSE_NAME")
	private String purposeName;

	//bi-directional many-to-one association to TPolManualHdr
	@ManyToOne
	@JoinColumn(name="MANUAL_ALL_HDR_ID")
	private TPolManualHdr TPolManualHdr;

	public TPolManualToDtl() {
	}

	public double getManualAllToId() {
		return this.manualAllToId;
	}

	public void setManualAllToId(double manualAllToId) {
		this.manualAllToId = manualAllToId;
	}

	public BigDecimal getAllocatedAmount() {
		return this.allocatedAmount;
	}

	public void setAllocatedAmount(BigDecimal allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
	}

	public BigDecimal getArrearsAmount() {
		return this.arrearsAmount;
	}

	public void setArrearsAmount(BigDecimal arrearsAmount) {
		this.arrearsAmount = arrearsAmount;
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

	public String getCollectionFlag() {
		return this.collectionFlag;
	}

	public void setCollectionFlag(String collectionFlag) {
		this.collectionFlag = collectionFlag;
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

	public BigDecimal getExpectedAmount() {
		return this.expectedAmount;
	}

	public void setExpectedAmount(BigDecimal expectedAmount) {
		this.expectedAmount = expectedAmount;
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

	public BigDecimal getPartyId() {
		return this.partyId;
	}

	public void setPartyId(BigDecimal partyId) {
		this.partyId = partyId;
	}

	public String getPayorName() {
		return this.payorName;
	}

	public void setPayorName(String payorName) {
		this.payorName = payorName;
	}

	public Date getPeriod() {
		return this.period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public String getPolicyCode() {
		return this.policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public double getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(double policyId) {
		this.policyId = policyId;
	}

	public String getPolicyStatus() {
		return this.policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
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

	public String getPurposeId() {
		return this.purposeId;
	}

	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
	}

	public String getPurposeName() {
		return this.purposeName;
	}

	public void setPurposeName(String purposeName) {
		this.purposeName = purposeName;
	}

	public TPolManualHdr getTPolManualHdr() {
		return this.TPolManualHdr;
	}

	public void setTPolManualHdr(TPolManualHdr TPolManualHdr) {
		this.TPolManualHdr = TPolManualHdr;
	}

}