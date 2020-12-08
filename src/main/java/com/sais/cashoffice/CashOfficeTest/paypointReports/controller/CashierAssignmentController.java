package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.CashierAssignment;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.CashierAssignmentRepository;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/cashier-assignment")
public class CashierAssignmentController {
	
	@Autowired
	CashierAssignmentRepository caRepos ;
	
	@GetMapping("/ca")
	public List<CashierAssignment> getCash(){
		return caRepos.findAll(); 
	}

}

