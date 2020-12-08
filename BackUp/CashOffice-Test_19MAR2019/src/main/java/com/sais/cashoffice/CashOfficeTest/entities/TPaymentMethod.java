package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the T_PAYMENT_METHODS database table.
 * 
 */
@Entity
@Table(name = "T_PAYMENT_METHODS")
@NamedQuery(name = "TPaymentMethod.findAll", query = "SELECT t FROM TPaymentMethod t")
public class TPaymentMethod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PAY_METHOD_ID")
	private long payMethodId;

	@Column(name = "ATTRIBUTE1")
	private String attribute1;

	@Column(name = "ATTRIBUTE2")
	private String attribute2;

	@Column(name = "ATTRIBUTE3")
	private String attribute3;

	@Column(name = "ATTRIBUTE4")
	private String attribute4;

	@Column(name = "ATTRIBUTE5")
	private String attribute5;

	@Column(name = "ATTRIBUTE6")
	private String attribute6;

	@Column(name = "COMMENTS")
	private String comments;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "ENABLED")
	private String enabled;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name = "PAY_METHOD_CODE")
	private String payMethodCode;

	@Column(name = "PAY_METHOD_DESC")
	private String payMethodDesc;

	// bi-directional many-to-one association to TCashOffPymtMthd
	@OneToMany(mappedBy = "TPaymentMethod")
	private List<TCashOffPymtMthd> TCashOffPymtMthds;

	// bi-directional many-to-one association to TPaymentDetail
	@OneToMany(mappedBy = "TPaymentMethod")
	private List<TPaymentDetail> TPaymentDetails;

	// bi-directional many-to-one association to TReceipt
	@OneToMany(mappedBy = "TPaymentMethod")
	private List<TReceipt> TReceipts;

	public TPaymentMethod() {
	}

	public long getPayMethodId() {
		return this.payMethodId;
	}

	public void setPayMethodId(long payMethodId) {
		this.payMethodId = payMethodId;
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
		this.creationDate = new java.sql.Date(System.currentTimeMillis());
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
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
		this.modifiedDatetime = new Date();
	}

	public String getPayMethodCode() {
		return this.payMethodCode;
	}

	public void setPayMethodCode(String payMethodCode) {
		this.payMethodCode = payMethodCode;
	}

	public String getPayMethodDesc() {
		return this.payMethodDesc;
	}

	public void setPayMethodDesc(String payMethodDesc) {
		this.payMethodDesc = payMethodDesc;
	}

	public List<TCashOffPymtMthd> getTCashOffPymtMthds() {
		return this.TCashOffPymtMthds;
	}

	public void setTCashOffPymtMthds(List<TCashOffPymtMthd> TCashOffPymtMthds) {
		this.TCashOffPymtMthds = TCashOffPymtMthds;
	}

	public TCashOffPymtMthd addTCashOffPymtMthd(TCashOffPymtMthd TCashOffPymtMthd) {
		getTCashOffPymtMthds().add(TCashOffPymtMthd);
		TCashOffPymtMthd.setTPaymentMethod(this);

		return TCashOffPymtMthd;
	}

	public TCashOffPymtMthd removeTCashOffPymtMthd(TCashOffPymtMthd TCashOffPymtMthd) {
		getTCashOffPymtMthds().remove(TCashOffPymtMthd);
		TCashOffPymtMthd.setTPaymentMethod(null);

		return TCashOffPymtMthd;
	}

	public List<TPaymentDetail> getTPaymentDetails() {
		return this.TPaymentDetails;
	}

	public void setTPaymentDetails(List<TPaymentDetail> TPaymentDetails) {
		this.TPaymentDetails = TPaymentDetails;
	}

	public TPaymentDetail addTPaymentDetail(TPaymentDetail TPaymentDetail) {
		getTPaymentDetails().add(TPaymentDetail);
		TPaymentDetail.setTPaymentMethod(this);

		return TPaymentDetail;
	}

	public TPaymentDetail removeTPaymentDetail(TPaymentDetail TPaymentDetail) {
		getTPaymentDetails().remove(TPaymentDetail);
		TPaymentDetail.setTPaymentMethod(null);

		return TPaymentDetail;
	}

	public List<TReceipt> getTReceipts() {
		return this.TReceipts;
	}

	public void setTReceipts(List<TReceipt> TReceipts) {
		this.TReceipts = TReceipts;
	}

	public TReceipt addTReceipt(TReceipt TReceipt) {
		getTReceipts().add(TReceipt);
		TReceipt.setTPaymentMethod(this);

		return TReceipt;
	}

	public TReceipt removeTReceipt(TReceipt TReceipt) {
		getTReceipts().remove(TReceipt);
		TReceipt.setTPaymentMethod(null);

		return TReceipt;
	}

}