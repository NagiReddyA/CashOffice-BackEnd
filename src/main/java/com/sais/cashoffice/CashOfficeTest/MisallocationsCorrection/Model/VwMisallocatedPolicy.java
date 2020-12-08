package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class VwMisallocatedPolicy implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double misallocationId;
	private double id;
	private double policyid;
	private String policyCode;
	private BigDecimal amount;
	private Date period;
	private double partyid;
	private String partyname;
	private double recepitNumber;
	private String collectionflag;
	private String postingstatus;
    private String policystatus;

	public double getMisallocationId() {
		return misallocationId;
	}

	public void setMisallocationId(double misallocationId) {
		this.misallocationId = misallocationId;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public double getPolicyid() {
		return policyid;
	}

	public void setPolicyid(double policyid) {
		this.policyid = policyid;
	}

	public String getPolicyCode() {
		return policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
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

	public double getRecepitNumber() {
		return recepitNumber;
	}

	public void setRecepitNumber(double recepitNumber) {
		this.recepitNumber = recepitNumber;
	}

	public String getCollectionflag() {
		return collectionflag;
	}

	public void setCollectionflag(String collectionflag) {
		this.collectionflag = collectionflag;
	}

	public String getPostingstatus() {
		return postingstatus;
	}

	public void setPostingstatus(String postingstatus) {
		this.postingstatus = postingstatus;
	}

	public String getPolicystatus() {
		return policystatus;
	}

	public void setPolicystatus(String policystatus) {
		this.policystatus = policystatus;
	}

	
	 
	
	
	


}
