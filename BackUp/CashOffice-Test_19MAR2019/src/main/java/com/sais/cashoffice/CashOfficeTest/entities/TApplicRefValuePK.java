package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the T_APPLIC_REF_VALUES database table.
 * 
 */
@Embeddable
public class TApplicRefValuePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="DOMAIN_CODE")
	private String domainCode;

	@Column(name="VALUE_CODE")
	private String valueCode;

	public TApplicRefValuePK() {
	}
	public String getDomainCode() {
		return this.domainCode;
	}
	public void setDomainCode(String domainCode) {
		this.domainCode = domainCode;
	}
	public String getValueCode() {
		return this.valueCode;
	}
	public void setValueCode(String valueCode) {
		this.valueCode = valueCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TApplicRefValuePK)) {
			return false;
		}
		TApplicRefValuePK castOther = (TApplicRefValuePK)other;
		return 
			this.domainCode.equals(castOther.domainCode)
			&& this.valueCode.equals(castOther.valueCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.domainCode.hashCode();
		hash = hash * prime + this.valueCode.hashCode();
		
		return hash;
	}
}