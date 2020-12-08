package com.sais.cashoffice.CashOfficeTest.allocations.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.model.PaypointCollectionHistory;
import com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.model.ReceiptDetails;
import com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.service.Paypointcollectionhistoryserviceimpl;
import com.sais.cashoffice.CashOfficeTest.paypointcollectionhistory.service.ReceiptDetailsServiceimpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class PayPointCollectionHistoryController {
	
	
	@Autowired
	private Paypointcollectionhistoryserviceimpl pchi;
	
	@Autowired
	private ReceiptDetailsServiceimpl rdetails;
	
	//code used for fetching paypoint details
	
	@GetMapping(path="/allocations/paypointcollectionhistory")
	public List<PaypointCollectionHistory> fetchallpaypointscollectionhistory(@RequestParam("paypointiddetails") BigDecimal paypoint) throws ParseException{
		System.out.println("from selecting paypoint id i m entering into stage 2 from stage 1 ----->"+paypoint);
		

		
		
		return pchi.getpaypointdetailscollection(paypoint);
        		
		 
	}
	
	
	@GetMapping(path="/allocations/paypointcollectionhistory/recepitdetails")
	public List<ReceiptDetails> fetchallpaypointscollectionhistoryrecepit(@RequestParam("p_Paypoint_Id") BigDecimal paypointid,@RequestParam("p_Period") String period){
		
		java.sql.Date re = null;
		
		System.out.println(period);
		
		PaypointCollectionHistory pch = new PaypointCollectionHistory();
		
		  Date sqlse = Date.valueOf(period);
		
		// convert date to calendar
		      Calendar c = Calendar.getInstance();
		        c.setTime(sqlse);
		        c.add(Calendar.DAY_OF_MONTH, 1);
		        
		     // convert calendar to date
		       java.util.Date currentDatePlusOne = c.getTime();
		        
		        
		        
		        
		       System.out.println("print the currentDatePlusOne date --->"+currentDatePlusOne); 
		  
		  
		
		
		
		return rdetails.getReceiptDetails(paypointid, currentDatePlusOne);
      // return null;
		
		
		
		
	
		//return rdetails.getReceiptDetails(paypointid, currentDatePlusOne);
	}
	
	
	


}
