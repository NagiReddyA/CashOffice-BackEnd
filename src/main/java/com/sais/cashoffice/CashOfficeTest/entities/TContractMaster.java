package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_CONTRACT_MASTER database table.
 * 
 */
@Entity
@Table(name="T_CONTRACT_MASTER")
@NamedQuery(name="TContractMaster.findAll", query="SELECT t FROM TContractMaster t")
public class TContractMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="POLICY_ID")
	private long policyId;

	@Column(name="ADVANCE_PREM_INDI")
	private String advancePremIndi;

	@Column(name="ANNUITANT_TYPE")
	private BigDecimal annuitantType;

	@Column(name="APILP_DESC")
	private String apilpDesc;

	@Column(name="APILP_MAXIMUM_LIMIT")
	private BigDecimal apilpMaximumLimit;

	@Column(name="APL_PERMIT")
	private String aplPermit;

	@Column(name="APPLY_CODE")
	private String applyCode;

	@Temporal(TemporalType.DATE)
	@Column(name="APPLY_DATE")
	private Date applyDate;

	@Temporal(TemporalType.DATE)
	@Column(name="APPOINT_VALIDATE_DATE")
	private Date appointValidateDate;

	@Column(name="ASSIGNMENT_TYPE")
	private String assignmentType;

	@Column(name="AUTO_TRUST_IND")
	private String autoTrustInd;

	@Column(name="BEREAVEMENT_INDI")
	private String bereavementIndi;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CAMPAIGN_CODE")
	private String campaignCode;

	@Column(name="CHANNEL_ORG_ID")
	private BigDecimal channelOrgId;

	@Column(name="CHANNEL_STAFF_CODE")
	private String channelStaffCode;

	@Column(name="CHANNEL_TYPE")
	private BigDecimal channelType;

	@Column(name="COMM_MONTHLY_PAY_INDI")
	private String commMonthlyPayIndi;

	@Column(name="COMMISSION_SACRIFICE_RATE")
	private BigDecimal commissionSacrificeRate;

	@Column(name="CPF_POLICY")
	private String cpfPolicy;

	private String derivation;

	@Column(name="DISCOUNT_TYPE")
	private String discountType;

	@Column(name="EMS_VERSION")
	private BigDecimal emsVersion;

	@Column(name="END_CAUSE")
	private BigDecimal endCause;

	@Column(name="END_CAUSE_DETAIL")
	private String endCauseDetail;

	@Column(name="ENTITY_FUND_INDI")
	private String entityFundIndi;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;

	@Column(name="FOREIGN_POL_INDI")
	private String foreignPolIndi;

	@Column(name="FORMER_ID")
	private BigDecimal formerId;

	@Column(name="FUT_CHILD_INDI")
	private String futChildIndi;

	@Column(name="GROUP_POLICY_ID")
	private BigDecimal groupPolicyId;

	@Column(name="HEAD_ID")
	private BigDecimal headId;

	@Column(name="HOLIDAY_INDI")
	private String holidayIndi;

	@Temporal(TemporalType.DATE)
	@Column(name="INFORCING_DATE")
	private Date inforcingDate;

	@Temporal(TemporalType.DATE)
	@Column(name="INITIAL_VALI_DATE")
	private Date initialValiDate;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TIME")
	private Date insertTime;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TIMESTAMP")
	private Date insertTimestamp;

	@Column(name="INSERTED_BY")
	private BigDecimal insertedBy;

	@Column(name="INTRODUCER_NO")
	private String introducerNo;

	@Temporal(TemporalType.DATE)
	@Column(name="ISSUE_DATE")
	private Date issueDate;

	@Column(name="LANGUAGE_ID")
	private String languageId;

	@Column(name="LAPSE_CAUSE")
	private BigDecimal lapseCause;

	@Column(name="LEGACY_PRD_INFO")
	private String legacyPrdInfo;

	@Column(name="LIABILITY_STATE")
	private BigDecimal liabilityState;

	@Column(name="LIABILITY_STATE_CAUSE")
	private BigDecimal liabilityStateCause;

	@Temporal(TemporalType.DATE)
	@Column(name="LIABILITY_STATE_DATE")
	private Date liabilityStateDate;

	@Column(name="MAX_ANNUAL_PREM")
	private BigDecimal maxAnnualPrem;

	@Column(name="MISC_DEBT")
	private BigDecimal miscDebt;

	@Column(name="MISC_DEBT_PLD")
	private BigDecimal miscDebtPld;

	@Column(name="MONEY_ID")
	private BigDecimal moneyId;

	@Temporal(TemporalType.DATE)
	@Column(name="NO_LAPSE_END_DATE")
	private Date noLapseEndDate;

	@Column(name="NO_LAPSE_PERIOD")
	private BigDecimal noLapsePeriod;

	@Column(name="ORGAN_ID")
	private BigDecimal organId;

	@Column(name="OUT_OF_MARKET_INDI")
	private String outOfMarketIndi;

	@Column(name="OVER_MANAGE")
	private String overManage;

	@Column(name="OVERDUE_MANAGE")
	private String overdueManage;

	@Temporal(TemporalType.DATE)
	@Column(name="P_LAPSE_DATE")
	private Date pLapseDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PJ_LAPSE_DATE")
	private Date pjLapseDate;

	@Column(name="POLICY_CODE")
	private String policyCode;

	@Column(name="POLICY_SECTION")
	private String policySection;

	@Column(name="POLICY_TYPE")
	private String policyType;

	@Column(name="PREM_COLLECT_INDI")
	private String premCollectIndi;

	@Temporal(TemporalType.DATE)
	@Column(name="REG_DATE")
	private Date regDate;

	@Column(name="RI_PROCESSED")
	private String riProcessed;

	@Column(name="RISK_BACKDATING_INDI")
	private String riskBackdatingIndi;

	@Column(name="SERVI_TAX_INDI")
	private String serviTaxIndi;

	@Column(name="SERVICE_AGENT")
	private BigDecimal serviceAgent;

	@Column(name="SPOUSE_CHILD_INDI")
	private String spouseChildIndi;

	@Column(name="STD_BENE_INDI_DTH")
	private String stdBeneIndiDth;

	@Column(name="STD_BENE_INDI_LIFE")
	private String stdBeneIndiLife;

	@Temporal(TemporalType.DATE)
	@Column(name="SUBMISSION_DATE")
	private Date submissionDate;

	@Column(name="SUBMIT_CHANNEL")
	private String submitChannel;

	private String suspend;

	@Column(name="SUSPEND_CAUSE")
	private BigDecimal suspendCause;

	@Column(name="SUSPEND_CHG_ID")
	private BigDecimal suspendChgId;

	@Column(name="TRUST_POLICY_INDI")
	private String trustPolicyIndi;

	@Column(name="UPDATE_END_DATE")
	private String updateEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIMESTAMP")
	private Date updateTimestamp;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="VALIDATE_DATE")
	private Date validateDate;

	@Column(name="VESTING_INDI")
	private String vestingIndi;

	//bi-directional many-to-one association to TBenefitInsured
	@OneToMany(mappedBy="TContractMaster")
	private List<TBenefitInsured> TBenefitInsureds;

	//bi-directional many-to-one association to TContractProduct
	@OneToMany(mappedBy="TContractMaster")
	private List<TContractProduct> TContractProducts;

	//bi-directional many-to-one association to TInsuredList
	@OneToMany(mappedBy="TContractMaster")
	private List<TInsuredList> TInsuredLists;

	public TContractMaster() {
	}

	public long getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public String getAdvancePremIndi() {
		return this.advancePremIndi;
	}

	public void setAdvancePremIndi(String advancePremIndi) {
		this.advancePremIndi = advancePremIndi;
	}

	public BigDecimal getAnnuitantType() {
		return this.annuitantType;
	}

	public void setAnnuitantType(BigDecimal annuitantType) {
		this.annuitantType = annuitantType;
	}

	public String getApilpDesc() {
		return this.apilpDesc;
	}

	public void setApilpDesc(String apilpDesc) {
		this.apilpDesc = apilpDesc;
	}

	public BigDecimal getApilpMaximumLimit() {
		return this.apilpMaximumLimit;
	}

	public void setApilpMaximumLimit(BigDecimal apilpMaximumLimit) {
		this.apilpMaximumLimit = apilpMaximumLimit;
	}

	public String getAplPermit() {
		return this.aplPermit;
	}

	public void setAplPermit(String aplPermit) {
		this.aplPermit = aplPermit;
	}

	public String getApplyCode() {
		return this.applyCode;
	}

	public void setApplyCode(String applyCode) {
		this.applyCode = applyCode;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public Date getAppointValidateDate() {
		return this.appointValidateDate;
	}

	public void setAppointValidateDate(Date appointValidateDate) {
		this.appointValidateDate = appointValidateDate;
	}

	public String getAssignmentType() {
		return this.assignmentType;
	}

	public void setAssignmentType(String assignmentType) {
		this.assignmentType = assignmentType;
	}

	public String getAutoTrustInd() {
		return this.autoTrustInd;
	}

	public void setAutoTrustInd(String autoTrustInd) {
		this.autoTrustInd = autoTrustInd;
	}

	public String getBereavementIndi() {
		return this.bereavementIndi;
	}

	public void setBereavementIndi(String bereavementIndi) {
		this.bereavementIndi = bereavementIndi;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getCampaignCode() {
		return this.campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public BigDecimal getChannelOrgId() {
		return this.channelOrgId;
	}

	public void setChannelOrgId(BigDecimal channelOrgId) {
		this.channelOrgId = channelOrgId;
	}

	public String getChannelStaffCode() {
		return this.channelStaffCode;
	}

	public void setChannelStaffCode(String channelStaffCode) {
		this.channelStaffCode = channelStaffCode;
	}

	public BigDecimal getChannelType() {
		return this.channelType;
	}

	public void setChannelType(BigDecimal channelType) {
		this.channelType = channelType;
	}

	public String getCommMonthlyPayIndi() {
		return this.commMonthlyPayIndi;
	}

	public void setCommMonthlyPayIndi(String commMonthlyPayIndi) {
		this.commMonthlyPayIndi = commMonthlyPayIndi;
	}

	public BigDecimal getCommissionSacrificeRate() {
		return this.commissionSacrificeRate;
	}

	public void setCommissionSacrificeRate(BigDecimal commissionSacrificeRate) {
		this.commissionSacrificeRate = commissionSacrificeRate;
	}

	public String getCpfPolicy() {
		return this.cpfPolicy;
	}

	public void setCpfPolicy(String cpfPolicy) {
		this.cpfPolicy = cpfPolicy;
	}

	public String getDerivation() {
		return this.derivation;
	}

	public void setDerivation(String derivation) {
		this.derivation = derivation;
	}

	public String getDiscountType() {
		return this.discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public BigDecimal getEmsVersion() {
		return this.emsVersion;
	}

	public void setEmsVersion(BigDecimal emsVersion) {
		this.emsVersion = emsVersion;
	}

	public BigDecimal getEndCause() {
		return this.endCause;
	}

	public void setEndCause(BigDecimal endCause) {
		this.endCause = endCause;
	}

	public String getEndCauseDetail() {
		return this.endCauseDetail;
	}

	public void setEndCauseDetail(String endCauseDetail) {
		this.endCauseDetail = endCauseDetail;
	}

	public String getEntityFundIndi() {
		return this.entityFundIndi;
	}

	public void setEntityFundIndi(String entityFundIndi) {
		this.entityFundIndi = entityFundIndi;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getForeignPolIndi() {
		return this.foreignPolIndi;
	}

	public void setForeignPolIndi(String foreignPolIndi) {
		this.foreignPolIndi = foreignPolIndi;
	}

	public BigDecimal getFormerId() {
		return this.formerId;
	}

	public void setFormerId(BigDecimal formerId) {
		this.formerId = formerId;
	}

	public String getFutChildIndi() {
		return this.futChildIndi;
	}

	public void setFutChildIndi(String futChildIndi) {
		this.futChildIndi = futChildIndi;
	}

	public BigDecimal getGroupPolicyId() {
		return this.groupPolicyId;
	}

	public void setGroupPolicyId(BigDecimal groupPolicyId) {
		this.groupPolicyId = groupPolicyId;
	}

	public BigDecimal getHeadId() {
		return this.headId;
	}

	public void setHeadId(BigDecimal headId) {
		this.headId = headId;
	}

	public String getHolidayIndi() {
		return this.holidayIndi;
	}

	public void setHolidayIndi(String holidayIndi) {
		this.holidayIndi = holidayIndi;
	}

	public Date getInforcingDate() {
		return this.inforcingDate;
	}

	public void setInforcingDate(Date inforcingDate) {
		this.inforcingDate = inforcingDate;
	}

	public Date getInitialValiDate() {
		return this.initialValiDate;
	}

	public void setInitialValiDate(Date initialValiDate) {
		this.initialValiDate = initialValiDate;
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

	public String getIntroducerNo() {
		return this.introducerNo;
	}

	public void setIntroducerNo(String introducerNo) {
		this.introducerNo = introducerNo;
	}

	public Date getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public BigDecimal getLapseCause() {
		return this.lapseCause;
	}

	public void setLapseCause(BigDecimal lapseCause) {
		this.lapseCause = lapseCause;
	}

	public String getLegacyPrdInfo() {
		return this.legacyPrdInfo;
	}

	public void setLegacyPrdInfo(String legacyPrdInfo) {
		this.legacyPrdInfo = legacyPrdInfo;
	}

	public BigDecimal getLiabilityState() {
		return this.liabilityState;
	}

	public void setLiabilityState(BigDecimal liabilityState) {
		this.liabilityState = liabilityState;
	}

	public BigDecimal getLiabilityStateCause() {
		return this.liabilityStateCause;
	}

	public void setLiabilityStateCause(BigDecimal liabilityStateCause) {
		this.liabilityStateCause = liabilityStateCause;
	}

	public Date getLiabilityStateDate() {
		return this.liabilityStateDate;
	}

	public void setLiabilityStateDate(Date liabilityStateDate) {
		this.liabilityStateDate = liabilityStateDate;
	}

	public BigDecimal getMaxAnnualPrem() {
		return this.maxAnnualPrem;
	}

	public void setMaxAnnualPrem(BigDecimal maxAnnualPrem) {
		this.maxAnnualPrem = maxAnnualPrem;
	}

	public BigDecimal getMiscDebt() {
		return this.miscDebt;
	}

	public void setMiscDebt(BigDecimal miscDebt) {
		this.miscDebt = miscDebt;
	}

	public BigDecimal getMiscDebtPld() {
		return this.miscDebtPld;
	}

	public void setMiscDebtPld(BigDecimal miscDebtPld) {
		this.miscDebtPld = miscDebtPld;
	}

	public BigDecimal getMoneyId() {
		return this.moneyId;
	}

	public void setMoneyId(BigDecimal moneyId) {
		this.moneyId = moneyId;
	}

	public Date getNoLapseEndDate() {
		return this.noLapseEndDate;
	}

	public void setNoLapseEndDate(Date noLapseEndDate) {
		this.noLapseEndDate = noLapseEndDate;
	}

	public BigDecimal getNoLapsePeriod() {
		return this.noLapsePeriod;
	}

	public void setNoLapsePeriod(BigDecimal noLapsePeriod) {
		this.noLapsePeriod = noLapsePeriod;
	}

	public BigDecimal getOrganId() {
		return this.organId;
	}

	public void setOrganId(BigDecimal organId) {
		this.organId = organId;
	}

	public String getOutOfMarketIndi() {
		return this.outOfMarketIndi;
	}

	public void setOutOfMarketIndi(String outOfMarketIndi) {
		this.outOfMarketIndi = outOfMarketIndi;
	}

	public String getOverManage() {
		return this.overManage;
	}

	public void setOverManage(String overManage) {
		this.overManage = overManage;
	}

	public String getOverdueManage() {
		return this.overdueManage;
	}

	public void setOverdueManage(String overdueManage) {
		this.overdueManage = overdueManage;
	}

	public Date getPLapseDate() {
		return this.pLapseDate;
	}

	public void setPLapseDate(Date pLapseDate) {
		this.pLapseDate = pLapseDate;
	}

	public Date getPjLapseDate() {
		return this.pjLapseDate;
	}

	public void setPjLapseDate(Date pjLapseDate) {
		this.pjLapseDate = pjLapseDate;
	}

	public String getPolicyCode() {
		return this.policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public String getPolicySection() {
		return this.policySection;
	}

	public void setPolicySection(String policySection) {
		this.policySection = policySection;
	}

	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getPremCollectIndi() {
		return this.premCollectIndi;
	}

	public void setPremCollectIndi(String premCollectIndi) {
		this.premCollectIndi = premCollectIndi;
	}

	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRiProcessed() {
		return this.riProcessed;
	}

	public void setRiProcessed(String riProcessed) {
		this.riProcessed = riProcessed;
	}

	public String getRiskBackdatingIndi() {
		return this.riskBackdatingIndi;
	}

	public void setRiskBackdatingIndi(String riskBackdatingIndi) {
		this.riskBackdatingIndi = riskBackdatingIndi;
	}

	public String getServiTaxIndi() {
		return this.serviTaxIndi;
	}

	public void setServiTaxIndi(String serviTaxIndi) {
		this.serviTaxIndi = serviTaxIndi;
	}

	public BigDecimal getServiceAgent() {
		return this.serviceAgent;
	}

	public void setServiceAgent(BigDecimal serviceAgent) {
		this.serviceAgent = serviceAgent;
	}

	public String getSpouseChildIndi() {
		return this.spouseChildIndi;
	}

	public void setSpouseChildIndi(String spouseChildIndi) {
		this.spouseChildIndi = spouseChildIndi;
	}

	public String getStdBeneIndiDth() {
		return this.stdBeneIndiDth;
	}

	public void setStdBeneIndiDth(String stdBeneIndiDth) {
		this.stdBeneIndiDth = stdBeneIndiDth;
	}

	public String getStdBeneIndiLife() {
		return this.stdBeneIndiLife;
	}

	public void setStdBeneIndiLife(String stdBeneIndiLife) {
		this.stdBeneIndiLife = stdBeneIndiLife;
	}

	public Date getSubmissionDate() {
		return this.submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getSubmitChannel() {
		return this.submitChannel;
	}

	public void setSubmitChannel(String submitChannel) {
		this.submitChannel = submitChannel;
	}

	public String getSuspend() {
		return this.suspend;
	}

	public void setSuspend(String suspend) {
		this.suspend = suspend;
	}

	public BigDecimal getSuspendCause() {
		return this.suspendCause;
	}

	public void setSuspendCause(BigDecimal suspendCause) {
		this.suspendCause = suspendCause;
	}

	public BigDecimal getSuspendChgId() {
		return this.suspendChgId;
	}

	public void setSuspendChgId(BigDecimal suspendChgId) {
		this.suspendChgId = suspendChgId;
	}

	public String getTrustPolicyIndi() {
		return this.trustPolicyIndi;
	}

	public void setTrustPolicyIndi(String trustPolicyIndi) {
		this.trustPolicyIndi = trustPolicyIndi;
	}

	public String getUpdateEndDate() {
		return this.updateEndDate;
	}

	public void setUpdateEndDate(String updateEndDate) {
		this.updateEndDate = updateEndDate;
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

	public Date getValidateDate() {
		return this.validateDate;
	}

	public void setValidateDate(Date validateDate) {
		this.validateDate = validateDate;
	}

	public String getVestingIndi() {
		return this.vestingIndi;
	}

	public void setVestingIndi(String vestingIndi) {
		this.vestingIndi = vestingIndi;
	}

	public List<TBenefitInsured> getTBenefitInsureds() {
		return this.TBenefitInsureds;
	}

	public void setTBenefitInsureds(List<TBenefitInsured> TBenefitInsureds) {
		this.TBenefitInsureds = TBenefitInsureds;
	}

	public TBenefitInsured addTBenefitInsured(TBenefitInsured TBenefitInsured) {
		getTBenefitInsureds().add(TBenefitInsured);
		TBenefitInsured.setTContractMaster(this);

		return TBenefitInsured;
	}

	public TBenefitInsured removeTBenefitInsured(TBenefitInsured TBenefitInsured) {
		getTBenefitInsureds().remove(TBenefitInsured);
		TBenefitInsured.setTContractMaster(null);

		return TBenefitInsured;
	}

	public List<TContractProduct> getTContractProducts() {
		return this.TContractProducts;
	}

	public void setTContractProducts(List<TContractProduct> TContractProducts) {
		this.TContractProducts = TContractProducts;
	}

	public TContractProduct addTContractProduct(TContractProduct TContractProduct) {
		getTContractProducts().add(TContractProduct);
		TContractProduct.setTContractMaster(this);

		return TContractProduct;
	}

	public TContractProduct removeTContractProduct(TContractProduct TContractProduct) {
		getTContractProducts().remove(TContractProduct);
		TContractProduct.setTContractMaster(null);

		return TContractProduct;
	}

	public List<TInsuredList> getTInsuredLists() {
		return this.TInsuredLists;
	}

	public void setTInsuredLists(List<TInsuredList> TInsuredLists) {
		this.TInsuredLists = TInsuredLists;
	}

	public TInsuredList addTInsuredList(TInsuredList TInsuredList) {
		getTInsuredLists().add(TInsuredList);
		TInsuredList.setTContractMaster(this);

		return TInsuredList;
	}

	public TInsuredList removeTInsuredList(TInsuredList TInsuredList) {
		getTInsuredLists().remove(TInsuredList);
		TInsuredList.setTContractMaster(null);

		return TInsuredList;
	}

}