package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_PAYPOINT_DR_LINES database table.
 * 
 */
@Entity
@Table(name="T_PAYPOINT_DR_LINES")
@NamedQuery(name="TPaypointDrLine.findAll", query="SELECT t FROM TPaypointDrLine t")
public class TPaypointDrLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PP_DR_LINE_ID")
	private double ppDrLineId;

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

	@Column(name="BANK_ACCOUNT_CODE")
	private String bankAccountCode;

	@Column(name="BANK_ACCOUNT_HOLDER")
	private String bankAccountHolder;

	@Column(name="BANK_ACCOUNT_TYPE")
	private String bankAccountType;

	@Column(name="BANK_CODE")
	private String bankCode;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DUE_DATE")
	private Date dueDate;

	@Column(name="EMPLOYEE_CODE")
	private String employeeCode;

	@Column(name="INCLUDE_OTHER_PREM_YN")
	private String includeOtherPremYn;

	@Column(name="INCLUDE_PENSION_PREM_YN")
	private String includePensionPremYn;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="OTHER_PREM")
	private BigDecimal otherPrem;

	@Column(name="PARTY_ID")
	private BigDecimal partyId;

	@Column(name="PARTY_IDENTIFICATION_CODE")
	private String partyIdentificationCode;

	@Column(name="PARTY_NAME")
	private String partyName;

	@Column(name="PAYMENT_MODE")
	private String paymentMode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PAYPOINT_DUE_DATE")
	private Date paypointDueDate;

	@Column(name="PAYPOINT_ID")
	private BigDecimal paypointId;

	@Column(name="PENSION_PREM")
	private BigDecimal pensionPrem;

	@Column(name="POLICY_CODE")
	private String policyCode;

	@Column(name="PRODUCT_ID")
	private String productId;

	@Column(name="STATUS")
	private int status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STRIKE_DAY")
	private Date strikeDay;

	//bi-directional many-to-one association to TPaypointCrLine
	@ManyToOne
	@JoinColumn(name="PP_CR_LINE_ID")
	private TPaypointCrLine TPaypointCrLine;

	//bi-directional many-to-one association to TPaypointDrHdr
	@ManyToOne
	@JoinColumn(name="PP_DR_HDR_ID")
	private TPaypointDrHdr TPaypointDrHdr;

	//bi-directional many-to-one association to TSplitMergeFile
	@ManyToOne
	@JoinColumn(name="SPLIT_MERGE_FILE_ID")
	private TSplitMergeFile TSplitMergeFile;

	public TPaypointDrLine() {
	}

	public double getPpDrLineId() {
		return this.ppDrLineId;
	}

	public void setPpDrLineId(double ppDrLineId) {
		this.ppDrLineId = ppDrLineId;
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

	public String getBankAccountCode() {
		return this.bankAccountCode;
	}

	public void setBankAccountCode(String bankAccountCode) {
		this.bankAccountCode = bankAccountCode;
	}

	public String getBankAccountHolder() {
		return this.bankAccountHolder;
	}

	public void setBankAccountHolder(String bankAccountHolder) {
		this.bankAccountHolder = bankAccountHolder;
	}

	public String getBankAccountType() {
		return this.bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
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

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getIncludeOtherPremYn() {
		return this.includeOtherPremYn;
	}

	public void setIncludeOtherPremYn(String includeOtherPremYn) {
		this.includeOtherPremYn = includeOtherPremYn;
	}

	public String getIncludePensionPremYn() {
		return this.includePensionPremYn;
	}

	public void setIncludePensionPremYn(String includePensionPremYn) {
		this.includePensionPremYn = includePensionPremYn;
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

	public BigDecimal getOtherPrem() {
		return this.otherPrem;
	}

	public void setOtherPrem(BigDecimal otherPrem) {
		this.otherPrem = otherPrem;
	}

	public BigDecimal getPartyId() {
		return this.partyId;
	}

	public void setPartyId(BigDecimal partyId) {
		this.partyId = partyId;
	}

	public String getPartyIdentificationCode() {
		return this.partyIdentificationCode;
	}

	public void setPartyIdentificationCode(String partyIdentificationCode) {
		this.partyIdentificationCode = partyIdentificationCode;
	}

	public String getPartyName() {
		return this.partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Date getPaypointDueDate() {
		return this.paypointDueDate;
	}

	public void setPaypointDueDate(Date paypointDueDate) {
		this.paypointDueDate = paypointDueDate;
	}

	public BigDecimal getPaypointId() {
		return this.paypointId;
	}

	public void setPaypointId(BigDecimal paypointId) {
		this.paypointId = paypointId;
	}

	public BigDecimal getPensionPrem() {
		return this.pensionPrem;
	}

	public void setPensionPrem(BigDecimal pensionPrem) {
		this.pensionPrem = pensionPrem;
	}

	public String getPolicyCode() {
		return this.policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getStrikeDay() {
		return this.strikeDay;
	}

	public void setStrikeDay(Date strikeDay) {
		this.strikeDay = strikeDay;
	}

	public TPaypointCrLine getTPaypointCrLine() {
		return this.TPaypointCrLine;
	}

	public void setTPaypointCrLine(TPaypointCrLine TPaypointCrLine) {
		this.TPaypointCrLine = TPaypointCrLine;
	}

	public TPaypointDrHdr getTPaypointDrHdr() {
		return this.TPaypointDrHdr;
	}

	public void setTPaypointDrHdr(TPaypointDrHdr TPaypointDrHdr) {
		this.TPaypointDrHdr = TPaypointDrHdr;
	}

	public TSplitMergeFile getTSplitMergeFile() {
		return this.TSplitMergeFile;
	}

	public void setTSplitMergeFile(TSplitMergeFile TSplitMergeFile) {
		this.TSplitMergeFile = TSplitMergeFile;
	}

}