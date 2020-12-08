package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.BankStatementPosting;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.BankStamentPostingRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/bstmtp")

public class BankStatementPostingController {
	
	@Autowired
	BankStamentPostingRepository bspRepo;
	
	@GetMapping("/report/{bsID}")
	public List<BankStatementPosting> getReports(@PathVariable("bsID") int bsID) {

		List<BankStatementPosting> result = bspRepo.getReport(bsID);

		if (result == null) {
			return new ArrayList<BankStatementPosting>();
		} else {

			return result;
		}
	}
	

	

}
