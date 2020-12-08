package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.model;

import java.io.Serializable;
import java.util.Date;

public class PpMisAllocDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    
    private double receiptresllocationid;
	private double receiptno;
	private double rcptallocamount;
	private Date realldate;
	private String postingstatus;
	private double rcptfromrealldetid;
	private Date period;
	private String referencenumber;
	private String paypointname;
	private String ppname;
	private double rcpttorealldetid;
	private String toreferenceno;
	private Date toperiod;
	private String creditfilename;
	private double totalcreditamount;
	private double credithdrid;
	
	
	public double getReceiptresllocationid() {
		return receiptresllocationid;
	}
	public void setReceiptresllocationid(double receiptresllocationid) {
		this.receiptresllocationid = receiptresllocationid;
	}
	public double getReceiptno() {
		return receiptno;
	}
	public void setReceiptno(double receiptno) {
		this.receiptno = receiptno;
	}
	public double getRcptallocamount() {
		return rcptallocamount;
	}
	public void setRcptallocamount(double rcptallocamount) {
		this.rcptallocamount = rcptallocamount;
	}
	public Date getRealldate() {
		return realldate;
	}
	public void setRealldate(Date realldate) {
		this.realldate = realldate;
	}
	public String getPostingstatus() {
		return postingstatus;
	}
	public void setPostingstatus(String postingstatus) {
		this.postingstatus = postingstatus;
	}
	public double getRcptfromrealldetid() {
		return rcptfromrealldetid;
	}
	public void setRcptfromrealldetid(double rcptfromrealldetid) {
		this.rcptfromrealldetid = rcptfromrealldetid;
	}
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	public String getReferencenumber() {
		return referencenumber;
	}
	public void setReferencenumber(String referencenumber) {
		this.referencenumber = referencenumber;
	}
	public String getPaypointname() {
		return paypointname;
	}
	public void setPaypointname(String paypointname) {
		this.paypointname = paypointname;
	}
	public String getPpname() {
		return ppname;
	}
	public void setPpname(String ppname) {
		this.ppname = ppname;
	}
	public double getRcpttorealldetid() {
		return rcpttorealldetid;
	}
	public void setRcpttorealldetid(double rcpttorealldetid) {
		this.rcpttorealldetid = rcpttorealldetid;
	}
	public String getToreferenceno() {
		return toreferenceno;
	}
	public void setToreferenceno(String toreferenceno) {
		this.toreferenceno = toreferenceno;
	}
	public Date getToperiod() {
		return toperiod;
	}
	public void setToperiod(Date toperiod) {
		this.toperiod = toperiod;
	}
	public String getCreditfilename() {
		return creditfilename;
	}
	public void setCreditfilename(String creditfilename) {
		this.creditfilename = creditfilename;
	}
	public double getTotalcreditamount() {
		return totalcreditamount;
	}
	public void setTotalcreditamount(double totalcreditamount) {
		this.totalcreditamount = totalcreditamount;
	}
	public double getCredithdrid() {
		return credithdrid;
	}
	public void setCredithdrid(double credithdrid) {
		this.credithdrid = credithdrid;
	}
    
    
	

}
