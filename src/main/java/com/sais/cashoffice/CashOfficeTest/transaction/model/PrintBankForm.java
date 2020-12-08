package com.sais.cashoffice.CashOfficeTest.transaction.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class PrintBankForm {

	private double depositNo;
	private String cashOffice;
	private Date receiptDate;
	private String cashier;
	private LocalDate depositDate;
	private String denominationCode;
	private BigDecimal amount;
	private double totalDenominationCash;
	private String denominationcode;
	private BigDecimal Amt;
	private double totalReceiptedCash;
	private String cheque;
	private Date postalOrder;
	private Date totalDeposit;
	private double CashOfficeId;

	public PrintBankForm() {

	}

	public double getCashOfficeId() {
		return CashOfficeId;
	}

	public void setCashOfficeId(double cashOfficeId) {
		CashOfficeId = cashOfficeId;
	}

	public double getDepositNo() {
		return depositNo;
	}

	public void setDepositNo(double depositNo) {
		this.depositNo = depositNo;
	}

	public String getCashOffice() {
		return cashOffice;
	}

	public void setCashOffice(String cashOffice) {
		this.cashOffice = cashOffice;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getCashier() {
		return cashier;
	}

	public void setCashier(String cashier) {
		this.cashier = cashier;
	}

	public LocalDate getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(LocalDate date) {
		this.depositDate = date;
	}

	public String getDenominationCode() {
		return denominationCode;
	}

	public void setDenominationCode(String denominationCode) {
		this.denominationCode = denominationCode;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public double getTotalDenominationCash() {
		return totalDenominationCash;
	}

	public void setTotalDenominationCash(double totalDenominationCash) {
		this.totalDenominationCash = totalDenominationCash;
	}

	public String getDenominationcode() {
		return denominationcode;
	}

	public void setDenominationcode(String denominationcode) {
		this.denominationcode = denominationcode;
	}

	public BigDecimal getAmt() {
		return Amt;
	}

	public void setAmt(BigDecimal amt) {
		Amt = amt;
	}

	public double getTotalReceiptedCash() {
		return totalReceiptedCash;
	}

	public void setTotalReceiptedCash(double totalReceiptedCash) {
		this.totalReceiptedCash = totalReceiptedCash;
	}

	public String getCheque() {
		return cheque;
	}

	public void setCheque(String cheque) {
		this.cheque = cheque;
	}

	public Date getPostalOrder() {
		return postalOrder;
	}

	public void setPostalOrder(Date postalOrder) {
		this.postalOrder = postalOrder;
	}

	public Date getTotalDeposit() {
		return totalDeposit;
	}

	public void setTotalDeposit(Date totalDeposit) {
		this.totalDeposit = totalDeposit;
	}

}