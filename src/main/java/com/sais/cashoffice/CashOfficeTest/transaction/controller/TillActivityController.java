package com.sais.cashoffice.CashOfficeTest.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.entities.TCashTillActivity1;
import com.sais.cashoffice.CashOfficeTest.transaction.model.ActivityForm1;
import com.sais.cashoffice.CashOfficeTest.transaction.model.TillActivityForm;
import com.sais.cashoffice.CashOfficeTest.transaction.service.ActivityImplDe;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class TillActivityController {


	@Autowired
	private ActivityImplDe tci;


	@GetMapping(path = "/TillDetails/{LId}", produces ="application/json")
	public List<TillActivityForm> getTillActivitydetails(@PathVariable String LId){	
		String lid1 = LId.replace("\"", "");
		return tci.getTillData(lid1) ;   

	}
	@PostMapping(path = "/Tillactivity", produces ="application/json")
	public TCashTillActivity1 getAllActivity6(@RequestBody TillActivityForm tcash) throws Exception {

		return tci.updateStatus(tcash);
	}

	@GetMapping(path = "/CheckTillDetails/{LId}", produces ="application/json")
	public List<ActivityForm1> getCheckTilldetails(@PathVariable String LId){
		String lid1 = LId.replace("\"", "");
		return tci.getCheckTillData(lid1);   

	}
	@GetMapping(path = "/CheckTillStatus/{LId}", produces ="application/json")
	public List<TillActivityForm> getCheckTillstatus(@PathVariable String LId){
		String lid1 = LId.replace("\"", "");
		return tci.getCheckTillStatus(lid1);   

	}

}	



