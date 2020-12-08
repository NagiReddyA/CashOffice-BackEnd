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

public class Misallocpartialfromdet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private double polParMisallocFromId;
	private double polparmisallochdrid;
	private double amount; 
	private String collectionFlag;
	private String createdBy;
	private Date creationDate;
	private double listId;
	private String modifiedBy;
	private Date modifiedDatetime;
	private double partyId;
	private String payorName;
	private Date period;
	private String policyCode;
	private double policyId;
	private String policyStatus;
	private String postedBy;
	private Date postingDatetime;
	private String postingStatus;
	private double receiptNo;
	
	
	public double getPolParMisallocFromId() {
		return polParMisallocFromId;
	}
	public void setPolParMisallocFromId(double polParMisallocFromId) {
		this.polParMisallocFromId = polParMisallocFromId;
	}
	public double getPolparmisallochdrid() {
		return polparmisallochdrid;
	}
	public void setPolparmisallochdrid(double polparmisallochdrid) {
		this.polparmisallochdrid = polparmisallochdrid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
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
	public double getListId() {
		return listId;
	}
	public void setListId(double listId) {
		this.listId = listId;
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
	public double getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}
	

}
