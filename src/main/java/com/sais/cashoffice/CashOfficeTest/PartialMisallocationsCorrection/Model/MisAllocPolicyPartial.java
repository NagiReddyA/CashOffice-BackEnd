package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MisAllocPolicyPartial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public double misallocationid;
	
	public double id ;
	
	public double policyid;
	
	public String policycode;
	
	public BigDecimal amount;
	
	public Date period;
	
	public double partyid;
	
	public String partyname;
	
	public double recepitnumber;
	
	public String flag;
	
	public String postingstatus;
	
	public String transcationtype;

	public double getMisallocationid() {
		return misallocationid;
	}

	public void setMisallocationid(double misallocationid) {
		this.misallocationid = misallocationid;
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

	public String getPolicycode() {
		return policycode;
	}

	public void setPolicycode(String policycode) {
		this.policycode = policycode;
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

	public double getRecepitnumber() {
		return recepitnumber;
	}

	public void setRecepitnumber(double recepitnumber) {
		this.recepitnumber = recepitnumber;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getPostingstatus() {
		return postingstatus;
	}

	public void setPostingstatus(String postingstatus) {
		this.postingstatus = postingstatus;
	}

	public String getTranscationtype() {
		return transcationtype;
	}

	public void setTranscationtype(String transcationtype) {
		this.transcationtype = transcationtype;
	}
	
	
}
