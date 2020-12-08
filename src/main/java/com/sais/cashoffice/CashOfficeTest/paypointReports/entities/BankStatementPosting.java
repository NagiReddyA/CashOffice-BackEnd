package com.sais.cashoffice.CashOfficeTest.paypointReports.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vw_bank_statement_posting")
public class BankStatementPosting {
	
	@Id
	@GeneratedValue
	private int id;
	private long BANK_STMT_ID; 
	private String BANK_NAME; 
	private String BANK_ACCOUNT;
	private String INPUT_DATE;
	private String BANK_STMT_NUMBER;
	private int USER_ID; 
	private String USER_NAME; 
	private String DATE_FROM; 
	private String DATE_TO;
	private String PAYMODE; 
	private String POLICY_NUMBER; 
	private String PAYOR; 
	private String TRNS_CODE;
	private String TRNS_DESC;
	private String STMT_START_DATE;
	private String STMT_END_DATE; 
	private double OPENG_BAL;
	private double CLOS_BAL;
	private char DEBIT_YN;
	private double AMOUNT;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getBANK_STMT_ID() {
		return BANK_STMT_ID;
	}
	public void setBANK_STMT_ID(long bANK_STMT_ID) {
		BANK_STMT_ID = bANK_STMT_ID;
	}
	public String getBANK_NAME() {
		return BANK_NAME;
	}
	public void setBANK_NAME(String bANK_NAME) {
		BANK_NAME = bANK_NAME;
	}
	public String getBANK_ACCOUNT() {
		return BANK_ACCOUNT;
	}
	public void setBANK_ACCOUNT(String bANK_ACCOUNT) {
		BANK_ACCOUNT = bANK_ACCOUNT;
	}
	public String getINPUT_DATE() {
		return INPUT_DATE;
	}
	public void setINPUT_DATE(String iNPUT_DATE) {
		INPUT_DATE = iNPUT_DATE;
	}
	public String getBANK_STMT_NUMBER() {
		return BANK_STMT_NUMBER;
	}
	public void setBANK_STMT_NUMBER(String bANK_STMT_NUMBER) {
		BANK_STMT_NUMBER = bANK_STMT_NUMBER;
	}
	public int getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getDATE_FROM() {
		return DATE_FROM;
	}
	public void setDATE_FROM(String dATE_FROM) {
		DATE_FROM = dATE_FROM;
	}
	public String getDATE_TO() {
		return DATE_TO;
	}
	public void setDATE_TO(String dATE_TO) {
		DATE_TO = dATE_TO;
	}
	public String getPAYMODE() {
		return PAYMODE;
	}
	public void setPAYMODE(String pAYMODE) {
		PAYMODE = pAYMODE;
	}
	public String getPOLICY_NUMBER() {
		return POLICY_NUMBER;
	}
	public void setPOLICY_NUMBER(String pOLICY_NUMBER) {
		POLICY_NUMBER = pOLICY_NUMBER;
	}
	public String getPAYOR() {
		return PAYOR;
	}
	public void setPAYOR(String pAYOR) {
		PAYOR = pAYOR;
	}
	public String getTRNS_CODE() {
		return TRNS_CODE;
	}
	public void setTRNS_CODE(String tRNS_CODE) {
		TRNS_CODE = tRNS_CODE;
	}
	public String getTRNS_DESC() {
		return TRNS_DESC;
	}
	public void setTRNS_DESC(String tRNS_DESC) {
		TRNS_DESC = tRNS_DESC;
	}
	public String getSTMT_START_DATE() {
		return STMT_START_DATE;
	}
	public void setSTMT_START_DATE(String sTMT_START_DATE) {
		STMT_START_DATE = sTMT_START_DATE;
	}
	public String getSTMT_END_DATE() {
		return STMT_END_DATE;
	}
	public void setSTMT_END_DATE(String sTMT_END_DATE) {
		STMT_END_DATE = sTMT_END_DATE;
	}
	public double getOPENG_BAL() {
		return OPENG_BAL;
	}
	public void setOPENG_BAL(double oPENG_BAL) {
		OPENG_BAL = oPENG_BAL;
	}
	public double getCLOS_BAL() {
		return CLOS_BAL;
	}
	public void setCLOS_BAL(double cLOS_BAL) {
		CLOS_BAL = cLOS_BAL;
	}
	public char getDEBIT_YN() {
		return DEBIT_YN;
	}
	public void setDEBIT_YN(char dEBIT_YN) {
		DEBIT_YN = dEBIT_YN;
	}
	public double getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}

}
