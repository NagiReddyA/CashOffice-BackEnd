package com.sais.cashoffice.CashOfficeTest.transaction.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class DenominationForm {

	private double depositNo;
	private String cashOffice;
	private LocalDate receiptDate;
	private String cashier;
	private Date depositDate;
	private BigDecimal amount;
	private double totalDenominationCash;
	private String denominationcode;
	private double totalReceiptedCash;
	private String cheque;
	private Date postalOrder;
	private String totalDeposit;
	private double CashOfficeId;
	private String denominationCode;
	private BigDecimal Amount;
	private int id;

	public DenominationForm() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(LocalDate receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getCashier() {
		return cashier;
	}

	public void setCashier(String cashier) {
		this.cashier = cashier;
	}

	public Date getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
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

	public String getTotalDeposit() {
		return totalDeposit;
	}

	public void setTotalDeposit(String totalDeposit) {
		this.totalDeposit = totalDeposit;
	}

	public double getCashOfficeId() {
		return CashOfficeId;
	}

	public void setCashOfficeId(double cashOfficeId) {
		CashOfficeId = cashOfficeId;
	}

	public BigDecimal getAmount() {
		return Amount;
	}

	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}

	public String getDenominationCode() {
		return denominationCode;
	}

	public void setDenominationCode(String denominationCode) {
		this.denominationCode = denominationCode;
	}

}
