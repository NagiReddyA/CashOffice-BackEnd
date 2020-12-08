package com.sais.cashoffice.CashOfficeTest.paypointtransaction.model;

import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.FileDesignerhdrLinesForm;

public class CreditFileFieldFormatForm extends FileDesignerhdrLinesForm {

	private char enabled;
	private String lineType;
	private String fileType;

	public CreditFileFieldFormatForm(long ppId, String ppName, String fileName, long paypointFileId, String fieldName,
			String delimiter, int startPosition, int endPosition, String datatype, String constants, long fieldSequence,
			char enabled, String lineType, String fileType) {
		super(ppId, ppName, fileName, paypointFileId, fieldName, delimiter, startPosition, endPosition, datatype,
				constants, fieldSequence);
		this.enabled = enabled;
		this.lineType = lineType;
		this.fileType = fileType;
	}

	public char getEnabled() {
		return enabled;
	}

	public void setEnabled(char enabled) {
		this.enabled = enabled;
	}

	public String getLineType() {
		return lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}
