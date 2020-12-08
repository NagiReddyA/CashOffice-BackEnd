package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the T_COMPANY_ORGAN database table.
 * 
 */
@Entity
@Table(name = "T_COMPANY_ORGAN")
@NamedQuery(name = "TCompanyOrgan.findAll", query = "SELECT t FROM TCompanyOrgan t")
public class TCompanyOrgan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORGAN_ID")
	private long organId;

	@Column(name = "ABBR_NAME")
	private String abbrName;

	@Column(name = "ADDRESS_ID")
	private BigDecimal addressId;

	@Column(name = "AREA_CODE")
	private String areaCode;

	@Column(name = "BOS_RATE")
	private BigDecimal bosRate;

	@Column(name = "CHIEF_CLAIM")
	private BigDecimal chiefClaim;

	@Column(name = "CHIEF_CLAIM_GRP")
	private BigDecimal chiefClaimGrp;

	@Column(name = "CHIEF_CLAIM_HEALTH")
	private BigDecimal chiefClaimHealth;

	@Column(name = "CHIEF_GROUP_UW")
	private BigDecimal chiefGroupUw;

	@Column(name = "CHIEF_INDIVI_UW")
	private BigDecimal chiefIndiviUw;

	@Column(name = "CLASS_ID")
	private int classId;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "COUNTRY_CODE")
	private String countryCode;

	@Column(name = "CUT_OFF_TIME")
	private String cutOffTime;

	@Column(name = "DEFAULT_MONEY")
	private Integer defaultMoney;

	@Column(name = "DELEGATE")
	private String delegate;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "FAX")
	private String fax;

	@Column(name = "FINANCIAL_RIGHT")
	private String financialRight;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FOUND_DATE")
	private Date foundDate;

	@Column(name = "FULL_CODE")
	private String fullCode;

	@Column(name = "GRADE_ID")
	private BigDecimal gradeId;

	@Column(name = "HOTLINE")
	private String hotline;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERT_TIME")
	private Date insertTime;

	@Column(name = "INTEREST_TAX_RATE")
	private BigDecimal interestTaxRate;

	@Column(name = "IS_BASIC")
	private String isBasic;

	@Column(name = "LEADER_ID")
	private BigDecimal leaderId;

	@Column(name = "LEAF")
	private String leaf;

	@Column(name = "LEGAL_ENTITY")
	private String legalEntity;

	@Column(name = "ORGAN_CODE")
	private String organCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECALL_DATE")
	private Date recallDate;

	@Column(name = "RECORDER_ID")
	private BigDecimal recorderId;

	@Column(name = "REGION_ID")
	private Integer regionId;

	@Column(name = "STATUS")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SYNC_TIME")
	private Date syncTime;

	@Column(name = "TAX_CODE")
	private String taxCode;

	@Column(name = "TELEPHONE")
	private String telephone;

	@Column(name = "TYPE_ID")
	private Integer typeId;

	@Column(name = "UNIT_CODE")
	private String unitCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME")
	private Date updateTime;

	@Column(name = "UPDATER_ID")
	private BigDecimal updaterId;

	@Column(name = "VIRTUAL_ENTITY")
	private String virtualEntity;

	@Column(name = "WEBSITE")
	private String website;

	// bi-directional many-to-one association to TCompanyOrgan
	@ManyToOne
	@JoinColumn(name = "PARENT_ID")	
	private TCompanyOrgan TCompanyOrgan;

	// bi-directional many-to-one association to TCompanyOrgan
	@OneToMany(mappedBy = "TCompanyOrgan")	
	private List<TCompanyOrgan> TCompanyOrgans;

	public TCompanyOrgan() {
	}

	public long getOrganId() {
		return this.organId;
	}

	public void setOrganId(long organId) {
		this.organId = organId;
	}

	public String getAbbrName() {
		return this.abbrName;
	}

	public void setAbbrName(String abbrName) {
		this.abbrName = abbrName;
	}

	public BigDecimal getAddressId() {
		return this.addressId;
	}

	public void setAddressId(BigDecimal addressId) {
		this.addressId = addressId;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public BigDecimal getBosRate() {
		return this.bosRate;
	}

	public void setBosRate(BigDecimal bosRate) {
		this.bosRate = bosRate;
	}

	public BigDecimal getChiefClaim() {
		return this.chiefClaim;
	}

	public void setChiefClaim(BigDecimal chiefClaim) {
		this.chiefClaim = chiefClaim;
	}

	public BigDecimal getChiefClaimGrp() {
		return this.chiefClaimGrp;
	}

	public void setChiefClaimGrp(BigDecimal chiefClaimGrp) {
		this.chiefClaimGrp = chiefClaimGrp;
	}

	public BigDecimal getChiefClaimHealth() {
		return this.chiefClaimHealth;
	}

	public void setChiefClaimHealth(BigDecimal chiefClaimHealth) {
		this.chiefClaimHealth = chiefClaimHealth;
	}

	public BigDecimal getChiefGroupUw() {
		return this.chiefGroupUw;
	}

	public void setChiefGroupUw(BigDecimal chiefGroupUw) {
		this.chiefGroupUw = chiefGroupUw;
	}

	public BigDecimal getChiefIndiviUw() {
		return this.chiefIndiviUw;
	}

	public void setChiefIndiviUw(BigDecimal chiefIndiviUw) {
		this.chiefIndiviUw = chiefIndiviUw;
	}

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCutOffTime() {
		return this.cutOffTime;
	}

	public void setCutOffTime(String cutOffTime) {
		this.cutOffTime = cutOffTime;
	}

	public Integer getDefaultMoney() {
		return this.defaultMoney;
	}

	public void setDefaultMoney(Integer defaultMoney) {
		this.defaultMoney = defaultMoney;
	}

	public String getDelegate() {
		return this.delegate;
	}

	public void setDelegate(String delegate) {
		this.delegate = delegate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFinancialRight() {
		return this.financialRight;
	}

	public void setFinancialRight(String financialRight) {
		this.financialRight = financialRight;
	}

	public Date getFoundDate() {
		return this.foundDate;
	}

	public void setFoundDate(Date foundDate) {
		this.foundDate = foundDate;
	}

	public String getFullCode() {
		return this.fullCode;
	}

	public void setFullCode(String fullCode) {
		this.fullCode = fullCode;
	}

	public BigDecimal getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(BigDecimal gradeId) {
		this.gradeId = gradeId;
	}

	public String getHotline() {
		return this.hotline;
	}

	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public Date getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public BigDecimal getInterestTaxRate() {
		return this.interestTaxRate;
	}

	public void setInterestTaxRate(BigDecimal interestTaxRate) {
		this.interestTaxRate = interestTaxRate;
	}

	public String getIsBasic() {
		return this.isBasic;
	}

	public void setIsBasic(String isBasic) {
		this.isBasic = isBasic;
	}

	public BigDecimal getLeaderId() {
		return this.leaderId;
	}

	public void setLeaderId(BigDecimal leaderId) {
		this.leaderId = leaderId;
	}

	public String getLeaf() {
		return this.leaf;
	}

	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}

	public String getLegalEntity() {
		return this.legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public String getOrganCode() {
		return this.organCode;
	}

	public void setOrganCode(String organCode) {
		this.organCode = organCode;
	}

	public Date getRecallDate() {
		return this.recallDate;
	}

	public void setRecallDate(Date recallDate) {
		this.recallDate = recallDate;
	}

	public BigDecimal getRecorderId() {
		return this.recorderId;
	}

	public void setRecorderId(BigDecimal recorderId) {
		this.recorderId = recorderId;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getSyncTime() {
		return this.syncTime;
	}

	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}

	public String getTaxCode() {
		return this.taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getUnitCode() {
		return this.unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public BigDecimal getUpdaterId() {
		return this.updaterId;
	}

	public void setUpdaterId(BigDecimal updaterId) {
		this.updaterId = updaterId;
	}

	public String getVirtualEntity() {
		return this.virtualEntity;
	}

	public void setVirtualEntity(String virtualEntity) {
		this.virtualEntity = virtualEntity;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public TCompanyOrgan getTCompanyOrgan() {
		return this.TCompanyOrgan;
	}

	public void setTCompanyOrgan(TCompanyOrgan TCompanyOrgan) {
		this.TCompanyOrgan = TCompanyOrgan;
	}

	@JsonIgnore
	public List<TCompanyOrgan> getTCompanyOrgans() {
		return this.TCompanyOrgans;
	}

	public void setTCompanyOrgans(List<TCompanyOrgan> TCompanyOrgans) {
		this.TCompanyOrgans = TCompanyOrgans;
	}

	public TCompanyOrgan addTCompanyOrgan(TCompanyOrgan TCompanyOrgan) {
		getTCompanyOrgans().add(TCompanyOrgan);
		TCompanyOrgan.setTCompanyOrgan(this);

		return TCompanyOrgan;
	}

	public TCompanyOrgan removeTCompanyOrgan(TCompanyOrgan TCompanyOrgan) {
		getTCompanyOrgans().remove(TCompanyOrgan);
		TCompanyOrgan.setTCompanyOrgan(null);

		return TCompanyOrgan;
	}

}