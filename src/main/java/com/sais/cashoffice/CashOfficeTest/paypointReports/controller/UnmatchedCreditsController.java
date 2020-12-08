package com.sais.cashoffice.CashOfficeTest.paypointReports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.UnmatchedCredits;
import com.sais.cashoffice.CashOfficeTest.paypointReports.repository.UnmatchedCreditsRepository;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api/paypoint-reports/unmatched-credits")
public class UnmatchedCreditsController {
	
	@Autowired
	UnmatchedCreditsRepository ucRepos ;
		
	@GetMapping("/{ppid}&{ppname}&{period}")
	public List<UnmatchedCredits> getUCs(@PathVariable("ppid") String ppid, 
			@PathVariable("ppname") String ppname,
			@PathVariable("period") String period){ 
		
		System.out.println(); // dbg. 
		System.out.println("::: PPID " + ppid + " PPName " + ppname + " Period " + period ) ; // dbg. 
		System.out.println(); // dbg. 
		
		return ucRepos.getUnmatchedCredits(ppid, ppname, period) ;  
	}

}

