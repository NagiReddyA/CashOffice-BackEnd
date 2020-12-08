package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_CONTRACT_PRODUCT database table.
 * 
 */
@Entity
@Table(name="T_CONTRACT_PRODUCT")
@NamedQuery(name="TContractProduct.findAll", query="SELECT t FROM TContractProduct t")
public class TContractProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ITEM_ID")
	private long itemId;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_VALIDATE")
	private Date actualValidate;

	@Column(name="ADVANTAGE_INDI")
	private String advantageIndi;

	@Column(name="AGE_INCREASE_INDI")
	private String ageIncreaseIndi;

	private BigDecimal amount;

	@Column(name="ANNI_BALANCE")
	private BigDecimal anniBalance;

	@Temporal(TemporalType.DATE)
	@Column(name="APPLY_DATE")
	private Date applyDate;

	@Column(name="AUTO_PERMNT_LAPSE")
	private String autoPermntLapse;

	@Column(name="BEN_PERIOD_TYPE")
	private String benPeriodType;

	@Column(name="BENEFIT_LEVEL")
	private String benefitLevel;

	@Column(name="BENEFIT_PERIOD")
	private BigDecimal benefitPeriod;

	@Column(name="BONUS_SA")
	private BigDecimal bonusSa;

	@Column(name="CAR_REG_NO")
	private String carRegNo;

	@Temporal(TemporalType.DATE)
	@Column(name="CAR_REG_NO_START")
	private Date carRegNoStart;

	@Column(name="CASH_COST")
	private BigDecimal cashCost;

	@Column(name="CHARGE_PERIOD")
	private String chargePeriod;

	@Column(name="CHARGE_YEAR")
	private BigDecimal chargeYear;

	@Column(name="COOLING_OFF_OPTION")
	private BigDecimal coolingOffOption;

	@Column(name="COUNT_WAY")
	private String countWay;

	@Column(name="COVERAGE_PERIOD")
	private String coveragePeriod;

	@Column(name="COVERAGE_YEAR")
	private BigDecimal coverageYear;

	@Column(name="CPF_COST")
	private BigDecimal cpfCost;

	@Column(name="DECISION_ID")
	private BigDecimal decisionId;

	@Column(name="DEFER_PERIOD")
	private BigDecimal deferPeriod;

	private String derivation;

	@Column(name="DISCNT_PREM_AF")
	private BigDecimal discntPremAf;

	@Column(name="DISCNT_PREM_AN")
	private BigDecimal discntPremAn;

	@Column(name="DISCNT_PREM_BF")
	private BigDecimal discntPremBf;

	@Column(name="DISCNTED_PREM_AF")
	private BigDecimal discntedPremAf;

	@Column(name="DISCNTED_PREM_AN")
	private BigDecimal discntedPremAn;

	@Column(name="DISCNTED_PREM_BF")
	private BigDecimal discntedPremBf;

	@Column(name="EMS_VERSION")
	private BigDecimal emsVersion;

	@Column(name="END_CAUSE")
	private BigDecimal endCause;

	@Column(name="END_CAUSE_DETAIL")
	private String endCauseDetail;

	@Column(name="ENTITY_FUND")
	private String entityFund;

	@Column(name="EXCEPT_VALUE")
	private BigDecimal exceptValue;

	@Column(name="EXPENSE_AMOUNT")
	private BigDecimal expenseAmount;

	@Column(name="EXPIRY_CASH_VALUE")
	private BigDecimal expiryCashValue;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;

	@Column(name="EXPOSURE_RATE")
	private BigDecimal exposureRate;

	@Column(name="EXTRA_PREM_AF")
	private BigDecimal extraPremAf;

	@Column(name="EXTRA_PREM_AN")
	private BigDecimal extraPremAn;

	@Column(name="EXTRA_PREM_BF")
	private BigDecimal extraPremBf;

	@Column(name="FIX_INCREMENT")
	private String fixIncrement;

	@Column(name="GROSS_PREM_AF")
	private BigDecimal grossPremAf;

	@Column(name="GURNT_PERD_TYPE")
	private String gurntPerdType;

	@Column(name="GURNT_PERIOD")
	private BigDecimal gurntPeriod;

	@Temporal(TemporalType.DATE)
	@Column(name="GURNT_START_DATE")
	private Date gurntStartDate;

	@Column(name="ILP_CALC_SA")
	private BigDecimal ilpCalcSa;

	@Column(name="INDX_CALC_BASIS")
	private BigDecimal indxCalcBasis;

	@Column(name="INDX_INDI")
	private String indxIndi;

	@Column(name="INDX_SUSPEND_CAUSE")
	private BigDecimal indxSuspendCause;

	@Column(name="INDX_TYPE")
	private BigDecimal indxType;

	@Column(name="INITIAL_TYPE")
	private String initialType;

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

	@Column(name="INSUR_PREM_AF")
	private BigDecimal insurPremAf;

	@Column(name="INSUR_PREM_AN")
	private BigDecimal insurPremAn;

	@Column(name="INSURED_CATEGORY")
	private String insuredCategory;

	@Column(name="INVEST_HORIZON")
	private BigDecimal investHorizon;

	@Column(name="INVEST_SCHEME")
	private String investScheme;

	@Column(name="ISSUE_AGENT")
	private BigDecimal issueAgent;

	@Temporal(TemporalType.DATE)
	@Column(name="ISSUE_DATE")
	private Date issueDate;

	@Column(name="LAPSE_CAUSE")
	private BigDecimal lapseCause;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_STATEMENT_DATE")
	private Date lastStatementDate;

	@Column(name="LIABILITY_STATE")
	private BigDecimal liabilityState;

	@Column(name="LIABILITY_STATE_CAUSE")
	private BigDecimal liabilityStateCause;

	@Temporal(TemporalType.DATE)
	@Column(name="LIABILITY_STATE_DATE")
	private Date liabilityStateDate;

	@Column(name="LOAN_TYPE")
	private String loanType;

	@Column(name="MANU_SURR_VALUE")
	private String manuSurrValue;

	@Column(name="MANUAL_SA")
	private String manualSa;

	@Column(name="MASTER_ID")
	private BigDecimal masterId;

	@Column(name="MASTER_PRODUCT")
	private BigDecimal masterProduct;

	@Column(name="NEXT_AMOUNT")
	private BigDecimal nextAmount;

	@Column(name="NEXT_COUNT_WAY")
	private String nextCountWay;

	@Column(name="NEXT_DISCNT_PREM_AF")
	private BigDecimal nextDiscntPremAf;

	@Column(name="NEXT_DISCNT_PREM_AN")
	private BigDecimal nextDiscntPremAn;

	@Column(name="NEXT_DISCNT_PREM_BF")
	private BigDecimal nextDiscntPremBf;

	@Column(name="NEXT_DISCNTED_PREM_AF")
	private BigDecimal nextDiscntedPremAf;

	@Column(name="NEXT_DISCNTED_PREM_AN")
	private BigDecimal nextDiscntedPremAn;

	@Column(name="NEXT_DISCNTED_PREM_BF")
	private BigDecimal nextDiscntedPremBf;

	@Column(name="NEXT_EXTRA_PREM_AF")
	private BigDecimal nextExtraPremAf;

	@Column(name="NEXT_EXTRA_PREM_AN")
	private BigDecimal nextExtraPremAn;

	@Column(name="NEXT_EXTRA_PREM_BF")
	private BigDecimal nextExtraPremBf;

	@Column(name="NEXT_GROSS_PREM_AF")
	private BigDecimal nextGrossPremAf;

	@Column(name="NEXT_INSUR_PREM_AF")
	private BigDecimal nextInsurPremAf;

	@Column(name="NEXT_INSUR_PREM_AN")
	private BigDecimal nextInsurPremAn;

	@Column(name="NEXT_POLICY_FEE_AF")
	private BigDecimal nextPolicyFeeAf;

	@Column(name="NEXT_POLICY_FEE_AN")
	private BigDecimal nextPolicyFeeAn;

	@Column(name="NEXT_POLICY_FEE_BF")
	private BigDecimal nextPolicyFeeBf;

	@Column(name="NEXT_STD_PREM_AF")
	private BigDecimal nextStdPremAf;

	@Column(name="NEXT_STD_PREM_AN")
	private BigDecimal nextStdPremAn;

	@Column(name="NEXT_STD_PREM_BF")
	private BigDecimal nextStdPremBf;

	@Column(name="NEXT_TOTAL_PREM_AF")
	private BigDecimal nextTotalPremAf;

	@Column(name="NEXT_UNIT")
	private BigDecimal nextUnit;

	@Column(name="ORIGIN_BONUS_SA")
	private BigDecimal originBonusSa;

	@Column(name="ORIGIN_PRODUCT_ID")
	private BigDecimal originProductId;

	@Column(name="ORIGIN_SA")
	private BigDecimal originSa;

	@Temporal(TemporalType.DATE)
	@Column(name="P_LAPSE_DATE")
	private Date pLapseDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PAIDUP_DATE")
	private Date paidupDate;

	@Column(name="PAIDUP_OPTION")
	private String paidupOption;

	@Column(name="PAY_MODE")
	private BigDecimal payMode;

	@Column(name="PAY_NEXT")
	private BigDecimal payNext;

	@Temporal(TemporalType.DATE)
	@Column(name="PERMNT_LAPSE_NOTICE_DATE")
	private Date permntLapseNoticeDate;

	@Column(name="PHD_PERIOD")
	private BigDecimal phdPeriod;

	@Column(name="POLICY_FEE_AF")
	private BigDecimal policyFeeAf;

	@Column(name="POLICY_FEE_AN")
	private BigDecimal policyFeeAn;

	@Column(name="POLICY_FEE_BF")
	private BigDecimal policyFeeBf;

	@Column(name="POLICY_PREM_SOURCE")
	private String policyPremSource;

	@Column(name="POSTPONE_PERIOD")
	private BigDecimal postponePeriod;

	@Column(name="PRE_WAR_INDI")
	private String preWarIndi;

	@Temporal(TemporalType.DATE)
	@Column(name="PREM_CHANGE_TIME")
	private Date premChangeTime;

	@Column(name="PRODUCT_ID")
	private BigDecimal productId;

	@Column(name="REINS_RATE")
	private BigDecimal reinsRate;

	@Column(name="RENEW_DECISION")
	private String renewDecision;

	@Column(name="RENEWAL_TYPE")
	private String renewalType;

	@Column(name="RI_PROCESSED")
	private String riProcessed;

	@Column(name="RISK_CODE")
	private BigDecimal riskCode;

	@Temporal(TemporalType.DATE)
	@Column(name="RISK_COMMENCE_DATE")
	private Date riskCommenceDate;

	@Column(name="SA_FACTOR")
	private BigDecimal saFactor;

	@Temporal(TemporalType.DATE)
	@Column(name="SHORT_END_TIME")
	private Date shortEndTime;

	@Column(name="STD_PREM_AF")
	private BigDecimal stdPremAf;

	@Column(name="STD_PREM_AN")
	private BigDecimal stdPremAn;

	@Column(name="STD_PREM_BF")
	private BigDecimal stdPremBf;

	@Column(name="STRATEGY_CODE")
	private String strategyCode;

	@Temporal(TemporalType.DATE)
	@Column(name="SUBMISSION_DATE")
	private Date submissionDate;

	private String suspend;

	@Column(name="SUSPEND_CAUSE")
	private BigDecimal suspendCause;

	@Column(name="SUSPEND_CHG_ID")
	private BigDecimal suspendChgId;

	@Column(name="TARIFF_TYPE")
	private BigDecimal tariffType;

	@Column(name="TOTAL_PREM_AF")
	private BigDecimal totalPremAf;

	private BigDecimal unit;

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

	@Column(name="WAIT_PERIOD")
	private BigDecimal waitPeriod;

	@Column(name="WAIV_ANUL_BENEFIT")
	private BigDecimal waivAnulBenefit;

	@Column(name="WAIV_ANUL_PREM")
	private BigDecimal waivAnulPrem;

	@Column(name="WAIVED_SA")
	private BigDecimal waivedSa;

	private String waiver;

	@Column(name="WAIVER_CLAIM_TYPE")
	private BigDecimal waiverClaimType;

	@Temporal(TemporalType.DATE)
	@Column(name="WAIVER_END")
	private Date waiverEnd;

	@Temporal(TemporalType.DATE)
	@Column(name="WAIVER_START")
	private Date waiverStart;

	//bi-directional many-to-one association to TBenefitInsured
	@OneToMany(mappedBy="TContractProduct")
	private List<TBenefitInsured> TBenefitInsureds;

	//bi-directional many-to-one association to TContractMaster
	@ManyToOne
	@JoinColumn(name="POLICY_ID")
	private TContractMaster TContractMaster;

	public TContractProduct() {
	}

	public long getItemId() {
		return this.itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public Date getActualValidate() {
		return this.actualValidate;
	}

	public void setActualValidate(Date actualValidate) {
		this.actualValidate = actualValidate;
	}

	public String getAdvantageIndi() {
		return this.advantageIndi;
	}

	public void setAdvantageIndi(String advantageIndi) {
		this.advantageIndi = advantageIndi;
	}

	public String getAgeIncreaseIndi() {
		return this.ageIncreaseIndi;
	}

	public void setAgeIncreaseIndi(String ageIncreaseIndi) {
		this.ageIncreaseIndi = ageIncreaseIndi;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAnniBalance() {
		return this.anniBalance;
	}

	public void setAnniBalance(BigDecimal anniBalance) {
		this.anniBalance = anniBalance;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getAutoPermntLapse() {
		return this.autoPermntLapse;
	}

	public void setAutoPermntLapse(String autoPermntLapse) {
		this.autoPermntLapse = autoPermntLapse;
	}

	public String getBenPeriodType() {
		return this.benPeriodType;
	}

	public void setBenPeriodType(String benPeriodType) {
		this.benPeriodType = benPeriodType;
	}

	public String getBenefitLevel() {
		return this.benefitLevel;
	}

	public void setBenefitLevel(String benefitLevel) {
		this.benefitLevel = benefitLevel;
	}

	public BigDecimal getBenefitPeriod() {
		return this.benefitPeriod;
	}

	public void setBenefitPeriod(BigDecimal benefitPeriod) {
		this.benefitPeriod = benefitPeriod;
	}

	public BigDecimal getBonusSa() {
		return this.bonusSa;
	}

	public void setBonusSa(BigDecimal bonusSa) {
		this.bonusSa = bonusSa;
	}

	public String getCarRegNo() {
		return this.carRegNo;
	}

	public void setCarRegNo(String carRegNo) {
		this.carRegNo = carRegNo;
	}

	public Date getCarRegNoStart() {
		return this.carRegNoStart;
	}

	public void setCarRegNoStart(Date carRegNoStart) {
		this.carRegNoStart = carRegNoStart;
	}

	public BigDecimal getCashCost() {
		return this.cashCost;
	}

	public void setCashCost(BigDecimal cashCost) {
		this.cashCost = cashCost;
	}

	public String getChargePeriod() {
		return this.chargePeriod;
	}

	public void setChargePeriod(String chargePeriod) {
		this.chargePeriod = chargePeriod;
	}

	public BigDecimal getChargeYear() {
		return this.chargeYear;
	}

	public void setChargeYear(BigDecimal chargeYear) {
		this.chargeYear = chargeYear;
	}

	public BigDecimal getCoolingOffOption() {
		return this.coolingOffOption;
	}

	public void setCoolingOffOption(BigDecimal coolingOffOption) {
		this.coolingOffOption = coolingOffOption;
	}

	public String getCountWay() {
		return this.countWay;
	}

	public void setCountWay(String countWay) {
		this.countWay = countWay;
	}

	public String getCoveragePeriod() {
		return this.coveragePeriod;
	}

	public void setCoveragePeriod(String coveragePeriod) {
		this.coveragePeriod = coveragePeriod;
	}

	public BigDecimal getCoverageYear() {
		return this.coverageYear;
	}

	public void setCoverageYear(BigDecimal coverageYear) {
		this.coverageYear = coverageYear;
	}

	public BigDecimal getCpfCost() {
		return this.cpfCost;
	}

	public void setCpfCost(BigDecimal cpfCost) {
		this.cpfCost = cpfCost;
	}

	public BigDecimal getDecisionId() {
		return this.decisionId;
	}

	public void setDecisionId(BigDecimal decisionId) {
		this.decisionId = decisionId;
	}

	public BigDecimal getDeferPeriod() {
		return this.deferPeriod;
	}

	public void setDeferPeriod(BigDecimal deferPeriod) {
		this.deferPeriod = deferPeriod;
	}

	public String getDerivation() {
		return this.derivation;
	}

	public void setDerivation(String derivation) {
		this.derivation = derivation;
	}

	public BigDecimal getDiscntPremAf() {
		return this.discntPremAf;
	}

	public void setDiscntPremAf(BigDecimal discntPremAf) {
		this.discntPremAf = discntPremAf;
	}

	public BigDecimal getDiscntPremAn() {
		return this.discntPremAn;
	}

	public void setDiscntPremAn(BigDecimal discntPremAn) {
		this.discntPremAn = discntPremAn;
	}

	public BigDecimal getDiscntPremBf() {
		return this.discntPremBf;
	}

	public void setDiscntPremBf(BigDecimal discntPremBf) {
		this.discntPremBf = discntPremBf;
	}

	public BigDecimal getDiscntedPremAf() {
		return this.discntedPremAf;
	}

	public void setDiscntedPremAf(BigDecimal discntedPremAf) {
		this.discntedPremAf = discntedPremAf;
	}

	public BigDecimal getDiscntedPremAn() {
		return this.discntedPremAn;
	}

	public void setDiscntedPremAn(BigDecimal discntedPremAn) {
		this.discntedPremAn = discntedPremAn;
	}

	public BigDecimal getDiscntedPremBf() {
		return this.discntedPremBf;
	}

	public void setDiscntedPremBf(BigDecimal discntedPremBf) {
		this.discntedPremBf = discntedPremBf;
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

	public String getEntityFund() {
		return this.entityFund;
	}

	public void setEntityFund(String entityFund) {
		this.entityFund = entityFund;
	}

	public BigDecimal getExceptValue() {
		return this.exceptValue;
	}

	public void setExceptValue(BigDecimal exceptValue) {
		this.exceptValue = exceptValue;
	}

	public BigDecimal getExpenseAmount() {
		return this.expenseAmount;
	}

	public void setExpenseAmount(BigDecimal expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public BigDecimal getExpiryCashValue() {
		return this.expiryCashValue;
	}

	public void setExpiryCashValue(BigDecimal expiryCashValue) {
		this.expiryCashValue = expiryCashValue;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public BigDecimal getExposureRate() {
		return this.exposureRate;
	}

	public void setExposureRate(BigDecimal exposureRate) {
		this.exposureRate = exposureRate;
	}

	public BigDecimal getExtraPremAf() {
		return this.extraPremAf;
	}

	public void setExtraPremAf(BigDecimal extraPremAf) {
		this.extraPremAf = extraPremAf;
	}

	public BigDecimal getExtraPremAn() {
		return this.extraPremAn;
	}

	public void setExtraPremAn(BigDecimal extraPremAn) {
		this.extraPremAn = extraPremAn;
	}

	public BigDecimal getExtraPremBf() {
		return this.extraPremBf;
	}

	public void setExtraPremBf(BigDecimal extraPremBf) {
		this.extraPremBf = extraPremBf;
	}

	public String getFixIncrement() {
		return this.fixIncrement;
	}

	public void setFixIncrement(String fixIncrement) {
		this.fixIncrement = fixIncrement;
	}

	public BigDecimal getGrossPremAf() {
		return this.grossPremAf;
	}

	public void setGrossPremAf(BigDecimal grossPremAf) {
		this.grossPremAf = grossPremAf;
	}

	public String getGurntPerdType() {
		return this.gurntPerdType;
	}

	public void setGurntPerdType(String gurntPerdType) {
		this.gurntPerdType = gurntPerdType;
	}

	public BigDecimal getGurntPeriod() {
		return this.gurntPeriod;
	}

	public void setGurntPeriod(BigDecimal gurntPeriod) {
		this.gurntPeriod = gurntPeriod;
	}

	public Date getGurntStartDate() {
		return this.gurntStartDate;
	}

	public void setGurntStartDate(Date gurntStartDate) {
		this.gurntStartDate = gurntStartDate;
	}

	public BigDecimal getIlpCalcSa() {
		return this.ilpCalcSa;
	}

	public void setIlpCalcSa(BigDecimal ilpCalcSa) {
		this.ilpCalcSa = ilpCalcSa;
	}

	public BigDecimal getIndxCalcBasis() {
		return this.indxCalcBasis;
	}

	public void setIndxCalcBasis(BigDecimal indxCalcBasis) {
		this.indxCalcBasis = indxCalcBasis;
	}

	public String getIndxIndi() {
		return this.indxIndi;
	}

	public void setIndxIndi(String indxIndi) {
		this.indxIndi = indxIndi;
	}

	public BigDecimal getIndxSuspendCause() {
		return this.indxSuspendCause;
	}

	public void setIndxSuspendCause(BigDecimal indxSuspendCause) {
		this.indxSuspendCause = indxSuspendCause;
	}

	public BigDecimal getIndxType() {
		return this.indxType;
	}

	public void setIndxType(BigDecimal indxType) {
		this.indxType = indxType;
	}

	public String getInitialType() {
		return this.initialType;
	}

	public void setInitialType(String initialType) {
		this.initialType = initialType;
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

	public BigDecimal getInsurPremAf() {
		return this.insurPremAf;
	}

	public void setInsurPremAf(BigDecimal insurPremAf) {
		this.insurPremAf = insurPremAf;
	}

	public BigDecimal getInsurPremAn() {
		return this.insurPremAn;
	}

	public void setInsurPremAn(BigDecimal insurPremAn) {
		this.insurPremAn = insurPremAn;
	}

	public String getInsuredCategory() {
		return this.insuredCategory;
	}

	public void setInsuredCategory(String insuredCategory) {
		this.insuredCategory = insuredCategory;
	}

	public BigDecimal getInvestHorizon() {
		return this.investHorizon;
	}

	public void setInvestHorizon(BigDecimal investHorizon) {
		this.investHorizon = investHorizon;
	}

	public String getInvestScheme() {
		return this.investScheme;
	}

	public void setInvestScheme(String investScheme) {
		this.investScheme = investScheme;
	}

	public BigDecimal getIssueAgent() {
		return this.issueAgent;
	}

	public void setIssueAgent(BigDecimal issueAgent) {
		this.issueAgent = issueAgent;
	}

	public Date getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public BigDecimal getLapseCause() {
		return this.lapseCause;
	}

	public void setLapseCause(BigDecimal lapseCause) {
		this.lapseCause = lapseCause;
	}

	public Date getLastStatementDate() {
		return this.lastStatementDate;
	}

	public void setLastStatementDate(Date lastStatementDate) {
		this.lastStatementDate = lastStatementDate;
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

	public String getLoanType() {
		return this.loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getManuSurrValue() {
		return this.manuSurrValue;
	}

	public void setManuSurrValue(String manuSurrValue) {
		this.manuSurrValue = manuSurrValue;
	}

	public String getManualSa() {
		return this.manualSa;
	}

	public void setManualSa(String manualSa) {
		this.manualSa = manualSa;
	}

	public BigDecimal getMasterId() {
		return this.masterId;
	}

	public void setMasterId(BigDecimal masterId) {
		this.masterId = masterId;
	}

	public BigDecimal getMasterProduct() {
		return this.masterProduct;
	}

	public void setMasterProduct(BigDecimal masterProduct) {
		this.masterProduct = masterProduct;
	}

	public BigDecimal getNextAmount() {
		return this.nextAmount;
	}

	public void setNextAmount(BigDecimal nextAmount) {
		this.nextAmount = nextAmount;
	}

	public String getNextCountWay() {
		return this.nextCountWay;
	}

	public void setNextCountWay(String nextCountWay) {
		this.nextCountWay = nextCountWay;
	}

	public BigDecimal getNextDiscntPremAf() {
		return this.nextDiscntPremAf;
	}

	public void setNextDiscntPremAf(BigDecimal nextDiscntPremAf) {
		this.nextDiscntPremAf = nextDiscntPremAf;
	}

	public BigDecimal getNextDiscntPremAn() {
		return this.nextDiscntPremAn;
	}

	public void setNextDiscntPremAn(BigDecimal nextDiscntPremAn) {
		this.nextDiscntPremAn = nextDiscntPremAn;
	}

	public BigDecimal getNextDiscntPremBf() {
		return this.nextDiscntPremBf;
	}

	public void setNextDiscntPremBf(BigDecimal nextDiscntPremBf) {
		this.nextDiscntPremBf = nextDiscntPremBf;
	}

	public BigDecimal getNextDiscntedPremAf() {
		return this.nextDiscntedPremAf;
	}

	public void setNextDiscntedPremAf(BigDecimal nextDiscntedPremAf) {
		this.nextDiscntedPremAf = nextDiscntedPremAf;
	}

	public BigDecimal getNextDiscntedPremAn() {
		return this.nextDiscntedPremAn;
	}

	public void setNextDiscntedPremAn(BigDecimal nextDiscntedPremAn) {
		this.nextDiscntedPremAn = nextDiscntedPremAn;
	}

	public BigDecimal getNextDiscntedPremBf() {
		return this.nextDiscntedPremBf;
	}

	public void setNextDiscntedPremBf(BigDecimal nextDiscntedPremBf) {
		this.nextDiscntedPremBf = nextDiscntedPremBf;
	}

	public BigDecimal getNextExtraPremAf() {
		return this.nextExtraPremAf;
	}

	public void setNextExtraPremAf(BigDecimal nextExtraPremAf) {
		this.nextExtraPremAf = nextExtraPremAf;
	}

	public BigDecimal getNextExtraPremAn() {
		return this.nextExtraPremAn;
	}

	public void setNextExtraPremAn(BigDecimal nextExtraPremAn) {
		this.nextExtraPremAn = nextExtraPremAn;
	}

	public BigDecimal getNextExtraPremBf() {
		return this.nextExtraPremBf;
	}

	public void setNextExtraPremBf(BigDecimal nextExtraPremBf) {
		this.nextExtraPremBf = nextExtraPremBf;
	}

	public BigDecimal getNextGrossPremAf() {
		return this.nextGrossPremAf;
	}

	public void setNextGrossPremAf(BigDecimal nextGrossPremAf) {
		this.nextGrossPremAf = nextGrossPremAf;
	}

	public BigDecimal getNextInsurPremAf() {
		return this.nextInsurPremAf;
	}

	public void setNextInsurPremAf(BigDecimal nextInsurPremAf) {
		this.nextInsurPremAf = nextInsurPremAf;
	}

	public BigDecimal getNextInsurPremAn() {
		return this.nextInsurPremAn;
	}

	public void setNextInsurPremAn(BigDecimal nextInsurPremAn) {
		this.nextInsurPremAn = nextInsurPremAn;
	}

	public BigDecimal getNextPolicyFeeAf() {
		return this.nextPolicyFeeAf;
	}

	public void setNextPolicyFeeAf(BigDecimal nextPolicyFeeAf) {
		this.nextPolicyFeeAf = nextPolicyFeeAf;
	}

	public BigDecimal getNextPolicyFeeAn() {
		return this.nextPolicyFeeAn;
	}

	public void setNextPolicyFeeAn(BigDecimal nextPolicyFeeAn) {
		this.nextPolicyFeeAn = nextPolicyFeeAn;
	}

	public BigDecimal getNextPolicyFeeBf() {
		return this.nextPolicyFeeBf;
	}

	public void setNextPolicyFeeBf(BigDecimal nextPolicyFeeBf) {
		this.nextPolicyFeeBf = nextPolicyFeeBf;
	}

	public BigDecimal getNextStdPremAf() {
		return this.nextStdPremAf;
	}

	public void setNextStdPremAf(BigDecimal nextStdPremAf) {
		this.nextStdPremAf = nextStdPremAf;
	}

	public BigDecimal getNextStdPremAn() {
		return this.nextStdPremAn;
	}

	public void setNextStdPremAn(BigDecimal nextStdPremAn) {
		this.nextStdPremAn = nextStdPremAn;
	}

	public BigDecimal getNextStdPremBf() {
		return this.nextStdPremBf;
	}

	public void setNextStdPremBf(BigDecimal nextStdPremBf) {
		this.nextStdPremBf = nextStdPremBf;
	}

	public BigDecimal getNextTotalPremAf() {
		return this.nextTotalPremAf;
	}

	public void setNextTotalPremAf(BigDecimal nextTotalPremAf) {
		this.nextTotalPremAf = nextTotalPremAf;
	}

	public BigDecimal getNextUnit() {
		return this.nextUnit;
	}

	public void setNextUnit(BigDecimal nextUnit) {
		this.nextUnit = nextUnit;
	}

	public BigDecimal getOriginBonusSa() {
		return this.originBonusSa;
	}

	public void setOriginBonusSa(BigDecimal originBonusSa) {
		this.originBonusSa = originBonusSa;
	}

	public BigDecimal getOriginProductId() {
		return this.originProductId;
	}

	public void setOriginProductId(BigDecimal originProductId) {
		this.originProductId = originProductId;
	}

	public BigDecimal getOriginSa() {
		return this.originSa;
	}

	public void setOriginSa(BigDecimal originSa) {
		this.originSa = originSa;
	}

	public Date getPLapseDate() {
		return this.pLapseDate;
	}

	public void setPLapseDate(Date pLapseDate) {
		this.pLapseDate = pLapseDate;
	}

	public Date getPaidupDate() {
		return this.paidupDate;
	}

	public void setPaidupDate(Date paidupDate) {
		this.paidupDate = paidupDate;
	}

	public String getPaidupOption() {
		return this.paidupOption;
	}

	public void setPaidupOption(String paidupOption) {
		this.paidupOption = paidupOption;
	}

	public BigDecimal getPayMode() {
		return this.payMode;
	}

	public void setPayMode(BigDecimal payMode) {
		this.payMode = payMode;
	}

	public BigDecimal getPayNext() {
		return this.payNext;
	}

	public void setPayNext(BigDecimal payNext) {
		this.payNext = payNext;
	}

	public Date getPermntLapseNoticeDate() {
		return this.permntLapseNoticeDate;
	}

	public void setPermntLapseNoticeDate(Date permntLapseNoticeDate) {
		this.permntLapseNoticeDate = permntLapseNoticeDate;
	}

	public BigDecimal getPhdPeriod() {
		return this.phdPeriod;
	}

	public void setPhdPeriod(BigDecimal phdPeriod) {
		this.phdPeriod = phdPeriod;
	}

	public BigDecimal getPolicyFeeAf() {
		return this.policyFeeAf;
	}

	public void setPolicyFeeAf(BigDecimal policyFeeAf) {
		this.policyFeeAf = policyFeeAf;
	}

	public BigDecimal getPolicyFeeAn() {
		return this.policyFeeAn;
	}

	public void setPolicyFeeAn(BigDecimal policyFeeAn) {
		this.policyFeeAn = policyFeeAn;
	}

	public BigDecimal getPolicyFeeBf() {
		return this.policyFeeBf;
	}

	public void setPolicyFeeBf(BigDecimal policyFeeBf) {
		this.policyFeeBf = policyFeeBf;
	}

	public String getPolicyPremSource() {
		return this.policyPremSource;
	}

	public void setPolicyPremSource(String policyPremSource) {
		this.policyPremSource = policyPremSource;
	}

	public BigDecimal getPostponePeriod() {
		return this.postponePeriod;
	}

	public void setPostponePeriod(BigDecimal postponePeriod) {
		this.postponePeriod = postponePeriod;
	}

	public String getPreWarIndi() {
		return this.preWarIndi;
	}

	public void setPreWarIndi(String preWarIndi) {
		this.preWarIndi = preWarIndi;
	}

	public Date getPremChangeTime() {
		return this.premChangeTime;
	}

	public void setPremChangeTime(Date premChangeTime) {
		this.premChangeTime = premChangeTime;
	}

	public BigDecimal getProductId() {
		return this.productId;
	}

	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}

	public BigDecimal getReinsRate() {
		return this.reinsRate;
	}

	public void setReinsRate(BigDecimal reinsRate) {
		this.reinsRate = reinsRate;
	}

	public String getRenewDecision() {
		return this.renewDecision;
	}

	public void setRenewDecision(String renewDecision) {
		this.renewDecision = renewDecision;
	}

	public String getRenewalType() {
		return this.renewalType;
	}

	public void setRenewalType(String renewalType) {
		this.renewalType = renewalType;
	}

	public String getRiProcessed() {
		return this.riProcessed;
	}

	public void setRiProcessed(String riProcessed) {
		this.riProcessed = riProcessed;
	}

	public BigDecimal getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(BigDecimal riskCode) {
		this.riskCode = riskCode;
	}

	public Date getRiskCommenceDate() {
		return this.riskCommenceDate;
	}

	public void setRiskCommenceDate(Date riskCommenceDate) {
		this.riskCommenceDate = riskCommenceDate;
	}

	public BigDecimal getSaFactor() {
		return this.saFactor;
	}

	public void setSaFactor(BigDecimal saFactor) {
		this.saFactor = saFactor;
	}

	public Date getShortEndTime() {
		return this.shortEndTime;
	}

	public void setShortEndTime(Date shortEndTime) {
		this.shortEndTime = shortEndTime;
	}

	public BigDecimal getStdPremAf() {
		return this.stdPremAf;
	}

	public void setStdPremAf(BigDecimal stdPremAf) {
		this.stdPremAf = stdPremAf;
	}

	public BigDecimal getStdPremAn() {
		return this.stdPremAn;
	}

	public void setStdPremAn(BigDecimal stdPremAn) {
		this.stdPremAn = stdPremAn;
	}

	public BigDecimal getStdPremBf() {
		return this.stdPremBf;
	}

	public void setStdPremBf(BigDecimal stdPremBf) {
		this.stdPremBf = stdPremBf;
	}

	public String getStrategyCode() {
		return this.strategyCode;
	}

	public void setStrategyCode(String strategyCode) {
		this.strategyCode = strategyCode;
	}

	public Date getSubmissionDate() {
		return this.submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
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

	public BigDecimal getTariffType() {
		return this.tariffType;
	}

	public void setTariffType(BigDecimal tariffType) {
		this.tariffType = tariffType;
	}

	public BigDecimal getTotalPremAf() {
		return this.totalPremAf;
	}

	public void setTotalPremAf(BigDecimal totalPremAf) {
		this.totalPremAf = totalPremAf;
	}

	public BigDecimal getUnit() {
		return this.unit;
	}

	public void setUnit(BigDecimal unit) {
		this.unit = unit;
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

	public BigDecimal getWaitPeriod() {
		return this.waitPeriod;
	}

	public void setWaitPeriod(BigDecimal waitPeriod) {
		this.waitPeriod = waitPeriod;
	}

	public BigDecimal getWaivAnulBenefit() {
		return this.waivAnulBenefit;
	}

	public void setWaivAnulBenefit(BigDecimal waivAnulBenefit) {
		this.waivAnulBenefit = waivAnulBenefit;
	}

	public BigDecimal getWaivAnulPrem() {
		return this.waivAnulPrem;
	}

	public void setWaivAnulPrem(BigDecimal waivAnulPrem) {
		this.waivAnulPrem = waivAnulPrem;
	}

	public BigDecimal getWaivedSa() {
		return this.waivedSa;
	}

	public void setWaivedSa(BigDecimal waivedSa) {
		this.waivedSa = waivedSa;
	}

	public String getWaiver() {
		return this.waiver;
	}

	public void setWaiver(String waiver) {
		this.waiver = waiver;
	}

	public BigDecimal getWaiverClaimType() {
		return this.waiverClaimType;
	}

	public void setWaiverClaimType(BigDecimal waiverClaimType) {
		this.waiverClaimType = waiverClaimType;
	}

	public Date getWaiverEnd() {
		return this.waiverEnd;
	}

	public void setWaiverEnd(Date waiverEnd) {
		this.waiverEnd = waiverEnd;
	}

	public Date getWaiverStart() {
		return this.waiverStart;
	}

	public void setWaiverStart(Date waiverStart) {
		this.waiverStart = waiverStart;
	}

	public List<TBenefitInsured> getTBenefitInsureds() {
		return this.TBenefitInsureds;
	}

	public void setTBenefitInsureds(List<TBenefitInsured> TBenefitInsureds) {
		this.TBenefitInsureds = TBenefitInsureds;
	}

	public TBenefitInsured addTBenefitInsured(TBenefitInsured TBenefitInsured) {
		getTBenefitInsureds().add(TBenefitInsured);
		TBenefitInsured.setTContractProduct(this);

		return TBenefitInsured;
	}

	public TBenefitInsured removeTBenefitInsured(TBenefitInsured TBenefitInsured) {
		getTBenefitInsureds().remove(TBenefitInsured);
		TBenefitInsured.setTContractProduct(null);

		return TBenefitInsured;
	}

	public TContractMaster getTContractMaster() {
		return this.TContractMaster;
	}

	public void setTContractMaster(TContractMaster TContractMaster) {
		this.TContractMaster = TContractMaster;
	}

}