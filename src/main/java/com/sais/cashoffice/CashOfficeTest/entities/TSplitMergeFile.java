package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_SPLIT_MERGE_FILES database table.
 * 
 */
@Entity
@Table(name="T_SPLIT_MERGE_FILES")
@NamedQuery(name="TSplitMergeFile.findAll", query="SELECT t FROM TSplitMergeFile t")
public class TSplitMergeFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SPLIT_MERGE_ID")
	private long splitMergeId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="FILENAME")
	private String filename;

	@Column(name="MERGED")
	private String merged;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="NUMBER_OF_RECORDS")
	private double numberOfRecords;

	@Column(name="PAYPOINT_ID")
	private long paypointId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PERIOD")
	private Date period;

	@Column(name="SPLIT")
	private String split;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STRIKE_DATE_FROM")
	private Date strikeDateFrom;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STRIKE_DATE_TO")
	private Date strikeDateTo;

	//bi-directional many-to-one association to TPaypointDrLine
	@OneToMany(mappedBy="TSplitMergeFile")
	private List<TPaypointDrLine> TPaypointDrLines;

	public TSplitMergeFile() {
	}

	public long getSplitMergeId() {
		return this.splitMergeId;
	}

	public void setSplitMergeId(long splitMergeId) {
		this.splitMergeId = splitMergeId;
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

	public double getNumberOfRecords() {
		return this.numberOfRecords;
	}

	public void setNumberOfRecords(double numberOfRecords) {
		this.numberOfRecords = numberOfRecords;
	}

	public long getPaypointId() {
		return this.paypointId;
	}

	public void setPaypointId(long paypointId) {
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

	public Date getStrikeDateFrom() {
		return this.strikeDateFrom;
	}

	public void setStrikeDateFrom(Date strikeDateFrom) {
		this.strikeDateFrom = strikeDateFrom;
	}

	public Date getStrikeDateTo() {
		return this.strikeDateTo;
	}

	public void setStrikeDateTo(Date strikeDateTo) {
		this.strikeDateTo = strikeDateTo;
	}

	public List<TPaypointDrLine> getTPaypointDrLines() {
		return this.TPaypointDrLines;
	}

	public void setTPaypointDrLines(List<TPaypointDrLine> TPaypointDrLines) {
		this.TPaypointDrLines = TPaypointDrLines;
	}

	public TPaypointDrLine addTPaypointDrLine(TPaypointDrLine TPaypointDrLine) {
		getTPaypointDrLines().add(TPaypointDrLine);
		TPaypointDrLine.setTSplitMergeFile(this);

		return TPaypointDrLine;
	}

	public TPaypointDrLine removeTPaypointDrLine(TPaypointDrLine TPaypointDrLine) {
		getTPaypointDrLines().remove(TPaypointDrLine);
		TPaypointDrLine.setTSplitMergeFile(null);

		return TPaypointDrLine;
	}

}