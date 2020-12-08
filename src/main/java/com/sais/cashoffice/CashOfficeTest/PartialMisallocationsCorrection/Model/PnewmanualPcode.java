package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

// this class is used for fetching the policy details by passing policy code has input


public class PnewmanualPcode implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String policycode;
	private int policyid;
	private BigDecimal partyid;
	private String partyname;
	private BigInteger exceptedamount;
	private String duedate;
	private BigInteger purposeid;
	private String purpose;
	private String postingstatus;
	private int liabilitystatus;
	private String statusname;
	private Date period;
	
	
	
	public String getPolicycode() {
		return policycode;
	}
	public void setPolicycode(String policycode) {
		this.policycode = policycode;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public BigDecimal getPartyid() {
		return partyid;
	}
	public void setPartyid(BigDecimal partyid) {
		this.partyid = partyid;
	}
	public String getPartyname() {
		return partyname;
	}
	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}
	public BigInteger getExceptedamount() {
		return exceptedamount;
	}
	public void setExceptedamount(BigInteger exceptedamount) {
		this.exceptedamount = exceptedamount;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public BigInteger getPurposeid() {
		return purposeid;
	}
	public void setPurposeid(BigInteger purposeid) {
		this.purposeid = purposeid;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getPostingstatus() {
		return postingstatus;
	}
	public void setPostingstatus(String postingstatus) {
		this.postingstatus = postingstatus;
	}
	public int getLiabilitystatus() {
		return liabilitystatus;
	}
	public void setLiabilitystatus(int liabilitystatus) {
		this.liabilitystatus = liabilitystatus;
	}
	public String getStatusname() {
		return statusname;
	}
	public void setStatusname(String statusname) {
		this.statusname = statusname;
	}
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}

	
	
	
	
	
	
	
	
	

}
