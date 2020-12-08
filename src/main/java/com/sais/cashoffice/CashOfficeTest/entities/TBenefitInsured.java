package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_BENEFIT_INSURED database table.
 * 
 */
@Entity
@Table(name="T_BENEFIT_INSURED")
@NamedQuery(name="TBenefitInsured.findAll", query="SELECT t FROM TBenefitInsured t")
public class TBenefitInsured implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LIST_ID")
	private long listId;

	@Column(name="EMS_VERSION")
	private BigDecimal emsVersion;

	@Column(name="ENTRY_AGE")
	private BigDecimal entryAge;

	@Column(name="ENTRY_AGE_MONTH")
	private BigDecimal entryAgeMonth;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TIME")
	private Date insertTime;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TIMESTAMP")
	private Date insertTimestamp;

	@Column(name="INSERTED_BY")
	private BigDecimal insertedBy;

	@Column(name="JOB_CLASS")
	private BigDecimal jobClass;

	@Column(name="ORDER_ID")
	private BigDecimal orderId;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TIMESTAMP")
	private Date updateTimestamp;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	//bi-directional many-to-one association to TContractMaster
	@ManyToOne
	@JoinColumn(name="POLICY_ID")
	private TContractMaster TContractMaster;

	//bi-directional many-to-one association to TContractProduct
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	private TContractProduct TContractProduct;

	//bi-directional many-to-one association to TInsuredList
	@ManyToOne
	@JoinColumn(name="INSURED_ID")
	private TInsuredList TInsuredList;

	public TBenefitInsured() {
	}

	public long getListId() {
		return this.listId;
	}

	public void setListId(long listId) {
		this.listId = listId;
	}

	public BigDecimal getEmsVersion() {
		return this.emsVersion;
	}

	public void setEmsVersion(BigDecimal emsVersion) {
		this.emsVersion = emsVersion;
	}

	public BigDecimal getEntryAge() {
		return this.entryAge;
	}

	public void setEntryAge(BigDecimal entryAge) {
		this.entryAge = entryAge;
	}

	public BigDecimal getEntryAgeMonth() {
		return this.entryAgeMonth;
	}

	public void setEntryAgeMonth(BigDecimal entryAgeMonth) {
		this.entryAgeMonth = entryAgeMonth;
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

	public BigDecimal getJobClass() {
		return this.jobClass;
	}

	public void setJobClass(BigDecimal jobClass) {
		this.jobClass = jobClass;
	}

	public BigDecimal getOrderId() {
		return this.orderId;
	}

	public void setOrderId(BigDecimal orderId) {
		this.orderId = orderId;
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

	public TContractMaster getTContractMaster() {
		return this.TContractMaster;
	}

	public void setTContractMaster(TContractMaster TContractMaster) {
		this.TContractMaster = TContractMaster;
	}

	public TContractProduct getTContractProduct() {
		return this.TContractProduct;
	}

	public void setTContractProduct(TContractProduct TContractProduct) {
		this.TContractProduct = TContractProduct;
	}

	public TInsuredList getTInsuredList() {
		return this.TInsuredList;
	}

	public void setTInsuredList(TInsuredList TInsuredList) {
		this.TInsuredList = TInsuredList;
	}

}