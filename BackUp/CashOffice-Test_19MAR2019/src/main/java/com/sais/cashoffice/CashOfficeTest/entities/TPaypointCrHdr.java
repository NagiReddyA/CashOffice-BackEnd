package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_PAYPOINT_CR_HDR database table.
 * 
 */
@Entity
@Table(name="T_PAYPOINT_CR_HDR")
@NamedQuery(name="TPaypointCrHdr.findAll", query="SELECT t FROM TPaypointCrHdr t")
public class TPaypointCrHdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PP_CR_HDR_ID")
	private long ppCrHdrId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ALLOCATION_PERIOD")
	private Date allocationPeriod;

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

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="PAYPOINT_ID")
	private long paypointId;

	@Column(name="RECEIPT_NO")
	private double receiptNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPLOAD_PERIOD")
	private Date uploadPeriod;

	//bi-directional many-to-one association to TPaypointCrLine
	@OneToMany(mappedBy="TPaypointCrHdr")
	private List<TPaypointCrLine> TPaypointCrLines;

	public TPaypointCrHdr() {
	}

	public long getPpCrHdrId() {
		return this.ppCrHdrId;
	}

	public void setPpCrHdrId(long ppCrHdrId) {
		this.ppCrHdrId = ppCrHdrId;
	}

	public Date getAllocationPeriod() {
		return this.allocationPeriod;
	}

	public void setAllocationPeriod(Date allocationPeriod) {
		this.allocationPeriod = allocationPeriod;
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

	public long getPaypointId() {
		return this.paypointId;
	}

	public void setPaypointId(Long paypointId) {
		this.paypointId = paypointId;
	}

	public double getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}

	public Date getUploadPeriod() {
		return this.uploadPeriod;
	}

	public void setUploadPeriod(Date uploadPeriod) {
		this.uploadPeriod = uploadPeriod;
	}

	public List<TPaypointCrLine> getTPaypointCrLines() {
		return this.TPaypointCrLines;
	}

	public void setTPaypointCrLines(List<TPaypointCrLine> TPaypointCrLines) {
		this.TPaypointCrLines = TPaypointCrLines;
	}

	public TPaypointCrLine addTPaypointCrLine(TPaypointCrLine TPaypointCrLine) {
		getTPaypointCrLines().add(TPaypointCrLine);
		TPaypointCrLine.setTPaypointCrHdr(this);

		return TPaypointCrLine;
	}

	public TPaypointCrLine removeTPaypointCrLine(TPaypointCrLine TPaypointCrLine) {
		getTPaypointCrLines().remove(TPaypointCrLine);
		TPaypointCrLine.setTPaypointCrHdr(null);

		return TPaypointCrLine;
	}

}