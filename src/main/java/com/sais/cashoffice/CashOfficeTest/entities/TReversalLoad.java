package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the T_REVERSAL_LOAD database table.
 * 
 */
//@Entity
//@Table(name="T_REVERSAL_LOAD")
//@NamedQuery(name="TReversalLoad.findAll", query="SELECT t FROM TReversalLoad t")
//public class TReversalLoad implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name="BK_STMT_ID")
//	private double bkStmtId;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="DATA_LOAD_DATE")
//	private Date dataLoadDate;
//
//	@Lob
//	@Column(name="REVERSAL_DATA")
//	private String reversalData;
//
//	@Lob
//	@Column(name="REVERSAL_DATA_BLOL")
//	private byte[] reversalDataBlol;
//
//	public TReversalLoad() {
//	}
//
//	public double getBkStmtId() {
//		return this.bkStmtId;
//	}
//
//	public void setBkStmtId(double bkStmtId) {
//		this.bkStmtId = bkStmtId;
//	}
//
//	public Date getDataLoadDate() {
//		return this.dataLoadDate;
//	}
//
//	public void setDataLoadDate(Date dataLoadDate) {
//		this.dataLoadDate = dataLoadDate;
//	}
//
//	public String getReversalData() {
//		return this.reversalData;
//	}
//
//	public void setReversalData(String reversalData) {
//		this.reversalData = reversalData;
//	}
//
//	public byte[] getReversalDataBlol() {
//		return this.reversalDataBlol;
//	}
//
//	public void setReversalDataBlol(byte[] reversalDataBlol) {
//		this.reversalDataBlol = reversalDataBlol;
//	}
//
//}