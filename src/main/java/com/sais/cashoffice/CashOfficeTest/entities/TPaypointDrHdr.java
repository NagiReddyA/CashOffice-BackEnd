package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_PAYPOINT_DR_HDR database table.
 * 
 */
@Entity
@Table(name="T_PAYPOINT_DR_HDR")
@NamedQuery(name="TPaypointDrHdr.findAll", query="SELECT t FROM TPaypointDrHdr t")
public class TPaypointDrHdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PP_DR_HDR_ID")
	private long ppDrHdrId;

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

	@Column(name="FILE_NAME")
	private String fileName;

	@Column(name="FILE_STATUS")
	private String fileStatus;

	@Column(name="FILE_TOTAL_AMOUNT")
	private BigDecimal fileTotalAmount;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="NO_OF_AVAILABLE_RECS")
	private double noOfAvailableRecs;

	@Column(name="PAYPOINT_ID")
	private long paypointId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PERIOD")
	private Date period;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STRIKE_DATE_FROM")
	private Date strikeDateFrom;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="STRIKE_DATE_TO")
	private Date strikeDateTo;

	//bi-directional many-to-one association to TPaypointDrLine
	@OneToMany(mappedBy="TPaypointDrHdr")
	private List<TPaypointDrLine> TPaypointDrLines;

	public TPaypointDrHdr() {
	}

	public long getPpDrHdrId() {
		return this.ppDrHdrId;
	}

	public void setPpDrHdrId(long ppDrHdrId) {
		this.ppDrHdrId = ppDrHdrId;
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

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileStatus() {
		return this.fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	public BigDecimal getFileTotalAmount() {
		return this.fileTotalAmount;
	}

	public void setFileTotalAmount(BigDecimal fileTotalAmount) {
		this.fileTotalAmount = fileTotalAmount;
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

	public double getNoOfAvailableRecs() {
		return this.noOfAvailableRecs;
	}

	public void setNoOfAvailableRecs(double noOfAvailableRecs) {
		this.noOfAvailableRecs = noOfAvailableRecs;
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
		TPaypointDrLine.setTPaypointDrHdr(this);

		return TPaypointDrLine;
	}

	public TPaypointDrLine removeTPaypointDrLine(TPaypointDrLine TPaypointDrLine) {
		getTPaypointDrLines().remove(TPaypointDrLine);
		TPaypointDrLine.setTPaypointDrHdr(null);

		return TPaypointDrLine;
	}

}