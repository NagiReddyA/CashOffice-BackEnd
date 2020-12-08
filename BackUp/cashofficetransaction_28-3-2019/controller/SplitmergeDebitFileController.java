package com.sais.cashoffice.CashOfficeTest.cashofficetransaction.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

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

import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.SplitDebitFileForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.SplitMergeSearchForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.service.SplitMergeService;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.service.SplitMergeServiceImpl;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class SplitmergeDebitFileController {

	@Autowired
	SplitMergeService splitMergeService;	

	@GetMapping("getDebitFilesDetails/{period}")
	public List<SplitDebitFileForm> getEligibleFiles(@PathVariable("period") String period) throws Exception {

		return splitMergeService.getEligibleDebitFilesForSplitMerge(SplitMergeServiceImpl.convertToDate(period));
	}

	@PostMapping("splitDebitFile")
	@Transactional
	public ResponseEntity<?> splitDebitFile(@RequestBody SplitDebitFileForm form) {
		return splitMergeService.splitDebitFile(form);
	}

	@PostMapping("mergeDebitFiles")
	@Transactional
	public ResponseEntity<?> mergeDebitFile(@RequestBody SplitDebitFileForm form) throws Exception {
		return splitMergeService.mergeDebitFiles(form);
	}

	@GetMapping("searchSplitFiles")
	public List<SplitMergeSearchForm> getSplitFiles(@RequestParam("period") String dateString,
			@RequestParam String pp) throws Exception {
		Date period=SplitMergeServiceImpl.convertToDate(dateString);
		return splitMergeService.getSplitFiles(period,pp);
	}

	@GetMapping("searchMergeFiles")
	public List<SplitMergeSearchForm> getMergeFiles(@RequestParam("period") String dateString,
			@RequestParam String pp) throws Exception {
		Date period=SplitMergeServiceImpl.convertToDate(dateString);
		return splitMergeService.getMergeFiles(period,pp);
	}
}
