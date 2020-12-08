package com.sais.cashoffice.CashOfficeTest.BankStatementAdjustmentVoucher.Model;

import java.math.BigDecimal;
import java.util.Date;

public class Unspecifieddetails {
	
	private double bankunspecifiedid;
    private String bktranstype;
    private Date period;
    private BigDecimal allocatedamount;
    private String bktranstypedesc;
    private char credityn;
    
	public double getBankunspecifiedid() {
		return bankunspecifiedid;
	}
	public void setBankunspecifiedid(double bankunspecifiedid) {
		this.bankunspecifiedid = bankunspecifiedid;
	}
	public String getBktranstype() {
		return bktranstype;
	}
	public void setBktranstype(String bktranstype) {
		this.bktranstype = bktranstype;
	}
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	public BigDecimal getAllocatedamount() {
		return allocatedamount;
	}
	public void setAllocatedamount(BigDecimal allocatedamount) {
		this.allocatedamount = allocatedamount;
	}
	public String getBktranstypedesc() {
		return bktranstypedesc;
	}
	public void setBktranstypedesc(String bktranstypedesc) {
		this.bktranstypedesc = bktranstypedesc;
	}
	public char getCredityn() {
		return credityn;
	}
	public void setCredityn(char credityn) {
		this.credityn = credityn;
	}
    
    
    
    
    
    
   


}
