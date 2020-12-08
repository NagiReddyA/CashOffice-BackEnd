package com.sais.cashoffice.CashOfficeTest.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sais.cashoffice.CashOfficeTest.transaction.model.QueryReceiptForm;
import com.sais.cashoffice.CashOfficeTest.transaction.service.QueryServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class QueryController {

	@Autowired
	private	QueryServiceImpl queryReceiptServiceImpl;

	@GetMapping(path = "/QRDetails")
	public List<QueryReceiptForm> getQuery() {		
		return queryReceiptServiceImpl.getReceipt();
	}
	
	
	@GetMapping(path = "/QRCashiers")
	public List<QueryReceiptForm> getQRCashiers() {
		
		return queryReceiptServiceImpl.getCashierDetails();
	}
	
	@GetMapping(path = "/QR_rcptList/{wcond}")
	public List<QueryReceiptForm> getRcptDtls(@PathVariable (value = "wcond") String cond1) {
		System.out.println("Calling Controller Service and Cond:"+ cond1);
		return queryReceiptServiceImpl.getRcptDetails(cond1);
	}
		
	@GetMapping(path = "/QRCashiersWithID",produces="application/json")
	public List<QueryReceiptForm> getRcptDtlsWithID(@RequestParam("rcptno") double No) {
		System.out.println("Calling QRCashiersWithID Service and No:"+ No);
		return queryReceiptServiceImpl.getRcptDetailsWithID(No);
	}
	
	@GetMapping(path = "/QR_rcptDtlsWithID",produces="application/json")
	public List<QueryReceiptForm> getRcptAllocationDtls(@RequestParam("rcptno") double No) {
		System.out.println("Calling ALlocation Service and No:"+ No);
		return queryReceiptServiceImpl.getRcptDtlsWithID(No);
	}
	
	
}
