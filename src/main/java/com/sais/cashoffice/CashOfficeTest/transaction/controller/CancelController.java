package com.sais.cashoffice.CashOfficeTest.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.transaction.model.ActivityForm1;
import com.sais.cashoffice.CashOfficeTest.transaction.model.QueryReceiptForm;
import com.sais.cashoffice.CashOfficeTest.transaction.service.CancelReceiptImpl;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class CancelController {
	
	@Autowired
	private	CancelReceiptImpl cancelImpl;
	
	
	//@PostMapping(path = "/receiptCancel/{recieptNumber}",produces="application/json")
	
	@GetMapping(path = "/receiptCancel")
	public void cancelReceipt(@RequestParam(value = "rID") double Id, @RequestParam(value = "reason") String reason, @RequestParam(value = "user") String User) throws Exception {
		System.out.println("Cancellation Reason:"+reason);
		System.out.println("Receipt No:"+ Id);
		System.out.println("Modified By:"+ User);
		cancelImpl.CancelReceipt(Id, reason, User);
	}
	
	@GetMapping(path = "/approveReceiptCancel")
	public void ApprovecancelReceipt(@RequestParam(value = "rID") double Id, @RequestParam(value = "status") String status, @RequestParam(value = "user") String User) throws Exception {
		System.out.println("Status:"+status);
		System.out.println("Receipt No:"+ Id);
		System.out.println("Modified By:"+ User);
		cancelImpl.ApproveCancelReceipt(Id, status, User);
	}

	
	@GetMapping(path = "/QRCancelDetails")
	public List<QueryReceiptForm> getApprCancelQuery() {		
		return cancelImpl.ApprCancelQuery();
	}
	
}
