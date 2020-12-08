package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class ManualAllocationToDet   implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double manualAllToId;
	
	private double  ManualHdrid;

	
	private BigDecimal allocatedAmount;


	private BigDecimal arrearsAmount;


	private String collectionFlag;


	private String createdBy;


	private Date creationDate;


	private BigDecimal expectedAmount;


	private String modifiedBy;

	
	private Date modifiedDatetime;


	private BigDecimal partyId;


	private String payorName;

	private Date period;

	private String policyCode;


	private double policyId;


	private String policyStatus;
	private String postedBy;


	private Date postingDatetime;


	private String postingStatus;

	private String purposeId;


	private String purposeName;


	public double getManualAllToId() {
		return manualAllToId;
	}


	public void setManualAllToId(double manualAllToId) {
		this.manualAllToId = manualAllToId;
	}


	public double getManualHdrid() {
		return ManualHdrid;
	}


	public void setManualHdrid(double manualHdrid) {
		ManualHdrid = manualHdrid;
	}


	public BigDecimal getAllocatedAmount() {
		return allocatedAmount;
	}


	public void setAllocatedAmount(BigDecimal allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
	}


	public BigDecimal getArrearsAmount() {
		return arrearsAmount;
	}


	public void setArrearsAmount(BigDecimal arrearsAmount) {
		this.arrearsAmount = arrearsAmount;
	}


	public String getCollectionFlag() {
		return collectionFlag;
	}


	public void setCollectionFlag(String collectionFlag) {
		this.collectionFlag = collectionFlag;
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


	public BigDecimal getExpectedAmount() {
		return expectedAmount;
	}


	public void setExpectedAmount(BigDecimal expectedAmount) {
		this.expectedAmount = expectedAmount;
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


	public BigDecimal getPartyId() {
		return partyId;
	}


	public void setPartyId(BigDecimal partyId) {
		this.partyId = partyId;
	}


	public String getPayorName() {
		return payorName;
	}


	public void setPayorName(String payorName) {
		this.payorName = payorName;
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


	public double getPolicyId() {
		return policyId;
	}


	public void setPolicyId(double policyId) {
		this.policyId = policyId;
	}


	public String getPolicyStatus() {
		return policyStatus;
	}


	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
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


	public String getPurposeId() {
		return purposeId;
	}


	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
	}


	public String getPurposeName() {
		return purposeName;
	}


	public void setPurposeName(String purposeName) {
		this.purposeName = purposeName;
	}

    
	
	
}
