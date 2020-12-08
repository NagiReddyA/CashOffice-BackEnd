package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_MODULES database table.
 * 
 */
@Entity
@Table(name="T_MODULES")
@NamedQuery(name="TModule.findAll", query="SELECT t FROM TModule t")
public class TModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MODULE_ID")
	private double moduleId;

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

	@Column(name="MODULE_CODE")
	private String moduleCode;

	@Column(name="MODULE_DESC")
	private String moduleDesc;

	//bi-directional many-to-one association to TPageaccessMaster
	@OneToMany(mappedBy="TModule")
	private List<TPageaccessMaster> TPageaccessMasters;

	public TModule() {
	}

	public double getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(double moduleId) {
		this.moduleId = moduleId;
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

	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getModuleDesc() {
		return this.moduleDesc;
	}

	public void setModuleDesc(String moduleDesc) {
		this.moduleDesc = moduleDesc;
	}

	public List<TPageaccessMaster> getTPageaccessMasters() {
		return this.TPageaccessMasters;
	}

	public void setTPageaccessMasters(List<TPageaccessMaster> TPageaccessMasters) {
		this.TPageaccessMasters = TPageaccessMasters;
	}

	public TPageaccessMaster addTPageaccessMaster(TPageaccessMaster TPageaccessMaster) {
		getTPageaccessMasters().add(TPageaccessMaster);
		TPageaccessMaster.setTModule(this);

		return TPageaccessMaster;
	}

	public TPageaccessMaster removeTPageaccessMaster(TPageaccessMaster TPageaccessMaster) {
		getTPageaccessMasters().remove(TPageaccessMaster);
		TPageaccessMaster.setTModule(null);

		return TPageaccessMaster;
	}

}