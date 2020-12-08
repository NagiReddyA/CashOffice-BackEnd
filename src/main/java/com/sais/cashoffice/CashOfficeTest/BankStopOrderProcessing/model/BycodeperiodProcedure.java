package com.sais.cashoffice.CashOfficeTest.BankStopOrderProcessing.model;

import java.math.BigDecimal;
import java.util.Date;

public class BycodeperiodProcedure {
	
	private String policycode;
	private BigDecimal policyid;
	private BigDecimal partyid;
	private String partyname;
	private double exceptedamount;
	private String duedate;
	private int purposeid;
	private String purpose;
	private String postingstatus;
	private int liabilitystatus;
	private String stattusname;
	public String getPolicycode() {
		return policycode;
	}
	public void setPolicycode(String policycode) {
		this.policycode = policycode;
	}
	public BigDecimal getPolicyid() {
		return policyid;
	}
	public void setPolicyid(BigDecimal policyid) {
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
	public double getExceptedamount() {
		return exceptedamount;
	}
	public void setExceptedamount(double exceptedamount) {
		this.exceptedamount = exceptedamount;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public int getPurposeid() {
		return purposeid;
	}
	public void setPurposeid(int purposeid) {
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
	public String getStattusname() {
		return stattusname;
	}
	public void setStattusname(String stattusname) {
		this.stattusname = stattusname;
	}
	
    
	
}
