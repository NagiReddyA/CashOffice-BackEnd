package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model;

import java.math.BigDecimal;






public class Vw_PayPoints {
	
     private BigDecimal Paypoint_id;
     private String PayPoint_Name;
     private char Pay_Point_Type_id;
     private int PAY_MODE_ID;
     private String PAY_MODE_NAME;
     private String pay_mode_short_name;
     
     
	public BigDecimal getPaypoint_id() {
		return Paypoint_id;
	}
	public void setPaypoint_id(BigDecimal paypoint_id) {
		Paypoint_id = paypoint_id;
	}
	public String getPayPoint_Name() {
		return PayPoint_Name;
	}
	public void setPayPoint_Name(String payPoint_Name) {
		PayPoint_Name = payPoint_Name;
	}
	public char getPay_Point_Type_id() {
		return Pay_Point_Type_id;
	}
	public void setPay_Point_Type_id(char pay_Point_Type_id) {
		Pay_Point_Type_id = pay_Point_Type_id;
	}
	public int getPAY_MODE_ID() {
		return PAY_MODE_ID;
	}
	public void setPAY_MODE_ID(int pAY_MODE_ID) {
		PAY_MODE_ID = pAY_MODE_ID;
	}
	public String getPAY_MODE_NAME() {
		return PAY_MODE_NAME;
	}
	public void setPAY_MODE_NAME(String pAY_MODE_NAME) {
		PAY_MODE_NAME = pAY_MODE_NAME;
	}
	public String getPay_mode_short_name() {
		return pay_mode_short_name;
	}
	public void setPay_mode_short_name(String pay_mode_short_name) {
		this.pay_mode_short_name = pay_mode_short_name;
	}
     
     
	

     
     
     
}
