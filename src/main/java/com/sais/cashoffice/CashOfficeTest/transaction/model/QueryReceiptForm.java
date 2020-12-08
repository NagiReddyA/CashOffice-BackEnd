package com.sais.cashoffice.CashOfficeTest.transaction.model;

import java.math.BigDecimal;
import java.util.Date;

public class QueryReceiptForm {


	private 	double   	RCPT_TRN_ID 		;         
    private 	double   	RECEIPT_NO			;
    private 	Date     	RECEIPT_DATE 		;		
    private 	BigDecimal  RECEIPT_AMOUNT 		;
    private 	String   	RECEIVED_FROM 		;
    private 	double   	PAY_METHOD_ID 		;
    private 	double   	CASH_OFFICE_ID 		;
    private 	double   	CASHIER_ID 			;
    private 	char	    POSTING_STATUS 		;
    private 	BigDecimal  POSTING_REFERENCE 	;
    private 	Date     	POSTING_DATETIME 	;	
    private  	String   	CANCELLATION_REASON	;
    private 	String   	COMMENTS 			;
    private     String  	PAY_METHOD_CODE     ;
    private 	String  	CASH_OFFICE_CODE 	;
//    private 	String  	CASHIER_CODE 		;
//    private 	String  	CASHIER_NAME 		;
//    private 	String  	LOGIN_ID 			;
  //  private 	double  	PYMT_DET_TRN_ID 	;
    private 	String  	REFERENCE_NUMBER 	;
    private 	Date    	REFERENCE_DATE 		;		
    private 	BigDecimal 	BANK_ID 			;
    private 	BigDecimal 	BANK_BRANCH_ID 		;
    private 	String  	DRAWEE 				;
    private 	double  	RCPT_ALL_ID 		;
    private 	double  	APP_ID 				;
   	private 	BigDecimal 	ALLOCATED_AMOUNT 	;
    private 	String  	APP_CODE 			;
    private 	String  	APP_DESC 			;
    private 	String  	VALUE_MEANING		;
    
    // T_CASHIERS    
    private 	String  	CASHIER_CODE 		;
    private 	String  	CASHIER_NAME 		;
    private 	String  	LOGIN_ID 			;
    private 	String  	BRANCH_CODE			;
    // T_CASHIERS END
    
	public double getRCPT_TRN_ID() {
		return RCPT_TRN_ID;
	}
	public void setRCPT_TRN_ID(double rCPT_TRN_ID) {
		RCPT_TRN_ID = rCPT_TRN_ID;
	}
	public double getRECEIPT_NO() {
		return RECEIPT_NO;
	}
	public void setRECEIPT_NO(double rECEIPT_NO) {
		RECEIPT_NO = rECEIPT_NO;
	}
	public Date getRECEIPT_DATE() {
		return RECEIPT_DATE;
	}
	public void setRECEIPT_DATE(Date rECEIPT_DATE) {
		RECEIPT_DATE = rECEIPT_DATE;
	}
	public BigDecimal getRECEIPT_AMOUNT() {
		return RECEIPT_AMOUNT;
	}
	public void setRECEIPT_AMOUNT(BigDecimal rECEIPT_AMOUNT) {
		RECEIPT_AMOUNT = rECEIPT_AMOUNT;
	}
	public String getRECEIVED_FROM() {
		return RECEIVED_FROM;
	}
	public void setRECEIVED_FROM(String rECEIVED_FROM) {
		RECEIVED_FROM = rECEIVED_FROM;
	}
	public double getPAY_METHOD_ID() {
		return PAY_METHOD_ID;
	}
	public void setPAY_METHOD_ID(double pAY_METHOD_ID) {
		PAY_METHOD_ID = pAY_METHOD_ID;
	}
	public double getCASH_OFFICE_ID() {
		return CASH_OFFICE_ID;
	}
	public void setCASH_OFFICE_ID(double cASH_OFFICE_ID) {
		CASH_OFFICE_ID = cASH_OFFICE_ID;
	}
	public double getCASHIER_ID() {
		return CASHIER_ID;
	}
	public void setCASHIER_ID(double cASHIER_ID) {
		CASHIER_ID = cASHIER_ID;
	}
	public char getPOSTING_STATUS() {
		return POSTING_STATUS;
	}
	public void setPOSTING_STATUS(char pOSTING_STATUS) {
		POSTING_STATUS = pOSTING_STATUS;
	}
	public BigDecimal getPOSTING_REFERENCE() {
		return POSTING_REFERENCE;
	}
	public void setPOSTING_REFERENCE(BigDecimal pOSTING_REFERENCE) {
		POSTING_REFERENCE = pOSTING_REFERENCE;
	}
	public Date getPOSTING_DATETIME() {
		return POSTING_DATETIME;
	}
	public void setPOSTING_DATETIME(Date pOSTING_DATETIME) {
		POSTING_DATETIME = pOSTING_DATETIME;
	}
	public String getCANCELLATION_REASON() {
		return CANCELLATION_REASON;
	}
	public void setCANCELLATION_REASON(String cANCELLATION_REASON) {
		CANCELLATION_REASON = cANCELLATION_REASON;
	}
	public String getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}
	public String getPAY_METHOD_CODE() {
		return PAY_METHOD_CODE;
	}
	public void setPAY_METHOD_CODE(String pAY_METHOD_CODE) {
		PAY_METHOD_CODE = pAY_METHOD_CODE;
	}
	public String getCASH_OFFICE_CODE() {
		return CASH_OFFICE_CODE;
	}
	public void setCASH_OFFICE_CODE(String cASH_OFFICE_CODE) {
		CASH_OFFICE_CODE = cASH_OFFICE_CODE;
	}
	
