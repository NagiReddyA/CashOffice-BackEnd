package com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vw_reprint_deposit")
public class CORReprintDeposit {

	@Id
	private Long id ;
	
	private String deposit_slip_id,	deposit_date, branch_code, branch_name,	
		denomination_code, receipt_date, deposited_amount, received_from, 
		reference_number, pay_method_id, bank_id, drawee, value_sequence, cash_or_cheq ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeposit_slip_id() {
		return deposit_slip_id;
	}

	public void setDeposit_slip_id(String deposit_slip_id) {
		this.deposit_slip_id = deposit_slip_id;
	}

	public String getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(String deposit_date) {
		this.deposit_date = deposit_date;
	}

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

	public String getDenomination_code() {
		return denomination_code;
	}

	public void setDenomination_code(String denomination_code) {
		this.denomination_code = denomination_code;
	}

	public String getReceipt_date() {
		return receipt_date;
	}

	public void setReceipt_date(String receipt_date) {
		this.receipt_date = receipt_date;
	}

	public String getDeposited_amount() {
		return deposited_amount;
	}

	public void setDeposited_amount(String deposited_amount) {
		this.deposited_amount = deposited_amount;
	}

	public String getReceived_from() {
		return received_from;
	}

	public void setReceived_from(String received_from) {
		this.received_from = received_from;
	}

	public String getReference_number() {
		return reference_number;
	}

	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}

	public String getPay_method_id() {
		return pay_method_id;
	}

	public void setPay_method_id(String pay_method_id) {
		this.pay_method_id = pay_method_id;
	}

	public String getBank_id() {
		return bank_id;
	}

	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}

	public String getDrawee() {
		return drawee;
	}

	public void setDrawee(String drawee) {
		this.drawee = drawee;
	}

	public String getValue_sequence() {
		return value_sequence;
	}

	public void setValue_sequence(String value_sequence) {
		this.value_sequence = value_sequence;
	}

	public String getCash_or_cheq() {
		return cash_or_cheq;
	}

	public void setCash_or_cheq(String cash_or_cheq) {
		this.cash_or_cheq = cash_or_cheq;
	}

	@Override
	public String toString() {
		return "ReprintDeposit [id=" + id + ", deposit_slip_id=" + deposit_slip_id + ", deposit_date=" + deposit_date
				+ ", branch_code=" + branch_code + ", branch_name=" + branch_name + ", denomination_code="
				+ denomination_code + ", receipt_date=" + receipt_date + ", deposited_amount=" + deposited_amount
				+ ", received_from=" + received_from + ", reference_number=" + reference_number + ", pay_method_id="
				+ pay_method_id + ", bank_id=" + bank_id + ", drawee=" + drawee + ", value_sequence=" + value_sequence
				+ ", cash_or_cheq=" + cash_or_cheq + "]";
	} 
	
}
