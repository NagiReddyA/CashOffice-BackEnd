package com.sais.cashoffice.CashOfficeTest.paypointmaster.model;

public class AssignDbtFileTmpt {

	private long ppId;
	private String ppName;
	private long ppAttributeId;
	private String ppAttributeDesc;
	private String pensionOnly;
	private String selectTemplate;
	private String otherPremOnly;
	private String ppTemplateCode;
	private String ppTemplatePath;
	private String ffConstantValue;
	private String ffPeriod;
	private String ffStrikeday;
	private String ffFileExtension;

	public String getFfConstantValue() {
		return ffConstantValue;
	}

	public void setFfConstantValue(String ffConstantValue) {
		this.ffConstantValue = ffConstantValue;
	}

	public String getFfPeriod() {
		return ffPeriod;
	}

	public void setFfPeriod(String ffPeriod) {
		this.ffPeriod = ffPeriod;
	}

	public String getFfStrikeday() {
		return ffStrikeday;
	}

	public void setFfStrikeday(String ffStrikeday) {
		this.ffStrikeday = ffStrikeday;
	}

	public String getFfFileExtension() {
		return ffFileExtension;
	}

	public void setFfFileExtension(String ffFileExtension) {
		this.ffFileExtension = ffFileExtension;
	}

	public long getPpId() {
		return ppId;
	}

	public void setPpId(long ppId) {
		this.ppId = ppId;
	}

	public String getPpName() {
		return ppName;
	}

	public void setPpName(String ppName) {
		this.ppName = ppName;
	}

	public long getPpAttributeId() {
		return ppAttributeId;
	}

	public void setPpAttributeId(long ppAttributeId) {
		this.ppAttributeId = ppAttributeId;
	}

	public String getPpAttributeDesc() {
		return ppAttributeDesc;
	}

	public void setPpAttributeDesc(String ppAttributeDesc) {
		this.ppAttributeDesc = ppAttributeDesc;
	}

	public String getPensionOnly() {
		return pensionOnly;
	}

	public void setPensionOnly(String pensionOnly) {
		this.pensionOnly = pensionOnly;
	}

	public String getSelectTemplate() {
		return selectTemplate;
	}

	public void setSelectTemplate(String selectTemplate) {
		this.selectTemplate = selectTemplate;
	}	

	public String getPpTemplatePath() {
		return ppTemplatePath;
	}

	public void setPpTemplatePath(String ppTemplatePath) {
		this.ppTemplatePath = ppTemplatePath;
	}

	public String getPpTemplateCode() {
		return ppTemplateCode;
	}

	public void setPpTemplateCode(String ppTemplateCode) {
		this.ppTemplateCode = ppTemplateCode;
	}

	public String getOtherPremOnly() {
		return otherPremOnly;
	}

	public void setOtherPremOnly(String otherPremOnly) {
		this.otherPremOnly = otherPremOnly;
	}

	/*
	 * public File getSelectTemplate() { return selectTemplate; }
	 * 
	 * public void setSelectTemplate(File selectTemplate) { this.selectTemplate =
	 * selectTemplate; }
	 */
}
