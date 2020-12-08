package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the GROUP_AUTHORITIES database table.
 * 
 */
@Embeddable
public class GroupAuthorityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="AUTHORITY", insertable=false, updatable=false)
	private String authority;

	@Column(name="GROUP_ID")
	private double groupId;

	public GroupAuthorityPK() {
	}
	public String getAuthority() {
		return this.authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public double getGroupId() {
		return this.groupId;
	}
	public void setGroupId(double groupId) {
		this.groupId = groupId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GroupAuthorityPK)) {
			return false;
		}
		GroupAuthorityPK castOther = (GroupAuthorityPK)other;
		return 
			this.authority.equals(castOther.authority)
			&& (this.groupId == castOther.groupId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.authority.hashCode();
		hash = hash * prime + ((int) (java.lang.Double.doubleToLongBits(this.groupId) ^ (java.lang.Double.doubleToLongBits(this.groupId) >>> 32)));
		
		return hash;
	}
}