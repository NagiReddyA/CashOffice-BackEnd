package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Misallocpartialtodet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	private double polParMisallocToId;
	private double polparmisallochdrid;
	private String policyCode;
	private Date period;
	private String policyStatus;
	private BigDecimal amount;
	private double partyId;
	private String payorName;
	private BigDecimal arrears;
	private String purpose;
	private double policyId;
	private String receiptNumber;
	private Date creationDate;
	private String createdBy;
	private Date modifiedDatetime;
	private String modifiedBy;
	private String postingStatus;
	private Date postingDatetime;
	private String postedBy;
	
	// below two variables are used for getting the amount details (misallocation partial hdr)
	
	private BigDecimal totalreversalamount;
	private BigDecimal allocatedammmount;
	private BigDecimal totalunallocated;
	
	
	
	
	
	public BigDecimal getTotalreversalamount() {
		return totalreversalamount;
	}
	public void setTotalreversalamount(BigDecimal totalreversalamount) {
		this.totalreversalamount = totalreversalamount;
	}
	public BigDecimal getAllocatedammmount() {
		return allocatedammmount;
	}
	public void setAllocatedammmount(BigDecimal allocatedammmount) {
		this.allocatedammmount = allocatedammmount;
	}
	public BigDecimal getTotalunallocated() {
		return totalunallocated;
	}
	public void setTotalunallocated(BigDecimal totalunallocated) {
		this.totalunallocated = totalunallocated;
	}
	public double getPolParMisallocToId() {
		return polParMisallocToId;
	}
	public void setPolParMisallocToId(double polParMisallocToId) {
		this.polParMisallocToId = polParMisallocToId;
	}
	public double getPolparmisallochdrid() {
		return polparmisallochdrid;
	}
	public void setPolparmisallochdrid(double polparmisallochdrid) {
		this.polparmisallochdrid = polparmisallochdrid;
	}
	public String getPolicyCode() {
		return policyCode;
	}
	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public double getPartyId() {
		return partyId;
	}
	public void setPartyId(double partyId) {
		this.partyId = partyId;
	}
	public String getPayorName() {
		return payorName;
	}
	public void setPayorName(String payorName) {
		this.payorName = payorName;
	}
	public BigDecimal getArrears() {
		return arrears;
	}
	public void setArrears(BigDecimal arrears) {
		this.arrears = arrears;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public double getPolicyId() {
		return policyId;
	}
	public void setPolicyId(double policyId) {
		this.policyId = policyId;
	}
	public String getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifiedDatetime() {
		return modifiedDatetime;
	}
	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getPostingStatus() {
		return postingStatus;
	}
	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}
	public Date getPostingDatetime() {
		return postingDatetime;
	}
	public void setPostingDatetime(Date postingDatetime) {
		this.postingDatetime = postingDatetime;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	


}
