package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the T_FILE_NAMING_FORMAT database table.
 * 
 */
@Entity
@Table(name="T_FILE_NAMING_FORMAT")
@NamedQuery(name="TFileNamingFormat.findAll", query="SELECT t FROM TFileNamingFormat t")
public class TFileNamingFormat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PP_FILE_NAME_FORMAT_ID")
	private Long ppFileNameFormatId;

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

	@Column(name="CONSTANT")
	private String constant;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="FILE_EXTENSION")
	private String fileExtension;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="PAYPOINT_ID")
	private long paypointId;

	@Column(name="PERIOD")
	private String period;

	@Column(name="STRIKE_DATE")
	private String strikeDate;

	@Column(name="TYPE")
	private String type;

	//bi-directional many-to-one association to TPpCrFileFormatHdr
	@ManyToOne
	@JoinColumn(name="PP_FILE_ID")
	private TPpCrFileFormatHdr ppCrFileFormatHdr;

	//bi-directional many-to-one association to TPpTemplate
	@ManyToOne
	@JoinColumn(name="PP_TEMPLATE_ID")
	private TPpTemplate ppTemplate;

	public TFileNamingFormat() {
	}

	public Long getPpFileNameFormatId() {
		return this.ppFileNameFormatId;
	}

	public void setPpFileNameFormatId(Long ppFileNameFormatId) {
		this.ppFileNameFormatId = ppFileNameFormatId;
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

	public String getConstant() {
		return this.constant;
	}

	public void setConstant(String constant) {
		this.constant = constant;
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

	public String getFileExtension() {
		return this.fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
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

	public void setPaypointId(long paypointId) {
		this.paypointId = paypointId;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getStrikeDate() {
		return this.strikeDate;
	}

	public void setStrikeDate(String strikeDate) {
		this.strikeDate = strikeDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public TPpCrFileFormatHdr getPpCrFileFormatHdr() {
		return this.ppCrFileFormatHdr;
	}

	public void setPpCrFileFormatHdr(TPpCrFileFormatHdr ppCrFileFormatHdr) {
		this.ppCrFileFormatHdr = ppCrFileFormatHdr;
	}

	public TPpTemplate getPpTemplate() {
		return this.ppTemplate;
	}

	public void setPpTemplate(TPpTemplate ppTemplate) {
		this.ppTemplate = ppTemplate;
	}

}