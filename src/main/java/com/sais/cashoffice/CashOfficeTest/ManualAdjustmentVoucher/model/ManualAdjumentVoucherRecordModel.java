package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_MANUAL_ADJUSTMENT")
public class ManualAdjumentVoucherRecordModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
   //	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MANUAL_ADJ_ID")
	private double manualAdjId;

	@Column(name="ADJ_TRANSACTION_TYPE")
	private char adjTransactionType;

	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PERIOD")
	private Date period;

	@Column(name="POLICY_CODE")
	private String policyCode;
	
	@Column(name="PAYOR_ID")
	private BigDecimal payorId;
	
	@Column(name="AMOUNT")
	private BigDecimal amount;
	
	
	@Column(name="COMMENTS")
	private String comments;
	
	@Column(name="PURPOSE")
	private String purpose;
	
	
	@Column(name="POSTING_STATUS")
	private String postingStatus;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;
	

	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;
	
	
	@Column(name="POLICY_ID")
	private BigDecimal policyId;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name="BOBI_REF_NUMBER")
	private String bobiRefNumber;



	@Column(name="POSTED_BY")
	private String postedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="POSTING_DATE")
	private Date postingDate;

	

	

	public ManualAdjumentVoucherRecordModel() {
	}

	public double getManualAdjId() {
		return manualAdjId;
	}

	public void setManualAdjId(double manualAdjId) {
		this.manualAdjId = manualAdjId;
	}

	public char getAdjTransactionType() {
		return adjTransactionType;
	}

	public void setAdjTransactionType(char adjTransactionType) {
		this.adjTransactionType = adjTransactionType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	

	public String getBobiRefNumber() {
		return bobiRefNumber;
	}

	public void setBobiRefNumber(String bobiRefNumber) {
		this.bobiRefNumber = bobiRefNumber;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDatetime() {
		return modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public BigDecimal getPayorId() {
		return payorId;
	}

	public void setPayorId(BigDecimal payorId) {
		this.payorId = payorId;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public String getPolicyCode() {
		return policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public BigDecimal getPolicyId() {
		return policyId;
	}

	public void setPolicyId(BigDecimal policyId) {
		this.policyId = policyId;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	public String getPostingStatus() {
		return postingStatus;
	}

	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	
	

	
	

}
