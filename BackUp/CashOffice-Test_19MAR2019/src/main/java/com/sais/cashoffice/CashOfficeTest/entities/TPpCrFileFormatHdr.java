package com.sais.cashoffice.CashOfficeTest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the T_PP_CR_FILE_FORMAT_HDR database table.
 * 
 */
@Entity
@Table(name = "T_PP_CR_FILE_FORMAT_HDR")
@NamedQuery(name = "TPpCrFileFormatHdr.findAll", query = "SELECT t FROM TPpCrFileFormatHdr t")
public class TPpCrFileFormatHdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PAYPOINT_FILE_ID")
	private long paypointFileId;

	@Column(name = "ALLOW_PER_CLIENT")
	private int allowPerClient;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "DELIMITER")
	private String delimiter;

	@Column(name = "DTO_FILE_LOCATION")
	private String dtoFileLocation;

	@Column(name = "ENABLED")
	private String enabled;

	@Column(name = "ENCRYPTION")
	private int encryption;

	@Column(name = "FIELD_NAME")
	private String fieldName;

	@Column(name = "FILE_NAME")
	private String fileName;

	@Column(name = "FILE_SEPARATOR_TYPE")
	private String fileSeparatorType;

	@Column(name = "FQN_PAYPOINT_DTO")
	private String fqnPaypointDto;

	@Column(name = "INTERFACE_TABLE")
	private String interfaceTable;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DATETIME")
	private Date modifiedDatetime;

	@Column(name = "MOVEMENT")
	private int movement;

	@Column(name = "NO_OF_CREDIT_HDR_LINES")
	private long noOfCreditHdrLines;

	@Column(name = "PAYPOINT_FILE_NAME")
	private String paypointFileName;

	@Column(name = "PAYPOINT_FILE_TYPE")
	private String paypointFileType;

	@Column(name = "PAYPOINT_ID")
	private long paypointId;

	@Column(name = "PAYPOINT_NAME")
	private String paypointName;

	// bi-directional many-to-one association to TFileNamingFormat
	@OneToMany(mappedBy = "ppCrFileFormatHdr")
	private List<TFileNamingFormat> fileNamingFormats;

	public TPpCrFileFormatHdr() {
	}

	public long getPaypointFileId() {
		return this.paypointFileId;
	}

	public void setPaypointFileId(long paypointFileId) {
		this.paypointFileId = paypointFileId;
	}

	public int getAllowPerClient() {
		return this.allowPerClient;
	}

	public void setAllowPerClient(int allowPerClient) {
		this.allowPerClient = allowPerClient;
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

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDelimiter() {
		return this.delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	public String getDtoFileLocation() {
		return this.dtoFileLocation;
	}

	public void setDtoFileLocation(String dtoFileLocation) {
		this.dtoFileLocation = dtoFileLocation;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public int getEncryption() {
		return this.encryption;
	}

	public void setEncryption(int encryption) {
		this.encryption = encryption;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileSeparatorType() {
		return this.fileSeparatorType;
	}

	public void setFileSeparatorType(String fileSeparatorType) {
		this.fileSeparatorType = fileSeparatorType;
	}

	public String getFqnPaypointDto() {
		return this.fqnPaypointDto;
	}

	public void setFqnPaypointDto(String fqnPaypointDto) {
		this.fqnPaypointDto = fqnPaypointDto;
	}

	public String getInterfaceTable() {
		return this.interfaceTable;
	}

	public void setInterfaceTable(String interfaceTable) {
		this.interfaceTable = interfaceTable;
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

	public int getMovement() {
		return this.movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	public long getNoOfCreditHdrLines() {
		return this.noOfCreditHdrLines;
	}

	public void setNoOfCreditHdrLines(long noOfCreditHdrLines) {
		this.noOfCreditHdrLines = noOfCreditHdrLines;
	}

	public String getPaypointFileName() {
		return this.paypointFileName;
	}

	public void setPaypointFileName(String paypointFileName) {
		this.paypointFileName = paypointFileName;
	}

	public String getPaypointFileType() {
		return this.paypointFileType;
	}

	public void setPaypointFileType(String paypointFileType) {
		this.paypointFileType = paypointFileType;
	}

	public long getPaypointId() {
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

	public List<TFileNamingFormat> getFileNamingFormats() {
		return this.fileNamingFormats;
	}

	public void setFileNamingFormats(List<TFileNamingFormat> fileNamingFormats) {
		this.fileNamingFormats = fileNamingFormats;
	}

	public TFileNamingFormat addTFileNamingFormat(TFileNamingFormat fileNamingFormat) {
		getFileNamingFormats().add(fileNamingFormat);
		fileNamingFormat.setPpCrFileFormatHdr(this);

		return fileNamingFormat;
	}

	public TFileNamingFormat removeTFileNamingFormat(TFileNamingFormat TFileNamingFormat) {
		getFileNamingFormats().remove(TFileNamingFormat);
		TFileNamingFormat.setPpCrFileFormatHdr(null);

		return TFileNamingFormat;
	}

}