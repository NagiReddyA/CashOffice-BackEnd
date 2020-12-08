package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PolicyInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	
	private String policycode;
	private BigDecimal policyId;
	private BigDecimal partyid;
	private String partyName;
	private double expectedAMOUNT;
	private Date due_date;
	private int purpose_id;
	private String purpose;
	private String postingStatus;
	private int liabilityStatus;
	private String statusName;
	public String getPolicycode() {
		return policycode;
	}
	public void setPolicycode(String policycode) {
		this.policycode = policycode;
	}
	public BigDecimal getPolicyId() {
		return policyId;
	}
	public void setPolicyId(BigDecimal policyId) {
		this.policyId = policyId;
	}
	public BigDecimal getPartyid() {
		return partyid;
	}
	public void setPartyid(BigDecimal partyid) {
		this.partyid = partyid;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public double getExpectedAMOUNT() {
		return expectedAMOUNT;
	}
	public void setExpectedAMOUNT(double expectedAMOUNT) {
		this.expectedAMOUNT = expectedAMOUNT;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public int getPurpose_id() {
		return purpose_id;
	}
	public void setPurpose_id(int purpose_id) {
		this.purpose_id = purpose_id;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getPostingStatus() {
		return postingStatus;
	}
	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}
	public int getLiabilityStatus() {
		return liabilityStatus;
	}
	public void setLiabilityStatus(int liabilityStatus) {
		this.liabilityStatus = liabilityStatus;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
	
	
	
	
	
	
	
	
	

}