//	public double getPYMT_DET_TRN_ID() {
//		return PYMT_DET_TRN_ID;
//	}
//	public void setPYMT_DET_TRN_ID(double pYMT_DET_TRN_ID) {
//		PYMT_DET_TRN_ID = pYMT_DET_TRN_ID;
//	}
	public String getREFERENCE_NUMBER() {
		return REFERENCE_NUMBER;
	}
	public void setREFERENCE_NUMBER(String rEFERENCE_NUMBER) {
		REFERENCE_NUMBER = rEFERENCE_NUMBER;
	}
	public Date getREFERENCE_DATE() {
		return REFERENCE_DATE;
	}
	public void setREFERENCE_DATE(Date rEFERENCE_DATE) {
		REFERENCE_DATE = rEFERENCE_DATE;
	}
	public BigDecimal getBANK_ID() {
		return BANK_ID;
	}
	public void setBANK_ID(BigDecimal bANK_ID) {
		BANK_ID = bANK_ID;
	}
	public BigDecimal getBANK_BRANCH_ID() {
		return BANK_BRANCH_ID;
	}
	public void setBANK_BRANCH_ID(BigDecimal bANK_BRANCH_ID) {
		BANK_BRANCH_ID = bANK_BRANCH_ID;
	}
	public String getDRAWEE() {
		return DRAWEE;
	}
	public void setDRAWEE(String dRAWEE) {
		DRAWEE = dRAWEE;
	}
	public double getRCPT_ALL_ID() {
		return RCPT_ALL_ID;
	}
	public void setRCPT_ALL_ID(double rCPT_ALL_ID) {
		RCPT_ALL_ID = rCPT_ALL_ID;
	}
	public double getAPP_ID() {
		return APP_ID;
	}
	public void setAPP_ID(double aPP_ID) {
		APP_ID = aPP_ID;
	}
	public BigDecimal getALLOCATED_AMOUNT() {
		return ALLOCATED_AMOUNT;
	}
	public void setALLOCATED_AMOUNT(BigDecimal aLLOCATED_AMOUNT) {
		ALLOCATED_AMOUNT = aLLOCATED_AMOUNT;
	}
	public String getAPP_CODE() {
		return APP_CODE;
	}
	public void setAPP_CODE(String aPP_CODE) {
		APP_CODE = aPP_CODE;
	}
	public String getAPP_DESC() {
		return APP_DESC;
	}
	public void setAPP_DESC(String aPP_DESC) {
		APP_DESC = aPP_DESC;
	}
	public String getVALUE_MEANING() {
		return VALUE_MEANING;
	}
	public void setVALUE_MEANING(String vALUE_MEANING) {
		VALUE_MEANING = vALUE_MEANING;
	}
    
    
	
	// T_CASHIERS 
	public String getCASHIER_CODE() {
		return CASHIER_CODE;
	}
	public void setCASHIER_CODE(String cASHIER_CODE) {
		CASHIER_CODE = cASHIER_CODE;
	}
	public String getCASHIER_NAME() {
		return CASHIER_NAME;
	}
	public void setCASHIER_NAME(String cASHIER_NAME) {
		CASHIER_NAME = cASHIER_NAME;
	}
	public String getLOGIN_ID() {
		return LOGIN_ID;
	}
	public void setLOGIN_ID(String lOGIN_ID) {
		BRANCH_CODE = lOGIN_ID;
	}
	public String getBRANCH_CODE() {
		return BRANCH_CODE;
	}
	public void setBRANCH_CODE(String bRANCH_CODE) {
		BRANCH_CODE = bRANCH_CODE;
	}
	// T_CASHIERS END
	
    
	
}
