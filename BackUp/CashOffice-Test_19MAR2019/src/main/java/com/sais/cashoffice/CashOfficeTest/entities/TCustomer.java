package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_CUSTOMER database table.
 * 
 */
@Entity
@Table(name="T_CUSTOMER")
@NamedQuery(name="TCustomer.findAll", query="SELECT t FROM TCustomer t")
public class TCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private long customerId;

	@Column(name="ACCIDENT_STATUS")
	private String accidentStatus;

	@Column(name="ADDRESS_ID")
	private BigDecimal addressId;

	@Column(name="ALIAS_NAME")
	private String aliasName;

	@Column(name="ALIVE_STATUS")
	private BigDecimal aliveStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="BANKRUPTCY_ORDER_DATE")
	private Date bankruptcyOrderDate;

	@Column(name="BANKRUPTCY_ORDER_NO")
	private String bankruptcyOrderNo;

	@Column(name="BANKRUPTCY_STATUS")
	private String bankruptcyStatus;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Column(name="BIRTHDAY_VALID")
	private String birthdayValid;

	@Column(name="BLACKLIST_CAUSE")
	private BigDecimal blacklistCause;

	@Column(name="BLACKLIST_CODE")
	private String blacklistCode;

	private String bp;

	@Column(name="BUMI_INDI")
	private String bumiIndi;

	@Column(name="CERTI_CODE")
	private String certiCode;

	@Column(name="CERTI_TYPE")
	private BigDecimal certiType;

	@Column(name="CHILD_COUNT")
	private BigDecimal childCount;

	@Column(name="CLAIM_INDI")
	private String claimIndi;

	@Column(name="CONTACT_PREFERENCE")
	private String contactPreference;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

	@Column(name="CPF_ACCOUNT_NO")
	private String cpfAccountNo;

	@Column(name="CUST_GRADE")
	private String custGrade;

	@Column(name="DATA_LEVEL")
	private BigDecimal dataLevel;

	@Temporal(TemporalType.DATE)
	@Column(name="DEATH_TIME")
	private Date deathTime;

	@Temporal(TemporalType.DATE)
	@Column(name="DISCHARGE_DATE")
	private Date dischargeDate;

	@Column(name="DRIVING_LICENCE")
	private String drivingLicence;

	@Column(name="EASI_CASH_INDI")
	private String easiCashIndi;

	@Column(name="EDUCATION_ID")
	private String educationId;

	@Column(name="EM_VALUE")
	private BigDecimal emValue;

	private String email;

	@Column(name="EMAIL_2")
	private String email2;

	@Column(name="EMAIL1_USE_INDI")
	private String email1UseIndi;

	@Column(name="EMAIL2_USE_INDI")
	private String email2UseIndi;

	@Column(name="EMP_ID")
	private BigDecimal empId;

	private String employed;

	@Column(name="EMPLOYEE_NUMBER")
	private BigDecimal employeeNumber;

	private BigDecimal employer;

	private String fax;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="FOCUS_TYPE")
	private String focusType;

	private String gender;

	private BigDecimal height;

	@Column(name="HOME_TEL")
	private String homeTel;

	private String homeplace;

	@Column(name="HONOR_TITLE")
	private String honorTitle;

	private String householder;

	private BigDecimal income;

	@Column(name="INDUSTRY_ID")
	private BigDecimal industryId;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TIME")
	private Date insertTime;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TIMESTAMP")
	private Date insertTimestamp;

	@Column(name="INSERTED_BY")
	private BigDecimal insertedBy;

	@Column(name="INSURED_STATUS")
	private String insuredStatus;

	@Column(name="IS_ECONNECT_USER")
	private String isEconnectUser;

	@Column(name="JOB_1")
	private String job1;

	@Column(name="JOB_2")
	private String job2;

	@Column(name="JOB_CATE_ID")
	private BigDecimal jobCateId;

	@Column(name="JOB_CATE_ID_2")
	private BigDecimal jobCateId2;

	@Column(name="JOB_COM")
	private String jobCom;

	@Column(name="JOB_KIND")
	private BigDecimal jobKind;

	@Column(name="LANG_ID")
	private String langId;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="MARRIAGE_ID")
	private String marriageId;

	@Column(name="MEDI_CLAIM_INDI")
	private String mediClaimIndi;

	@Column(name="MERGED_ID")
	private BigDecimal mergedId;

	@Column(name="MID_NAME")
	private String midName;

	private String mobile;

	@Column(name="NATION_CODE")
	private String nationCode;

	private String nationality;

	@Column(name="OFFICE_TEL")
	private String officeTel;

	@Column(name="OFFICE_TEL_EXT")
	private String officeTelExt;

	@Column(name="OPERATOR_DEPT_ID")
	private BigDecimal operatorDeptId;

	@Column(name="OPERATOR_ID")
	private BigDecimal operatorId;

	@Column(name="ORI_CERTI_CODE")
	private String oriCertiCode;

	@Column(name="OTHER_INCOME_INDI")
	private String otherIncomeIndi;

	@Column(name="PR_INDI")
	private String prIndi;

	@Column(name="PREVIOUS_ID_NUMBER")
	private String previousIdNumber;

	@Column(name="PROOF_AGE")
	private String proofAge;

	@Column(name="RECORDER_ID")
	private BigDecimal recorderId;

	@Column(name="RELIGION_CODE")
	private String religionCode;

	private String retired;

	private String smoking;

	@Column(name="SPECIAL_TAG_1")
	private String specialTag1;

	@Column(name="SS_CODE")
	private String ssCode;

	private String status;

	private String suspend;

	@Column(name="SUSPEND_CHG_ID")
	private BigDecimal suspendChgId;

	private String title;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_STATUS_DATE")
	private Date updateStatusDate;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIMESTAMP")
	private Date updateTimestamp;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Column(name="UPDATER_ID")
	private BigDecimal updaterId;

	@Column(name="VIP_INDI")
	private String vipIndi;

	private BigDecimal weight;

	public TCustomer() {
	}

	public long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getAccidentStatus() {
		return this.accidentStatus;
	}

	public void setAccidentStatus(String accidentStatus) {
		this.accidentStatus = accidentStatus;
	}

	public BigDecimal getAddressId() {
		return this.addressId;
	}

	public void setAddressId(BigDecimal addressId) {
		this.addressId = addressId;
	}

	public String getAliasName() {
		return this.aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public BigDecimal getAliveStatus() {
		return this.aliveStatus;
	}

	public void setAliveStatus(BigDecimal aliveStatus) {
		this.aliveStatus = aliveStatus;
	}

	public Date getBankruptcyOrderDate() {
		return this.bankruptcyOrderDate;
	}

	public void setBankruptcyOrderDate(Date bankruptcyOrderDate) {
		this.bankruptcyOrderDate = bankruptcyOrderDate;
	}

	public String getBankruptcyOrderNo() {
		return this.bankruptcyOrderNo;
	}

	public void setBankruptcyOrderNo(String bankruptcyOrderNo) {
		this.bankruptcyOrderNo = bankruptcyOrderNo;
	}

	public String getBankruptcyStatus() {
		return this.bankruptcyStatus;
	}

	public void setBankruptcyStatus(String bankruptcyStatus) {
		this.bankruptcyStatus = bankruptcyStatus;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBirthdayValid() {
		return this.birthdayValid;
	}

	public void setBirthdayValid(String birthdayValid) {
		this.birthdayValid = birthdayValid;
	}

	public BigDecimal getBlacklistCause() {
		return this.blacklistCause;
	}

	public void setBlacklistCause(BigDecimal blacklistCause) {
		this.blacklistCause = blacklistCause;
	}

	public String getBlacklistCode() {
		return this.blacklistCode;
	}

	public void setBlacklistCode(String blacklistCode) {
		this.blacklistCode = blacklistCode;
	}

	public String getBp() {
		return this.bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public String getBumiIndi() {
		return this.bumiIndi;
	}

	public void setBumiIndi(String bumiIndi) {
		this.bumiIndi = bumiIndi;
	}

	public String getCertiCode() {
		return this.certiCode;
	}

	public void setCertiCode(String certiCode) {
		this.certiCode = certiCode;
	}

	public BigDecimal getCertiType() {
		return this.certiType;
	}

	public void setCertiType(BigDecimal certiType) {
		this.certiType = certiType;
	}

	public BigDecimal getChildCount() {
		return this.childCount;
	}

	public void setChildCount(BigDecimal childCount) {
		this.childCount = childCount;
	}

	public String getClaimIndi() {
		return this.claimIndi;
	}

	public void setClaimIndi(String claimIndi) {
		this.claimIndi = claimIndi;
	}

	public String getContactPreference() {
		return this.contactPreference;
	}

	public void setContactPreference(String contactPreference) {
		this.contactPreference = contactPreference;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCpfAccountNo() {
		return this.cpfAccountNo;
	}

	public void setCpfAccountNo(String cpfAccountNo) {
		this.cpfAccountNo = cpfAccountNo;
	}

	public String getCustGrade() {
		return this.custGrade;
	}

	public void setCustGrade(String custGrade) {
		this.custGrade = custGrade;
	}

	public BigDecimal getDataLevel() {
		return this.dataLevel;
	}

	public void setDataLevel(BigDecimal dataLevel) {
		this.dataLevel = dataLevel;
	}

	public Date getDeathTime() {
		return this.deathTime;
	}

	public void setDeathTime(Date deathTime) {
		this.deathTime = deathTime;
	}

	public Date getDischargeDate() {
		return this.dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public String getDrivingLicence() {
		return this.drivingLicence;
	}

	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}

	public String getEasiCashIndi() {
		return this.easiCashIndi;
	}

	public void setEasiCashIndi(String easiCashIndi) {
		this.easiCashIndi = easiCashIndi;
	}

	public String getEducationId() {
		return this.educationId;
	}

	public void setEducationId(String educationId) {
		this.educationId = educationId;
	}

	public BigDecimal getEmValue() {
		return this.emValue;
	}

	public void setEmValue(BigDecimal emValue) {
		this.emValue = emValue;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail2() {
		return this.email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEmail1UseIndi() {
		return this.email1UseIndi;
	}

	public void setEmail1UseIndi(String email1UseIndi) {
		this.email1UseIndi = email1UseIndi;
	}

	public String getEmail2UseIndi() {
		return this.email2UseIndi;
	}

	public void setEmail2UseIndi(String email2UseIndi) {
		this.email2UseIndi = email2UseIndi;
	}

	public BigDecimal getEmpId() {
		return this.empId;
	}

	public void setEmpId(BigDecimal empId) {
		this.empId = empId;
	}

	public String getEmployed() {
		return this.employed;
	}

	public void setEmployed(String employed) {
		this.employed = employed;
	}

	public BigDecimal getEmployeeNumber() {
		return this.employeeNumber;
	}

	public void setEmployeeNumber(BigDecimal employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public BigDecimal getEmployer() {
		return this.employer;
	}

	public void setEmployer(BigDecimal employer) {
		this.employer = employer;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFocusType() {
		return this.focusType;
	}

	public void setFocusType(String focusType) {
		this.focusType = focusType;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigDecimal getHeight() {
		return this.height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public String getHomeTel() {
		return this.homeTel;
	}

	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}

	public String getHomeplace() {
		return this.homeplace;
	}

	public void setHomeplace(String homeplace) {
		this.homeplace = homeplace;
	}

	public String getHonorTitle() {
		return this.honorTitle;
	}

	public void setHonorTitle(String honorTitle) {
		this.honorTitle = honorTitle;
	}

	public String getHouseholder() {
		return this.householder;
	}

	public void setHouseholder(String householder) {
		this.householder = householder;
	}

	public BigDecimal getIncome() {
		return this.income;
	}

	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	public BigDecimal getIndustryId() {
		return this.industryId;
	}

	public void setIndustryId(BigDecimal industryId) {
		this.industryId = industryId;
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

	public String getInsuredStatus() {
		return this.insuredStatus;
	}

	public void setInsuredStatus(String insuredStatus) {
		this.insuredStatus = insuredStatus;
	}

	public String getIsEconnectUser() {
		return this.isEconnectUser;
	}

	public void setIsEconnectUser(String isEconnectUser) {
		this.isEconnectUser = isEconnectUser;
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

	public BigDecimal getJobCateId2() {
		return this.jobCateId2;
	}

	public void setJobCateId2(BigDecimal jobCateId2) {
		this.jobCateId2 = jobCateId2;
	}

	public String getJobCom() {
		return this.jobCom;
	}

	public void setJobCom(String jobCom) {
		this.jobCom = jobCom;
	}

	public BigDecimal getJobKind() {
		return this.jobKind;
	}

	public void setJobKind(BigDecimal jobKind) {
		this.jobKind = jobKind;
	}

	public String getLangId() {
		return this.langId;
	}

	public void setLangId(String langId) {
		this.langId = langId;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMarriageId() {
		return this.marriageId;
	}

	public void setMarriageId(String marriageId) {
		this.marriageId = marriageId;
	}

	public String getMediClaimIndi() {
		return this.mediClaimIndi;
	}

	public void setMediClaimIndi(String mediClaimIndi) {
		this.mediClaimIndi = mediClaimIndi;
	}

	public BigDecimal getMergedId() {
		return this.mergedId;
	}

	public void setMergedId(BigDecimal mergedId) {
		this.mergedId = mergedId;
	}

	public String getMidName() {
		return this.midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNationCode() {
		return this.nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getOfficeTel() {
		return this.officeTel;
	}

	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}

	public String getOfficeTelExt() {
		return this.officeTelExt;
	}

	public void setOfficeTelExt(String officeTelExt) {
		this.officeTelExt = officeTelExt;
	}

	public BigDecimal getOperatorDeptId() {
		return this.operatorDeptId;
	}

	public void setOperatorDeptId(BigDecimal operatorDeptId) {
		this.operatorDeptId = operatorDeptId;
	}

	public BigDecimal getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(BigDecimal operatorId) {
		this.operatorId = operatorId;
	}

	public String getOriCertiCode() {
		return this.oriCertiCode;
	}

	public void setOriCertiCode(String oriCertiCode) {
		this.oriCertiCode = oriCertiCode;
	}

	public String getOtherIncomeIndi() {
		return this.otherIncomeIndi;
	}

	public void setOtherIncomeIndi(String otherIncomeIndi) {
		this.otherIncomeIndi = otherIncomeIndi;
	}

	public String getPrIndi() {
		return this.prIndi;
	}

	public void setPrIndi(String prIndi) {
		this.prIndi = prIndi;
	}

	public String getPreviousIdNumber() {
		return this.previousIdNumber;
	}

	public void setPreviousIdNumber(String previousIdNumber) {
		this.previousIdNumber = previousIdNumber;
	}

	public String getProofAge() {
		return this.proofAge;
	}

	public void setProofAge(String proofAge) {
		this.proofAge = proofAge;
	}

	public BigDecimal getRecorderId() {
		return this.recorderId;
	}

	public void setRecorderId(BigDecimal recorderId) {
		this.recorderId = recorderId;
	}

	public String getReligionCode() {
		return this.religionCode;
	}

	public void setReligionCode(String religionCode) {
		this.religionCode = religionCode;
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

	public String getSpecialTag1() {
		return this.specialTag1;
	}

	public void setSpecialTag1(String specialTag1) {
		this.specialTag1 = specialTag1;
	}

	public String getSsCode() {
		return this.ssCode;
	}

	public void setSsCode(String ssCode) {
		this.ssCode = ssCode;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSuspend() {
		return this.suspend;
	}

	public void setSuspend(String suspend) {
		this.suspend = suspend;
	}

	public BigDecimal getSuspendChgId() {
		return this.suspendChgId;
	}

	public void setSuspendChgId(BigDecimal suspendChgId) {
		this.suspendChgId = suspendChgId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUpdateStatusDate() {
		return this.updateStatusDate;
	}

	public void setUpdateStatusDate(Date updateStatusDate) {
		this.updateStatusDate = updateStatusDate;
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

	public BigDecimal getUpdaterId() {
		return this.updaterId;
	}

	public void setUpdaterId(BigDecimal updaterId) {
		this.updaterId = updaterId;
	}

	public String getVipIndi() {
		return this.vipIndi;
	}

	public void setVipIndi(String vipIndi) {
		this.vipIndi = vipIndi;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}