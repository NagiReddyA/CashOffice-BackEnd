package com.sais.cashoffice.CashOfficeTest.cashofficetransaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.PaypointTemplateRepository;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.GenDebitFileForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.service.GenerateDebitFileService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class GenerateDebitFileController {

	@Autowired
	PaypointTemplateRepository ppTmplRepo;
	
	@Autowired
	GenerateDebitFileService genDbtFlService;

	@GetMapping("/getTemplateName/{ppId}")
	public String getTempalteNameForPp(@PathVariable("ppId") String paypoint) {
		try {
		return ppTmplRepo.findByPaypointId(Long.valueOf(paypoint)).getPpTemplateCode();
		}catch(Exception e) {
			return "Failed To fetch Template for paypoint"+paypoint;
		}
	}

	@PostMapping("/generateDebitFileForPaypoint")
	public ResponseEntity<?> generateDebitFileForPaypoint(@RequestBody GenDebitFileForm form) {
		return genDbtFlService.generateManualDebitFile(form);
	}

}
