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

public class MisallcationFromPol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private double polMisallFromId;
	
	private double misallocationId;

	
	private BigDecimal amount;

	
	private String collectionflag;


	private String createdBy;

	
	private Date creationDate;


	private BigDecimal id;


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


	private double recepitNumber;
	
	


	public double getPolMisallFromId() {
		return polMisallFromId;
	}


	public void setPolMisallFromId(double polMisallFromId) {
		this.polMisallFromId = polMisallFromId;
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


	public String getCollectionflag() {
		return collectionflag;
	}


	public void setCollectionflag(String collectionflag) {
		this.collectionflag = collectionflag;
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


	public BigDecimal getId() {
		return id;
	}


	public void setId(BigDecimal id) {
		this.id = id;
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


	public double getRecepitNumber() {
		return recepitNumber;
	}


	public void setRecepitNumber(double recepitNumber) {
		this.recepitNumber = recepitNumber;
	}


	
	
	

}
