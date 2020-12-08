package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_CANCEL_REASON database table.
 * 
 */
@Entity
@Table(name="T_CANCEL_REASON")
@NamedQuery(name="TCancelReason.findAll", query="SELECT t FROM TCancelReason t")
public class TCancelReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CANCEL_REASON_CODE")
	private String cancelReasonCode;

	@Column(name="CANCEL_REASON_DESC")
	private String cancelReasonDesc;

	@Column(name="CANCEL_REASON_ID")
	private double cancelReasonId;

	@Column(name="COMMENTS")
	private String comments;

	public TCancelReason() {
	}

	public String getCancelReasonCode() {
		return this.cancelReasonCode;
	}

	public void setCancelReasonCode(String cancelReasonCode) {
		this.cancelReasonCode = cancelReasonCode;
	}

	public String getCancelReasonDesc() {
		return this.cancelReasonDesc;
	}

	public void setCancelReasonDesc(String cancelReasonDesc) {
		this.cancelReasonDesc = cancelReasonDesc;
	}

	public double getCancelReasonId() {
		return this.cancelReasonId;
	}

	public void setCancelReasonId(double cancelReasonId) {
		this.cancelReasonId = cancelReasonId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}