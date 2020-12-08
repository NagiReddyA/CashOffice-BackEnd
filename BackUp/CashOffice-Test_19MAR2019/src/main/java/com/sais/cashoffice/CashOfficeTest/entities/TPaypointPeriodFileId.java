package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_PAYPOINT_PERIOD_FILE_ID database table.
 * 
 */
@Entity
@Table(name="T_PAYPOINT_PERIOD_FILE_ID")
@NamedQuery(name="TPaypointPeriodFileId.findAll", query="SELECT t FROM TPaypointPeriodFileId t")
public class TPaypointPeriodFileId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PP_PERIOD_FILE_ID")
	private double ppPeriodFileId;

	@Column(name="FILE_STATUS")
	private String fileStatus;

	@Column(name="FILE_TOTAL_AMOUNT")
	private double fileTotalAmount;

	@Column(name="FILE_TYPE")
	private String fileType;

	@Column(name="FILENAME")
	private String filename;

	@Column(name="MERGED")
	private String merged;

	@Column(name="NO_OF_AVAIL_RECORDS")
	private double noOfAvailRecords;

	@Column(name="PAYPOINT_ID")
	private BigDecimal paypointId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PERIOD")
	private Date period;

	@Column(name="SPLIT")
	private String split;

	@Column(name="SPLIT_MERGE_FILE_ID")
	private double splitMergeFileId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STRIKE_DAY")
	private Date strikeDay;

	public TPaypointPeriodFileId() {
	}

	public double getPpPeriodFileId() {
		return this.ppPeriodFileId;
	}

	public void setPpPeriodFileId(double ppPeriodFileId) {
		this.ppPeriodFileId = ppPeriodFileId;
	}

	public String getFileStatus() {
		return this.fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	public double getFileTotalAmount() {
		return this.fileTotalAmount;
	}

	public void setFileTotalAmount(double fileTotalAmount) {
		this.fileTotalAmount = fileTotalAmount;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMerged() {
		return this.merged;
	}

	public void setMerged(String merged) {
		this.merged = merged;
	}

	public double getNoOfAvailRecords() {
		return this.noOfAvailRecords;
	}

	public void setNoOfAvailRecords(double noOfAvailRecords) {
		this.noOfAvailRecords = noOfAvailRecords;
	}

	public BigDecimal getPaypointId() {
		return this.paypointId;
	}

	public void setPaypointId(BigDecimal paypointId) {
		this.paypointId = paypointId;
	}

	public Date getPeriod() {
		return this.period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public String getSplit() {
		return this.split;
	}

	public void setSplit(String split) {
		this.split = split;
	}

	public double getSplitMergeFileId() {
		return this.splitMergeFileId;
	}

	public void setSplitMergeFileId(double splitMergeFileId) {
		this.splitMergeFileId = splitMergeFileId;
	}

	public Date getStrikeDay() {
		return this.strikeDay;
	}

	public void setStrikeDay(Date strikeDay) {
		this.strikeDay = strikeDay;
	}

}