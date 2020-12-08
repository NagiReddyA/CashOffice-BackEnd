package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DetUnspecified  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double bK_STMT_DET_UNSP_ID;
    private String bK_TRANSACTION_TYPE;
    private Date pERIOD;
    private BigDecimal aLLOCATED_AMOUNT;
    private char cREDIT_YN;
    private String bK_TRANSACTION_DESC;
    private double bk_stmt_id;
    
    
    
	public double getBk_stmt_id() {
		return bk_stmt_id;
	}
	public void setBk_stmt_id(double bk_stmt_id) {
		this.bk_stmt_id = bk_stmt_id;
	}
	public char getcREDIT_YN() {
		return cREDIT_YN;
	}
	public void setcREDIT_YN(char cREDIT_YN) {
		this.cREDIT_YN = cREDIT_YN;
	}
	public double getbK_STMT_DET_UNSP_ID() {
		return bK_STMT_DET_UNSP_ID;
	}
	public void setbK_STMT_DET_UNSP_ID(double bK_STMT_DET_UNSP_ID) {
		this.bK_STMT_DET_UNSP_ID = bK_STMT_DET_UNSP_ID;
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
    
    
    
	
	
	
	
	
	
	
	
}
