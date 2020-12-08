package com.sais.cashoffice.CashOfficeTest.paypointtransaction.model;

import java.util.Date;

public class SplitMergeSearchForm {
	private long paypointId;
	private String paypointName;
	private Date period;
	private Date strikeDateFrom;
	private Date strikeDateTo;
	private String filename;
	private long numberOfRecords;
	private String splitmergeFileName;

	public long getPaypointId() {
		return paypointId;
	}

	public void setPaypointId(long paypointId) {
		this.paypointId = paypointId;
	}

	public String getPaypointName() {
		return paypointName;
	}

	public void setPaypointName(String paypointName) {
		this.paypointName = paypointName;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public String getSplitmergeFileName() {
		return splitmergeFileName;
	}

	public void setSplitmergeFileName(String splitmergeFileName) {
		this.splitmergeFileName = splitmergeFileName;
	}

	public Date getStrikeDateFrom() {
		return strikeDateFrom;
	}

	public void setStrikeDateFrom(Date strikeDateFrom) {
		this.strikeDateFrom = strikeDateFrom;
	}

	public Date getStrikeDateTo() {
		return strikeDateTo;
	}

	public void setStrikeDateTo(Date strikeDateTo) {
		this.strikeDateTo = strikeDateTo;
	}

	public long getNumberOfRecords() {
		return numberOfRecords;
	}

	public void setNumberOfRecords(long numberOfRecords) {
		this.numberOfRecords = numberOfRecords;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
