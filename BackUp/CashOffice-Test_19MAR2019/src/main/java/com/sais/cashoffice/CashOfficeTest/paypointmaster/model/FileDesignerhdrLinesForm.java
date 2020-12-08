package com.sais.cashoffice.CashOfficeTest.paypointmaster.model;

public class FileDesignerhdrLinesForm extends FileDesignerHdrForm {

	private String fieldName;
	private String delimiter;
	private int startPosition;
	private int endPosition;
	private long length;
	private String datatype;
	private String constants;
	private long ppFileFormatId;
	private long fieldSequence;

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	public int getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}

	public int getEndPosition() {
		return endPosition;
	}

	public void setEndPosition(int endPosition) {
		this.endPosition = endPosition;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getConstants() {
		return constants;
	}

	public void setConstants(String constants) {
		this.constants = constants;
	}

	public long getPpFileFormatId() {
		return ppFileFormatId;
	}

	public void setPpFileFormatId(long ppFileFormatId) {
		this.ppFileFormatId = ppFileFormatId;
	}

	public long getFieldSequence() {
		return fieldSequence;
	}

	public void setFieldSequence(long fieldSequence) {
		this.fieldSequence = fieldSequence;
	}

	public FileDesignerhdrLinesForm() {

	}

	public FileDesignerhdrLinesForm(long ppId, String ppName, String fileName, long paypointFileId, String fieldName,
			String delimiter, int startPosition, int endPosition, String datatype, String constants,
			long fieldSequence) {
		super(ppId, ppName, fileName, paypointFileId);
		this.fieldName = fieldName;
		this.delimiter = delimiter;
		this.startPosition = startPosition;
		this.endPosition = endPosition;
		this.datatype = datatype;
		this.constants = constants;
		this.fieldSequence = fieldSequence;
	}

}
