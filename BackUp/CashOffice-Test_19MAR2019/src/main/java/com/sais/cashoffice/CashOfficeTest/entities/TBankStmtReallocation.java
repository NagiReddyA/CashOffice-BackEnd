package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_BANK_STMT_REALLOCATION database table.
 * 
 */
@Entity
@Table(name="T_BANK_STMT_REALLOCATION")
@NamedQuery(name="TBankStmtReallocation.findAll", query="SELECT t FROM TBankStmtReallocation t")
public class TBankStmtReallocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BANK_STMT_REALLOC_ID")
	private double bankStmtReallocId;

	@Column(name="ACCOUNT_ID")
	private double accountId;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

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

	@Column(name="AUTHORISED_BY")
	private String authorisedBy;

	@Column(name="BANK_BRANCH_ID")
	private BigDecimal bankBranchId;

	@Column(name="BANK_ID")
	private BigDecimal bankId;

	@Column(name="BANK_STMT_NUMBER")
	private String bankStmtNumber;

	@Column(name="CAPTURED_BY")
	private String capturedBy;

	@Column(name="CAPTURED_BY_BRANCH")
	private String capturedByBranch;

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

	@Column(name="PAYMENT_MODE")
	private String paymentMode;

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

	@Column(name="STMT_CLOSING_BALANCE")
	private double stmtClosingBalance;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STMT_END_DATE")
	private Date stmtEndDate;

	@Column(name="STMT_OPENING_BALANCE")
	private double stmtOpeningBalance;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STMT_START_DATE")
	private Date stmtStartDate;

	//bi-directional many-to-one association to TBankStmtHdr
	@ManyToOne
	@JoinColumn(name="BANK_STMT_ID")
	private TBankStmtHdr TBankStmtHdr;

	//bi-directional many-to-one association to TBkStmtToReallocationDet
	@OneToMany(mappedBy="TBankStmtReallocation")
	private List<TBkStmtToReallocationDet> TBkStmtToReallocationDets;

	//bi-directional many-to-one association to TBkStmtUnspecAllocDet
	@OneToMany(mappedBy="TBankStmtReallocation")
	private List<TBkStmtUnspecAllocDet> TBkStmtUnspecAllocDets;

	public TBankStmtReallocation() {
	}

	public double getBankStmtReallocId() {
		return this.bankStmtReallocId;
	}

	public void setBankStmtReallocId(double bankStmtReallocId) {
		this.bankStmtReallocId = bankStmtReallocId;
	}

	public double getAccountId() {
		return this.accountId;
	}

	public void setAccountId(double accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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

	public String getAuthorisedBy() {
		return this.authorisedBy;
	}

	public void setAuthorisedBy(String authorisedBy) {
		this.authorisedBy = authorisedBy;
	}

	public BigDecimal getBankBranchId() {
		return this.bankBranchId;
	}

	public void setBankBranchId(BigDecimal bankBranchId) {
		this.bankBranchId = bankBranchId;
	}

	public BigDecimal getBankId() {
		return this.bankId;
	}

	public void setBankId(BigDecimal bankId) {
		this.bankId = bankId;
	}

	public String getBankStmtNumber() {
		return this.bankStmtNumber;
	}

	public void setBankStmtNumber(String bankStmtNumber) {
		this.bankStmtNumber = bankStmtNumber;
	}

	public String getCapturedBy() {
		return this.capturedBy;
	}

	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
	}

	public String getCapturedByBranch() {
		return this.capturedByBranch;
	}

	public void setCapturedByBranch(String capturedByBranch) {
		this.capturedByBranch = capturedByBranch;
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

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
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

	public double getStmtClosingBalance() {
		return this.stmtClosingBalance;
	}

	public void setStmtClosingBalance(double stmtClosingBalance) {
		this.stmtClosingBalance = stmtClosingBalance;
	}

	public Date getStmtEndDate() {
		return this.stmtEndDate;
	}

	public void setStmtEndDate(Date stmtEndDate) {
		this.stmtEndDate = stmtEndDate;
	}

	public double getStmtOpeningBalance() {
		return this.stmtOpeningBalance;
	}

	public void setStmtOpeningBalance(double stmtOpeningBalance) {
		this.stmtOpeningBalance = stmtOpeningBalance;
	}

	public Date getStmtStartDate() {
		return this.stmtStartDate;
	}

	public void setStmtStartDate(Date stmtStartDate) {
		this.stmtStartDate = stmtStartDate;
	}

	public TBankStmtHdr getTBankStmtHdr() {
		return this.TBankStmtHdr;
	}

	public void setTBankStmtHdr(TBankStmtHdr TBankStmtHdr) {
		this.TBankStmtHdr = TBankStmtHdr;
	}

	public List<TBkStmtToReallocationDet> getTBkStmtToReallocationDets() {
		return this.TBkStmtToReallocationDets;
	}

	public void setTBkStmtToReallocationDets(List<TBkStmtToReallocationDet> TBkStmtToReallocationDets) {
		this.TBkStmtToReallocationDets = TBkStmtToReallocationDets;
	}

	public TBkStmtToReallocationDet addTBkStmtToReallocationDet(TBkStmtToReallocationDet TBkStmtToReallocationDet) {
		getTBkStmtToReallocationDets().add(TBkStmtToReallocationDet);
		TBkStmtToReallocationDet.setTBankStmtReallocation(this);

		return TBkStmtToReallocationDet;
	}

	public TBkStmtToReallocationDet removeTBkStmtToReallocationDet(TBkStmtToReallocationDet TBkStmtToReallocationDet) {
		getTBkStmtToReallocationDets().remove(TBkStmtToReallocationDet);
		TBkStmtToReallocationDet.setTBankStmtReallocation(null);

		return TBkStmtToReallocationDet;
	}

	public List<TBkStmtUnspecAllocDet> getTBkStmtUnspecAllocDets() {
		return this.TBkStmtUnspecAllocDets;
	}

	public void setTBkStmtUnspecAllocDets(List<TBkStmtUnspecAllocDet> TBkStmtUnspecAllocDets) {
		this.TBkStmtUnspecAllocDets = TBkStmtUnspecAllocDets;
	}

	public TBkStmtUnspecAllocDet addTBkStmtUnspecAllocDet(TBkStmtUnspecAllocDet TBkStmtUnspecAllocDet) {
		getTBkStmtUnspecAllocDets().add(TBkStmtUnspecAllocDet);
		TBkStmtUnspecAllocDet.setTBankStmtReallocation(this);

		return TBkStmtUnspecAllocDet;
	}

	public TBkStmtUnspecAllocDet removeTBkStmtUnspecAllocDet(TBkStmtUnspecAllocDet TBkStmtUnspecAllocDet) {
		getTBkStmtUnspecAllocDets().remove(TBkStmtUnspecAllocDet);
		TBkStmtUnspecAllocDet.setTBankStmtReallocation(null);

		return TBkStmtUnspecAllocDet;
	}

}