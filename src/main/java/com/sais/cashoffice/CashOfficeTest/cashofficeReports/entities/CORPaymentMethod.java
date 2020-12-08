package com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="v_paymentmethod")
public class CORPaymentMethod {
	@Id
	@GeneratedValue
	Long id; 
	String pay_method_code, pay_method_desc, pay_start_date, pay_end_date, branch_name, cash_office_desc;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPay_method_code() {
		return pay_method_code;
	}
	public void setPay_method_code(String pay_method_code) {
		this.pay_method_code = pay_method_code;
	}
	public String getPay_method_desc() {
		return pay_method_desc;
	}
	public void setPay_method_desc(String pay_method_desc) {
		this.pay_method_desc = pay_method_desc;
	}
	public String getPay_start_date() {
		return pay_start_date;
	}
	public void setPay_start_date(String pay_start_date) {
		this.pay_start_date = pay_start_date;
	}
	public String getPay_end_date() {
		return pay_end_date;
	}
	public void setPay_end_date(String pay_end_date) {
		this.pay_end_date = pay_end_date;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getCash_office_desc() {
		return cash_office_desc;
	}
	public void setCash_office_desc(String cash_office_desc) {
		this.cash_office_desc = cash_office_desc;
	}

}
