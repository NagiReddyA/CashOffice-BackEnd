package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_POL_MISALLOCATION_HDR database table.
 * 
 */
@Entity
@Table(name="T_POL_MISALLOCATION_HDR")
@NamedQuery(name="TPolMisallocationHdr.findAll", query="SELECT t FROM TPolMisallocationHdr t")
public class TPolMisallocationHdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="POL_MISALLOCATION_ID")
	private double polMisallocationId;

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

	//bi-directional many-to-one association to TPolMisallFromDet
	@OneToMany(mappedBy="TPolMisallocationHdr")
	private List<TPolMisallFromDet> TPolMisallFromDets;

	//bi-directional many-to-one association to TPolMisallToDet
	@OneToMany(mappedBy="TPolMisallocationHdr")
	private List<TPolMisallToDet> TPolMisallToDets;

	public TPolMisallocationHdr() {
	}

	public double getPolMisallocationId() {
		return this.polMisallocationId;
	}

	public void setPolMisallocationId(double polMisallocationId) {
		this.polMisallocationId = polMisallocationId;
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

	public List<TPolMisallFromDet> getTPolMisallFromDets() {
		return this.TPolMisallFromDets;
	}

	public void setTPolMisallFromDets(List<TPolMisallFromDet> TPolMisallFromDets) {
		this.TPolMisallFromDets = TPolMisallFromDets;
	}

	public TPolMisallFromDet addTPolMisallFromDet(TPolMisallFromDet TPolMisallFromDet) {
		getTPolMisallFromDets().add(TPolMisallFromDet);
		TPolMisallFromDet.setTPolMisallocationHdr(this);

		return TPolMisallFromDet;
	}

	public TPolMisallFromDet removeTPolMisallFromDet(TPolMisallFromDet TPolMisallFromDet) {
		getTPolMisallFromDets().remove(TPolMisallFromDet);
		TPolMisallFromDet.setTPolMisallocationHdr(null);

		return TPolMisallFromDet;
	}

	public List<TPolMisallToDet> getTPolMisallToDets() {
		return this.TPolMisallToDets;
	}

	public void setTPolMisallToDets(List<TPolMisallToDet> TPolMisallToDets) {
		this.TPolMisallToDets = TPolMisallToDets;
	}

	public TPolMisallToDet addTPolMisallToDet(TPolMisallToDet TPolMisallToDet) {
		getTPolMisallToDets().add(TPolMisallToDet);
		TPolMisallToDet.setTPolMisallocationHdr(this);

		return TPolMisallToDet;
	}

	public TPolMisallToDet removeTPolMisallToDet(TPolMisallToDet TPolMisallToDet) {
		getTPolMisallToDets().remove(TPolMisallToDet);
		TPolMisallToDet.setTPolMisallocationHdr(null);

		return TPolMisallToDet;
	}

}