package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MIG_BOBI_UNALLOCATED_BK_STMTS database table.
 * 
 */
//@Entity
//@Table(name="MIG_BOBI_UNALLOCATED_BK_STMTS")
//@NamedQuery(name="MigBobiUnallocatedBkStmt.findAll", query="SELECT m FROM MigBobiUnallocatedBkStmt m")
//public class MigBobiUnallocatedBkStmt implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name="ACCOUNT_NUMBER")
//	private String accountNumber;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="ACCOUNTING_DATE")
//	private Date accountingDate;
//
//	@Column(name="ALLOCATED_AMOUNT")
//	private BigDecimal allocatedAmount;
//
//	@Column(name="ALLOCATION_STATUS")
//	private String allocationStatus;
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
//	@Column(name="BANK_CODE")
//	private String bankCode;
//
//	@Column(name="BANK_STMT_ID")
//	private double bankStmtId;
//
//	@Column(name="BRANCH_CODE")
//	private String branchCode;
//
//	@Column(name="CASH_ALLOC_TRN_ID")
//	private double cashAllocTrnId;
//
//	@Column(name="COMMENTS")
//	private String comments;
//
//	@Column(name="GROSS_AMOUNT")
//	private BigDecimal grossAmount;
//
//	@Column(name="PAYMENT_MODE")
//	private String paymentMode;
//
//	@Column(name="STMT_NUMBER")
//	private String stmtNumber;
//
//	@Column(name="STMT_RECEIPT_NO_OLD")
//	private int stmtReceiptNoOld;
//
//	@Column(name="TRANSACTION_CODE")
//	private String transactionCode;
//
//	public MigBobiUnallocatedBkStmt() {
//	}
//
//	public String getAccountNumber() {
//		return this.accountNumber;
//	}
//
//	public void setAccountNumber(String accountNumber) {
//		this.accountNumber = accountNumber;
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
//	public BigDecimal getAllocatedAmount() {
//		return this.allocatedAmount;
//	}
//
//	public void setAllocatedAmount(BigDecimal allocatedAmount) {
//		this.allocatedAmount = allocatedAmount;
//	}
//
//	public String getAllocationStatus() {
//		return this.allocationStatus;
//	}
//
//	public void setAllocationStatus(String allocationStatus) {
//		this.allocationStatus = allocationStatus;
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
//	public String getBankCode() {
//		return this.bankCode;
//	}
//
//	public void setBankCode(String bankCode) {
//		this.bankCode = bankCode;
//	}
//
//	public double getBankStmtId() {
//		return this.bankStmtId;
//	}
//
//	public void setBankStmtId(double bankStmtId) {
//		this.bankStmtId = bankStmtId;
//	}
//
//	public String getBranchCode() {
//		return this.branchCode;
//	}
//
//	public void setBranchCode(String branchCode) {
//		this.branchCode = branchCode;
//	}
//
//	public double getCashAllocTrnId() {
//		return this.cashAllocTrnId;
//	}
//
//	public void setCashAllocTrnId(double cashAllocTrnId) {
//		this.cashAllocTrnId = cashAllocTrnId;
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
//	public BigDecimal getGrossAmount() {
//		return this.grossAmount;
//	}
//
//	public void setGrossAmount(BigDecimal grossAmount) {
//		this.grossAmount = grossAmount;
//	}
//
//	public String getPaymentMode() {
//		return this.paymentMode;
//	}
//
//	public void setPaymentMode(String paymentMode) {
//		this.paymentMode = paymentMode;
//	}
//
//	public String getStmtNumber() {
//		return this.stmtNumber;
//	}
//
//	public void setStmtNumber(String stmtNumber) {
//		this.stmtNumber = stmtNumber;
//	}
//
//	public int getStmtReceiptNoOld() {
//		return this.stmtReceiptNoOld;
//	}
//
//	public void setStmtReceiptNoOld(int stmtReceiptNoOld) {
//		this.stmtReceiptNoOld = stmtReceiptNoOld;
//	}
//
//	public String getTransactionCode() {
//		return this.transactionCode;
//	}
//
//	public void setTransactionCode(String transactionCode) {
//		this.transactionCode = transactionCode;
//	}
//
//}