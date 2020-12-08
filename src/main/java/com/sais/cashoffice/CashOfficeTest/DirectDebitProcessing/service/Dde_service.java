package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.util.Date;
import java.util.List;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.Dde_model;

public interface Dde_service {
	
	List<Dde_model> getalldee(double sr);
	
	int insertintobankstmthdr(String paymentmode,String bankname,String accountnumber,
            Date creationdate,Date modifieddate,String bankstmtnumber,
            String postingstatus,Date stmtstartdate,Date stmtenddate,
            String captureby,double stmtopeningbalance,double stmtclosingbalance,
            String capturebybranch,Date periodforreversal,String createdby);

}
