package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TMP_DC_TBL database table.
 * 
 */
//@Entity
//@Table(name="TMP_DC_TBL")
//@NamedQuery(name="TmpDcTbl.findAll", query="SELECT t FROM TmpDcTbl t")
//public class TmpDcTbl implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name="AMOUNT")
//	private BigDecimal amount;
//
//	@Column(name="ATTRIBUTE1")
//	private String attribute1;
//
//	@Column(name="ATTRIBUTE10")
//	private String attribute10;
//
//	@Column(name="ATTRIBUTE2")
//	private String attribute2;
//
//	@Column(name="ATTRIBUTE3")
//	private String attribute3;
//
//	@Column(name="ATTRIBUTE4")
//	private String attribute4;
//
//	@Column(name="ATTRIBUTE5")
//	private String attribute5;
//
//	@Column(name="ATTRIBUTE6")
//	private String attribute6;
//
//	@Column(name="ATTRIBUTE7")
//	private String attribute7;
//
//	@Column(name="ATTRIBUTE8")
//	private String attribute8;
//
//	@Column(name="ATTRIBUTE9")
//	private String attribute9;
//
//	@Column(name="CLIENT_NUMBER")
//	private double clientNumber;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="COLLECTION_PERIOD")
//	private Date collectionPeriod;
//
//	@Column(name="COMMENTS")
//	private String comments;
//
//	@Column(name="CREATED_BY")
//	private String createdBy;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="CREATION_DATE")
//	private Date creationDate;
//
//	@Column(name="EMPLOYEE_CODE")
//	private String employeeCode;
//
//	@Column(name="MODIFIED_BY")
//	private String modifiedBy;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name="MODIFIED_DATETIME")
//	private Date modifiedDatetime;
//
//	@Column(name="PAYPOINT_ID")
//	private BigDecimal paypointId;
//
//	@Column(name="PENSION_YN")
//	private String pensionYn;
//
//	@Column(name="POLICY_CODE")
//	private String policyCode;
//
//	@Column(name="REFERENCE_NAME")
//	private String referenceName;
//
//	public TmpDcTbl() {
//	}
//
//	public BigDecimal getAmount() {
//		return this.amount;
//	}
//
//	public void setAmount(BigDecimal amount) {
//		this.amount = amount;
//	}
//
//	public String getAttribute1() {
//		return this.attribute1;
//	}
//
//	public void setAttribute1(String attribute1) {
//		this.attribute1 = attribute1;
//	}
//
//	public String getAttribute10() {
//		return this.attribute10;
//	}
//
//	public void setAttribute10(String attribute10) {
//		this.attribute10 = attribute10;
//	}
//
//	public String getAttribute2() {
//		return this.attribute2;
//	}
//
//	public void setAttribute2(String attribute2) {
//		this.attribute2 = attribute2;
//	}
//
//	public String getAttribute3() {
//		return this.attribute3;
//	}
//
//	public void setAttribute3(String attribute3) {
//		this.attribute3 = attribute3;
//	}
//
//	public String getAttribute4() {
//		return this.attribute4;
//	}
//
//	public void setAttribute4(String attribute4) {
//		this.attribute4 = attribute4;
//	}
//
//	public String getAttribute5() {
//		return this.attribute5;
//	}
//
//	public void setAttribute5(String attribute5) {
//		this.attribute5 = attribute5;
//	}
//
//	public String getAttribute6() {
//		return this.attribute6;
//	}
//
//	public void setAttribute6(String attribute6) {
//		this.attribute6 = attribute6;
//	}
//
//	public String getAttribute7() {
//		return this.attribute7;
//	}
//
//	public void setAttribute7(String attribute7) {
//		this.attribute7 = attribute7;
//	}
//
//	public String getAttribute8() {
//		return this.attribute8;
//	}
//
//	public void setAttribute8(String attribute8) {
//		this.attribute8 = attribute8;
//	}
//
//	public String getAttribute9() {
//		return this.attribute9;
//	}
//
//	public void setAttribute9(String attribute9) {
//		this.attribute9 = attribute9;
//	}
//
//	public double getClientNumber() {
//		return this.clientNumber;
//	}
//
//	public void setClientNumber(double clientNumber) {
//		this.clientNumber = clientNumber;
//	}
//
//	public Date getCollectionPeriod() {
//		return this.collectionPeriod;
//	}
//
//	public void setCollectionPeriod(Date collectionPeriod) {
//		this.collectionPeriod = collectionPeriod;
//	}
//
//	public String getComments() {
//		return this.comments;
//	}
//
//	public void setComments(String comments) {
//		this.comments = comments;
//	}
//
//	public String getCreatedBy() {
//		return this.createdBy;
//	}
//
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//
//	public Date getCreationDate() {
//		return this.creationDate;
//	}
//
//	public void setCreationDate(Date creationDate) {
//		this.creationDate = creationDate;
//	}
//
//	public String getEmployeeCode() {
//		return this.employeeCode;
//	}
//
//	public void setEmployeeCode(String employeeCode) {
//		this.employeeCode = employeeCode;
//	}
//
//	public String getModifiedBy() {
//		return this.modifiedBy;
//	}
//
//	public void setModifiedBy(String modifiedBy) {
//		this.modifiedBy = modifiedBy;
//	}
//
//	public Date getModifiedDatetime() {
//		return this.modifiedDatetime;
//	}
//
//	public void setModifiedDatetime(Date modifiedDatetime) {
//		this.modifiedDatetime = modifiedDatetime;
//	}
//
//	public BigDecimal getPaypointId() {
//		return this.paypointId;
//	}
//
//	public void setPaypointId(BigDecimal paypointId) {
//		this.paypointId = paypointId;
//	}
//
//	public String getPensionYn() {
//		return this.pensionYn;
//	}
//
//	public void setPensionYn(String pensionYn) {
//		this.pensionYn = pensionYn;
//	}
//
//	public String getPolicyCode() {
//		return this.policyCode;
//	}
//
//	public void setPolicyCode(String policyCode) {
//		this.policyCode = policyCode;
//	}
//
//	public String getReferenceName() {
//		return this.referenceName;
//	}
//
//	public void setReferenceName(String referenceName) {
//		this.referenceName = referenceName;
//	}
//
//}