package com.sais.cashoffice.CashOfficeTest.paypointmaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.entities.TApplicRefValue;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.FileDesignerHdrForm;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.FileDesignerhdrLinesForm;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.TApplicRefValueRepository;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.service.FileDesignerService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class FileDesignerController {

	@Autowired
	TApplicRefValueRepository fieldsRepo;

	@Autowired
	FileDesignerService fdService;

	@GetMapping("/getFileDsgnFields")
	public List<TApplicRefValue> getFieldNames() {
		return fieldsRepo.findByIdDomainCode("FIELD_TYPES");
	}

	@Transactional
	@PostMapping("saveFileDesignToPP")
	public ResponseEntity<?> saveDbtFileDetailsToPP(@RequestBody FileDesignerhdrLinesForm form) {
		return fdService.saveFileFormatHdrDetails(form);
	}
	
	@GetMapping("/getAssignedFileDetails")
	public List<FileDesignerHdrForm> getAssignedFileDetails(){
		return fdService.findAllAssignedFileDetails();
	}
	
	@GetMapping("/getAssignedFieldDetails")
	public List<FileDesignerhdrLinesForm> getAssignedFieldDetails(@RequestParam("ppId") long ppId){
		return fdService.findAllAssignedFieldDetails(ppId);
	}
	
	@DeleteMapping("/deleteFieldWithId/{ppFileFormatId}")
	public ResponseEntity<String> deleteFieldForppWithId(@PathVariable("ppFileFormatId") long id){
		return fdService.deleteFieldWithId(id);		
	}
}
