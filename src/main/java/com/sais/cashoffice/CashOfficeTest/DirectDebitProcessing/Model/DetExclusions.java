package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model;

import java.math.BigDecimal;
import java.util.Date;

public class DetExclusions {
	
	private Date PERIOD;
	private String POLICY_CODE;
	private int POLICY_STATUS_ID;
	private String PAYOR;
	private BigDecimal EXPECTED_PREMIUM;
	private BigDecimal ALLOCATED_AMOUNT;
	public Date getPERIOD() {
		return PERIOD;
	}
	public void setPERIOD(Date pERIOD) {
		PERIOD = pERIOD;
	}
	public String getPOLICY_CODE() {
		return POLICY_CODE;
	}
	public void setPOLICY_CODE(String pOLICY_CODE) {
		POLICY_CODE = pOLICY_CODE;
	}
	public int getPOLICY_STATUS_ID() {
		return POLICY_STATUS_ID;
	}
	public void setPOLICY_STATUS_ID(int pOLICY_STATUS_ID) {
		POLICY_STATUS_ID = pOLICY_STATUS_ID;
	}
	public String getPAYOR() {
		return PAYOR;
	}
	public void setPAYOR(String pAYOR) {
		PAYOR = pAYOR;
	}
	public BigDecimal getEXPECTED_PREMIUM() {
		return EXPECTED_PREMIUM;
	}
	public void setEXPECTED_PREMIUM(BigDecimal eXPECTED_PREMIUM) {
		EXPECTED_PREMIUM = eXPECTED_PREMIUM;
	}
	public BigDecimal getALLOCATED_AMOUNT() {
		return ALLOCATED_AMOUNT;
	}
	public void setALLOCATED_AMOUNT(BigDecimal aLLOCATED_AMOUNT) {
		ALLOCATED_AMOUNT = aLLOCATED_AMOUNT;
	}
	

}
