package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_APPLICATION database table.
 * 
 */
@Entity
@Table(name="T_APPLICATION")
@NamedQuery(name="TApplication.findAll", query="SELECT t FROM TApplication t")
public class TApplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="APP_ID")
	private long appId;

	@Column(name="APP_CODE")
	private String appCode;

	@Column(name="APP_DESC")
	private String appDesc;
	
	@Column(name="ENABLED")
	private char enabled;

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

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	//bi-directional many-to-one association to TAppActivity
	@OneToMany(mappedBy="TApplication")
	private List<TAppActivity> TAppActivities;

	//bi-directional many-to-one association to TCashOffApp
	@OneToMany(mappedBy="TApplication")
	private List<TCashOffApp> TCashOffApps;

	//bi-directional many-to-one association to TRcptAllocation
	@OneToMany(mappedBy="TApplication")
	private List<TRcptAllocation> TRcptAllocations;

	//bi-directional many-to-one association to TRcptFromReallocationDet
	@OneToMany(mappedBy="TApplication")
	private List<TRcptFromReallocationDet> TRcptFromReallocationDets;

	//bi-directional many-to-one association to TRcptToReallocationDet
	@OneToMany(mappedBy="TApplication")
	private List<TRcptToReallocationDet> TRcptToReallocationDets;

	public TApplication() {
	}

	public long getAppId() {
		return this.appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getAppDesc() {
		return this.appDesc;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	
	public char getEnabled() {
		return this.enabled;
	}

	public void setEnabled(char enabled) {
		this.enabled = enabled;
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

	public List<TAppActivity> getTAppActivities() {
		return this.TAppActivities;
	}

	public void setTAppActivities(List<TAppActivity> TAppActivities) {
		this.TAppActivities = TAppActivities;
	}

	public TAppActivity addTAppActivity(TAppActivity TAppActivity) {
		getTAppActivities().add(TAppActivity);
		TAppActivity.setTApplication(this);

		return TAppActivity;
	}

	public TAppActivity removeTAppActivity(TAppActivity TAppActivity) {
		getTAppActivities().remove(TAppActivity);
		TAppActivity.setTApplication(null);

		return TAppActivity;
	}

	public List<TCashOffApp> getTCashOffApps() {
		return this.TCashOffApps;
	}

	public void setTCashOffApps(List<TCashOffApp> TCashOffApps) {
		this.TCashOffApps = TCashOffApps;
	}

	public TCashOffApp addTCashOffApp(TCashOffApp TCashOffApp) {
		getTCashOffApps().add(TCashOffApp);
		TCashOffApp.setTApplication(this);

		return TCashOffApp;
	}

	public TCashOffApp removeTCashOffApp(TCashOffApp TCashOffApp) {
		getTCashOffApps().remove(TCashOffApp);
		TCashOffApp.setTApplication(null);

		return TCashOffApp;
	}

	public List<TRcptAllocation> getTRcptAllocations() {
		return this.TRcptAllocations;
	}

	public void setTRcptAllocations(List<TRcptAllocation> TRcptAllocations) {
		this.TRcptAllocations = TRcptAllocations;
	}

	public TRcptAllocation addTRcptAllocation(TRcptAllocation TRcptAllocation) {
		getTRcptAllocations().add(TRcptAllocation);
		TRcptAllocation.setTApplication(this);

		return TRcptAllocation;
	}

	public TRcptAllocation removeTRcptAllocation(TRcptAllocation TRcptAllocation) {
		getTRcptAllocations().remove(TRcptAllocation);
		TRcptAllocation.setTApplication(null);

		return TRcptAllocation;
	}

	public List<TRcptFromReallocationDet> getTRcptFromReallocationDets() {
		return this.TRcptFromReallocationDets;
	}

	public void setTRcptFromReallocationDets(List<TRcptFromReallocationDet> TRcptFromReallocationDets) {
		this.TRcptFromReallocationDets = TRcptFromReallocationDets;
	}

	public TRcptFromReallocationDet addTRcptFromReallocationDet(TRcptFromReallocationDet TRcptFromReallocationDet) {
		getTRcptFromReallocationDets().add(TRcptFromReallocationDet);
		TRcptFromReallocationDet.setTApplication(this);

		return TRcptFromReallocationDet;
	}

	public TRcptFromReallocationDet removeTRcptFromReallocationDet(TRcptFromReallocationDet TRcptFromReallocationDet) {
		getTRcptFromReallocationDets().remove(TRcptFromReallocationDet);
		TRcptFromReallocationDet.setTApplication(null);

		return TRcptFromReallocationDet;
	}

	public List<TRcptToReallocationDet> getTRcptToReallocationDets() {
		return this.TRcptToReallocationDets;
	}

	public void setTRcptToReallocationDets(List<TRcptToReallocationDet> TRcptToReallocationDets) {
		this.TRcptToReallocationDets = TRcptToReallocationDets;
	}

	public TRcptToReallocationDet addTRcptToReallocationDet(TRcptToReallocationDet TRcptToReallocationDet) {
		getTRcptToReallocationDets().add(TRcptToReallocationDet);
		TRcptToReallocationDet.setTApplication(this);

		return TRcptToReallocationDet;
	}

	public TRcptToReallocationDet removeTRcptToReallocationDet(TRcptToReallocationDet TRcptToReallocationDet) {
		getTRcptToReallocationDets().remove(TRcptToReallocationDet);
		TRcptToReallocationDet.setTApplication(null);

		return TRcptToReallocationDet;
	}

}