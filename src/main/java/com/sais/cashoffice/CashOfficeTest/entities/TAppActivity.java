package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the T_APP_ACTIVITY database table.
 * 
 */
@Entity
@Table(name="T_APP_ACTIVITY")
@NamedQuery(name="TAppActivity.findAll", query="SELECT t FROM TAppActivity t")
public class TAppActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="APP_ACTIVITY_ID")
	private long appActivityId;

	@Column(name="APP_ACTIVITY_CODE")
	private String appActivityCode;

	@Column(name="APP_ACTIVITY_DESC")
	private String appActivityDesc;

	@Column(name="ATTRIBUTE1")
	private String attribute1;

	@Column(name="ATTRIBUTE2")
	private String attribute2;

	@Column(name="ATTRIBUTE3")
	private String attribute3;

	@Column(name="ATTRIBUTE4")
	private String attribute4;

	@Column(name="ATTRIBUTE5")
	private String attribute5;

	@Column(name="ATTRIBUTE6")
	private String attribute6;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="CREDIT_ACCOUNT_SEG_CODE")
	private String creditAccountSegCode;

	@Column(name="DEBIT_ACCOUNT_SEG_CODE")
	private String debitAccountSegCode;

	@Column(name="ENABLED")
	private double enabled;

	@Column(name="EVENT_CODE")
	private String eventCode;

	@Column(name="GL_CONTEXT")
	private String glContext;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="TRANSACTION_CODE")
	private String transactionCode;

	//bi-directional many-to-one association to TApplication
	@ManyToOne
	@JoinColumn(name="APP_ID")
	private TApplication TApplication;

	public TAppActivity() {
	}

	public long getAppActivityId() {
		return this.appActivityId;
	}

	public void setAppActivityId(long appActivityId) {
		this.appActivityId = appActivityId;
	}

	public String getAppActivityCode() {
		return this.appActivityCode;
	}

	public void setAppActivityCode(String appActivityCode) {
		this.appActivityCode = appActivityCode;
	}

	public String getAppActivityDesc() {
		return this.appActivityDesc;
	}

	public void setAppActivityDesc(String appActivityDesc) {
		this.appActivityDesc = appActivityDesc;
	}

	public String getAttribute1() {
		return this.attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return this.attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return this.attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return this.attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return this.attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	public String getAttribute6() {
		return this.attribute6;
	}

	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreditAccountSegCode() {
		return this.creditAccountSegCode;
	}

	public void setCreditAccountSegCode(String creditAccountSegCode) {
		this.creditAccountSegCode = creditAccountSegCode;
	}

	public String getDebitAccountSegCode() {
		return this.debitAccountSegCode;
	}

	public void setDebitAccountSegCode(String debitAccountSegCode) {
		this.debitAccountSegCode = debitAccountSegCode;
	}

	public double getEnabled() {
		return this.enabled;
	}

	public void setEnabled(double enabled) {
		this.enabled = enabled;
	}

	public String getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getGlContext() {
		return this.glContext;
	}

	public void setGlContext(String glContext) {
		this.glContext = glContext;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDatetime() {
		return this.modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public String getTransactionCode() {
		return this.transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public TApplication getTApplication() {
		return this.TApplication;
	}

	public void setTApplication(TApplication TApplication) {
		this.TApplication = TApplication;
	}

}