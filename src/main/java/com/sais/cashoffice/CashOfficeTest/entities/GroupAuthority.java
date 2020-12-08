package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the GROUP_AUTHORITIES database table.
 * 
 */
@Entity
@Table(name = "GROUP_AUTHORITIES")
@NamedQuery(name = "GroupAuthority.findAll", query = "SELECT g FROM GroupAuthority g")
public class GroupAuthority implements Serializable {
	private static final long serialVersionUID = 1L;

	public GroupAuthority() {
	}

	@EmbeddedId
	private GroupAuthorityPK id;

	@Column(name = "ATTRIBUTE1")
	private String attribute1;

	@Column(name = "ATTRIBUTE2")
	private String attribute2;

	@Column(name = "ATTRIBUTE3")
	private String attribute3;

	@Column(name = "ATTRIBUTE4")
	private String attribute4;

	@Column(name = "ATTRIBUTE5")
	private String attribute5;

	@Column(name = "ATTRIBUTE6")
	private String attribute6;

	@Column(name = "COMMENTS")
	private String comments;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "ENABLED")
	private String enabled;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATETIME")
	private Date modifiedDatetime;

	// bi-directional many-to-one association to GroupAuthoritiesMaster
	@ManyToOne
	@JoinColumn(name = "AUTHORITY", referencedColumnName = "AUTHORITY", insertable = false, updatable = false)
	private GroupAuthoritiesMaster groupAuthoritiesMaster;

	public GroupAuthorityPK getId() {
		return this.id;
	}

	public void setId(GroupAuthorityPK id) {
		this.id = id;
	}

	public String getAttribute1() {
		return this.attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return this.attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return this.attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return this.attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return this.attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	public String getAttribute6() {
		return this.attribute6;
	}

	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDatetime() {
		return this.modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public GroupAuthoritiesMaster getGroupAuthoritiesMaster() {
		return this.groupAuthoritiesMaster;
	}

	public void setGroupAuthoritiesMaster(GroupAuthoritiesMaster groupAuthoritiesMaster) {
		this.groupAuthoritiesMaster = groupAuthoritiesMaster;
	}

}