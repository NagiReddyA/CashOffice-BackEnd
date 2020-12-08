package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.OversAndUnders;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.OversAndUndersRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/oversunders")

public class OversAndUndersController {
	
	@Autowired
	OversAndUndersRepository repo;
	
	
	@GetMapping("/report/{paypoint_id}&{period}")

	public List<OversAndUnders> getReports(@PathVariable("period") String period,
			@PathVariable("paypoint_id") int paypoint_id) {

		List<OversAndUnders> result = repo.getReport(period, paypoint_id);

		if (result == null) {
			return new ArrayList<OversAndUnders>();
		} else {

			return result;
		}
	}
	

	@GetMapping("/paypoints")
	public List<Object []> getPaypoints() {

		List<Object []> result = repo.getPaypoint();

		if (result == null) {
			return new ArrayList<Object []>();
		} else {

			return result;
		}
	}

	@GetMapping("/paypointname/{paypoint_id}")
	public List<Object []> getPaypointNames(@PathVariable("paypoint_id") int paypoint_id) {

		List<Object []> result = repo.getPaypointName(paypoint_id);

		if (result == null) {
			return new ArrayList<Object []>();
		} else {

			return result;
		}
	}


}
