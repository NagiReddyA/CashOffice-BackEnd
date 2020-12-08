package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.CreditFileFieldFormatForm;

import java.util.Date;

/**
 * The persistent class for the T_PP_CR_FILE_FORMAT_LINES database table.
 * 
 */
@Entity
@Table(name = "T_PP_CR_FILE_FORMAT_LINES")
@NamedQuery(name = "TPpCrFileFormatLine.findAll", query = "SELECT t FROM TPpCrFileFormatLine t")
@NamedNativeQuery(name = "TPpCrFileFormatLine.getCreditFileFieldFormat", query = "SELECT hdr.paypoint_id paypointId,hdr.paypoint_name paypointName,"
		+ "hdr.file_name fileName,hdr.paypoint_file_id fileId,line.field_name fieldName,line.`delimiter` `delimiter`,"
		+ "line.start_position startPosition,line.end_position endPosition,coalesce(line.data_type,\"\") dataType,"
		+ "coalesce(line.constants,\"\") constants,line.field_sequence fieldSequence,coalesce(hdr.enabled,'N') enabled,"
		+ "line.line_type lineType,coalesce(line.file_type,\"\") fileType	FROM T_PP_CR_FILE_FORMAT_HDR hdr,"
		+ "T_PP_CR_FILE_FORMAT_LINES line where hdr.Paypoint_File_Id = line.pp_file_id AND "
		+ " hdr.paypoint_id =?1 AND line.field_sequence=?2 AND line.line_type=?3", resultSetMapping = "creditFileFieldFormatMapping")

@SqlResultSetMapping(name = "creditFileFieldFormatMapping", classes = {
		@ConstructorResult(targetClass = CreditFileFieldFormatForm.class, columns = {
				@ColumnResult(name = "paypointId", type = Long.class),
				@ColumnResult(name = "paypointName", type = String.class),
				@ColumnResult(name = "fileName", type = String.class),
				@ColumnResult(name = "fileId", type = Long.class),
				@ColumnResult(name = "fieldName", type = String.class),
				@ColumnResult(name = "delimiter", type = String.class),
				@ColumnResult(name = "startPosition", type = Integer.class),
				@ColumnResult(name = "endPosition", type = Integer.class),
				@ColumnResult(name = "dataType", type = String.class),
				@ColumnResult(name = "constants", type = String.class),
				@ColumnResult(name = "fieldSequence", type = Long.class),
				@ColumnResult(name = "enabled", type = Character.class),
				@ColumnResult(name = "lineType", type = String.class),				
				@ColumnResult(name = "fileType", type = String.class), }) })
public class TPpCrFileFormatLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PP_FILE_FORMAT_ID")
	private Long ppFileFormatId;

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

	@Column(name = "CONSTANTS")
	private String constants;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "DATA_TYPE")
	private String dataType;

	@Column(name = "DELIMITER")
	private String delimiter;

	@Column(name = "ENABLED")
	private String enabled;

	@Column(name = "END_POSITION")
	private int endPosition;

	@Column(name = "FIELD_NAME")
	private String fieldName;

	@Column(name = "FIELD_SEQUENCE")
	private long fieldSequence;

	@Column(name = "FILE_TYPE")
	private String fileType;

	@Column(name = "LENGTH")
	private long length;

	@Column(name = "LINE_TYPE")
	private String lineType;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name = "PAYPOINT_ID")
	private Long paypointId;

	@Column(name = "PAYPOINT_NAME")
	private String paypointName;

	@Column(name = "PP_FILE_ID")
	private long ppFileId;

	@Column(name = "START_POSITION")
	private int startPosition;

	public TPpCrFileFormatLine() {
	}

	public Long getPpFileFormatId() {
		return this.ppFileFormatId;
	}

	public void setPpFileFormatId(Long ppFileFormatId) {
		this.ppFileFormatId = ppFileFormatId;
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

	public String getConstants() {
		return this.constants;
	}

	public void setConstants(String constants) {
		this.constants = constants;
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

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDelimiter() {
		return this.delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public int getEndPosition() {
		return this.endPosition;
	}

	public void setEndPosition(int endPosition) {
		this.endPosition = endPosition;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public long getFieldSequence() {
		return this.fieldSequence;
	}

	public void setFieldSequence(long fieldSequence) {
		this.fieldSequence = fieldSequence;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public long getLength() {
		return this.length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public String getLineType() {
		return this.lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
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

	public Long getPaypointId() {
		return this.paypointId;
	}

	public void setPaypointId(long paypointId) {
		this.paypointId = paypointId;
	}

	public String getPaypointName() {
		return this.paypointName;
	}

	public void setPaypointName(String paypointName) {
		this.paypointName = paypointName;
	}

	public long getPpFileId() {
		return this.ppFileId;
	}

	public void setPpFileId(long ppFileId) {
		this.ppFileId = ppFileId;
	}

	public int getStartPosition() {
		return this.startPosition;
	}

	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}

}