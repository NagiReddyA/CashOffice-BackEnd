package com.sais.cashoffice.CashOfficeTest.transaction.service;

import java.util.List;

import javax.validation.Valid;

import com.sais.cashoffice.CashOfficeTest.entities.TCashTillActivity1;
import com.sais.cashoffice.CashOfficeTest.transaction.model.ActivityForm1;
import com.sais.cashoffice.CashOfficeTest.transaction.model.TillActivityForm;





    public interface ActivityServiceDe {


	    public	List<TillActivityForm> getTillData(String LId);
	    public TCashTillActivity1 updateStatus(@Valid TillActivityForm tcash);
        public List<ActivityForm1> getTillDetails(String userID) throws Exception;
        public List<ActivityForm1>  getCheckTillData(String LId);
		public List<TillActivityForm> getCheckTillStatus(String LId);
     }

