package com.sais.cashoffice.CashOfficeTest.paypointtransaction.model;

import java.util.Date;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.entities.TPaypointDrHdr;
public class SplitDebitFileForm {
	private Long payPointId;
	private Long ppHdrId;
	private String paypointName;
	private Date period;
	private Date strikeDayFrom;
	private Date strikeDayTo;
	private String fileName;
	private List<SplitDebitFileForm> fileNames;
	private int filesize;
	private int noOfAvailableRecords;
	private boolean splitMerge;
	private String merged;
	
	public long getPayPointId() {
		return payPointId;
	}
	public void setPayPointId(long payPointId) {
		this.payPointId = payPointId;
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
	public Date getStrikeDayFrom() {
		return strikeDayFrom;
	}
	public void setStrikeDayFrom(Date strikeDayFrom) {
		this.strikeDayFrom = strikeDayFrom;
	}
	public Date getStrikeDayTo() {
		return strikeDayTo;
	}
	public void setStrikeDayTo(Date strikeDayTo) {
		this.strikeDayTo = strikeDayTo;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getNoOfAvailableRecords() {
		return noOfAvailableRecords;
	}
	public void setNoOfAvailableRecords(int noOfAvailableRecords) {
		this.noOfAvailableRecords = noOfAvailableRecords;
	}
	public boolean isSplitMerge() {
		return splitMerge;
	}
	public void setSplitMerge(boolean splitMerge) {
		this.splitMerge = splitMerge;
	}
	public String getMerged() {
		return merged;
	}
	public void setMerged(String merged) {
		this.merged = merged;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	public List<SplitDebitFileForm> getFileNames() {
		return fileNames;
	}
	public void setFileNames(List<SplitDebitFileForm> fileNames) {
		this.fileNames = fileNames;
	}
	public Long getPpHdrId() {
		return ppHdrId;
	}
	public void setPpHdrId(Long ppHdrId) {
		this.ppHdrId = ppHdrId;
	}
	
	
}
