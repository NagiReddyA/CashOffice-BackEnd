package com.sais.cashoffice.CashOfficeTest.master.model;

public class AppActivitiesForm {

	private String appActivityCode;
	private String appActivityDesc;
	private char enabled;
	private int appId;
	private String appCode;
//	private String appDesc;
	private int appActivityId;
	private String createdBy;
	
	public AppActivitiesForm() {
	}

	public AppActivitiesForm(String appActivityCode, String appActivityDesc, char enabled,int appId) {
		super();
		this.appActivityCode = appActivityCode;
		this.appActivityDesc = appActivityDesc;
		this.enabled = enabled;
		this.appId=appId;
	}

	public String getAppActivityCode() {
		return appActivityCode;
	}

	public void setAppActivityCode(String appActivityCode) {
		this.appActivityCode = appActivityCode;
	}

	public String getAppActivityDesc() {
		return appActivityDesc;
	}

	public void setAppActivityDesc(String appActivityDesc) {
		this.appActivityDesc = appActivityDesc;
	}

	public char isEnabled() {
		return enabled;
	}

	public void setEnabled(char enabled) {
		this.enabled = enabled;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int l) {
		this.appId = l;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

//	public String getAppDesc() {
//		return appDesc;
//	}
//
//	public void setAppDesc(String appDesc) {
//		this.appDesc = appDesc;
//	}

	public int getAppActivityId() {
		return appActivityId;
	}

	public void setAppActivityId(int appActivityId) {
		this.appActivityId = appActivityId;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}

}
