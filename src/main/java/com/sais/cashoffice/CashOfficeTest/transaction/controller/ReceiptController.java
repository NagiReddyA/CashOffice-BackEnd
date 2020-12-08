package com.sais.cashoffice.CashOfficeTest.transaction.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PaymentReceipt;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PolicyForm;
import com.sais.cashoffice.CashOfficeTest.transaction.service.PaymentReceiptImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ReceiptController {

	@Autowired
	private	PaymentReceiptImpl paymentReceiptImpl;
	
	@GetMapping(path = "/getPayRcptDtlsWithID",produces="application/json")
	public List<PaymentReceipt> getRcptDtlsWithID(@RequestParam("Id") double Id) {
		System.out.println("Cashier ID:"+ Id);
		return paymentReceiptImpl.getRcptDtls(Id);
	}
	
	@GetMapping(path = "/getApplicationDtls",produces="application/json")
	public List<PaymentReceipt> getApplicationDtls() {
		System.out.println("request to get Application Details");
		return paymentReceiptImpl.getApplicationDtls();
	}
	
	@GetMapping(path = "/getBankDtls",produces="application/json")
	public List<PaymentReceipt> getBankDtls() {
		System.out.println("request to get Bank Details");
		return paymentReceiptImpl.getBankDtls();
	}
	
	@GetMapping(path = "/getBankBranchDtls",produces="application/json")
	public List<PaymentReceipt> getBankBranchDtls(@RequestParam("Id") String Id) {
		System.out.println("Bank ID:"+ Id);
		return paymentReceiptImpl.getBankBranchDtls(Id);
	}
		
	@GetMapping(path = "/PRPayMethods",produces="application/json")
	public List<PaymentReceipt> getRcptDtlsWithID(@RequestParam("Id") int Id) {
		System.out.println("Cash Office ID:"+ Id);
		return paymentReceiptImpl.getPayModeDtls(Id);
	}
	
	@GetMapping(path = "/getPolicyDtls",produces="application/json")
	public List<PolicyForm> getPolicyDtls(@RequestParam("Id") String Id) {
		System.out.println("Policy Code:"+ Id);
		return paymentReceiptImpl.getPolicyDtls(Id);
	}
	
	
	@PostMapping(path="/InsertRcptDtls",consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> InsertRcptDtls(@RequestBody PaymentReceipt dtls) {
		
		System.out.println("Receipt Amount		:"+ dtls.getrcptAmount());
		System.out.println("Received From		:"+ dtls.getrcvdFrom());
		System.out.println("Pay Method ID		:"+ dtls.getpayMtdId());
		System.out.println("Cash Office ID		:"+ dtls.getcashOffId());
		System.out.println("Cashier ID			:"+ dtls.getcashierId());
		System.out.println("Created By 			:"+ dtls.getcreatBy()); 
		System.out.println("App ID				:"+ dtls.getappId());
		System.out.println("Allocated Amount	:"+ dtls.getallocAmt());
		System.out.println("UnAllocated Amount	:"+ dtls.getunallocAmt());
		
	Object receiptnumber=paymentReceiptImpl.InsertRcptDtls(dtls.getrcptAmount(),	dtls.getrcvdFrom(), dtls.getpayMtdId(), 
							  					 dtls.getcashOffId(), dtls.getcashierId(), dtls.getcreatBy(),
							  					 dtls.getappId(), dtls.getallocAmt(), dtls.getunallocAmt());
	System.out.println(receiptnumber);
		 
		 return ResponseEntity.ok().body(receiptnumber); 
	}
	
	@GetMapping(path = "/getRcptPostDtls",produces="application/json")
	public List<PaymentReceipt> getRcptPostDtls(@RequestParam("Name") String Name) {
		System.out.println("User Name:"+ Name);
		return paymentReceiptImpl.getRcptPostDtls(Name);
	}
	
	
	@GetMapping(path = "/postRcptDtls",produces="application/json")
	public void updateRcptPostStatus(@RequestParam("Id") double Id) {
		System.out.println("Cashier ID:"+ Id);
		paymentReceiptImpl.updateRcptPostStatus(Id);
	}
	
}
