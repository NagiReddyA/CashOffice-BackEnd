package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_RCPT_ALLOCATION database table.
 * 
 */
@Entity
@Table(name="T_RCPT_ALLOCATION")
@NamedQuery(name="TRcptAllocation.findAll", query="SELECT t FROM TRcptAllocation t")
public class TRcptAllocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RCPT_ALL_ID")
	private double rcptAllId;

	@Column(name="ALLOCATED_AMOUNT")
	private BigDecimal allocatedAmount;

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

	@Column(name="COMMENTS")
	private String comments;

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

	@Column(name="REALLOCATION_STATUS")
	private String reallocationStatus;

	@Column(name="UNALLOCATED_AMOUNT")
	private BigDecimal unallocatedAmount;

	//bi-directional many-to-one association to TApplication
	@ManyToOne
	@JoinColumn(name="APP_ID")
	private TApplication TApplication;

	//bi-directional many-to-one association to TReceipt
	@ManyToOne
	@JoinColumn(name="RCPT_TRN_ID")
	private TReceipt TReceipt;

	//bi-directional many-to-one association to TRcptAllocationAcqLoan
	@OneToMany(mappedBy="TRcptAllocation")
	private List<TRcptAllocationAcqLoan> TRcptAllocationAcqLoans;

	//bi-directional many-to-one association to TRcptAllocationGrplife
	@OneToMany(mappedBy="TRcptAllocation")
	private List<TRcptAllocationGrplife> TRcptAllocationGrplifes;

	//bi-directional many-to-one association to TRcptAllocationSundry
	@OneToMany(mappedBy="TRcptAllocation")
	private List<TRcptAllocationSundry> TRcptAllocationSundries;

	//bi-directional many-to-one association to TRcptAllocationThitoPol
	@OneToMany(mappedBy="TRcptAllocation")
	private List<TRcptAllocationThitoPol> TRcptAllocationThitoPols;

	//bi-directional many-to-one association to TRcptAllocationThitoPp
	@OneToMany(mappedBy="TRcptAllocation")
	private List<TRcptAllocationThitoPp> TRcptAllocationThitoPps;

	//bi-directional many-to-one association to TRcptAllocationUpr
	@OneToMany(mappedBy="TRcptAllocation")
	private List<TRcptAllocationUpr> TRcptAllocationUprs;

	public TRcptAllocation() {
	}

	public double getRcptAllId() {
		return this.rcptAllId;
	}

	public void setRcptAllId(double rcptAllId) {
		this.rcptAllId = rcptAllId;
	}

	public BigDecimal getAllocatedAmount() {
		return this.allocatedAmount;
	}

	public void setAllocatedAmount(BigDecimal allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
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

	public String getReallocationStatus() {
		return this.reallocationStatus;
	}

	public void setReallocationStatus(String reallocationStatus) {
		this.reallocationStatus = reallocationStatus;
	}

	public BigDecimal getUnallocatedAmount() {
		return this.unallocatedAmount;
	}

	public void setUnallocatedAmount(BigDecimal unallocatedAmount) {
		this.unallocatedAmount = unallocatedAmount;
	}

	public TApplication getTApplication() {
		return this.TApplication;
	}

	public void setTApplication(TApplication TApplication) {
		this.TApplication = TApplication;
	}

	public TReceipt getTReceipt() {
		return this.TReceipt;
	}

	public void setTReceipt(TReceipt TReceipt) {
		this.TReceipt = TReceipt;
	}

	public List<TRcptAllocationAcqLoan> getTRcptAllocationAcqLoans() {
		return this.TRcptAllocationAcqLoans;
	}

	public void setTRcptAllocationAcqLoans(List<TRcptAllocationAcqLoan> TRcptAllocationAcqLoans) {
		this.TRcptAllocationAcqLoans = TRcptAllocationAcqLoans;
	}

	public TRcptAllocationAcqLoan addTRcptAllocationAcqLoan(TRcptAllocationAcqLoan TRcptAllocationAcqLoan) {
		getTRcptAllocationAcqLoans().add(TRcptAllocationAcqLoan);
		TRcptAllocationAcqLoan.setTRcptAllocation(this);

		return TRcptAllocationAcqLoan;
	}

	public TRcptAllocationAcqLoan removeTRcptAllocationAcqLoan(TRcptAllocationAcqLoan TRcptAllocationAcqLoan) {
		getTRcptAllocationAcqLoans().remove(TRcptAllocationAcqLoan);
		TRcptAllocationAcqLoan.setTRcptAllocation(null);

		return TRcptAllocationAcqLoan;
	}

	public List<TRcptAllocationGrplife> getTRcptAllocationGrplifes() {
		return this.TRcptAllocationGrplifes;
	}

	public void setTRcptAllocationGrplifes(List<TRcptAllocationGrplife> TRcptAllocationGrplifes) {
		this.TRcptAllocationGrplifes = TRcptAllocationGrplifes;
	}

	public TRcptAllocationGrplife addTRcptAllocationGrplife(TRcptAllocationGrplife TRcptAllocationGrplife) {
		getTRcptAllocationGrplifes().add(TRcptAllocationGrplife);
		TRcptAllocationGrplife.setTRcptAllocation(this);

		return TRcptAllocationGrplife;
	}

	public TRcptAllocationGrplife removeTRcptAllocationGrplife(TRcptAllocationGrplife TRcptAllocationGrplife) {
		getTRcptAllocationGrplifes().remove(TRcptAllocationGrplife);
		TRcptAllocationGrplife.setTRcptAllocation(null);

		return TRcptAllocationGrplife;
	}

	public List<TRcptAllocationSundry> getTRcptAllocationSundries() {
		return this.TRcptAllocationSundries;
	}

	public void setTRcptAllocationSundries(List<TRcptAllocationSundry> TRcptAllocationSundries) {
		this.TRcptAllocationSundries = TRcptAllocationSundries;
	}

	public TRcptAllocationSundry addTRcptAllocationSundry(TRcptAllocationSundry TRcptAllocationSundry) {
		getTRcptAllocationSundries().add(TRcptAllocationSundry);
		TRcptAllocationSundry.setTRcptAllocation(this);

		return TRcptAllocationSundry;
	}

	public TRcptAllocationSundry removeTRcptAllocationSundry(TRcptAllocationSundry TRcptAllocationSundry) {
		getTRcptAllocationSundries().remove(TRcptAllocationSundry);
		TRcptAllocationSundry.setTRcptAllocation(null);

		return TRcptAllocationSundry;
	}

	public List<TRcptAllocationThitoPol> getTRcptAllocationThitoPols() {
		return this.TRcptAllocationThitoPols;
	}

	public void setTRcptAllocationThitoPols(List<TRcptAllocationThitoPol> TRcptAllocationThitoPols) {
		this.TRcptAllocationThitoPols = TRcptAllocationThitoPols;
	}

	public TRcptAllocationThitoPol addTRcptAllocationThitoPol(TRcptAllocationThitoPol TRcptAllocationThitoPol) {
		getTRcptAllocationThitoPols().add(TRcptAllocationThitoPol);
		TRcptAllocationThitoPol.setTRcptAllocation(this);

		return TRcptAllocationThitoPol;
	}

	public TRcptAllocationThitoPol removeTRcptAllocationThitoPol(TRcptAllocationThitoPol TRcptAllocationThitoPol) {
		getTRcptAllocationThitoPols().remove(TRcptAllocationThitoPol);
		TRcptAllocationThitoPol.setTRcptAllocation(null);

		return TRcptAllocationThitoPol;
	}

	public List<TRcptAllocationThitoPp> getTRcptAllocationThitoPps() {
		return this.TRcptAllocationThitoPps;
	}

	public void setTRcptAllocationThitoPps(List<TRcptAllocationThitoPp> TRcptAllocationThitoPps) {
		this.TRcptAllocationThitoPps = TRcptAllocationThitoPps;
	}

	public TRcptAllocationThitoPp addTRcptAllocationThitoPp(TRcptAllocationThitoPp TRcptAllocationThitoPp) {
		getTRcptAllocationThitoPps().add(TRcptAllocationThitoPp);
		TRcptAllocationThitoPp.setTRcptAllocation(this);

		return TRcptAllocationThitoPp;
	}

	public TRcptAllocationThitoPp removeTRcptAllocationThitoPp(TRcptAllocationThitoPp TRcptAllocationThitoPp) {
		getTRcptAllocationThitoPps().remove(TRcptAllocationThitoPp);
		TRcptAllocationThitoPp.setTRcptAllocation(null);

		return TRcptAllocationThitoPp;
	}

	public List<TRcptAllocationUpr> getTRcptAllocationUprs() {
		return this.TRcptAllocationUprs;
	}

	public void setTRcptAllocationUprs(List<TRcptAllocationUpr> TRcptAllocationUprs) {
		this.TRcptAllocationUprs = TRcptAllocationUprs;
	}

	public TRcptAllocationUpr addTRcptAllocationUpr(TRcptAllocationUpr TRcptAllocationUpr) {
		getTRcptAllocationUprs().add(TRcptAllocationUpr);
		TRcptAllocationUpr.setTRcptAllocation(this);

		return TRcptAllocationUpr;
	}

	public TRcptAllocationUpr removeTRcptAllocationUpr(TRcptAllocationUpr TRcptAllocationUpr) {
		getTRcptAllocationUprs().remove(TRcptAllocationUpr);
		TRcptAllocationUpr.setTRcptAllocation(null);

		return TRcptAllocationUpr;
	}

}