package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sais.cashoffice.CashOfficeTest.entities.TPolMisallocationHdr;



public class MisallcationToDet implements Serializable {
	

	private static final long serialVersionUID = 1L;

	
	private double polMisallToId;
	
	private double misallocationId;

	
	private BigDecimal amount;
	
	private String collectionflag;
	
	private BigDecimal id;
	
	

	
	public BigDecimal getId() {
		return id;
	}


	public void setId(BigDecimal id) {
		this.id = id;
	}


	public String getCollectionflag() {
		return collectionflag;
	}


	public void setCollectionflag(String collectionflag) {
		this.collectionflag = collectionflag;
	}


	private BigDecimal arrears;

	
	private String attribute1;


	private String createdBy;


	private Date creationDate;


	private String modifiedBy;

	private Date modifiedDatetime;


	private double partyid;


	private String partyname;

	
	private Date period;

	
	private String policyCode;

	private double policyid;


	private String policystatus;


	private String postedBy;

	
	private Date postingDatetime;

	
	private String postingstatus;


	private String purpose;


	private String recepitNumber;


	public double getPolMisallToId() {
		return polMisallToId;
	}


	public void setPolMisallToId(double polMisallToId) {
		this.polMisallToId = polMisallToId;
	}


	public double getMisallocationId() {
		return misallocationId;
	}


	public void setMisallocationId(double misallocationId) {
		this.misallocationId = misallocationId;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	public BigDecimal getArrears() {
		return arrears;
	}


	public void setArrears(BigDecimal arrears) {
		this.arrears = arrears;
	}


	public String getAttribute1() {
		return attribute1;
	}


	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
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


	public double getPartyid() {
		return partyid;
	}


	public void setPartyid(double partyid) {
		this.partyid = partyid;
	}


	public String getPartyname() {
		return partyname;
	}


	public void setPartyname(String partyname) {
		this.partyname = partyname;
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


	public double getPolicyid() {
		return policyid;
	}


	public void setPolicyid(double policyid) {
		this.policyid = policyid;
	}


	public String getPolicystatus() {
		return policystatus;
	}


	public void setPolicystatus(String policystatus) {
		this.policystatus = policystatus;
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


	public String getPostingstatus() {
		return postingstatus;
	}


	public void setPostingstatus(String postingstatus) {
		this.postingstatus = postingstatus;
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	public String getRecepitNumber() {
		return recepitNumber;
	}


	public void setRecepitNumber(String recepitNumber) {
		this.recepitNumber = recepitNumber;
	}


	
	
	
	
}
	
	
	
	