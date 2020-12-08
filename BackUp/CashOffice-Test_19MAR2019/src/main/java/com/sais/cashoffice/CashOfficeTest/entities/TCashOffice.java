package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_CASH_OFFICE database table.
 * 
 */
@Entity
@Table(name="T_CASH_OFFICE")
@NamedQuery(name="TCashOffice.findAll", query="SELECT t FROM TCashOffice t")
public class TCashOffice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CASH_OFFICE_ID")
	private long cashOfficeId;

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

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="CASH_OFFICE_CODE")
	private String cashOfficeCode;

	@Column(name="CASH_OFFICE_DESC")
	private String cashOfficeDesc;

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

	//bi-directional many-to-one association to TCashOfficeCashier
	@OneToMany(mappedBy="cashOffice")
	private List<TCashOfficeCashier> TCashOfficeCashiers;

	//bi-directional many-to-one association to TCashOffApp
	@OneToMany(mappedBy="TCashOffice")
	private List<TCashOffApp> TCashOffApps;

	//bi-directional many-to-one association to TCashOffPymtMthd
	@OneToMany(mappedBy="TCashOffice")
	private List<TCashOffPymtMthd> TCashOffPymtMthds;

	//bi-directional many-to-one association to TCashTillActivity
	@OneToMany(mappedBy="TCashOffice")
	private List<TCashTillActivity> TCashTillActivities;

	//bi-directional many-to-one association to TDepositSlip
	@OneToMany(mappedBy="TCashOffice")
	private List<TDepositSlip> TDepositSlips;

	//bi-directional many-to-one association to TReceipt
	@OneToMany(mappedBy="TCashOffice")
	private List<TReceipt> TReceipts;

	public TCashOffice() {
	}

	public long getCashOfficeId() {
		return this.cashOfficeId;
	}

	public void setCashOfficeId(long cashOfficeId) {
		this.cashOfficeId = cashOfficeId;
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

	public String getCashOfficeCode() {
		return this.cashOfficeCode;
	}

	public void setCashOfficeCode(String cashOfficeCode) {
		this.cashOfficeCode = cashOfficeCode;
	}

	public String getCashOfficeDesc() {
		return this.cashOfficeDesc;
	}

	public void setCashOfficeDesc(String cashOfficeDesc) {
		this.cashOfficeDesc = cashOfficeDesc;
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

	public List<TCashOfficeCashier> getTCashOfficeCashiers() {
		return this.TCashOfficeCashiers;
	}

	public void setTCashOfficeCashiers(List<TCashOfficeCashier> TCashOfficeCashiers) {
		this.TCashOfficeCashiers = TCashOfficeCashiers;
	}

	public TCashOfficeCashier addTCashOfficeCashier(TCashOfficeCashier TCashOfficeCashier) {
		getTCashOfficeCashiers().add(TCashOfficeCashier);
		TCashOfficeCashier.setCashOffice(this);

		return TCashOfficeCashier;
	}

	public TCashOfficeCashier removeTCashOfficeCashier(TCashOfficeCashier TCashOfficeCashier) {
		getTCashOfficeCashiers().remove(TCashOfficeCashier);
		TCashOfficeCashier.setCashOffice(null);

		return TCashOfficeCashier;
	}

	public List<TCashOffApp> getTCashOffApps() {
		return this.TCashOffApps;
	}

	public void setTCashOffApps(List<TCashOffApp> TCashOffApps) {
		this.TCashOffApps = TCashOffApps;
	}

	public TCashOffApp addTCashOffApp(TCashOffApp TCashOffApp) {
		getTCashOffApps().add(TCashOffApp);
		TCashOffApp.setTCashOffice(this);

		return TCashOffApp;
	}

	public TCashOffApp removeTCashOffApp(TCashOffApp TCashOffApp) {
		getTCashOffApps().remove(TCashOffApp);
		TCashOffApp.setTCashOffice(null);

		return TCashOffApp;
	}

	public List<TCashOffPymtMthd> getTCashOffPymtMthds() {
		return this.TCashOffPymtMthds;
	}

	public void setTCashOffPymtMthds(List<TCashOffPymtMthd> TCashOffPymtMthds) {
		this.TCashOffPymtMthds = TCashOffPymtMthds;
	}

	public TCashOffPymtMthd addTCashOffPymtMthd(TCashOffPymtMthd TCashOffPymtMthd) {
		getTCashOffPymtMthds().add(TCashOffPymtMthd);
		TCashOffPymtMthd.setTCashOffice(this);

		return TCashOffPymtMthd;
	}

	public TCashOffPymtMthd removeTCashOffPymtMthd(TCashOffPymtMthd TCashOffPymtMthd) {
		getTCashOffPymtMthds().remove(TCashOffPymtMthd);
		TCashOffPymtMthd.setTCashOffice(null);

		return TCashOffPymtMthd;
	}

	public List<TCashTillActivity> getTCashTillActivities() {
		return this.TCashTillActivities;
	}

	public void setTCashTillActivities(List<TCashTillActivity> TCashTillActivities) {
		this.TCashTillActivities = TCashTillActivities;
	}

	public TCashTillActivity addTCashTillActivity(TCashTillActivity TCashTillActivity) {
		getTCashTillActivities().add(TCashTillActivity);
		TCashTillActivity.setTCashOffice(this);

		return TCashTillActivity;
	}

	public TCashTillActivity removeTCashTillActivity(TCashTillActivity TCashTillActivity) {
		getTCashTillActivities().remove(TCashTillActivity);
		TCashTillActivity.setTCashOffice(null);

		return TCashTillActivity;
	}

	public List<TDepositSlip> getTDepositSlips() {
		return this.TDepositSlips;
	}

	public void setTDepositSlips(List<TDepositSlip> TDepositSlips) {
		this.TDepositSlips = TDepositSlips;
	}

	public TDepositSlip addTDepositSlip(TDepositSlip TDepositSlip) {
		getTDepositSlips().add(TDepositSlip);
		TDepositSlip.setTCashOffice(this);

		return TDepositSlip;
	}

	public TDepositSlip removeTDepositSlip(TDepositSlip TDepositSlip) {
		getTDepositSlips().remove(TDepositSlip);
		TDepositSlip.setTCashOffice(null);

		return TDepositSlip;
	}

	public List<TReceipt> getTReceipts() {
		return this.TReceipts;
	}

	public void setTReceipts(List<TReceipt> TReceipts) {
		this.TReceipts = TReceipts;
	}

	public TReceipt addTReceipt(TReceipt TReceipt) {
		getTReceipts().add(TReceipt);
		TReceipt.setTCashOffice(this);

		return TReceipt;
	}

	public TReceipt removeTReceipt(TReceipt TReceipt) {
		getTReceipts().remove(TReceipt);
		TReceipt.setTCashOffice(null);

		return TReceipt;
	}

}