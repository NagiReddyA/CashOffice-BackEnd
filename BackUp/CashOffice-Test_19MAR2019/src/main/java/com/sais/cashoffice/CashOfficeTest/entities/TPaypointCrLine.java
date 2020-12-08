package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_PAYPOINT_CR_LINES database table.
 * 
 */
@Entity
@Table(name="T_PAYPOINT_CR_LINES")
@NamedQuery(name="TPaypointCrLine.findAll", query="SELECT t FROM TPaypointCrLine t")
public class TPaypointCrLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PP_CR_LINE_ID")
	private long ppCrLineId;

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
	private double bankAccountType;

	@Column(name="BANK_CODE")
	private String bankCode;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="COLLECTION_PERIOD")
	private Date collectionPeriod;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CR_AMOUNT")
	private BigDecimal crAmount;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="EMPLOYEE_CODE")
	private String employeeCode;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="PARTY_IDENTIFICATION_CODE")
	private String partyIdentificationCode;

	@Column(name="PARTY_NAME")
	private String partyName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PAYPOINT_DUE_DATE")
	private Date paypointDueDate;

	@Column(name="PAYPOINT_ID")
	private double paypointId;

	@Column(name="POLICY_CODE")
	private String policyCode;

	@Column(name="PRODUCT_ID")
	private int productId;

	@Column(name="STATUS")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STRIKE_DAY")
	private Date strikeDay;

	//bi-directional many-to-one association to TPaypointCrHdr
	@ManyToOne
	@JoinColumn(name="PP_CR_HDR_ID")
	private TPaypointCrHdr TPaypointCrHdr;

	//bi-directional many-to-one association to TPaypointDrLine
	@OneToMany(mappedBy="TPaypointCrLine")
	private List<TPaypointDrLine> TPaypointDrLines;

	public TPaypointCrLine() {
	}

	public long getPpCrLineId() {
		return this.ppCrLineId;
	}

	public void setPpCrLineId(long ppCrLineId) {
		this.ppCrLineId = ppCrLineId;
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

	public double getBankAccountType() {
		return this.bankAccountType;
	}

	public void setBankAccountType(double bankAccountType) {
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

	public Date getCollectionPeriod() {
		return this.collectionPeriod;
	}

	public void setCollectionPeriod(Date collectionPeriod) {
		this.collectionPeriod = collectionPeriod;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public BigDecimal getCrAmount() {
		return this.crAmount;
	}

	public void setCrAmount(BigDecimal crAmount) {
		this.crAmount = crAmount;
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

	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
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

	public Date getPaypointDueDate() {
		return this.paypointDueDate;
	}

	public void setPaypointDueDate(Date paypointDueDate) {
		this.paypointDueDate = paypointDueDate;
	}

	public double getPaypointId() {
		return this.paypointId;
	}

	public void setPaypointId(double paypointId) {
		this.paypointId = paypointId;
	}

	public String getPolicyCode() {
		return this.policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStrikeDay() {
		return this.strikeDay;
	}

	public void setStrikeDay(Date strikeDay) {
		this.strikeDay = strikeDay;
	}

	public TPaypointCrHdr getTPaypointCrHdr() {
		return this.TPaypointCrHdr;
	}

	public void setTPaypointCrHdr(TPaypointCrHdr TPaypointCrHdr) {
		this.TPaypointCrHdr = TPaypointCrHdr;
	}

	public List<TPaypointDrLine> getTPaypointDrLines() {
		return this.TPaypointDrLines;
	}

	public void setTPaypointDrLines(List<TPaypointDrLine> TPaypointDrLines) {
		this.TPaypointDrLines = TPaypointDrLines;
	}

	public TPaypointDrLine addTPaypointDrLine(TPaypointDrLine TPaypointDrLine) {
		getTPaypointDrLines().add(TPaypointDrLine);
		TPaypointDrLine.setTPaypointCrLine(this);

		return TPaypointDrLine;
	}

	public TPaypointDrLine removeTPaypointDrLine(TPaypointDrLine TPaypointDrLine) {
		getTPaypointDrLines().remove(TPaypointDrLine);
		TPaypointDrLine.setTPaypointCrLine(null);

		return TPaypointDrLine;
	}

}