package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_BANK_STMT_HDR database table.
 * 
 */
@Entity
@Table(name="T_BANK_STMT_HDR")
@NamedQuery(name="TBankStmtHdr.findAll", query="SELECT t FROM TBankStmtHdr t")
public class TBankStmtHdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BANK_STMT_ID")
	private double bankStmtId;

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

	@Column(name="BANK_BRANCH_ID")
	private BigDecimal bankBranchId;

	@Column(name="BANK_ID")
	private BigDecimal bankId;

	@Column(name="BANK_STMT_NUMBER")
	private String bankStmtNumber;

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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PERIOD_FOR_REVERSALS")
	private Date periodForReversals;

	@Column(name="POST_TO_GL")
	private String postToGl;

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

	//bi-directional many-to-one association to TPaymentMode
	@ManyToOne
	@JoinColumn(name="PAYMENT_MODE")
	private TPaymentMode TPaymentMode;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="CAPTURED_BY")
	private User user1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="AUTHORISED_BY")
	private User user2;

	//bi-directional many-to-one association to TBankStmtReallocation
	@OneToMany(mappedBy="TBankStmtHdr")
	private List<TBankStmtReallocation> TBankStmtReallocations;

	//bi-directional many-to-one association to TBkStmtBsoPremium
	@OneToMany(mappedBy="TBankStmtHdr")
	private List<TBkStmtBsoPremium> TBkStmtBsoPremiums;

	//bi-directional many-to-one association to TBkStmtDetDde
	@OneToMany(mappedBy="TBankStmtHdr")
	private List<TBkStmtDetDde> TBkStmtDetDdes;

	//bi-directional many-to-one association to TBkStmtDetExclusion
	@OneToMany(mappedBy="TBankStmtHdr")
	private List<TBkStmtDetExclusion> TBkStmtDetExclusions;

	//bi-directional many-to-one association to TBkStmtDetReversal
	@OneToMany(mappedBy="TBankStmtHdr")
	private List<TBkStmtDetReversal> TBkStmtDetReversals;

	//bi-directional many-to-one association to TBkStmtDetSundry
	@OneToMany(mappedBy="TBankStmtHdr")
	private List<TBkStmtDetSundry> TBkStmtDetSundries;

	//bi-directional many-to-one association to TBkStmtDetUnspecified
	@OneToMany(mappedBy="TBankStmtHdr")
	private List<TBkStmtDetUnspecified> TBkStmtDetUnspecifieds;

	public TBankStmtHdr() {
	}

	public double getBankStmtId() {
		return this.bankStmtId;
	}

	public void setBankStmtId(double bankStmtId) {
		this.bankStmtId = bankStmtId;
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

	public Date getPeriodForReversals() {
		return this.periodForReversals;
	}

	public void setPeriodForReversals(Date periodForReversals) {
		this.periodForReversals = periodForReversals;
	}

	public String getPostToGl() {
		return this.postToGl;
	}

	public void setPostToGl(String postToGl) {
		this.postToGl = postToGl;
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

	public TPaymentMode getTPaymentMode() {
		return this.TPaymentMode;
	}

	public void setTPaymentMode(TPaymentMode TPaymentMode) {
		this.TPaymentMode = TPaymentMode;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public List<TBankStmtReallocation> getTBankStmtReallocations() {
		return this.TBankStmtReallocations;
	}

	public void setTBankStmtReallocations(List<TBankStmtReallocation> TBankStmtReallocations) {
		this.TBankStmtReallocations = TBankStmtReallocations;
	}

	public TBankStmtReallocation addTBankStmtReallocation(TBankStmtReallocation TBankStmtReallocation) {
		getTBankStmtReallocations().add(TBankStmtReallocation);
		TBankStmtReallocation.setTBankStmtHdr(this);

		return TBankStmtReallocation;
	}

	public TBankStmtReallocation removeTBankStmtReallocation(TBankStmtReallocation TBankStmtReallocation) {
		getTBankStmtReallocations().remove(TBankStmtReallocation);
		TBankStmtReallocation.setTBankStmtHdr(null);

		return TBankStmtReallocation;
	}

	public List<TBkStmtBsoPremium> getTBkStmtBsoPremiums() {
		return this.TBkStmtBsoPremiums;
	}

	public void setTBkStmtBsoPremiums(List<TBkStmtBsoPremium> TBkStmtBsoPremiums) {
		this.TBkStmtBsoPremiums = TBkStmtBsoPremiums;
	}

	public TBkStmtBsoPremium addTBkStmtBsoPremium(TBkStmtBsoPremium TBkStmtBsoPremium) {
		getTBkStmtBsoPremiums().add(TBkStmtBsoPremium);
		TBkStmtBsoPremium.setTBankStmtHdr(this);

		return TBkStmtBsoPremium;
	}

	public TBkStmtBsoPremium removeTBkStmtBsoPremium(TBkStmtBsoPremium TBkStmtBsoPremium) {
		getTBkStmtBsoPremiums().remove(TBkStmtBsoPremium);
		TBkStmtBsoPremium.setTBankStmtHdr(null);

		return TBkStmtBsoPremium;
	}

	public List<TBkStmtDetDde> getTBkStmtDetDdes() {
		return this.TBkStmtDetDdes;
	}

	public void setTBkStmtDetDdes(List<TBkStmtDetDde> TBkStmtDetDdes) {
		this.TBkStmtDetDdes = TBkStmtDetDdes;
	}

	public TBkStmtDetDde addTBkStmtDetDde(TBkStmtDetDde TBkStmtDetDde) {
		getTBkStmtDetDdes().add(TBkStmtDetDde);
		TBkStmtDetDde.setTBankStmtHdr(this);

		return TBkStmtDetDde;
	}

	public TBkStmtDetDde removeTBkStmtDetDde(TBkStmtDetDde TBkStmtDetDde) {
		getTBkStmtDetDdes().remove(TBkStmtDetDde);
		TBkStmtDetDde.setTBankStmtHdr(null);

		return TBkStmtDetDde;
	}

	public List<TBkStmtDetExclusion> getTBkStmtDetExclusions() {
		return this.TBkStmtDetExclusions;
	}

	public void setTBkStmtDetExclusions(List<TBkStmtDetExclusion> TBkStmtDetExclusions) {
		this.TBkStmtDetExclusions = TBkStmtDetExclusions;
	}

	public TBkStmtDetExclusion addTBkStmtDetExclusion(TBkStmtDetExclusion TBkStmtDetExclusion) {
		getTBkStmtDetExclusions().add(TBkStmtDetExclusion);
		TBkStmtDetExclusion.setTBankStmtHdr(this);

		return TBkStmtDetExclusion;
	}

	public TBkStmtDetExclusion removeTBkStmtDetExclusion(TBkStmtDetExclusion TBkStmtDetExclusion) {
		getTBkStmtDetExclusions().remove(TBkStmtDetExclusion);
		TBkStmtDetExclusion.setTBankStmtHdr(null);

		return TBkStmtDetExclusion;
	}

	public List<TBkStmtDetReversal> getTBkStmtDetReversals() {
		return this.TBkStmtDetReversals;
	}

	public void setTBkStmtDetReversals(List<TBkStmtDetReversal> TBkStmtDetReversals) {
		this.TBkStmtDetReversals = TBkStmtDetReversals;
	}

	public TBkStmtDetReversal addTBkStmtDetReversal(TBkStmtDetReversal TBkStmtDetReversal) {
		getTBkStmtDetReversals().add(TBkStmtDetReversal);
		TBkStmtDetReversal.setTBankStmtHdr(this);

		return TBkStmtDetReversal;
	}

	public TBkStmtDetReversal removeTBkStmtDetReversal(TBkStmtDetReversal TBkStmtDetReversal) {
		getTBkStmtDetReversals().remove(TBkStmtDetReversal);
		TBkStmtDetReversal.setTBankStmtHdr(null);

		return TBkStmtDetReversal;
	}

	public List<TBkStmtDetSundry> getTBkStmtDetSundries() {
		return this.TBkStmtDetSundries;
	}

	public void setTBkStmtDetSundries(List<TBkStmtDetSundry> TBkStmtDetSundries) {
		this.TBkStmtDetSundries = TBkStmtDetSundries;
	}

	public TBkStmtDetSundry addTBkStmtDetSundry(TBkStmtDetSundry TBkStmtDetSundry) {
		getTBkStmtDetSundries().add(TBkStmtDetSundry);
		TBkStmtDetSundry.setTBankStmtHdr(this);

		return TBkStmtDetSundry;
	}

	public TBkStmtDetSundry removeTBkStmtDetSundry(TBkStmtDetSundry TBkStmtDetSundry) {
		getTBkStmtDetSundries().remove(TBkStmtDetSundry);
		TBkStmtDetSundry.setTBankStmtHdr(null);

		return TBkStmtDetSundry;
	}

	public List<TBkStmtDetUnspecified> getTBkStmtDetUnspecifieds() {
		return this.TBkStmtDetUnspecifieds;
	}

	public void setTBkStmtDetUnspecifieds(List<TBkStmtDetUnspecified> TBkStmtDetUnspecifieds) {
		this.TBkStmtDetUnspecifieds = TBkStmtDetUnspecifieds;
	}

	public TBkStmtDetUnspecified addTBkStmtDetUnspecified(TBkStmtDetUnspecified TBkStmtDetUnspecified) {
		getTBkStmtDetUnspecifieds().add(TBkStmtDetUnspecified);
		TBkStmtDetUnspecified.setTBankStmtHdr(this);

		return TBkStmtDetUnspecified;
	}

	public TBkStmtDetUnspecified removeTBkStmtDetUnspecified(TBkStmtDetUnspecified TBkStmtDetUnspecified) {
		getTBkStmtDetUnspecifieds().remove(TBkStmtDetUnspecified);
		TBkStmtDetUnspecified.setTBankStmtHdr(null);

		return TBkStmtDetUnspecified;
	}

}