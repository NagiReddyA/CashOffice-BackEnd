package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_CS_APPLICATION database table.
 * 
 */
@Entity
@Table(name="T_CS_APPLICATION")
@NamedQuery(name="TCsApplication.findAll", query="SELECT t FROM TCsApplication t")
public class TCsApplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CHANGE_ID")
	private long changeId;

	@Column(name="APPLY_CODE")
	private String applyCode;

	@Column(name="APPLY_NAME")
	private String applyName;

	@Column(name="APPLY_NOTE")
	private String applyNote;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="APPLY_TIME")
	private Date applyTime;

	@Column(name="APPLY_TYPE")
	private String applyType;

	@Column(name="CANCEL_CAUSE")
	private String cancelCause;

	@Column(name="CANCEL_ID")
	private BigDecimal cancelId;

	@Column(name="CANCEL_NOTE")
	private String cancelNote;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CANCEL_TIME")
	private Date cancelTime;

	@Column(name="CERTI_CODE")
	private String certiCode;

	@Column(name="CERTI_TYPE")
	private int certiType;

	@Column(name="CHANGE_TYPE")
	private String changeType;

	@Column(name="CHANNEL_ORG_ID")
	private BigDecimal channelOrgId;

	@Column(name="CS_APP_STATUS")
	private int csAppStatus;

	@Column(name="CURRENT_CHG_ID")
	private BigDecimal currentChgId;

	@Column(name="CURRENT_OPERATOR_ID")
	private BigDecimal currentOperatorId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CUST_APP_TIME")
	private Date custAppTime;

	@Column(name="`DELAYED`")
	private String delayed;

	@Column(name="ENDORSEMENT_NO")
	private String endorsementNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="HEALTH_WARRANT_DATE")
	private Date healthWarrantDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INSERT_TIME")
	private Date insertTime;

	@Column(name="INSERTED_BY")
	private BigDecimal insertedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INSERTED_TIMESTAMP")
	private Date insertedTimestamp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_ENTRY_TIME")
	private Date lastEntryTime;

	@Column(name="LAST_HANDLER_ID")
	private BigDecimal lastHandlerId;

	@Column(name="LAST_OPERATOR_ID")
	private BigDecimal lastOperatorId;

	@Column(name="LAST_UW_DISP_ID")
	private BigDecimal lastUwDispId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UW_DISP_TIME")
	private Date lastUwDispTime;

	@Column(name="NEED_ENDORSEMENT")
	private String needEndorsement;

	@Column(name="NOTICE_CODE")
	private String noticeCode;

	@Column(name="ORG_ID")
	private BigDecimal orgId;

	@Column(name="PARTY_ID")
	private BigDecimal partyId;

	@Column(name="POLICY_ID")
	private BigDecimal policyId;

	@Column(name="PRINT_NUM")
	private int printNum;

	@Column(name="PRINT_STATUS")
	private String printStatus;

	@Column(name="REJECT_AGENT_ID")
	private BigDecimal rejectAgentId;

	@Column(name="REJECT_CAUSE")
	private String rejectCause;

	@Column(name="REJECT_NOTE")
	private String rejectNote;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REJECT_TIME")
	private Date rejectTime;

	@Column(name="REJECTER_ID")
	private BigDecimal rejecterId;

	@Column(name="SERVICE_TYPE")
	private String serviceType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_TIME")
	private Date updateTime;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIMESTAMP")
	private Date updatedTimestamp;

	public TCsApplication() {
	}

	public long getChangeId() {
		return this.changeId;
	}

	public void setChangeId(long changeId) {
		this.changeId = changeId;
	}

	public String getApplyCode() {
		return this.applyCode;
	}

	public void setApplyCode(String applyCode) {
		this.applyCode = applyCode;
	}

	public String getApplyName() {
		return this.applyName;
	}

	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}

	public String getApplyNote() {
		return this.applyNote;
	}

	public void setApplyNote(String applyNote) {
		this.applyNote = applyNote;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getApplyType() {
		return this.applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getCancelCause() {
		return this.cancelCause;
	}

	public void setCancelCause(String cancelCause) {
		this.cancelCause = cancelCause;
	}

	public BigDecimal getCancelId() {
		return this.cancelId;
	}

	public void setCancelId(BigDecimal cancelId) {
		this.cancelId = cancelId;
	}

	public String getCancelNote() {
		return this.cancelNote;
	}

	public void setCancelNote(String cancelNote) {
		this.cancelNote = cancelNote;
	}

	public Date getCancelTime() {
		return this.cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getCertiCode() {
		return this.certiCode;
	}

	public void setCertiCode(String certiCode) {
		this.certiCode = certiCode;
	}

	public int getCertiType() {
		return this.certiType;
	}

	public void setCertiType(int certiType) {
		this.certiType = certiType;
	}

	public String getChangeType() {
		return this.changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public BigDecimal getChannelOrgId() {
		return this.channelOrgId;
	}

	public void setChannelOrgId(BigDecimal channelOrgId) {
		this.channelOrgId = channelOrgId;
	}

	public int getCsAppStatus() {
		return this.csAppStatus;
	}

	public void setCsAppStatus(int csAppStatus) {
		this.csAppStatus = csAppStatus;
	}

	public BigDecimal getCurrentChgId() {
		return this.currentChgId;
	}

	public void setCurrentChgId(BigDecimal currentChgId) {
		this.currentChgId = currentChgId;
	}

	public BigDecimal getCurrentOperatorId() {
		return this.currentOperatorId;
	}

	public void setCurrentOperatorId(BigDecimal currentOperatorId) {
		this.currentOperatorId = currentOperatorId;
	}

	public Date getCustAppTime() {
		return this.custAppTime;
	}

	public void setCustAppTime(Date custAppTime) {
		this.custAppTime = custAppTime;
	}

	public String getDelayed() {
		return this.delayed;
	}

	public void setDelayed(String delayed) {
		this.delayed = delayed;
	}

	public String getEndorsementNo() {
		return this.endorsementNo;
	}

	public void setEndorsementNo(String endorsementNo) {
		this.endorsementNo = endorsementNo;
	}

	public Date getHealthWarrantDate() {
		return this.healthWarrantDate;
	}

	public void setHealthWarrantDate(Date healthWarrantDate) {
		this.healthWarrantDate = healthWarrantDate;
	}

	public Date getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public BigDecimal getInsertedBy() {
		return this.insertedBy;
	}

	public void setInsertedBy(BigDecimal insertedBy) {
		this.insertedBy = insertedBy;
	}

	public Date getInsertedTimestamp() {
		return this.insertedTimestamp;
	}

	public void setInsertedTimestamp(Date insertedTimestamp) {
		this.insertedTimestamp = insertedTimestamp;
	}

	public Date getLastEntryTime() {
		return this.lastEntryTime;
	}

	public void setLastEntryTime(Date lastEntryTime) {
		this.lastEntryTime = lastEntryTime;
	}

	public BigDecimal getLastHandlerId() {
		return this.lastHandlerId;
	}

	public void setLastHandlerId(BigDecimal lastHandlerId) {
		this.lastHandlerId = lastHandlerId;
	}

	public BigDecimal getLastOperatorId() {
		return this.lastOperatorId;
	}

	public void setLastOperatorId(BigDecimal lastOperatorId) {
		this.lastOperatorId = lastOperatorId;
	}

	public BigDecimal getLastUwDispId() {
		return this.lastUwDispId;
	}

	public void setLastUwDispId(BigDecimal lastUwDispId) {
		this.lastUwDispId = lastUwDispId;
	}

	public Date getLastUwDispTime() {
		return this.lastUwDispTime;
	}

	public void setLastUwDispTime(Date lastUwDispTime) {
		this.lastUwDispTime = lastUwDispTime;
	}

	public String getNeedEndorsement() {
		return this.needEndorsement;
	}

	public void setNeedEndorsement(String needEndorsement) {
		this.needEndorsement = needEndorsement;
	}

	public String getNoticeCode() {
		return this.noticeCode;
	}

	public void setNoticeCode(String noticeCode) {
		this.noticeCode = noticeCode;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	public BigDecimal getPartyId() {
		return this.partyId;
	}

	public void setPartyId(BigDecimal partyId) {
		this.partyId = partyId;
	}

	public BigDecimal getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(BigDecimal policyId) {
		this.policyId = policyId;
	}

	public int getPrintNum() {
		return this.printNum;
	}

	public void setPrintNum(int printNum) {
		this.printNum = printNum;
	}

	public String getPrintStatus() {
		return this.printStatus;
	}

	public void setPrintStatus(String printStatus) {
		this.printStatus = printStatus;
	}

	public BigDecimal getRejectAgentId() {
		return this.rejectAgentId;
	}

	public void setRejectAgentId(BigDecimal rejectAgentId) {
		this.rejectAgentId = rejectAgentId;
	}

	public String getRejectCause() {
		return this.rejectCause;
	}

	public void setRejectCause(String rejectCause) {
		this.rejectCause = rejectCause;
	}

	public String getRejectNote() {
		return this.rejectNote;
	}

	public void setRejectNote(String rejectNote) {
		this.rejectNote = rejectNote;
	}

	public Date getRejectTime() {
		return this.rejectTime;
	}

	public void setRejectTime(Date rejectTime) {
		this.rejectTime = rejectTime;
	}

	public BigDecimal getRejecterId() {
		return this.rejecterId;
	}

	public void setRejecterId(BigDecimal rejecterId) {
		this.rejecterId = rejecterId;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public BigDecimal getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTimestamp() {
		return this.updatedTimestamp;
	}

	public void setUpdatedTimestamp(Date updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

}