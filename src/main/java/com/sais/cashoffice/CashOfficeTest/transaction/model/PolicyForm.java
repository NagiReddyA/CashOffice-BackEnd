package com.sais.cashoffice.CashOfficeTest.transaction.model;

import java.math.BigDecimal;
import java.util.Date;

public class PolicyForm {
	
	private 	String 		POLICY_CODE;
    private 	String 		DUE_DATE;
    private 	String		PAYOR;
    private 	double   	ARREARS; 
    private 	double     	EXPECTED_PREMIUM;		
    private 	String   		STATUS;
    
    public String getPOLICY_CODE() {
		return POLICY_CODE;
	}
	public void setPOLICY_CODE(String pOLICY_CODE) {
		POLICY_CODE = pOLICY_CODE;
	}
	
	public String getDUE_DATE() {
		return DUE_DATE;
	}
	public void setDUE_DATE(String dUE_DATE) {
		DUE_DATE = dUE_DATE;
	}
	
	public String getPAYOR() {
		return PAYOR;
	}
	public void setPAYOR(String pAYOR) {
		PAYOR = pAYOR;
	}
	
	public double getARREARS() {
		return ARREARS;
	}
	public void setARREARS(double aRREARS) {
		ARREARS = aRREARS;
	}
	
	public double getEXPECTED_PREMIUM() {
		return EXPECTED_PREMIUM;
	}
	public void setEXPECTED_PREMIUM(double eXPECTED_PREMIUM) {
		EXPECTED_PREMIUM = eXPECTED_PREMIUM;
	}
	
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String object) {
		STATUS = object;
	}
	

}
