package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_BK_STMT_BSO_PREMIUM database table.
 * 
 */
@Entity
@Table(name="T_BK_STMT_BSO_PREMIUM")
@NamedQuery(name="TBkStmtBsoPremium.findAll", query="SELECT t FROM TBkStmtBsoPremium t")
public class TBkStmtBsoPremium implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BK_STMT_DET_BSO_ID")
	private double bkStmtDetBsoId;

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

	@Column(name="BK_TRANSACTION_TYPE")
	private String bkTransactionType;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="EXPECTED_PREMIUM")
	private BigDecimal expectedPremium;

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

	@Column(name="POLICY_CODE")
	private String policyCode;

	@Column(name="POLICY_STATUS_ID")
	private String policyStatusId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STRIKE_DATE")
	private Date strikeDate;

	//bi-directional many-to-one association to TBankStmtHdr
	@ManyToOne
	@JoinColumn(name="BANK_STMT_ID")
	private TBankStmtHdr TBankStmtHdr;

	public TBkStmtBsoPremium() {
	}

	public double getBkStmtDetBsoId() {
		return this.bkStmtDetBsoId;
	}

	public void setBkStmtDetBsoId(double bkStmtDetBsoId) {
		this.bkStmtDetBsoId = bkStmtDetBsoId;
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

	public String getBkTransactionType() {
		return this.bkTransactionType;
	}

	public void setBkTransactionType(String bkTransactionType) {
		this.bkTransactionType = bkTransactionType;
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

	public BigDecimal getExpectedPremium() {
		return this.expectedPremium;
	}

	public void setExpectedPremium(BigDecimal expectedPremium) {
		this.expectedPremium = expectedPremium;
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

	public String getPolicyCode() {
		return this.policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public String getPolicyStatusId() {
		return this.policyStatusId;
	}

	public void setPolicyStatusId(String policyStatusId) {
		this.policyStatusId = policyStatusId;
	}

	public Date getStrikeDate() {
		return this.strikeDate;
	}

	public void setStrikeDate(Date strikeDate) {
		this.strikeDate = strikeDate;
	}

	public TBankStmtHdr getTBankStmtHdr() {
		return this.TBankStmtHdr;
	}

	public void setTBankStmtHdr(TBankStmtHdr TBankStmtHdr) {
		this.TBankStmtHdr = TBankStmtHdr;
	}

}