package com.sais.cashoffice.CashOfficeTest.transaction.controller;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sais.cashoffice.CashOfficeTest.entities.TDepositSlip1;
import com.sais.cashoffice.CashOfficeTest.entities.TDepositedDenomination;
import com.sais.cashoffice.CashOfficeTest.transaction.model.DenominationForm;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PrintBankForm;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PrintBankReceiptForm;
import com.sais.cashoffice.CashOfficeTest.transaction.service.PrintBankServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class PrintBankController {

	@Autowired
	private PrintBankServiceImpl printbankImpl;

	@GetMapping(path = "/DepositDetails/{userID}")
	public List<PrintBankForm> getCashOffDetails(@PathVariable(value = "userID") String userID) {
		String s = userID.replace("\"", "");
		return printbankImpl.getCashOffDet(s);
	}

	@GetMapping(path = "/Denominationdetails")
	public List<DenominationForm> getDenominationdetails() {

		return printbankImpl.getDenominationDetails();
	}

	@PostMapping(path = "/getReceipts")
	public List<PrintBankReceiptForm> getReceiptDetails(@RequestBody PrintBankReceiptForm form) {

		Date date = form.getReceiptDate();
		Instant instant = Instant.ofEpochMilli(date.getTime());
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		LocalDate localDate = localDateTime.toLocalDate();
		return printbankImpl.getReceiptDetails(localDate);
	}

	@Transactional
	@PostMapping(value = "/SaveUserDetails/{userID}", produces = "application/json")
	public TDepositSlip1 saveUserDetails(@PathVariable(value = "userID") String userID,
			@RequestBody DenominationForm form) {
		String str = userID.replace("\"", "");
		return printbankImpl.getUserDetails(str, form);
	}

	@Transactional
	@PostMapping(value = "/SaveReceipt", produces = "application/json")
	public TDepositedDenomination saveReceipt(@RequestParam("formValue") String form)
			throws JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		TDepositedDenomination obj = null;
		try {
			DenominationForm formData = mapper.readValue(form, DenominationForm.class);
			obj = printbankImpl.saveReceipt(formData);
		} catch (JsonParseException e) {
			System.out.println("error");
		}
		return obj;
	}

}
