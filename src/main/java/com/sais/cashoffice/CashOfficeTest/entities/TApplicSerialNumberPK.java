package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the T_APPLIC_SERIAL_NUMBERS database table.
 * 
 */
@Embeddable
public class TApplicSerialNumberPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PARAMETER_ID")
	private String parameterId;

	@Column(name="START_FIN_YEAR")
	private int startFinYear;

	public TApplicSerialNumberPK() {
	}
	public String getParameterId() {
		return this.parameterId;
	}
	public void setParameterId(String parameterId) {
		this.parameterId = parameterId;
	}
	public int getStartFinYear() {
		return this.startFinYear;
	}
	public void setStartFinYear(int startFinYear) {
		this.startFinYear = startFinYear;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TApplicSerialNumberPK)) {
			return false;
		}
		TApplicSerialNumberPK castOther = (TApplicSerialNumberPK)other;
		return 
			this.parameterId.equals(castOther.parameterId)
			&& (this.startFinYear == castOther.startFinYear);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.parameterId.hashCode();
		hash = hash * prime + this.startFinYear;
		
		return hash;
	}
}