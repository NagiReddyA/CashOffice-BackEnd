package com.sais.cashoffice.CashOfficeTest.allocations.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.Service.BibotranscationServiceImpl;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.Service.InsertRecordManualAdjumentVouncherImpl;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.Service.ManualAdjumentVouncherServiceImpl;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.Service.UpdateManualAdjustMentVouncherServiceImpl;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.model.ManualAdjumentVoucherRecordModel;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.model.MigTranscationbobiModel;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.repository.BibotranscationRepository;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.repository.ManualAdjumentVouncherRepository;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class ManualAdjumentVoucherController {
	
	
	
	@Autowired
	private ManualAdjumentVouncherServiceImpl mavs;
	
	@Autowired
	private BibotranscationServiceImpl btr;
	
	@Autowired
	private InsertRecordManualAdjumentVouncherImpl irmv;
	
	@Autowired
	private UpdateManualAdjustMentVouncherServiceImpl uas;
	
	
	
	// fetching T_MANUAL_ADJUSTMENT records
	@GetMapping(path="/allocations/manualadjustmentvoucher/unpostingstatus")
	public List<ManualAdjumentVoucherRecordModel> fetchallmanualunposteddetails(){
		return mavs.fetchallunpostvouchers();
	}
	
	
	//fetching MIG_BOBI_UNALLOCATED_BK_STMTS records details
	@GetMapping(path="/allocations/manualadjustmentvoucher/bibo")
	public MigTranscationbobiModel fetchallmanualvouchers(@RequestParam("bankstmtnum") double bankstmt){
		return btr.getallbibodetails(bankstmt);
	}
	
	
	
	
	
	@PostMapping(path="/allocations/manualadjustmentvoucher/unpostingstatus/saverecord")
    public ResponseEntity<?> saverecordposting(@RequestBody ManualAdjumentVoucherRecordModel mv){
		
		
		System.out.println(mv.getPolicyCode());
		System.out.println(mv.getAdjTransactionType());
		System.out.println(mv.getAmount());
		System.out.println(mv.getPeriod());
		System.out.println(mv.getComments());
		System.out.println(mv.getBobiRefNumber());
		System.out.println(mv.getCreatedBy());
		System.out.println(mv.getModifiedBy());
		
		Date creationdate = new Date();
		Date modifieddate = new Date();
		Date posteddate = new Date();
		
		
		
      double manualadjustmentid = irmv.insertrecordtmanualadjustment(mv.getPolicyCode(), mv.getAdjTransactionType(),
    		  mv.getPeriod(), mv.getAmount(), mv.getComments(),
    		  mv.getBobiRefNumber(), creationdate,mv.getCreatedBy(), modifieddate,
    		  mv.getModifiedBy(), mv.getPostingStatus() , posteddate);
		
		return ResponseEntity.ok().body(manualadjustmentid);
	}
	
	
	
	
	
	@PutMapping(path="/allocations/manualadjustmentvoucher/unpostingstatus/updaterecord")
	 public ResponseEntity<?> updatingrecordposting(@RequestBody ManualAdjumentVoucherRecordModel mv){
		
		System.out.println(mv.getPolicyCode());
		System.out.println(mv.getAdjTransactionType());
		System.out.println(mv.getPeriod());
		System.out.println(mv.getAmount());		
		System.out.println(mv.getComments());
		System.out.println(mv.getManualAdjId());
		System.out.println(mv.getModifiedBy());
		
		Date modifieddate = new Date();

  double manualadjid = uas.updatemanualadjustemtvouncher(mv.getPolicyCode(), mv.getAdjTransactionType(),
		                                                 mv.getPeriod(), mv.getAmount(), mv.getComments(),
		                                                 mv.getBobiRefNumber(), modifieddate,
		                                                 mv.getModifiedBy(), mv.getManualAdjId());

		return ResponseEntity.ok().body(manualadjid);
	}
}
