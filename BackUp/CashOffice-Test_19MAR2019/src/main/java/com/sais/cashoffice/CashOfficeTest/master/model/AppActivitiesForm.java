package com.sais.cashoffice.CashOfficeTest.master.model;

public class AppActivitiesForm {

	private String appActivityCode;
	private String appActivityDesc;
	private boolean enabled;
	private long appId;
	private String appCode;
	private String appDesc;
	private long appActivityId;
	
	public AppActivitiesForm() {
	}

	public AppActivitiesForm(String appActivityCode, String appActivityDesc, boolean enabled,int appId) {
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getAppDesc() {
		return appDesc;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public long getAppActivityId() {
		return appActivityId;
	}

	public void setAppActivityId(long appActivityId) {
		this.appActivityId = appActivityId;
	}

}
