package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

   

public class Det_Sundry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String bK_TRANSACTION_TYPE;
	private Date pERIOD;
	private BigDecimal aLLOCATED_AMOUNT;
	private String bK_TRANSACTION_DESC;
	private double bk_sundry_id;
	private double bk_stmt_id;
	
	
	
	
	public double getBk_sundry_id() {
		return bk_sundry_id;
	}
	public void setBk_sundry_id(double bk_sundry_id) {
		this.bk_sundry_id = bk_sundry_id;
	}
	public String getbK_TRANSACTION_TYPE() {
		return bK_TRANSACTION_TYPE;
	}
	public void setbK_TRANSACTION_TYPE(String bK_TRANSACTION_TYPE) {
		this.bK_TRANSACTION_TYPE = bK_TRANSACTION_TYPE;
	}
	public Date getpERIOD() {
		return pERIOD;
	}
	public void setpERIOD(Date pERIOD) {
		this.pERIOD = pERIOD;
	}
	public BigDecimal getaLLOCATED_AMOUNT() {
		return aLLOCATED_AMOUNT;
	}
	public void setaLLOCATED_AMOUNT(BigDecimal aLLOCATED_AMOUNT) {
		this.aLLOCATED_AMOUNT = aLLOCATED_AMOUNT;
	}
	public String getbK_TRANSACTION_DESC() {
		return bK_TRANSACTION_DESC;
	}
	public void setbK_TRANSACTION_DESC(String bK_TRANSACTION_DESC) {
		this.bK_TRANSACTION_DESC = bK_TRANSACTION_DESC;
	}
	public double getBk_stmt_id() {
		return bk_stmt_id;
	}
	public void setBk_stmt_id(double bk_stmt_id) {
		this.bk_stmt_id = bk_stmt_id;
	}
	
	
	
	
	
	
	
}
