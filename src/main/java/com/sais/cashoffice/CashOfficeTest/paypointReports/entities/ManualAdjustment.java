package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_ppr_ma")
public class ManualAdjustment {

	@Id
	private Long id ;
	
	private String manual_adj_id,
	transaction_type,
	period,
	policy_code,
	policy_id,
	payername,
	payer,
	amount,
	comments,
	purpose,
	posting_status,
	bobi_ref_number,
	creation_date ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManual_adj_id() {
		return manual_adj_id;
	}

	public void setManual_adj_id(String manual_adj_id) {
		this.manual_adj_id = manual_adj_id;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPolicy_code() {
		return policy_code;
	}

	public void setPolicy_code(String policy_code) {
		this.policy_code = policy_code;
	}

	public String getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}

	public String getPayername() {
		return payername;
	}

	public void setPayername(String payername) {
		this.payername = payername;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getPosting_status() {
		return posting_status;
	}

	public void setPosting_status(String posting_status) {
		this.posting_status = posting_status;
	}

	public String getBobi_ref_number() {
		return bobi_ref_number;
	}

	public void setBobi_ref_number(String bobi_ref_number) {
		this.bobi_ref_number = bobi_ref_number;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	@Override
	public String toString() {
		return "ManualAdjustment [id=" + id + ", manual_adj_id=" + manual_adj_id + ", transaction_type="
				+ transaction_type + ", period=" + period + ", policy_code=" + policy_code + ", policy_id=" + policy_id
				+ ", payername=" + payername + ", payer=" + payer + ", amount=" + amount + ", comments=" + comments
				+ ", purpose=" + purpose + ", posting_status=" + posting_status + ", bobi_ref_number=" + bobi_ref_number
				+ ", creation_date=" + creation_date + "]" ;
	} 
			
}
