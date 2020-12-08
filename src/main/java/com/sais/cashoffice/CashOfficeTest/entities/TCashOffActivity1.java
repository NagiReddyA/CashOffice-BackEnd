package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sais.cashoffice.CashOfficeTest.transaction.model.ActivityForm;


/**
 * The persistent class for the T_CASH_OFF_ACTIVITY database table.
 * 
 */
@Entity
@Table(name="T_CASH_OFF_ACTIVITY")
@NamedQuery(name="TCashOffActivity1.findAll", query="SELECT t FROM TCashOffActivity1 t")
public class TCashOffActivity1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CASH_OFF_ACTIVITY_ID")
	private int cashOffActivityId;
	
	@Column(name="BRANCH_CODE")
	private String branchCode;

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

	

	@Column(name="CASH_OFFICE_ID")
	private double cashOfficeId;

	@Column(name="CASHIER_ID")
	private double cashierId;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="DEPOSIT_SLIP_ID")
	private double depositSlipId;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	//@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECEIPT_DATE")
	private LocalDate receiptDate;

	@Column(name="STATUS")
	private char status;

	
	
//	//bi-directional many-to-one association to TCashTillActivity
//	@OneToMany(mappedBy="TCashOffActivity")
//	private List<TCashTillActivity> TCashTillActivities;
//
//	//bi-directional many-to-one association to TDepositSlip
//	@OneToMany(mappedBy="TCashOffActivity")
//	private List<TDepositSlip> TDepositSlips;



	public TCashOffActivity1() {
	}

	public int getCashOffActivityId() {
		return this.cashOffActivityId;
	}

	public void setCashOffActivityId(int cashOffActivityId) {
		this.cashOffActivityId = cashOffActivityId;
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

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public double getCashOfficeId() {
		return this.cashOfficeId;
	}

	public void setCashOfficeId(double cashOfficeId) {
		this.cashOfficeId = cashOfficeId;
	}

	public double getCashierId() {
		return this.cashierId;
	}

	public void setCashierId(double cashierId) {
		this.cashierId = cashierId;
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

	public double getDepositSlipId() {
		return this.depositSlipId;
	}

	public void setDepositSlipId(double depositSlipId) {
		this.depositSlipId = depositSlipId;
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

	public LocalDate getReceiptDate() {
		return this.receiptDate;
	}

	public void setReceiptDate(LocalDate date) {
		this.receiptDate = date;
	}

	public char getStatus() {
		return this.status;
	}

	public void setStatus(char object) {
		this.status = object;
	}
//
//	public List<TCashTillActivity> getTCashTillActivities() {
//		return this.TCashTillActivities;
//	}
//
//	public void setTCashTillActivities(List<TCashTillActivity> TCashTillActivities) {
//		this.TCashTillActivities = TCashTillActivities;
//	}
//
//	public TCashTillActivity addTCashTillActivity(TCashTillActivity TCashTillActivity) {
//		getTCashTillActivities().add(TCashTillActivity);
//		TCashTillActivity.setTCashOffActivity1(this);
//
//		return TCashTillActivity;
//	}
//
//	public TCashTillActivity removeTCashTillActivity(TCashTillActivity TCashTillActivity) {
//		getTCashTillActivities().remove(TCashTillActivity);
//		TCashTillActivity.setTCashOffActivity(null);
//
//		return TCashTillActivity;
//	}
//
//	public List<TDepositSlip> getTDepositSlips() {
//		return this.TDepositSlips;
//	}
//
//	public void setTDepositSlips(List<TDepositSlip> TDepositSlips) {
//		this.TDepositSlips = TDepositSlips;
//	}
//
//	public TDepositSlip addTDepositSlip(TDepositSlip TDepositSlip) {
//		getTDepositSlips().add(TDepositSlip);
//		TDepositSlip.setTCashOffActivity(this);
//
//		return TDepositSlip;
//	}
//
//	public TDepositSlip removeTDepositSlip(TDepositSlip TDepositSlip) {
//		getTDepositSlips().remove(TDepositSlip);
//		TDepositSlip.setTCashOffActivity(null);
//
//		return TDepositSlip;
//	}

	public void add(char c) {
		// TODO Auto-generated method stub
		
	}

	public void add(ActivityForm appForm2) {
		// TODO Auto-generated method stub
		
	}


}