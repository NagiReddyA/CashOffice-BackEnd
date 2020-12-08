package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the INT_CASHOFFICE_APP database table.
 * 
 */
//@Entity
//@Table(name="INT_CASHOFFICE_APP")
//@NamedQuery(name="IntCashofficeApp.findAll", query="SELECT i FROM IntCashofficeApp i")
//public class IntCashofficeApp implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="ACCOUNTING_DATE")
//	private Date accountingDate;
//
//	@Column(name="APP_ID")
//	private double appId;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="APP_REFERENCE_DATE")
//	private Date appReferenceDate;
//
//	@Column(name="APP_REFERENCE_NO")
//	private String appReferenceNo;
//
//	@Column(name="ATTRIBUTE1")
//	private String attribute1;
//
//	@Column(name="ATTRIBUTE2")
//	private String attribute2;
//
//	@Column(name="ATTRIBUTE3")
//	private String attribute3;
//
//	@Column(name="ATTRIBUTE4")
//	private String attribute4;
//
//	@Column(name="ATTRIBUTE5")
//	private String attribute5;
//
//	@Column(name="ATTRIBUTE6")
//	private String attribute6;
//
//	@Column(name="COMMENTS")
//	private String comments;
//
//	@Column(name="CREATED_BY")
//	private String createdBy;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="CREATION_DATE")
//	private Date creationDate;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="DOWNLOAD_DATETIME")
//	private Date downloadDatetime;
//
//	@Column(name="DOWNLOAD_ERROR")
//	private String downloadError;
//
//	@Column(name="DOWNLOADED")
//	private String downloaded;
//
//	@Column(name="MODIFIED_BY")
//	private String modifiedBy;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="MODIFIED_DATETIME")
//	private Date modifiedDatetime;
//
//	@Column(name="POSTED_TO_GL")
//	private String postedToGl;
//
//	@Column(name="RECEIPT_NO")
//	private double receiptNo;
//
//	@Column(name="SOURCE")
//	private String source;
//
//	@Column(name="TRANSACTION_AMOUNT")
//	private BigDecimal transactionAmount;
//
//	@Column(name="TRANSACTION_TYPE")
//	private String transactionType;
//
//	public IntCashofficeApp() {
//	}
//
//	public Date getAccountingDate() {
//		return this.accountingDate;
//	}
//
//	public void setAccountingDate(Date accountingDate) {
//		this.accountingDate = accountingDate;
//	}
//
//	public double getAppId() {
//		return this.appId;
//	}
//
//	public void setAppId(double appId) {
//		this.appId = appId;
//	}
//
//	public Date getAppReferenceDate() {
//		return this.appReferenceDate;
//	}
//
//	public void setAppReferenceDate(Date appReferenceDate) {
//		this.appReferenceDate = appReferenceDate;
//	}
//
//	public String getAppReferenceNo() {
//		return this.appReferenceNo;
//	}
//
//	public void setAppReferenceNo(String appReferenceNo) {
//		this.appReferenceNo = appReferenceNo;
//	}
//
//	public String getAttribute1() {
//		return this.attribute1;
//	}
//
//	public void setAttribute1(String attribute1) {
//		this.attribute1 = attribute1;
//	}
//
//	public String getAttribute2() {
//		return this.attribute2;
//	}
//
//	public void setAttribute2(String attribute2) {
//		this.attribute2 = attribute2;
//	}
//
//	public String getAttribute3() {
//		return this.attribute3;
//	}
//
//	public void setAttribute3(String attribute3) {
//		this.attribute3 = attribute3;
//	}
//
//	public String getAttribute4() {
//		return this.attribute4;
//	}
//
//	public void setAttribute4(String attribute4) {
//		this.attribute4 = attribute4;
//	}
//
//	public String getAttribute5() {
//		return this.attribute5;
//	}
//
//	public void setAttribute5(String attribute5) {
//		this.attribute5 = attribute5;
//	}
//
//	public String getAttribute6() {
//		return this.attribute6;
//	}
//
//	public void setAttribute6(String attribute6) {
//		this.attribute6 = attribute6;
//	}
//
//	public String getComments() {
//		return this.comments;
//	}
//
//	public void setComments(String comments) {
//		this.comments = comments;
//	}
//
//	public String getCreatedBy() {
//		return this.createdBy;
//	}
//
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//
//	public Date getCreationDate() {
//		return this.creationDate;
//	}
//
//	public void setCreationDate(Date creationDate) {
//		this.creationDate = creationDate;
//	}
//
//	public Date getDownloadDatetime() {
//		return this.downloadDatetime;
//	}
//
//	public void setDownloadDatetime(Date downloadDatetime) {
//		this.downloadDatetime = downloadDatetime;
//	}
//
//	public String getDownloadError() {
//		return this.downloadError;
//	}
//
//	public void setDownloadError(String downloadError) {
//		this.downloadError = downloadError;
//	}
//
//	public String getDownloaded() {
//		return this.downloaded;
//	}
//
//	public void setDownloaded(String downloaded) {
//		this.downloaded = downloaded;
//	}
//
//	public String getModifiedBy() {
//		return this.modifiedBy;
//	}
//
//	public void setModifiedBy(String modifiedBy) {
//		this.modifiedBy = modifiedBy;
//	}
//
//	public Date getModifiedDatetime() {
//		return this.modifiedDatetime;
//	}
//
//	public void setModifiedDatetime(Date modifiedDatetime) {
//		this.modifiedDatetime = modifiedDatetime;
//	}
//
//	public String getPostedToGl() {
//		return this.postedToGl;
//	}
//
//	public void setPostedToGl(String postedToGl) {
//		this.postedToGl = postedToGl;
//	}
//
//	public double getReceiptNo() {
//		return this.receiptNo;
//	}
//
//	public void setReceiptNo(double receiptNo) {
//		this.receiptNo = receiptNo;
//	}
//
//	public String getSource() {
//		return this.source;
//	}
//
//	public void setSource(String source) {
//		this.source = source;
//	}
//
//	public BigDecimal getTransactionAmount() {
//		return this.transactionAmount;
//	}
//
//	public void setTransactionAmount(BigDecimal transactionAmount) {
//		this.transactionAmount = transactionAmount;
//	}
//
//	public String getTransactionType() {
//		return this.transactionType;
//	}
//
//	public void setTransactionType(String transactionType) {
//		this.transactionType = transactionType;
//	}
//
//}