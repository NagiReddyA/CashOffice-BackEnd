package com.sais.cashoffice.CashOfficeTest.paypointtransaction.model;

public class CreditFileUploadForm {

	private String paypointId;
	private String paypointName;
	private String period;
	private String creditFile;

	public String getPaypointId() {
		return paypointId;
	}

	public void setPaypointId(String paypointId) {
		this.paypointId = paypointId;
	}

	public String getPaypointName() {
		return paypointName;
	}

	public void setPaypointName(String paypointName) {
		this.paypointName = paypointName;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getCreditFile() {
		return creditFile;
	}

	public void setCreditFile(String creditFile) {
		this.creditFile = creditFile;
	}
}
