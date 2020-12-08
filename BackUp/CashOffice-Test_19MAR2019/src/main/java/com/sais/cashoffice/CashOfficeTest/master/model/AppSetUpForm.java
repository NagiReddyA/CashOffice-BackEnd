package com.sais.cashoffice.CashOfficeTest.master.model;

import java.util.Date;

import org.springframework.stereotype.Component;


public class AppSetUpForm {
	
	private String applicationCode;	
	private String applicationDesc;
	private long appId;
	private Date startDate;
	private Date endDate;
	public AppSetUpForm() {
		
	}
	
	public AppSetUpForm(String applicationCode, String applicationDesc,int appId,Date startDate,Date endDate) {
		super();
		this.applicationCode = applicationCode;
		this.applicationDesc = applicationDesc;
		this.appId=appId;
		this.startDate=startDate;
		this.endDate=endDate;
	}
	
	public String getApplicationCode() {
		return applicationCode;
	}
	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}
	public String getApplicationDesc() {
		return applicationDesc;
	}
	public void setApplicationDesc(String applicationDesc) {
		this.applicationDesc = applicationDesc;
	}

	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
