package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_INSURED_LIST database table.
 * 
 */
@Entity
@Table(name="T_INSURED_LIST")
@NamedQuery(name="TInsuredList.findAll", query="SELECT t FROM TInsuredList t")
public class TInsuredList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LIST_ID")
	private long listId;

	@Column(name="ACTIVE_STATUS")
	private String activeStatus;

	@Column(name="ADDRESS_ID")
	private BigDecimal addressId;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="EM_VALUE")
	private BigDecimal emValue;

	@Column(name="EMS_VERSION")
	private BigDecimal emsVersion;

	private String gender;

	private String housekeeper;

	@Column(name="INDUSTRY_TYPE")
	private BigDecimal industryType;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TIME")
	private Date insertTime;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TIMESTAMP")
	private Date insertTimestamp;

	@Column(name="INSERTED_BY")
	private BigDecimal insertedBy;

	@Column(name="INSURED_NUM")
	private String insuredNum;

	@Column(name="INSURED_STATUS")
	private String insuredStatus;

	@Column(name="IS_DEATH")
	private String isDeath;

	@Column(name="JOB_1")
	private String job1;

	@Column(name="JOB_2")
	private String job2;

	@Column(name="JOB_CATE_ID")
	private BigDecimal jobCateId;

	@Column(name="LIVE_RANGE")
	private String liveRange;

	@Column(name="MASTER_NUM")
	private String masterNum;

	@Column(name="MEDICAL_EXAM_INDI")
	private String medicalExamIndi;

	@Column(name="MOBILE_TEL")
	private String mobileTel;

	@Column(name="MOVE_RANGE")
	private String moveRange;

	@Column(name="PARENT_SA")
	private BigDecimal parentSa;

	@Column(name="PARTY_ID")
	private BigDecimal partyId;

	@Column(name="PLAN_ID")
	private BigDecimal planId;

	@Column(name="RELATION_TO_PH")
	private BigDecimal relationToPh;

	private String retired;

	private String smoking;

	@Column(name="STAND_LIFE")
	private String standLife;

	private String telephone;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIMESTAMP")
	private Date updateTimestamp;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	//bi-directional many-to-one association to TBenefitInsured
	@OneToMany(mappedBy="TInsuredList")
	private List<TBenefitInsured> TBenefitInsureds;

	//bi-directional many-to-one association to TContractMaster
	@ManyToOne
	@JoinColumn(name="POLICY_ID")
	private TContractMaster TContractMaster;

	public TInsuredList() {
	}

	public long getListId() {
		return this.listId;
	}

	public void setListId(long listId) {
		this.listId = listId;
	}

	public String getActiveStatus() {
		return this.activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public BigDecimal getAddressId() {
		return this.addressId;
	}

	public void setAddressId(BigDecimal addressId) {
		this.addressId = addressId;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public BigDecimal getEmValue() {
		return this.emValue;
	}

	public void setEmValue(BigDecimal emValue) {
		this.emValue = emValue;
	}

	public BigDecimal getEmsVersion() {
		return this.emsVersion;
	}

	public void setEmsVersion(BigDecimal emsVersion) {
		this.emsVersion = emsVersion;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHousekeeper() {
		return this.housekeeper;
	}

	public void setHousekeeper(String housekeeper) {
		this.housekeeper = housekeeper;
	}

	public BigDecimal getIndustryType() {
		return this.industryType;
	}

	public void setIndustryType(BigDecimal industryType) {
		this.industryType = industryType;
	}

	public Date getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public Date getInsertTimestamp() {
		return this.insertTimestamp;
	}

	public void setInsertTimestamp(Date insertTimestamp) {
		this.insertTimestamp = insertTimestamp;
	}

	public BigDecimal getInsertedBy() {
		return this.insertedBy;
	}

	public void setInsertedBy(BigDecimal insertedBy) {
		this.insertedBy = insertedBy;
	}

	public String getInsuredNum() {
		return this.insuredNum;
	}

	public void setInsuredNum(String insuredNum) {
		this.insuredNum = insuredNum;
	}

	public String getInsuredStatus() {
		return this.insuredStatus;
	}

	public void setInsuredStatus(String insuredStatus) {
		this.insuredStatus = insuredStatus;
	}

	public String getIsDeath() {
		return this.isDeath;
	}

	public void setIsDeath(String isDeath) {
		this.isDeath = isDeath;
	}

	public String getJob1() {
		return this.job1;
	}

	public void setJob1(String job1) {
		this.job1 = job1;
	}

	public String getJob2() {
		return this.job2;
	}

	public void setJob2(String job2) {
		this.job2 = job2;
	}

	public BigDecimal getJobCateId() {
		return this.jobCateId;
	}

	public void setJobCateId(BigDecimal jobCateId) {
		this.jobCateId = jobCateId;
	}

	public String getLiveRange() {
		return this.liveRange;
	}

	public void setLiveRange(String liveRange) {
		this.liveRange = liveRange;
	}

	public String getMasterNum() {
		return this.masterNum;
	}

	public void setMasterNum(String masterNum) {
		this.masterNum = masterNum;
	}

	public String getMedicalExamIndi() {
		return this.medicalExamIndi;
	}

	public void setMedicalExamIndi(String medicalExamIndi) {
		this.medicalExamIndi = medicalExamIndi;
	}

	public String getMobileTel() {
		return this.mobileTel;
	}

	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}

	public String getMoveRange() {
		return this.moveRange;
	}

	public void setMoveRange(String moveRange) {
		this.moveRange = moveRange;
	}

	public BigDecimal getParentSa() {
		return this.parentSa;
	}

	public void setParentSa(BigDecimal parentSa) {
		this.parentSa = parentSa;
	}

	public BigDecimal getPartyId() {
		return this.partyId;
	}

	public void setPartyId(BigDecimal partyId) {
		this.partyId = partyId;
	}

	public BigDecimal getPlanId() {
		return this.planId;
	}

	public void setPlanId(BigDecimal planId) {
		this.planId = planId;
	}

	public BigDecimal getRelationToPh() {
		return this.relationToPh;
	}

	public void setRelationToPh(BigDecimal relationToPh) {
		this.relationToPh = relationToPh;
	}

	public String getRetired() {
		return this.retired;
	}

	public void setRetired(String retired) {
		this.retired = retired;
	}

	public String getSmoking() {
		return this.smoking;
	}

	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}

	public String getStandLife() {
		return this.standLife;
	}

	public void setStandLife(String standLife) {
		this.standLife = standLife;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public BigDecimal getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public List<TBenefitInsured> getTBenefitInsureds() {
		return this.TBenefitInsureds;
	}

	public void setTBenefitInsureds(List<TBenefitInsured> TBenefitInsureds) {
		this.TBenefitInsureds = TBenefitInsureds;
	}

	public TBenefitInsured addTBenefitInsured(TBenefitInsured TBenefitInsured) {
		getTBenefitInsureds().add(TBenefitInsured);
		TBenefitInsured.setTInsuredList(this);

		return TBenefitInsured;
	}

	public TBenefitInsured removeTBenefitInsured(TBenefitInsured TBenefitInsured) {
		getTBenefitInsureds().remove(TBenefitInsured);
		TBenefitInsured.setTInsuredList(null);

		return TBenefitInsured;
	}

	public TContractMaster getTContractMaster() {
		return this.TContractMaster;
	}

	public void setTContractMaster(TContractMaster TContractMaster) {
		this.TContractMaster = TContractMaster;
	}

}