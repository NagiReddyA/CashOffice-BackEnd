package com.sais.cashoffice.CashOfficeTest.transaction.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class PrintBankReceiptForm {

	private double rcptTrnId;
	private double receiptNo;
	private Date receiptDate;
	private BigDecimal receiptAmount;
	private double payMethodId;
	private double cashOfficeId;
	private double cashierId;
	private char postingStatus;
	private String payMethodDesc;

	public double getRcptTrnId() {
		return rcptTrnId;
	}

	public void setRcptTrnId(double rcptTrnId) {
		this.rcptTrnId = rcptTrnId;
	}

	public double getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date obj) {
		this.receiptDate = obj;
	}

	public BigDecimal getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(BigDecimal receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public double getPayMethodId() {
		return payMethodId;
	}

	public void setPayMethodId(double payMethodId) {
		this.payMethodId = payMethodId;
	}

	public double getCashOfficeId() {
		return cashOfficeId;
	}

	public void setCashOfficeId(double cashOfficeId) {
		this.cashOfficeId = cashOfficeId;
	}

	public double getCashierId() {
		return cashierId;
	}

	public void setCashierId(double cashierId) {
		this.cashierId = cashierId;
	}

	public char getPostingStatus() {
		return postingStatus;
	}

	public void setPostingStatus(char postingStatus) {
		this.postingStatus = postingStatus;
	}

	public String getPayMethodDesc() {
		return payMethodDesc;
	}

	public void setPayMethodDesc(String payMethodDesc) {
		this.payMethodDesc = payMethodDesc;
	}

}
