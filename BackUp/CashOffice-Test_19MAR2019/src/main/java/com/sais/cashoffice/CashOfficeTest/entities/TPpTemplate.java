package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the T_PP_TEMPLATE database table.
 * 
 */
@Entity
@Table(name = "T_PP_TEMPLATE")
@NamedQuery(name = "TPpTemplate.findAll", query = "SELECT t FROM TPpTemplate t")
public class TPpTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PP_TEMPLATE_ID")
	private Long ppTemplateId;

	@Column(name = "ATTRIBUTE1")
	private String attribute1;

	@Column(name = "ATTRIBUTE2")
	private String attribute2;

	@Column(name = "ATTRIBUTE3")
	private String attribute3;

	@Column(name = "ATTRIBUTE4")
	private String attribute4;

	@Column(name = "ATTRIBUTE5")
	private String attribute5;

	@Column(name = "ATTRIBUTE6")
	private String attribute6;

	@Column(name = "COMMENTS")
	private String comments;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "ENABLED")
	private String enabled;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name = "OTHER_PREM_ONLY_YN")
	private String otherPremOnlyYn;

	@Column(name = "PAYPOINT_ID")
	private Long paypointId;

	@Column(name = "PENSION_ONLY_YN")
	private String pensionOnlyYn;

	@Column(name = "PP_ATTRIBUTE_ID")
	private Long ppAttributeId;

	@Column(name = "PP_TEMPLATE_CODE")
	private String ppTemplateCode;

	@Column(name = "PP_TEMPLATE_PATH")
	private String ppTemplatePath;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TERMINATION_DATE")
	private Date terminationDate;

	// bi-directional many-to-one association to TFileNamingFormat
	@OneToMany(mappedBy = "ppTemplate")
	private List<TFileNamingFormat> fileNamingFormats;

	public TPpTemplate() {
	}

	public Long getPpTemplateId() {
		return this.ppTemplateId;
	}

	public void setPpTemplateId(Long ppTemplateId) {
		this.ppTemplateId = ppTemplateId;
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

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
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

	public String getOtherPremOnlyYn() {
		return this.otherPremOnlyYn;
	}

	public void setOtherPremOnlyYn(String otherPremOnlyYn) {
		this.otherPremOnlyYn = otherPremOnlyYn;
	}

	public Long getPaypointId() {
		return this.paypointId;
	}

	public void setPaypointId(Long paypointId) {
		this.paypointId = paypointId;
	}

	public String getPensionOnlyYn() {
		return this.pensionOnlyYn;
	}

	public void setPensionOnlyYn(String pensionOnlyYn) {
		this.pensionOnlyYn = pensionOnlyYn;
	}

	public long getPpAttributeId() {
		return this.ppAttributeId;
	}

	public void setPpAttributeId(long ppAttributeId) {
		this.ppAttributeId = ppAttributeId;
	}

	public String getPpTemplateCode() {
		return this.ppTemplateCode;
	}

	public void setPpTemplateCode(String ppTemplateCode) {
		this.ppTemplateCode = ppTemplateCode;
	}

	public String getPpTemplatePath() {
		return this.ppTemplatePath;
	}

	public void setPpTemplatePath(String ppTemplatePath) {
		this.ppTemplatePath = ppTemplatePath;
	}

	public Date getTerminationDate() {
		return this.terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public List<TFileNamingFormat> getFileNamingFormats() {
		return this.fileNamingFormats;
	}

	public void setFileNamingFormats(List<TFileNamingFormat> fileNamingFormats) {
		this.fileNamingFormats = fileNamingFormats;
	}	

}