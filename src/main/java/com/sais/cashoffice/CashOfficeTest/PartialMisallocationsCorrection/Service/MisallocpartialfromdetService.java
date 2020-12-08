package com.sais.cashoffice.CashOfficeTest.PartialMisallocationsCorrection.Service;

import java.util.Date;

public interface MisallocpartialfromdetService {
	
	public int insertnewrecordmisallparitalfrmdet(double partialmisallhdrid,double policyid,
            String policycode,Date period,String policystatus,double amount,double partyid,
            String payorname,double recepitno,double listid,String postingstatus,String collectionflag,
            Date creationdate,String createdby,Date modifieddate,String modifiedby);
		

}
