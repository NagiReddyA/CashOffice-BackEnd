package com.sais.cashoffice.CashOfficeTest.paypointmaster.model;

public class FileNamingFormatForm {

	private Long paypointId;
	private String constant;
	private String period;
	private String strikeDate;
	private String fileExtension;

	public Long getPaypointId() {
		return paypointId;
	}

	public void setPaypointId(Long paypointId) {
		this.paypointId = paypointId;
	}

	public String getConstant() {
		return constant;
	}

	public void setConstant(String constant) {
		this.constant = constant;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getStrikeDate() {
		return strikeDate;
	}

	public void setStrikeDate(String strikeDate) {
		this.strikeDate = strikeDate;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

}
