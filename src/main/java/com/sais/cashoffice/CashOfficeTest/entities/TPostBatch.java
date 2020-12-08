package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the T_POST_BATCHES database table.
 * 
 */
//@Entity
//@Table(name="T_POST_BATCHES")
//@NamedQuery(name="TPostBatch.findAll", query="SELECT t FROM TPostBatch t")
//public class TPostBatch implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Column(name="AMOUNT")
//	private BigDecimal amount;
//
//	@Column(name="CURRENCYID")
//	private String currencyid;
//
//	@Column(name="DUE_DATE")
//	private String dueDate;
//
//	@Column(name="LISTID")
//	private String listid;
//
//	@Column(name="PAYERID")
//	private String payerid;
//
//	@Column(name="POLICYID")
//	private String policyid;
//
//	@Column(name="PURPOSE")
//	private String purpose;
//
//	@Column(name="RECEIPTID")
//	private String receiptid;
//
//	public TPostBatch() {
//	}
//
//	public BigDecimal getAmount() {
//		return this.amount;
//	}
//
//	public void setAmount(BigDecimal amount) {
//		this.amount = amount;
//	}
//
//	public String getCurrencyid() {
//		return this.currencyid;
//	}
//
//	public void setCurrencyid(String currencyid) {
//		this.currencyid = currencyid;
//	}
//
//	public String getDueDate() {
//		return this.dueDate;
//	}
//
//	public void setDueDate(String dueDate) {
//		this.dueDate = dueDate;
//	}
//
//	public String getListid() {
//		return this.listid;
//	}
//
//	public void setListid(String listid) {
//		this.listid = listid;
//	}
//
//	public String getPayerid() {
//		return this.payerid;
//	}
//
//	public void setPayerid(String payerid) {
//		this.payerid = payerid;
//	}
//
//	public String getPolicyid() {
//		return this.policyid;
//	}
//
//	public void setPolicyid(String policyid) {
//		this.policyid = policyid;
//	}
//
//	public String getPurpose() {
//		return this.purpose;
//	}
//
//	public void setPurpose(String purpose) {
//		this.purpose = purpose;
//	}
//
//	public String getReceiptid() {
//		return this.receiptid;
//	}
//
//	public void setReceiptid(String receiptid) {
//		this.receiptid = receiptid;
//	}
//
//}