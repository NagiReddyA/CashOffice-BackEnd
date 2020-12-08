package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_BK_TRANSACTION_TYPES database table.
 * 
 */
@Entity
@Table(name="T_BK_TRANSACTION_TYPES")
@NamedQuery(name="TBkTransactionType.findAll", query="SELECT t FROM TBkTransactionType t")
public class TBkTransactionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BK_TRANSACTION_CODE")
	private String bkTransactionCode;

	@Column(name="ATTRIBUTE1")
	private String attribute1;

	@Column(name="ATTRIBUTE2")
	private String attribute2;

	@Column(name="ATTRIBUTE3")
	private String attribute3;

	@Column(name="ATTRIBUTE4")
	private String attribute4;

	@Column(name="ATTRIBUTE5")
	private String attribute5;

	@Column(name="ATTRIBUTE6")
	private String attribute6;

	@Column(name="BK_TRANSACTION_DESC")
	private String bkTransactionDesc;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="CREDIT_YN")
	private String creditYn;

	@Column(name="DEBIT_YN")
	private String debitYn;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	//bi-directional many-to-one association to TBkStmtDetDde
	@OneToMany(mappedBy="TBkTransactionType")
	private List<TBkStmtDetDde> TBkStmtDetDdes;

	//bi-directional many-to-one association to TBkStmtDetReversal
	@OneToMany(mappedBy="TBkTransactionType")
	private List<TBkStmtDetReversal> TBkStmtDetReversals;

	//bi-directional many-to-one association to TBkStmtDetSundry
	@OneToMany(mappedBy="TBkTransactionType")
	private List<TBkStmtDetSundry> TBkStmtDetSundries;

	//bi-directional many-to-one association to TBkStmtDetUnspecified
	@OneToMany(mappedBy="TBkTransactionType")
	private List<TBkStmtDetUnspecified> TBkStmtDetUnspecifieds;

	public TBkTransactionType() {
	}

	public String getBkTransactionCode() {
		return this.bkTransactionCode;
	}

	public void setBkTransactionCode(String bkTransactionCode) {
		this.bkTransactionCode = bkTransactionCode;
	}

	public String getAttribute1() {
		return this.attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return this.attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return this.attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return this.attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return this.attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	public String getAttribute6() {
		return this.attribute6;
	}

	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	public String getBkTransactionDesc() {
		return this.bkTransactionDesc;
	}

	public void setBkTransactionDesc(String bkTransactionDesc) {
		this.bkTransactionDesc = bkTransactionDesc;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreditYn() {
		return this.creditYn;
	}

	public void setCreditYn(String creditYn) {
		this.creditYn = creditYn;
	}

	public String getDebitYn() {
		return this.debitYn;
	}

	public void setDebitYn(String debitYn) {
		this.debitYn = debitYn;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDatetime() {
		return this.modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public List<TBkStmtDetDde> getTBkStmtDetDdes() {
		return this.TBkStmtDetDdes;
	}

	public void setTBkStmtDetDdes(List<TBkStmtDetDde> TBkStmtDetDdes) {
		this.TBkStmtDetDdes = TBkStmtDetDdes;
	}

	public TBkStmtDetDde addTBkStmtDetDde(TBkStmtDetDde TBkStmtDetDde) {
		getTBkStmtDetDdes().add(TBkStmtDetDde);
		TBkStmtDetDde.setTBkTransactionType(this);

		return TBkStmtDetDde;
	}

	public TBkStmtDetDde removeTBkStmtDetDde(TBkStmtDetDde TBkStmtDetDde) {
		getTBkStmtDetDdes().remove(TBkStmtDetDde);
		TBkStmtDetDde.setTBkTransactionType(null);

		return TBkStmtDetDde;
	}

	public List<TBkStmtDetReversal> getTBkStmtDetReversals() {
		return this.TBkStmtDetReversals;
	}

	public void setTBkStmtDetReversals(List<TBkStmtDetReversal> TBkStmtDetReversals) {
		this.TBkStmtDetReversals = TBkStmtDetReversals;
	}

	public TBkStmtDetReversal addTBkStmtDetReversal(TBkStmtDetReversal TBkStmtDetReversal) {
		getTBkStmtDetReversals().add(TBkStmtDetReversal);
		TBkStmtDetReversal.setTBkTransactionType(this);

		return TBkStmtDetReversal;
	}

	public TBkStmtDetReversal removeTBkStmtDetReversal(TBkStmtDetReversal TBkStmtDetReversal) {
		getTBkStmtDetReversals().remove(TBkStmtDetReversal);
		TBkStmtDetReversal.setTBkTransactionType(null);

		return TBkStmtDetReversal;
	}

	public List<TBkStmtDetSundry> getTBkStmtDetSundries() {
		return this.TBkStmtDetSundries;
	}

	public void setTBkStmtDetSundries(List<TBkStmtDetSundry> TBkStmtDetSundries) {
		this.TBkStmtDetSundries = TBkStmtDetSundries;
	}

	public TBkStmtDetSundry addTBkStmtDetSundry(TBkStmtDetSundry TBkStmtDetSundry) {
		getTBkStmtDetSundries().add(TBkStmtDetSundry);
		TBkStmtDetSundry.setTBkTransactionType(this);

		return TBkStmtDetSundry;
	}

	public TBkStmtDetSundry removeTBkStmtDetSundry(TBkStmtDetSundry TBkStmtDetSundry) {
		getTBkStmtDetSundries().remove(TBkStmtDetSundry);
		TBkStmtDetSundry.setTBkTransactionType(null);

		return TBkStmtDetSundry;
	}

	public List<TBkStmtDetUnspecified> getTBkStmtDetUnspecifieds() {
		return this.TBkStmtDetUnspecifieds;
	}

	public void setTBkStmtDetUnspecifieds(List<TBkStmtDetUnspecified> TBkStmtDetUnspecifieds) {
		this.TBkStmtDetUnspecifieds = TBkStmtDetUnspecifieds;
	}

	public TBkStmtDetUnspecified addTBkStmtDetUnspecified(TBkStmtDetUnspecified TBkStmtDetUnspecified) {
		getTBkStmtDetUnspecifieds().add(TBkStmtDetUnspecified);
		TBkStmtDetUnspecified.setTBkTransactionType(this);

		return TBkStmtDetUnspecified;
	}

	public TBkStmtDetUnspecified removeTBkStmtDetUnspecified(TBkStmtDetUnspecified TBkStmtDetUnspecified) {
		getTBkStmtDetUnspecifieds().remove(TBkStmtDetUnspecified);
		TBkStmtDetUnspecified.setTBkTransactionType(null);

		return TBkStmtDetUnspecified;
	}

}