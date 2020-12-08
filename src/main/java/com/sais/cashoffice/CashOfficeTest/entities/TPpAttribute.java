package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.*;


/**
 * The persistent class for the T_PP_ATTRIBUTES database table.
 * 
 */
@Entity
@Table(name="T_PP_ATTRIBUTES")
@NamedQuery(name="TPpAttribute.findAll", query="SELECT t FROM TPpAttribute t")
public class TPpAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AGGREGATE_BY_PARTY")
	private String aggregateByParty;

	@Column(name="ATTR_COM_DESC")
	private String attrComDesc;

	@Column(name="MOVEMENT_YN")
	private String movementYn;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PP_ATTRIBUTE_ID")
	private Long ppAttributeId;

	@Column(name="XML_DATASOURCE")
	private String xmlDatasource;

	public TPpAttribute() {
	}

	public String getAggregateByParty() {
		return this.aggregateByParty;
	}

	public void setAggregateByParty(String aggregateByParty) {
		this.aggregateByParty = aggregateByParty;
	}

	public String getAttrComDesc() {
		return this.attrComDesc;
	}

	public void setAttrComDesc(String attrComDesc) {
		this.attrComDesc = attrComDesc;
	}

	public String getMovementYn() {
		return this.movementYn;
	}

	public void setMovementYn(String movementYn) {
		this.movementYn = movementYn;
	}

	public Long getPpAttributeId() {
		return this.ppAttributeId;
	}

	public void setPpAttributeId(Long ppAttributeId) {
		this.ppAttributeId = ppAttributeId;
	}

	public String getXmlDatasource() {
		return this.xmlDatasource;
	}

	public void setXmlDatasource(String xmlDatasource) {
		this.xmlDatasource = xmlDatasource;
	}

}