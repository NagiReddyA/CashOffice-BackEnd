package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_RECEIPT database table.
 * 
 */
@Entity
@Table(name="T_RECEIPT")
@NamedQuery(name="TReceipt.findAll", query="SELECT t FROM TReceipt t")
public class TReceipt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RCPT_TRN_ID")
	private double rcptTrnId;

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

	@Column(name="CANCELLATION_REASON")
	private String cancellationReason;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="DEBIT_NUMBER")
	private BigDecimal debitNumber;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

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

	@Column(name="RECEIPT_AMOUNT")
	private BigDecimal receiptAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECEIPT_DATE")
	private Date receiptDate;

	@Column(name="RECEIPT_NO")
	private double receiptNo;

	@Column(name="RECEIVED_FROM")
	private String receivedFrom;

	@Column(name="REVERSAL_REASON")
	private String reversalReason;

	@Column(name="REVERSAL_REASON_CODE")
	private String reversalReasonCode;

	@Column(name="REVERSAL_TRN_ID")
	private BigDecimal reversalTrnId;

	//bi-directional many-to-one association to TPaymentDetail
	@OneToMany(mappedBy="TReceipt")
	private List<TPaymentDetail> TPaymentDetails;

	//bi-directional many-to-one association to TRcptAllocation
	@OneToMany(mappedBy="TReceipt")
	private List<TRcptAllocation> TRcptAllocations;

	//bi-directional many-to-one association to TCashier
	@ManyToOne
	@JoinColumn(name="CASHIER_ID")
	private TCashier TCashier;

	//bi-directional many-to-one association to TCashOffice
	@ManyToOne
	@JoinColumn(name="CASH_OFFICE_ID")
	private TCashOffice TCashOffice;

	//bi-directional many-to-one association to TPaymentMethod
	@ManyToOne
	@JoinColumn(name="PAY_METHOD_ID")
	private TPaymentMethod TPaymentMethod;

	public TReceipt() {
	}

	public double getRcptTrnId() {
		return this.rcptTrnId;
	}

	public void setRcptTrnId(double rcptTrnId) {
		this.rcptTrnId = rcptTrnId;
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

	public String getCancellationReason() {
		return this.cancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
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

	public BigDecimal getDebitNumber() {
		return this.debitNumber;
	}

	public void setDebitNumber(BigDecimal debitNumber) {
		this.debitNumber = debitNumber;
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

	public BigDecimal getReceiptAmount() {
		return this.receiptAmount;
	}

	public void setReceiptAmount(BigDecimal receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public Date getReceiptDate() {
		return this.receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public double getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getReceivedFrom() {
		return this.receivedFrom;
	}

	public void setReceivedFrom(String receivedFrom) {
		this.receivedFrom = receivedFrom;
	}

	public String getReversalReason() {
		return this.reversalReason;
	}

	public void setReversalReason(String reversalReason) {
		this.reversalReason = reversalReason;
	}

	public String getReversalReasonCode() {
		return this.reversalReasonCode;
	}

	public void setReversalReasonCode(String reversalReasonCode) {
		this.reversalReasonCode = reversalReasonCode;
	}

	public BigDecimal getReversalTrnId() {
		return this.reversalTrnId;
	}

	public void setReversalTrnId(BigDecimal reversalTrnId) {
		this.reversalTrnId = reversalTrnId;
	}

	public List<TPaymentDetail> getTPaymentDetails() {
		return this.TPaymentDetails;
	}

	public void setTPaymentDetails(List<TPaymentDetail> TPaymentDetails) {
		this.TPaymentDetails = TPaymentDetails;
	}

	public TPaymentDetail addTPaymentDetail(TPaymentDetail TPaymentDetail) {
		getTPaymentDetails().add(TPaymentDetail);
		TPaymentDetail.setTReceipt(this);

		return TPaymentDetail;
	}

	public TPaymentDetail removeTPaymentDetail(TPaymentDetail TPaymentDetail) {
		getTPaymentDetails().remove(TPaymentDetail);
		TPaymentDetail.setTReceipt(null);

		return TPaymentDetail;
	}

	public List<TRcptAllocation> getTRcptAllocations() {
		return this.TRcptAllocations;
	}

	public void setTRcptAllocations(List<TRcptAllocation> TRcptAllocations) {
		this.TRcptAllocations = TRcptAllocations;
	}

	public TRcptAllocation addTRcptAllocation(TRcptAllocation TRcptAllocation) {
		getTRcptAllocations().add(TRcptAllocation);
		TRcptAllocation.setTReceipt(this);

		return TRcptAllocation;
	}

	public TRcptAllocation removeTRcptAllocation(TRcptAllocation TRcptAllocation) {
		getTRcptAllocations().remove(TRcptAllocation);
		TRcptAllocation.setTReceipt(null);

		return TRcptAllocation;
	}

	public TCashier getTCashier() {
		return this.TCashier;
	}

	public void setTCashier(TCashier TCashier) {
		this.TCashier = TCashier;
	}

	public TCashOffice getTCashOffice() {
		return this.TCashOffice;
	}

	public void setTCashOffice(TCashOffice TCashOffice) {
		this.TCashOffice = TCashOffice;
	}

	public TPaymentMethod getTPaymentMethod() {
		return this.TPaymentMethod;
	}

	public void setTPaymentMethod(TPaymentMethod TPaymentMethod) {
		this.TPaymentMethod = TPaymentMethod;
	}

}