package com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="v_cashierassignment")
//@IdClass(cashierAssignCompositeKey.class)
//@NamedStoredProcedureQuery(name = "ca", procedureName = "cashierAssign",
//parameters = {
//		@StoredProcedureParameter(name ="branch_code",mode = ParameterMode.IN, type = String.class), 
//		@StoredProcedureParameter(name ="cash_office_code",mode = ParameterMode.IN, type = String.class)
//	},
//
//resultClasses = { CashierAssignment.class })

public class CORCashierAssignment {
	@Id
	@GeneratedValue
	private Long id;
	private String branch_code;
	
	private String branch_name;
	
	private String cash_office_id;
	
	private String cash_office_code;
	 
	private String cash_office_desc;
	 
	private String co_pymt_mthd_id;
	 
	private String pay_method_id;
	 
	private String pay_method_code;
	 
	private String pay_method_desc;
	 
	private String pay_start_date;
	 
	private String pay_end_date;
	 
	private String co_app_id;
	 
	private String app_id;
	 
	private String app_code;
	 
	private String app_desc;
	 
	private String app_start_date;
	 
	private String app_end_date;
	 
	private String co_cashier_id;
	 
	private String cashier_id;
	 
	private String cashier_code;
	 
	private String cashier_name;
	 
	private String ca_start_date;
	 
	private String ca_End_Date;
	 
	private String senior_cashier_yn;

	
	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getCash_office_id() {
		return cash_office_id;
	}

	public void setCash_office_id(String cash_office_id) {
		this.cash_office_id = cash_office_id;
	}

	public String getCash_office_code() {
		return cash_office_code;
	}

	public void setCash_office_code(String cash_office_code) {
		this.cash_office_code = cash_office_code;
	}

	public String getCash_office_desc() {
		return cash_office_desc;
	}

	public void setCash_office_desc(String cash_office_desc) {
		this.cash_office_desc = cash_office_desc;
	}

	public String getCo_pymt_mthd_id() {
		return co_pymt_mthd_id;
	}

	public void setCo_pymt_mthd_id(String co_pymt_mthd_id) {
		this.co_pymt_mthd_id = co_pymt_mthd_id;
	}

	public String getPay_method_id() {
		return pay_method_id;
	}

	public void setPay_method_id(String pay_method_id) {
		this.pay_method_id = pay_method_id;
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

	public String getCo_app_id() {
		return co_app_id;
	}

	public void setCo_app_id(String co_app_id) {
		this.co_app_id = co_app_id;
	}

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public String getApp_code() {
		return app_code;
	}

	public void setApp_code(String app_code) {
		this.app_code = app_code;
	}

	public String getApp_desc() {
		return app_desc;
	}

	public void setApp_desc(String app_desc) {
		this.app_desc = app_desc;
	}

	public String getApp_start_date() {
		return app_start_date;
	}

	public void setApp_start_date(String app_start_date) {
		this.app_start_date = app_start_date;
	}

	public String getApp_end_date() {
		return app_end_date;
	}

	public void setApp_end_date(String app_end_date) {
		this.app_end_date = app_end_date;
	}

	public String getCo_cashier_id() {
		return co_cashier_id;
	}

	public void setCo_cashier_id(String co_cashier_id) {
		this.co_cashier_id = co_cashier_id;
	}

	public String getCashier_id() {
		return cashier_id;
	}

	public void setCashier_id(String cashier_id) {
		this.cashier_id = cashier_id;
	}

	public String getCashier_code() {
		return cashier_code;
	}

	public void setCashier_code(String cashier_code) {
		this.cashier_code = cashier_code;
	}

	public String getCashier_name() {
		return cashier_name;
	}

	public void setCashier_name(String cashier_name) {
		this.cashier_name = cashier_name;
	}

	public String getCa_start_date() {
		return ca_start_date;
	}

	public void setCa_start_date(String ca_start_date) {
		this.ca_start_date = ca_start_date;
	}

	public String getCa_End_Date() {
		return ca_End_Date;
	}

	public void setCa_End_Date(String ca_End_Date) {
		this.ca_End_Date = ca_End_Date;
	}

	public String getSenior_cashier_yn() {
		return senior_cashier_yn;
	}

	public void setSenior_cashier_yn(String senior_cashier_yn) {
		this.senior_cashier_yn = senior_cashier_yn;
	}
	@Override
	public String toString() {
		return "CashierAssignment [id=" + id + ", branch_code=" + branch_code + ", branch_name=" + branch_name
				+ ", cash_office_id=" + cash_office_id + ", cash_office_code=" + cash_office_code
				+ ", cash_office_desc=" + cash_office_desc + ", co_pymt_mthd_id=" + co_pymt_mthd_id + ", pay_method_id="
				+ pay_method_id + ", pay_method_code=" + pay_method_code + ", pay_method_desc=" + pay_method_desc
				+ ", pay_start_date=" + pay_start_date + ", pay_end_date=" + pay_end_date + ", co_app_id=" + co_app_id
				+ ", app_id=" + app_id + ", app_code=" + app_code + ", app_desc=" + app_desc + ", app_start_date="
				+ app_start_date + ", app_end_date=" + app_end_date + ", co_cashier_id=" + co_cashier_id
				+ ", cashier_id=" + cashier_id + ", cashier_code=" + cashier_code + ", cashier_name=" + cashier_name
				+ ", ca_start_date=" + ca_start_date + ", ca_End_Date=" + ca_End_Date + ", senior_cashier_yn="
				+ senior_cashier_yn + "]";
	}

}
