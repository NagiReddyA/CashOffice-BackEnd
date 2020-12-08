package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_POL_PARTIAL_MISALL_TO_DET database table.
 * 
 */
@Entity
@Table(name="T_POL_PARTIAL_MISALL_TO_DET")
@NamedQuery(name="TPolPartialMisallToDet.findAll", query="SELECT t FROM TPolPartialMisallToDet t")
public class TPolPartialMisallToDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="POL_PAR_MISALLOC_TO_ID")
	private double polParMisallocToId;

	@Column(name="AMOUNT")
	private BigDecimal amount;

	@Column(name="ARREARS")
	private BigDecimal arrears;

	@Column(name="ATTRIBUTE1")
	private String attribute1;

	@Column(name="ATTRIBUTE10")
	private String attribute10;

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

	@Column(name="ATTRIBUTE7")
	private String attribute7;

	@Column(name="ATTRIBUTE8")
	private String attribute8;

	@Column(name="ATTRIBUTE9")
	private String attribute9;

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

	@Column(name="PARTY_ID")
	private double partyId;

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

	@Column(name="PURPOSE")
	private String purpose;

	@Column(name="RECEIPT_NUMBER")
	private String receiptNumber;

	//bi-directional many-to-one association to TPolPartialMisallocHdr
	@ManyToOne
	@JoinColumn(name="POL_PAR_MISALLOC_HDR_ID")
	private TPolPartialMisallocHdr TPolPartialMisallocHdr;

	public TPolPartialMisallToDet() {
	}

	public double getPolParMisallocToId() {
		return this.polParMisallocToId;
	}

	public void setPolParMisallocToId(double polParMisallocToId) {
		this.polParMisallocToId = polParMisallocToId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getArrears() {
		return this.arrears;
	}

	public void setArrears(BigDecimal arrears) {
		this.arrears = arrears;
	}

	public String getAttribute1() {
		return this.attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute10() {
		return this.attribute10;
	}

	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
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

	public String getAttribute7() {
		return this.attribute7;
	}

	public void setAttribute7(String attribute7) {
		this.attribute7 = attribute7;
	}

	public String getAttribute8() {
		return this.attribute8;
	}

	public void setAttribute8(String attribute8) {
		this.attribute8 = attribute8;
	}

	public String getAttribute9() {
		return this.attribute9;
	}

	public void setAttribute9(String attribute9) {
		this.attribute9 = attribute9;
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

	public double getPartyId() {
		return this.partyId;
	}

	public void setPartyId(double partyId) {
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

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getReceiptNumber() {
		return this.receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	public TPolPartialMisallocHdr getTPolPartialMisallocHdr() {
		return this.TPolPartialMisallocHdr;
	}

	public void setTPolPartialMisallocHdr(TPolPartialMisallocHdr TPolPartialMisallocHdr) {
		this.TPolPartialMisallocHdr = TPolPartialMisallocHdr;
	}

}