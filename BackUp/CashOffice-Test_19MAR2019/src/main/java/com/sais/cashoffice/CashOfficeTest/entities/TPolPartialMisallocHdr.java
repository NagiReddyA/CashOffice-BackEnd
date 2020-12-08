package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_POL_PARTIAL_MISALLOC_HDR database table.
 * 
 */
@Entity
@Table(name="T_POL_PARTIAL_MISALLOC_HDR")
@NamedQuery(name="TPolPartialMisallocHdr.findAll", query="SELECT t FROM TPolPartialMisallocHdr t")
public class TPolPartialMisallocHdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="POL_PAR_MISALLOC_HDR_ID")
	private double polParMisallocHdrId;

	@Column(name="ATTRIBUTE1")
	private String attribute1;

	@Column(name="ATTRIBUTE10")
	private String attribute10;

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

	@Column(name="ATTRIBUTE7")
	private String attribute7;

	@Column(name="ATTRIBUTE8")
	private String attribute8;

	@Column(name="ATTRIBUTE9")
	private String attribute9;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name="POSTED_BY")
	private String postedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="POSTING_DATETIME")
	private Date postingDatetime;

	@Column(name="POSTING_STATUS")
	private String postingStatus;

	@Column(name="TOTAL_ALLOCATED_AMT")
	private BigDecimal totalAllocatedAmt;

	@Column(name="TOTAL_REVERSAL_AMT")
	private BigDecimal totalReversalAmt;

	@Column(name="TRANSACTION_TYPE")
	private String transactionType;

	//bi-directional many-to-one association to TPolPartialMisallFromDet
	@OneToMany(mappedBy="TPolPartialMisallocHdr")
	private List<TPolPartialMisallFromDet> TPolPartialMisallFromDets;

	//bi-directional many-to-one association to TPolPartialMisallToDet
	@OneToMany(mappedBy="TPolPartialMisallocHdr")
	private List<TPolPartialMisallToDet> TPolPartialMisallToDets;

	public TPolPartialMisallocHdr() {
	}

	public double getPolParMisallocHdrId() {
		return this.polParMisallocHdrId;
	}

	public void setPolParMisallocHdrId(double polParMisallocHdrId) {
		this.polParMisallocHdrId = polParMisallocHdrId;
	}

	public String getAttribute1() {
		return this.attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute10() {
		return this.attribute10;
	}

	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
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

	public String getAttribute7() {
		return this.attribute7;
	}

	public void setAttribute7(String attribute7) {
		this.attribute7 = attribute7;
	}

	public String getAttribute8() {
		return this.attribute8;
	}

	public void setAttribute8(String attribute8) {
		this.attribute8 = attribute8;
	}

	public String getAttribute9() {
		return this.attribute9;
	}

	public void setAttribute9(String attribute9) {
		this.attribute9 = attribute9;
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

	public String getPostedBy() {
		return this.postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public Date getPostingDatetime() {
		return this.postingDatetime;
	}

	public void setPostingDatetime(Date postingDatetime) {
		this.postingDatetime = postingDatetime;
	}

	public String getPostingStatus() {
		return this.postingStatus;
	}

	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}

	public BigDecimal getTotalAllocatedAmt() {
		return this.totalAllocatedAmt;
	}

	public void setTotalAllocatedAmt(BigDecimal totalAllocatedAmt) {
		this.totalAllocatedAmt = totalAllocatedAmt;
	}

	public BigDecimal getTotalReversalAmt() {
		return this.totalReversalAmt;
	}

	public void setTotalReversalAmt(BigDecimal totalReversalAmt) {
		this.totalReversalAmt = totalReversalAmt;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public List<TPolPartialMisallFromDet> getTPolPartialMisallFromDets() {
		return this.TPolPartialMisallFromDets;
	}

	public void setTPolPartialMisallFromDets(List<TPolPartialMisallFromDet> TPolPartialMisallFromDets) {
		this.TPolPartialMisallFromDets = TPolPartialMisallFromDets;
	}

	public TPolPartialMisallFromDet addTPolPartialMisallFromDet(TPolPartialMisallFromDet TPolPartialMisallFromDet) {
		getTPolPartialMisallFromDets().add(TPolPartialMisallFromDet);
		TPolPartialMisallFromDet.setTPolPartialMisallocHdr(this);

		return TPolPartialMisallFromDet;
	}

	public TPolPartialMisallFromDet removeTPolPartialMisallFromDet(TPolPartialMisallFromDet TPolPartialMisallFromDet) {
		getTPolPartialMisallFromDets().remove(TPolPartialMisallFromDet);
		TPolPartialMisallFromDet.setTPolPartialMisallocHdr(null);

		return TPolPartialMisallFromDet;
	}

	public List<TPolPartialMisallToDet> getTPolPartialMisallToDets() {
		return this.TPolPartialMisallToDets;
	}

	public void setTPolPartialMisallToDets(List<TPolPartialMisallToDet> TPolPartialMisallToDets) {
		this.TPolPartialMisallToDets = TPolPartialMisallToDets;
	}

	public TPolPartialMisallToDet addTPolPartialMisallToDet(TPolPartialMisallToDet TPolPartialMisallToDet) {
		getTPolPartialMisallToDets().add(TPolPartialMisallToDet);
		TPolPartialMisallToDet.setTPolPartialMisallocHdr(this);

		return TPolPartialMisallToDet;
	}

	public TPolPartialMisallToDet removeTPolPartialMisallToDet(TPolPartialMisallToDet TPolPartialMisallToDet) {
		getTPolPartialMisallToDets().remove(TPolPartialMisallToDet);
		TPolPartialMisallToDet.setTPolPartialMisallocHdr(null);

		return TPolPartialMisallToDet;
	}

}