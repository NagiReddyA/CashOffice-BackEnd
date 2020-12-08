package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ManualAllocationHdr {


	private double manualAllHdrId;

	
	private String attribute1;


	private String bankStmtFlag;

	
	private String createdBy;

	
	private Date creationDate;

	private String modifiedBy;

	private Date modifiedDatetime;


	private String postedBy;


	private Date postingDatetime;


	private String postingStatus;


	private double receiptNo;


	private BigDecimal totalAllocatedAmt;


	private BigDecimal totalPoliciesAmount;


	private BigDecimal totalUnallocatedAmt;


	public double getManualAllHdrId() {
		return manualAllHdrId;
	}


	public void setManualAllHdrId(double manualAllHdrId) {
		this.manualAllHdrId = manualAllHdrId;
	}


	public String getAttribute1() {
		return attribute1;
	}


	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}


	public String getBankStmtFlag() {
		return bankStmtFlag;
	}


	public void setBankStmtFlag(String bankStmtFlag) {
		this.bankStmtFlag = bankStmtFlag;
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


	public String getPostedBy() {
		return postedBy;
	}


	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}


	public Date getPostingDatetime() {
		return postingDatetime;
	}


	public void setPostingDatetime(Date postingDatetime) {
		this.postingDatetime = postingDatetime;
	}


	public String getPostingStatus() {
		return postingStatus;
	}


	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}


	public double getReceiptNo() {
		return receiptNo;
	}


	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}


	public BigDecimal getTotalAllocatedAmt() {
		return totalAllocatedAmt;
	}


	public void setTotalAllocatedAmt(BigDecimal totalAllocatedAmt) {
		this.totalAllocatedAmt = totalAllocatedAmt;
	}


	public BigDecimal getTotalPoliciesAmount() {
		return totalPoliciesAmount;
	}


	public void setTotalPoliciesAmount(BigDecimal totalPoliciesAmount) {
		this.totalPoliciesAmount = totalPoliciesAmount;
	}


	public BigDecimal getTotalUnallocatedAmt() {
		return totalUnallocatedAmt;
	}


	public void setTotalUnallocatedAmt(BigDecimal totalUnallocatedAmt) {
		this.totalUnallocatedAmt = totalUnallocatedAmt;
	}
	
	
	


}
