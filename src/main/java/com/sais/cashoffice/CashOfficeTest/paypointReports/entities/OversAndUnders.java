package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="v_cashierassignment")
public class OversAndUnders {
	
	@Id
	@GeneratedValue
	private Long ID;
	private Date collection_period;
	private int paypoint_id;
	private String type_value;
	private String pay_point_name;
	private String payment_mode;
	private double debits;
	private double credits;
	private double difference_amt;
	private String reference_no;
	private String reference_name;
	private String policy_code;
	private double status;
	private String status_desc;
	private double payer_id;
	private String payer_name;
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public Date getCollection_period() {
		return collection_period;
	}
	public void setCollection_period(Date collection_period) {
		this.collection_period = collection_period;
	}
	public int getPaypoint_id() {
		return paypoint_id;
	}
	public void setPaypoint_id(int paypoint_id) {
		this.paypoint_id = paypoint_id;
	}
	public String getType_value() {
		return type_value;
	}
	public void setType_value(String type_value) {
		this.type_value = type_value;
	}
	public String getPay_point_name() {
		return pay_point_name;
	}
	public void setPay_point_name(String pay_point_name) {
		this.pay_point_name = pay_point_name;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	public double getDebits() {
		return debits;
	}
	public void setDebits(double debits) {
		this.debits = debits;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	public double getDifference_amt() {
		return difference_amt;
	}
	public void setDifference_amt(double difference_amt) {
		this.difference_amt = difference_amt;
	}
	public String getReference_no() {
		return reference_no;
	}
	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}
	public String getReference_name() {
		return reference_name;
	}
	public void setReference_name(String reference_name) {
		this.reference_name = reference_name;
	}
	public String getPolicy_code() {
		return policy_code;
	}
	public void setPolicy_code(String policy_code) {
		this.policy_code = policy_code;
	}
	public double getStatus() {
		return status;
	}
	public void setStatus(double status) {
		this.status = status;
	}
	public String getStatus_desc() {
		return status_desc;
	}
	public void setStatus_desc(String status_desc) {
		this.status_desc = status_desc;
	}
	public double getPayer_id() {
		return payer_id;
	}
	public void setPayer_id(double payer_id) {
		this.payer_id = payer_id;
	}
	public String getPayer_name() {
		return payer_name;
	}
	public void setPayer_name(String payer_name) {
		this.payer_name = payer_name;
	}

}
