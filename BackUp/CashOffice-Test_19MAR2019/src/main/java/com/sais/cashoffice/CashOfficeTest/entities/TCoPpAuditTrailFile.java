package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the T_CO_PP_AUDIT_TRAIL_FILE database table.
 * 
 */
//@Entity
//@Table(name="T_CO_PP_AUDIT_TRAIL_FILE")
//@NamedQuery(name="TCoPpAuditTrailFile.findAll", query="SELECT t FROM TCoPpAuditTrailFile t")
//public class TCoPpAuditTrailFile implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name="MATF_AFTER_VALUE")
//	private String matfAfterValue;
//
//	@Column(name="MATF_BEFORE_VALUE")
//	private String matfBeforeValue;
//
//	@Column(name="MATF_COLUMN_ID")
//	private String matfColumnId;
//
//	@Column(name="MATF_COLUMN_TITLE")
//	private String matfColumnTitle;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="MATF_DATE_PROCESSED")
//	private Date matfDateProcessed;
//
//	@Column(name="MATF_MODULE_CODE")
//	private String matfModuleCode;
//
//	@Column(name="MATF_PROCESS_ACTION")
//	private String matfProcessAction;
//
//	@Column(name="MATF_TABLE_ID")
//	private String matfTableId;
//
//	@Column(name="MATF_TABLE_UID")
//	private String matfTableUid;
//
//	@Column(name="MATF_TERMINAL")
//	private String matfTerminal;
//
//	@Column(name="MATF_USERID")
//	private String matfUserid;
//
//	public TCoPpAuditTrailFile() {
//	}
//
//	public String getMatfAfterValue() {
//		return this.matfAfterValue;
//	}
//
//	public void setMatfAfterValue(String matfAfterValue) {
//		this.matfAfterValue = matfAfterValue;
//	}
//
//	public String getMatfBeforeValue() {
//		return this.matfBeforeValue;
//	}
//
//	public void setMatfBeforeValue(String matfBeforeValue) {
//		this.matfBeforeValue = matfBeforeValue;
//	}
//
//	public String getMatfColumnId() {
//		return this.matfColumnId;
//	}
//
//	public void setMatfColumnId(String matfColumnId) {
//		this.matfColumnId = matfColumnId;
//	}
//
//	public String getMatfColumnTitle() {
//		return this.matfColumnTitle;
//	}
//
//	public void setMatfColumnTitle(String matfColumnTitle) {
//		this.matfColumnTitle = matfColumnTitle;
//	}
//
//	public Date getMatfDateProcessed() {
//		return this.matfDateProcessed;
//	}
//
//	public void setMatfDateProcessed(Date matfDateProcessed) {
//		this.matfDateProcessed = matfDateProcessed;
//	}
//
//	public String getMatfModuleCode() {
//		return this.matfModuleCode;
//	}
//
//	public void setMatfModuleCode(String matfModuleCode) {
//		this.matfModuleCode = matfModuleCode;
//	}
//
//	public String getMatfProcessAction() {
//		return this.matfProcessAction;
//	}
//
//	public void setMatfProcessAction(String matfProcessAction) {
//		this.matfProcessAction = matfProcessAction;
//	}
//
//	public String getMatfTableId() {
//		return this.matfTableId;
//	}
//
//	public void setMatfTableId(String matfTableId) {
//		this.matfTableId = matfTableId;
//	}
//
//	public String getMatfTableUid() {
//		return this.matfTableUid;
//	}
//
//	public void setMatfTableUid(String matfTableUid) {
//		this.matfTableUid = matfTableUid;
//	}
//
//	public String getMatfTerminal() {
//		return this.matfTerminal;
//	}
//
//	public void setMatfTerminal(String matfTerminal) {
//		this.matfTerminal = matfTerminal;
//	}
//
//	public String getMatfUserid() {
//		return this.matfUserid;
//	}
//
//	public void setMatfUserid(String matfUserid) {
//		this.matfUserid = matfUserid;
//	}
//
//}