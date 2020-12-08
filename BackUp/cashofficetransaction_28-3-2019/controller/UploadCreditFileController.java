package com.sais.cashoffice.CashOfficeTest.cashofficetransaction.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.TPpCrFileFormatHdrRepository;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.CreditFileUploadForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.service.CreditFileUploadService;

@CrossOrigin(maxAge=3600)
@RequestMapping("/api")
@RestController
public class UploadCreditFileController {
	
	@Autowired
	TPpCrFileFormatHdrRepository crhdrRepo;
	
	@Autowired
	CreditFileUploadService crFileService;
	
	@GetMapping("getCreditFileNameForPp")
	public String getCreditFileNameForPp(@RequestParam String paypointId) {
		return crhdrRepo.findByPaypointId(Long.valueOf(paypointId)).getFileName();
	}
	
	@Transactional
	@PostMapping(value = "/uploadCrediFile",produces="application/json")
	public ResponseEntity<?> creditFileUploadForPaypoint(@RequestParam("creditFile") MultipartFile file,
			@RequestParam("formValue") String form) throws JsonParseException, JsonMappingException, IOException,Exception {
		 System.out.println(form);
		ObjectMapper mapper = new ObjectMapper();
		CreditFileUploadForm formData = mapper.readValue(form, CreditFileUploadForm.class);
		// System.out.println(formData.toString());
		
		return crFileService.uploadCreditFile(formData, file);
	}


}
