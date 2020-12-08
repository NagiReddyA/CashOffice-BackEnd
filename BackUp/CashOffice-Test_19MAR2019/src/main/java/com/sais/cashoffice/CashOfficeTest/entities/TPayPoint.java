package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_PAY_POINT database table.
 * 
 */
@Entity
@Table(name="T_PAY_POINT")
@NamedQuery(name="TPayPoint.findAll", query="SELECT t FROM TPayPoint t")
public class TPayPoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PAY_POINT_ID")
	private long payPointId;

	@Column(name="ADDRESS_ID")
	private String addressId;

	@Column(name="CONTACT_NAME")
	private String contactName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CUT_OFF_DATE")
	private Date cutOffDate;

	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name="EMPLOYEE_CATEGORY_ID")
	private String employeeCategoryId;

	@Column(name="EMPLOYEE_NUM")
	private BigDecimal employeeNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EXTRACTION_MONTH")
	private Date extractionMonth;

	@Column(name="FAX_NUMBER")
	private String faxNumber;

	@Column(name="MOVEMENT_FILE_OR_NOT")
	private String movementFileOrNot;

	@Column(name="ORGANIZATION_ID")
	private BigDecimal organizationId;

	@Column(name="PAY_MODE_GROUP_ID")
	private int payModeGroupId;

	@Column(name="PAY_MODE_ID")
	private int payModeId;

	@Column(name="PAY_POINT_NAME")
	private String payPointName;

	@Column(name="PAY_POINT_STATUS_ID")
	private int payPointStatusId;

	@Column(name="PAY_POINT_TYPE_ID")
	private String payPointTypeId;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="RETIREMENT_OR_NOT")
	private String retirementOrNot;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TERMINATION_DATE")
	private Date terminationDate;

	@Column(name="TERMINATION_REASON")
	private String terminationReason;

	public TPayPoint() {
	}

	public long getPayPointId() {
		return this.payPointId;
	}

	public void setPayPointId(long payPointId) {
		this.payPointId = payPointId;
	}

	public String getAddressId() {
		return this.addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getCutOffDate() {
		return this.cutOffDate;
	}

	public void setCutOffDate(Date cutOffDate) {
		this.cutOffDate = cutOffDate;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmployeeCategoryId() {
		return this.employeeCategoryId;
	}

	public void setEmployeeCategoryId(String employeeCategoryId) {
		this.employeeCategoryId = employeeCategoryId;
	}

	public BigDecimal getEmployeeNum() {
		return this.employeeNum;
	}

	public void setEmployeeNum(BigDecimal employeeNum) {
		this.employeeNum = employeeNum;
	}

	public Date getExtractionMonth() {
		return this.extractionMonth;
	}

	public void setExtractionMonth(Date extractionMonth) {
		this.extractionMonth = extractionMonth;
	}

	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getMovementFileOrNot() {
		return this.movementFileOrNot;
	}

	public void setMovementFileOrNot(String movementFileOrNot) {
		this.movementFileOrNot = movementFileOrNot;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public int getPayModeGroupId() {
		return this.payModeGroupId;
	}

	public void setPayModeGroupId(int payModeGroupId) {
		this.payModeGroupId = payModeGroupId;
	}

	public int getPayModeId() {
		return this.payModeId;
	}

	public void setPayModeId(int payModeId) {
		this.payModeId = payModeId;
	}

	public String getPayPointName() {
		return this.payPointName;
	}

	public void setPayPointName(String payPointName) {
		this.payPointName = payPointName;
	}

	public int getPayPointStatusId() {
		return this.payPointStatusId;
	}

	public void setPayPointStatusId(int payPointStatusId) {
		this.payPointStatusId = payPointStatusId;
	}

	public String getPayPointTypeId() {
		return this.payPointTypeId;
	}

	public void setPayPointTypeId(String payPointTypeId) {
		this.payPointTypeId = payPointTypeId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRetirementOrNot() {
		return this.retirementOrNot;
	}

	public void setRetirementOrNot(String retirementOrNot) {
		this.retirementOrNot = retirementOrNot;
	}

	public Date getTerminationDate() {
		return this.terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public String getTerminationReason() {
		return this.terminationReason;
	}

	public void setTerminationReason(String terminationReason) {
		this.terminationReason = terminationReason;
	}

}

