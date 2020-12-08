package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_ppr_uc")
public class UnmatchedCredits {

	@Id
	private Long id ;
	
	private String emp_ref, 
	 emp_ref_name, 
	 paypnt_id, 
	 coll_trans_id, 
	 cr_amount, 
	 period, 
	 paypoint_name, 
	 pay_mode, 
	 tot_dbt_amt, 
	 tot_crd_amt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmp_ref() {
		return emp_ref;
	}

	public void setEmp_ref(String emp_ref) {
		this.emp_ref = emp_ref;
	}

	public String getEmp_ref_name() {
		return emp_ref_name;
	}

	public void setEmp_ref_name(String emp_ref_name) {
		this.emp_ref_name = emp_ref_name;
	}

	public String getPaypnt_id() {
		return paypnt_id;
	}

	public void setPaypnt_id(String paypnt_id) {
		this.paypnt_id = paypnt_id;
	}

	public String getColl_trans_id() {
		return coll_trans_id;
	}

	public void setColl_trans_id(String coll_trans_id) {
		this.coll_trans_id = coll_trans_id;
	}

	public String getCr_amount() {
		return cr_amount;
	}

	public void setCr_amount(String cr_amount) {
		this.cr_amount = cr_amount;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPaypoint_name() {
		return paypoint_name;
	}

	public void setPaypoint_name(String paypoint_name) {
		this.paypoint_name = paypoint_name;
	}

	public String getPay_mode() {
		return pay_mode;
	}

	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}

	public String getTot_dbt_amt() {
		return tot_dbt_amt;
	}

	public void setTot_dbt_amt(String tot_dbt_amt) {
		this.tot_dbt_amt = tot_dbt_amt;
	}

	public String getTot_crd_amt() {
		return tot_crd_amt;
	}

	public void setTot_crd_amt(String tot_crd_amt) {
		this.tot_crd_amt = tot_crd_amt;
	}

	@Override
	public String toString() {
		return "UnmatchedCredits [id=" + id + ", emp_ref=" + emp_ref + ", emp_ref_name=" + emp_ref_name + ", paypnt_id="
				+ paypnt_id + ", coll_trans_id=" + coll_trans_id + ", cr_amount=" + cr_amount + ", period=" + period
				+ ", paypoint_name=" + paypoint_name + ", pay_mode=" + pay_mode + ", tot_dbt_amt=" + tot_dbt_amt
				+ ", tot_crd_amt=" + tot_crd_amt + "]";
	}

}
