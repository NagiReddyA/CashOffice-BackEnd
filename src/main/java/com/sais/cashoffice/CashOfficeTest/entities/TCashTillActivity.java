package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the T_CASH_TILL_ACTIVITY database table.
 * 
 */
@Entity
@Table(name="T_CASH_TILL_ACTIVITY")
@NamedQuery(name="TCashTillActivity.findAll", query="SELECT t FROM TCashTillActivity t")
public class TCashTillActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CASHIER_ACTIVITY_ID")
	private double cashierActivityId;

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

	@Column(name="AUTHORIZED")
	private int authorized;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TILL_ACTIVITY_DATE")
	private Date tillActivityDate;

	@Column(name="TILL_ACTIVITY_STATUS")
	private String tillActivityStatus;

	//bi-directional many-to-one association to TCashier
	@ManyToOne
	@JoinColumn(name="CASHIER_ID")
	private TCashier TCashier;

	//bi-directional many-to-one association to TCashOffice
	@ManyToOne
	@JoinColumn(name="CASH_OFFICE_ID")
	private TCashOffice TCashOffice;

	//bi-directional many-to-one association to TCashOffActivity
	@ManyToOne
	@JoinColumn(name="CASH_OFF_ACTIVITY_ID")
	private TCashOffActivity TCashOffActivity;

	public TCashTillActivity() {
	}

	public double getCashierActivityId() {
		return this.cashierActivityId;
	}

	public void setCashierActivityId(double cashierActivityId) {
		this.cashierActivityId = cashierActivityId;
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

	public int getAuthorized() {
		return this.authorized;
	}

	public void setAuthorized(int authorized) {
		this.authorized = authorized;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
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

	public Date getTillActivityDate() {
		return this.tillActivityDate;
	}

	public void setTillActivityDate(Date tillActivityDate) {
		this.tillActivityDate = tillActivityDate;
	}

	public String getTillActivityStatus() {
		return this.tillActivityStatus;
	}

	public void setTillActivityStatus(String tillActivityStatus) {
		this.tillActivityStatus = tillActivityStatus;
	}

	public TCashier getTCashier() {
		return this.TCashier;
	}

	public void setTCashier(TCashier TCashier) {
		this.TCashier = TCashier;
	}

	public TCashOffice getTCashOffice() {
		return this.TCashOffice;
	}

	public void setTCashOffice(TCashOffice TCashOffice) {
		this.TCashOffice = TCashOffice;
	}

	public TCashOffActivity getTCashOffActivity() {
		return this.TCashOffActivity;
	}

	public void setTCashOffActivity(TCashOffActivity TCashOffActivity) {
		this.TCashOffActivity = TCashOffActivity;
	}

}