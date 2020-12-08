package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DetReversals implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double bK_STMT_DET_REV_ID;
	private String bK_TRANSACTION_TYPE;
	private Date pERIOD_FOR_REVERSALS;
	private String pOLICY_CODE;
	private String pAYOR;
	private int pOLICY_STATUS_ID;
	private BigDecimal eXPECTED_PREMIUM;
	private BigDecimal aLLOCATED_AMOUNT;
	private double bk_stmt_id;
	public double getbK_STMT_DET_REV_ID() {
		return bK_STMT_DET_REV_ID;
	}
	public void setbK_STMT_DET_REV_ID(double bK_STMT_DET_REV_ID) {
		this.bK_STMT_DET_REV_ID = bK_STMT_DET_REV_ID;
	}
	public String getbK_TRANSACTION_TYPE() {
		return bK_TRANSACTION_TYPE;
	}
	public void setbK_TRANSACTION_TYPE(String bK_TRANSACTION_TYPE) {
		this.bK_TRANSACTION_TYPE = bK_TRANSACTION_TYPE;
	}
	public Date getpERIOD_FOR_REVERSALS() {
		return pERIOD_FOR_REVERSALS;
	}
	public void setpERIOD_FOR_REVERSALS(Date pERIOD_FOR_REVERSALS) {
		this.pERIOD_FOR_REVERSALS = pERIOD_FOR_REVERSALS;
	}
	public String getpOLICY_CODE() {
		return pOLICY_CODE;
	}
	public void setpOLICY_CODE(String pOLICY_CODE) {
		this.pOLICY_CODE = pOLICY_CODE;
	}
	public String getpAYOR() {
		return pAYOR;
	}
	public void setpAYOR(String pAYOR) {
		this.pAYOR = pAYOR;
	}
	public int getpOLICY_STATUS_ID() {
		return pOLICY_STATUS_ID;
	}
	public void setpOLICY_STATUS_ID(int pOLICY_STATUS_ID) {
		this.pOLICY_STATUS_ID = pOLICY_STATUS_ID;
	}
	public BigDecimal geteXPECTED_PREMIUM() {
		return eXPECTED_PREMIUM;
	}
	public void seteXPECTED_PREMIUM(BigDecimal eXPECTED_PREMIUM) {
		this.eXPECTED_PREMIUM = eXPECTED_PREMIUM;
	}
	public BigDecimal getaLLOCATED_AMOUNT() {
		return aLLOCATED_AMOUNT;
	}
	public void setaLLOCATED_AMOUNT(BigDecimal aLLOCATED_AMOUNT) {
		this.aLLOCATED_AMOUNT = aLLOCATED_AMOUNT;
	}
	public double getBk_stmt_id() {
		return bk_stmt_id;
	}
	public void setBk_stmt_id(double bk_stmt_id) {
		this.bk_stmt_id = bk_stmt_id;
	}
	
	
	
	
        
	
	
	
	
}
