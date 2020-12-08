package com.sais.cashoffice.CashOfficeTest.paypointmaster.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.sais.cashoffice.CashOfficeTest.entities.TFileNamingFormat;
import com.sais.cashoffice.CashOfficeTest.entities.TPayPoint;
import com.sais.cashoffice.CashOfficeTest.entities.TPpAttribute;
import com.sais.cashoffice.CashOfficeTest.entities.TPpTemplate;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.AssignDbtFileTmpt;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.FileNamingFormatForm;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.FileNamingFormatRepository;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.PaypointAttrbutesRepository;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.PaypointRepository;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.repository.PaypointTemplateRepository;
import com.sais.cashoffice.exception.ErrorDetails;
import com.sais.cashoffice.exception.Response;

@Service
public class PaypointServiceImpl implements PaypointService {

	@Autowired
	PaypointRepository ppRepo;

	@Autowired
	PaypointAttrbutesRepository paRepo;

	@Autowired
	FileService fileservice;

	@Autowired
	ModelMapper modelmapper;

	@Autowired
	PaypointTemplateRepository ppTmplrepo;

	@Autowired
	FileNamingFormatRepository fnfRepo;

	@Override
	public List<TPayPoint> fetchAllPaypoints() {
		// TODO Auto-generated method stub
		return this.ppRepo.findAll();
	}

	@Override
	public List<TPpAttribute> fetchPaypointAttributes() {
		// TODO Auto-generated method stub
		return this.paRepo.findAll();
	}

	@Transactional
	@Override
	public ResponseEntity<?> assignDebitFileTemplate(AssignDbtFileTmpt form, MultipartFile file) {
		String message = "";
		Response resp = null;
		TPpTemplate id = null;
		TFileNamingFormat fnfid = null;
		try {
			fileservice.store(file,FileService.templatesLocation);
			message = "You have successfully uploaded debitfile " + file.getOriginalFilename() + "!";
			form.setPpTemplateCode(file.getOriginalFilename());
			form.setPpTemplatePath(FileService.templatesLocation.toUri().toString());

			// setting up pp_template entity for saving
			TPpTemplate asgnTmpl = modelmapper.map(form, TPpTemplate.class);
			asgnTmpl.setOtherPremOnlyYn(form.getOtherPremOnly() == "true" ? "Y" : "N");
			asgnTmpl.setPensionOnlyYn(form.getPensionOnly() == "true" ? "Y" : "N");
			asgnTmpl.setPaypointId(Long.valueOf(form.getPpId()));
			asgnTmpl.setPpAttributeId(form.getPpAttributeId());
			TPpTemplate tpt = ppTmplrepo.findByPaypointId(form.getPpId());
			if (tpt != null) {
				asgnTmpl.setPpTemplateId(tpt.getPpTemplateId());
				id = ppTmplrepo.save(asgnTmpl);
				message = message + " Updated data into T_PP_TEMPLATE for paypoint " + tpt.getPpTemplateId();
			} else {
				id = ppTmplrepo.save(asgnTmpl);
				message = message + " inserted data into T_PP_TEMPLATE for paypoint " + id.getPpTemplateId();
			}

			// setting file_naming_format entity
			FileNamingFormatForm fnf = new FileNamingFormatForm();
			fnf.setPaypointId(Long.valueOf(form.getPpId()));
			fnf.setConstant(form.getFfConstantValue());
			fnf.setPeriod(form.getFfPeriod());
			fnf.setStrikeDate(form.getFfStrikeday());
			fnf.setFileExtension(form.getFfFileExtension());
			TFileNamingFormat filenf = modelmapper.map(fnf, TFileNamingFormat.class);
			filenf.setPpTemplate(id);

			TFileNamingFormat tfnf = fnfRepo.findByPaypointId(form.getPpId());

			if (tfnf != null) {
				filenf.setPpFileNameFormatId(tfnf.getPpFileNameFormatId());
				fnfid = fnfRepo.save(filenf);
				message = message + " Updated data into T_FILE_NAMING_FORMAT for paypoint " + fnfid.getPaypointId();
			} else {
				fnfid = fnfRepo.save(filenf);
				message = message + " inserted data into T_FILE_NAMING_FORMAT for paypoint " + fnfid.getPaypointId();
			}
			System.out.println(ResponseEntity.status(HttpStatus.OK).body(message));
			resp = new Response(200, message);
			return new ResponseEntity<>(resp, HttpStatus.OK);
		} catch (Exception e) {
			// e.printStackTrace();
			message = "Failed to Assign template to paypoint " + file.getOriginalFilename() + "! " + e.getMessage();
			ErrorDetails error = new ErrorDetails(new Date(), message, null);
			return new ResponseEntity<>(error, HttpStatus.EXPECTATION_FAILED);
		}

	}

	@Override
	public List<AssignDbtFileTmpt> fetchAsgndPayPointDetails() {
		List<TPpTemplate> tmplList = ppTmplrepo.findAll();
		List<AssignDbtFileTmpt> result = new ArrayList<AssignDbtFileTmpt>();
		for (TPpTemplate pt : tmplList) {
			AssignDbtFileTmpt asgtmplForm = new AssignDbtFileTmpt();
			asgtmplForm.setPpId(pt.getPaypointId());
			asgtmplForm.setPpName(this.ppRepo.findById(pt.getPaypointId()).orElse(null).getPayPointName());
			asgtmplForm.setSelectTemplate(pt.getPpTemplateCode());
			asgtmplForm.setPpAttributeId(pt.getPpAttributeId());
			asgtmplForm.setPensionOnly(pt.getPensionOnlyYn());
			asgtmplForm.setOtherPremOnly(pt.getOtherPremOnlyYn());
			asgtmplForm.setPpAttributeDesc(this.paRepo.findById(pt.getPpAttributeId()).orElse(null).getAttrComDesc());
			TFileNamingFormat tfnf = pt.getFileNamingFormats().get(0);
			asgtmplForm.setFfConstantValue(tfnf.getConstant());
			asgtmplForm.setFfPeriod(tfnf.getPeriod());
			asgtmplForm.setFfStrikeday(tfnf.getStrikeDate());
			asgtmplForm.setFfFileExtension(tfnf.getFileExtension());
			result.add(asgtmplForm);
		}
		return result;
	}
}
