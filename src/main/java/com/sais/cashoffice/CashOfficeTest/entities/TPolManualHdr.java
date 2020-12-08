package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_POL_MANUAL_HDR database table.
 * 
 */
@Entity
@Table(name="T_POL_MANUAL_HDR")
@NamedQuery(name="TPolManualHdr.findAll", query="SELECT t FROM TPolManualHdr t")
public class TPolManualHdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MANUAL_ALL_HDR_ID")
	private double manualAllHdrId;

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

	@Column(name="BANK_STMT_FLAG")
	private String bankStmtFlag;

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

	@Column(name="POSTED_BY")
	private String postedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="POSTING_DATETIME")
	private Date postingDatetime;

	@Column(name="POSTING_STATUS")
	private String postingStatus;

	@Column(name="RECEIPT_NO")
	private double receiptNo;

	@Column(name="TOTAL_ALLOCATED_AMT")
	private BigDecimal totalAllocatedAmt;

	@Column(name="TOTAL_POLICIES_AMOUNT")
	private BigDecimal totalPoliciesAmount;

	@Column(name="TOTAL_UNALLOCATED_AMT")
	private BigDecimal totalUnallocatedAmt;

	//bi-directional many-to-one association to TPolManualFromDtl
	@OneToMany(mappedBy="TPolManualHdr")
	private List<TPolManualFromDtl> TPolManualFromDtls;

	//bi-directional many-to-one association to TPolManualToDtl
	@OneToMany(mappedBy="TPolManualHdr")
	private List<TPolManualToDtl> TPolManualToDtls;

	public TPolManualHdr() {
	}

	public double getManualAllHdrId() {
		return this.manualAllHdrId;
	}

	public void setManualAllHdrId(double manualAllHdrId) {
		this.manualAllHdrId = manualAllHdrId;
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

	public String getBankStmtFlag() {
		return this.bankStmtFlag;
	}

	public void setBankStmtFlag(String bankStmtFlag) {
		this.bankStmtFlag = bankStmtFlag;
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

	public double getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}

	public BigDecimal getTotalAllocatedAmt() {
		return this.totalAllocatedAmt;
	}

	public void setTotalAllocatedAmt(BigDecimal totalAllocatedAmt) {
		this.totalAllocatedAmt = totalAllocatedAmt;
	}

	public BigDecimal getTotalPoliciesAmount() {
		return this.totalPoliciesAmount;
	}

	public void setTotalPoliciesAmount(BigDecimal totalPoliciesAmount) {
		this.totalPoliciesAmount = totalPoliciesAmount;
	}

	public BigDecimal getTotalUnallocatedAmt() {
		return this.totalUnallocatedAmt;
	}

	public void setTotalUnallocatedAmt(BigDecimal totalUnallocatedAmt) {
		this.totalUnallocatedAmt = totalUnallocatedAmt;
	}

	public List<TPolManualFromDtl> getTPolManualFromDtls() {
		return this.TPolManualFromDtls;
	}

	public void setTPolManualFromDtls(List<TPolManualFromDtl> TPolManualFromDtls) {
		this.TPolManualFromDtls = TPolManualFromDtls;
	}

	public TPolManualFromDtl addTPolManualFromDtl(TPolManualFromDtl TPolManualFromDtl) {
		getTPolManualFromDtls().add(TPolManualFromDtl);
		TPolManualFromDtl.setTPolManualHdr(this);

		return TPolManualFromDtl;
	}

	public TPolManualFromDtl removeTPolManualFromDtl(TPolManualFromDtl TPolManualFromDtl) {
		getTPolManualFromDtls().remove(TPolManualFromDtl);
		TPolManualFromDtl.setTPolManualHdr(null);

		return TPolManualFromDtl;
	}

	public List<TPolManualToDtl> getTPolManualToDtls() {
		return this.TPolManualToDtls;
	}

	public void setTPolManualToDtls(List<TPolManualToDtl> TPolManualToDtls) {
		this.TPolManualToDtls = TPolManualToDtls;
	}

	public TPolManualToDtl addTPolManualToDtl(TPolManualToDtl TPolManualToDtl) {
		getTPolManualToDtls().add(TPolManualToDtl);
		TPolManualToDtl.setTPolManualHdr(this);

		return TPolManualToDtl;
	}

	public TPolManualToDtl removeTPolManualToDtl(TPolManualToDtl TPolManualToDtl) {
		getTPolManualToDtls().remove(TPolManualToDtl);
		TPolManualToDtl.setTPolManualHdr(null);

		return TPolManualToDtl;
	}

}