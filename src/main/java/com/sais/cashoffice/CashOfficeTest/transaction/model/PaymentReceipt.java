package com.sais.cashoffice.CashOfficeTest.transaction.model;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentReceipt {
	
	private 	double   	cashierActId		 	;         
    private 	int   		cashOffActId			;
    private 	double     	cashOffId 				;		
    private 	double   	cashierId 				;
    private 	String   	cashierName 			;
    private 	String   	cashOffCode  	 		;   

    //FOR PAYMENT METHOD
  	private 	double   	payMtdId			 	;
  	private 	String   	modeName			 	;
  	
  	//FOR T_RECEIPT
  	private 	double   	rcptNo					;
  	private 	String   	rcptAmount				;
  	private 	Date		rcptDate				;
  	private		String		postStatus				;
  	private 	String   	rcvdFrom				;
  	private 	int		   	appId					;
  	private 	double   	allocAmt				;
  	private 	double   	unallocAmt				;
  	private 	String   	creatBy					;
  	
  	//FOR APPLICATION DETAILS
  	//private 	double   	APP_ID					; 
  	private 	String   	appCode					;
  	private 	int   	appActId				;
  	private 	String   	appActCode				;
  	private 	String   	appActDesc				;
  	
  	//FOR BANK BRANCH DETAILS
  	private 	String   	branchName				;
  	private 	String   	branchCode				;
  	private 	String   	bankName				;
  	private 	String   	bankCode				;
  	
  	
  	
	public double getcashierActId() {
		return cashierActId;
	}
	public void setcashierActId(double cashieractId) {
		cashierActId = cashieractId;
	}
	public int getcashOffActId() {
		return cashOffActId;
	}
	public void setcashOffActId(int cashoffActId) {
		cashOffActId = cashoffActId;
	}
	public double getcashOffId() {
		return cashOffId;
	}
	public void setcashOffId(double cashoffId) {
		cashOffId = cashoffId;
	}
	public double getcashierId() {
		return cashierId;
	}
	public void setcashierId(double cashierid) {
		cashierId = cashierid;
	}
	public String getcashierName() {
		return cashierName;
	}
	public void setcashierName(String cashiername) {
		cashierName = cashiername;
	}
	public String getcashOffCode() {
		return cashOffCode;
	}
	public void setcashOffCode(String cashoffCode) {
		cashOffCode = cashoffCode;
	}
    
		
	
	public double getpayMtdId() {
		return payMtdId;
	}
	public void setpayMtdId(double paymtdId) {
		payMtdId = paymtdId;
	}
	
	public String getmodeName() {
		return modeName;
	}
	public void setmodeName(String modename) {
		modeName = modename;
	}
	
	
	//FOR T_RECEIPT
	public double getrcptNo() {
		return rcptNo;
	}
	public void setrcptNo(double rcptno) {
		rcptNo = rcptno;
	}
	
	public String getrcptAmount() {
		return rcptAmount;
	}
	public void setrcptAmount(String rcptamount) {
		rcptAmount = rcptamount;
	}
	
	public Date getrcptDate() {
		return rcptDate;
	}
	public void setrcptDate(Date rcptdate) {
		rcptDate = rcptdate;
	}
	
	public String getpostStatus() {
		return postStatus;
	}
	public void setpostStatus(String poststatus) {
		postStatus = poststatus;
	}
	
	public String getrcvdFrom() {
		return rcvdFrom;
	}
	public void setrcvdFrom(String rcvdfrom) {
		rcvdFrom = rcvdfrom;
	}
	
	public int getappId() {
		return appId;
	}
	public void setappId(int appid) {
		appId = appid;
	}
	
	public double getallocAmt() {
		return allocAmt;
	}
	public void setallocAmt(double allocamt) {
		allocAmt = allocamt;
	}
	
	public double getunallocAmt() {
		return unallocAmt;
	}
	public void setunallocAmt(double unallocamt) {
		unallocAmt = unallocamt;
	}
	
	public String getcreatBy() {
		return creatBy;
	}
	public void setcreatBy(String creatby) {
		creatBy = creatby;
	}
	
	
	//FOR APPLICATION DETAILS
	
	public String getappCode() {
		return appCode;
	}
	public void setappCode(String appcode) {
		appCode = appcode;
	}
  	
	public int getappActId() {
		return appActId;
	}
	public void setappActId(int appactId) {
		appActId = appactId;
	}
	
	public String getappActCode() {
		return appActCode;
	}
	public void setappActCode(String appactCode) {
		appActCode = appactCode;
	}
	
	public String getappActDesc() {
		return appActDesc;
	}
	public void setappActDesc(String appactDesc) {
		appActDesc = appactDesc;
	}
	
	
	//FOR BANK BRANCH DETAILS
	public String getbranchName() {
		return branchName;
	}
	public void setbranchName(String branchname) {
		branchName = branchname;
	}
	
	public String getbranchCode() {
		return branchCode;
	}
	public void setbranchCode(String branchcode) {
		branchCode = branchcode;
	}
	
	public String getbankName() {
		return bankName;
	}
	public void setbankName(String bankname) {
		bankName = bankname;
	}
	
	public String getbankCode() {
		return bankCode;
	}
	public void setbankCode(String bankcode) {
		bankCode = bankcode;
	}
  		  	
}
