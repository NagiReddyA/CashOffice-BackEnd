package com.sais.cashoffice.CashOfficeTest.paypointmaster.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.AssignDbtFileTmpt;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.service.PaypointService;
import com.sais.cashoffice.exception.Response;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOfficeCashier;
import com.sais.cashoffice.CashOfficeTest.entities.TPayPoint;
import com.sais.cashoffice.CashOfficeTest.entities.TPpAttribute;
import com.sais.cashoffice.CashOfficeTest.entities.TPpTemplate;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class AssignDbtFileToPaypointController {

	@Autowired
	PaypointService ppService;

	@GetMapping("/getPaypoints")
	public List<TPayPoint> getPaypoints() {
		return this.ppService.fetchAllPaypoints();
	}

	@GetMapping("/getPaypointAttributes")
	public List<TPpAttribute> getPaypointAttribuites() {
		return this.ppService.fetchPaypointAttributes();
	}

	@Transactional
	@PostMapping(value = "/assignDebitFileTemplate",produces="application/json")
	public ResponseEntity<?> assignDebitFileTemplate(@RequestParam("selectTemplate") MultipartFile file,
			@RequestParam("formValue") String form) throws JsonParseException, JsonMappingException, IOException {
		 System.out.println(form);
		ObjectMapper mapper = new ObjectMapper();
		AssignDbtFileTmpt formData = mapper.readValue(form, AssignDbtFileTmpt.class);
		// System.out.println(formData.toString());
		return ppService.assignDebitFileTemplate(formData, file);

	}
	@GetMapping("/getAsgndPayPointDetails")
	public List<AssignDbtFileTmpt> getAsgndPayPointDetails() {
		return this.ppService.fetchAsgndPayPointDetails();
	}
	

}
