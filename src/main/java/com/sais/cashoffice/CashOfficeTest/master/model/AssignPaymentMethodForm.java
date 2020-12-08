package com.sais.cashoffice.CashOfficeTest.master.model;

import java.util.Date;

public class AssignPaymentMethodForm {
	
	private long payMethodId;
	private String cashOfficeCode;
	private String pymtMethodCode;
	private String pymtMethodDesc;
	private Date startDate;
	private Date endDate;
	
	
	public long getPayMethodId() {
		return payMethodId;
	}
	public void setPayMethodId(long PayMethodId) {
		this.payMethodId = PayMethodId;
	}
	public String getCashOfficeCode() {
		return cashOfficeCode;
	}
	public void setCashOfficeCode(String cashOfficeCode) {
		this.cashOfficeCode = cashOfficeCode;
	}
	public String getPymtMethodCode() {
		return pymtMethodCode;
	}
	public void setPymtMethodCode(String pymtMethodCode) {
		this.pymtMethodCode = pymtMethodCode;
	}
	public String getPymtMethodDesc() {
		return pymtMethodDesc;
	}
	public void setPymtMethodDesc(String pymtMethodDesc) {
		this.pymtMethodDesc = pymtMethodDesc;
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
