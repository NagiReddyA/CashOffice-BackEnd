package com.sais.cashoffice.CashOfficeTest.Tranasaction.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "T_CASH_TILL_ACTIVITY")
public class ActivityFormDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CASHIER_ACTIVITY_ID")
	private double CASHIER_ACTIVITY_ID;	
	
	@Column(name = "CASH_OFF_ACTIVITY_ID")
	private double CASH_OFF_ACTIVITY_ID;
	
	@Column(name = "CASH_OFFICE_ID")
	private double CASH_OFFICE_ID;
	
	
	@Column(name = "CASHIER_ID")
	private double CASHIER_ID;
	
	@Column(name = "BRANCH_CODE")
	private double BRANCH_CODE;
	
	/*@Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "TILL_ACTIVITY_DATE")
	private double TILL_ACTIVITY_DATE;*/
	
	@Column(name = "TILL_ACTIVITY_STATUS")
	private char TILL_ACTIVITY_STATUS;
	
	@Column(name = "AUTHORIZED")
	private double AUTHORIZED;
	
	/*@Temporal(TemporalType.TIMESTAMP)
	
	@Column(name = "CREATION_DATE")
	private double CREATION_DATE;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATETIME")
	private double MODIFIED_DATETIME;*/
	
	@Column(name = "CREATED_BY")
	private String CREATED_BY;
	
	
	
	@Column(name = "MODIFIED_BY")
	private String MODIFIED_BY;
	
	@Column(name = "COMMENTS")
	private String COMMENTS;
	
	@Column(name = "ATTRIBUTE1")
	private String ATTRIBUTE1;
	
	@Column(name = "ATTRIBUTE2")
	private String ATTRIBUTE2;
	
	@Column(name = "ATTRIBUTE3")
	private String ATTRIBUTE3;
	
	@Column(name = "ATTRIBUTE4")
	private String ATTRIBUTE4;
	
	@Column(name = "ATTRIBUTE5")
	private String ATTRIBUTE5;
	
	@Column(name = "ATTRIBUTE6")
	private String ATTRIBUTE6;

	
	public double getCASHIER_ACTIVITY_ID() {
		return CASHIER_ACTIVITY_ID;
	}

	public void setCASHIER_ACTIVITY_ID(double cASHIER_ACTIVITY_ID) {
		CASHIER_ACTIVITY_ID = cASHIER_ACTIVITY_ID;
	}

	public double getCASH_OFF_ACTIVITY_ID() {
		return CASH_OFF_ACTIVITY_ID;
	}

	public void setCASH_OFF_ACTIVITY_ID(double cASH_OFF_ACTIVITY_ID) {
		CASH_OFF_ACTIVITY_ID = cASH_OFF_ACTIVITY_ID;
	}

	public double getCASH_OFFICE_ID() {
		return CASH_OFFICE_ID;
	}

	public void setCASH_OFFICE_ID(double cASH_OFFICE_ID) {
		CASH_OFFICE_ID = cASH_OFFICE_ID;
	}

	public double getCASHIER_ID() {
		return CASHIER_ID;
	}

	public void setCASHIER_ID(double cASHIER_ID) {
		CASHIER_ID = cASHIER_ID;
	}

	public double getBRANCH_CODE() {
		return BRANCH_CODE;
	}

	public void setBRANCH_CODE(double bRANCH_CODE) {
		BRANCH_CODE = bRANCH_CODE;
	}


	

	public char getTILL_ACTIVITY_STATUS() {
		return TILL_ACTIVITY_STATUS;
	}

	public void setTILL_ACTIVITY_STATUS(char tILL_ACTIVITY_STATUS) {
		TILL_ACTIVITY_STATUS = tILL_ACTIVITY_STATUS;
	}

	public double getAUTHORIZED() {
		return AUTHORIZED;
	}

	public void setAUTHORIZED(double aUTHORIZED) {
		AUTHORIZED = aUTHORIZED;
	}

	
	

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	

	public String getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(String mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}

	public String getCOMMENTS() {
		return COMMENTS;
	}

	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}

	public String getATTRIBUTE1() {
		return ATTRIBUTE1;
	}

	public void setATTRIBUTE1(String aTTRIBUTE1) {
		ATTRIBUTE1 = aTTRIBUTE1;
	}

	public String getATTRIBUTE2() {
		return ATTRIBUTE2;
	}

	public void setATTRIBUTE2(String aTTRIBUTE2) {
		ATTRIBUTE2 = aTTRIBUTE2;
	}

	public String getATTRIBUTE3() {
		return ATTRIBUTE3;
	}

	public void setATTRIBUTE3(String aTTRIBUTE3) {
		ATTRIBUTE3 = aTTRIBUTE3;
	}

	public String getATTRIBUTE4() {
		return ATTRIBUTE4;
	}

	public void setATTRIBUTE4(String aTTRIBUTE4) {
		ATTRIBUTE4 = aTTRIBUTE4;
	}

	public String getATTRIBUTE5() {
		return ATTRIBUTE5;
	}

	public void setATTRIBUTE5(String aTTRIBUTE5) {
		ATTRIBUTE5 = aTTRIBUTE5;
	}

	public String getATTRIBUTE6() {
		return ATTRIBUTE6;
	}

	public void setATTRIBUTE6(String aTTRIBUTE6) {
		ATTRIBUTE6 = aTTRIBUTE6;
	}
	
	

	



}