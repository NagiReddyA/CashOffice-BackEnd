package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="MIG_BOBI_UNALLOCATED_BK_STMTS")
public class MigTranscationbobiModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name="TRANSACTION_CODE")
	private String transactionCode;
	
	@Column(name="CASH_ALLOC_TRN_ID")
	private double cashAllocTrnId;
	


	@Column(name="BRANCH_CODE")
	private String branchCode;
	
	@Column(name="BANK_CODE")
	private String bankCode;
	
	
	@Column(name="BANK_STMT_ID")
	private double bankStmtId;
	
	@Column(name="STMT_NUMBER")
	private String stmtNumber;
	

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;
	
	@Column(name="ALLOCATION_STATUS")
	private String allocationStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ACCOUNTING_DATE")
	private Date accountingDate;
	
	@Column(name="GROSS_AMOUNT")
	private BigDecimal grossAmount;
	

	@Column(name="ALLOCATED_AMOUNT")
	private BigDecimal allocatedAmount;

	
	@Column(name="COMMENTS")
	private String comments;


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public String getTransactionCode() {
		return transactionCode;
	}


	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}


	public double getCashAllocTrnId() {
		return cashAllocTrnId;
	}


	public void setCashAllocTrnId(double cashAllocTrnId) {
		this.cashAllocTrnId = cashAllocTrnId;
	}



	public String getBranchCode() {
		return branchCode;
	}


	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	public String getBankCode() {
		return bankCode;
	}


	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}


	public double getBankStmtId() {
		return bankStmtId;
	}


	public void setBankStmtId(double bankStmtId) {
		this.bankStmtId = bankStmtId;
	}


	public String getStmtNumber() {
		return stmtNumber;
	}


	public void setStmtNumber(String stmtNumber) {
		this.stmtNumber = stmtNumber;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAllocationStatus() {
		return allocationStatus;
	}


	public void setAllocationStatus(String allocationStatus) {
		this.allocationStatus = allocationStatus;
	}


	public Date getAccountingDate() {
		return accountingDate;
	}


	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
	}


	public BigDecimal getGrossAmount() {
		return grossAmount;
	}


	public void setGrossAmount(BigDecimal grossAmount) {
		this.grossAmount = grossAmount;
	}


	public BigDecimal getAllocatedAmount() {
		return allocatedAmount;
	}


	public void setAllocatedAmount(BigDecimal allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}

	

	

	

	




 
	
	
	
	
	

}
