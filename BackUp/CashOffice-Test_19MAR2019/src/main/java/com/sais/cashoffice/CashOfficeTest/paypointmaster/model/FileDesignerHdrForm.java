package com.sais.cashoffice.CashOfficeTest.paypointmaster.model;

public class FileDesignerHdrForm {
	
	private long ppId;
	private String ppName;
	private String fileName;
	private String noOfCrHdrLines;
	private String currency;
	private long paypointFileId;
	
	public FileDesignerHdrForm() {
		
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
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getNoOfCrHdrLines() {
		return noOfCrHdrLines;
	}
	public void setNoOfCrHdrLines(String noOfCrHdrLines) {
		this.noOfCrHdrLines = noOfCrHdrLines;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public long getPaypointFileId() {
		return paypointFileId;
	}
	public void setPaypointFileId(long paypointFileId) {
		this.paypointFileId = paypointFileId;
	}
	public FileDesignerHdrForm(long ppId, String ppName, String fileName,long paypointFileId) {
		super();
		this.ppId = ppId;
		this.ppName = ppName;
		this.fileName = fileName;
		this.paypointFileId = paypointFileId;
	}
	
}
