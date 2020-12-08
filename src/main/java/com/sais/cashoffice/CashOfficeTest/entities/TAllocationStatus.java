package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_ALLOCATION_STATUS database table.
 * 
 */
@Entity
@Table(name="T_ALLOCATION_STATUS")
@NamedQuery(name="TAllocationStatus.findAll", query="SELECT t FROM TAllocationStatus t")
public class TAllocationStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RECEIPT_NO")
	private double receiptNo;

	@Lob
	@Column(name="CLOB_COLUMN")
	private String clobColumn;

	public TAllocationStatus() {
	}

	public double getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(double receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getClobColumn() {
		return this.clobColumn;
	}

	public void setClobColumn(String clobColumn) {
		this.clobColumn = clobColumn;
	}

}