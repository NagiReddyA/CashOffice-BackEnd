package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_PAYMENT_DETAIL database table.
 * 
 */
@Entity
@Table(name="T_PAYMENT_DETAIL")
@NamedQuery(name="TPaymentDetail.findAll", query="SELECT t FROM TPaymentDetail t")
public class TPaymentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PYMT_DET_TRN_ID")
	private double pymtDetTrnId;

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

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="DRAWEE")
	private String drawee;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REFERENCE_DATE")
	private Date referenceDate;

	@Column(name="REFERENCE_NUMBER")
	private String referenceNumber;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REVERSAL_DATE")
	private Date reversalDate;

	@Column(name="REVERSAL_REASON")
	private String reversalReason;

	//bi-directional many-to-one association to TPaymentMethod
	@ManyToOne
	@JoinColumn(name="PAY_METHOD_ID")
	private TPaymentMethod TPaymentMethod;

	//bi-directional many-to-one association to TReceipt
	@ManyToOne
	@JoinColumn(name="RCPT_TRN_ID")
	private TReceipt TReceipt;

	public TPaymentDetail() {
	}

	public double getPymtDetTrnId() {
		return this.pymtDetTrnId;
	}

	public void setPymtDetTrnId(double pymtDetTrnId) {
		this.pymtDetTrnId = pymtDetTrnId;
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

	public String getDrawee() {
		return this.drawee;
	}

	public void setDrawee(String drawee) {
		this.drawee = drawee;
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

	public Date getReferenceDate() {
		return this.referenceDate;
	}

	public void setReferenceDate(Date referenceDate) {
		this.referenceDate = referenceDate;
	}

	public String getReferenceNumber() {
		return this.referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Date getReversalDate() {
		return this.reversalDate;
	}

	public void setReversalDate(Date reversalDate) {
		this.reversalDate = reversalDate;
	}

	public String getReversalReason() {
		return this.reversalReason;
	}

	public void setReversalReason(String reversalReason) {
		this.reversalReason = reversalReason;
	}

	public TPaymentMethod getTPaymentMethod() {
		return this.TPaymentMethod;
	}

	public void setTPaymentMethod(TPaymentMethod TPaymentMethod) {
		this.TPaymentMethod = TPaymentMethod;
	}

	public TReceipt getTReceipt() {
		return this.TReceipt;
	}

	public void setTReceipt(TReceipt TReceipt) {
		this.TReceipt = TReceipt;
	}

}