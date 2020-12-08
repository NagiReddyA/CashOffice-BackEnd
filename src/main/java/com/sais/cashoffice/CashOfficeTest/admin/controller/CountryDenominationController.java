package com.sais.cashoffice.CashOfficeTest.admin.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.admin.model.CountryDenominationForm;
import com.sais.cashoffice.CashOfficeTest.admin.repository.CountryDenominationRepository;
import com.sais.cashoffice.CashOfficeTest.admin.service.CountryDenominationServiceImpl;
import com.sais.cashoffice.CashOfficeTest.entities.TDenomination;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class CountryDenominationController {
	
	@Autowired
	private CountryDenominationRepository countryDemnRepo;
	
	@Autowired
	private CountryDenominationServiceImpl countryDemnImpl;
	
	@GetMapping(path = "/getCountryDetails")
	public List<CountryDenominationForm> getDenominationdetails() {

		return countryDemnImpl.getCountryDetails();
	}
	
	@PostMapping("/createDenomination")
	@Transactional
	public TDenomination createDenomination(@Valid @RequestBody TDenomination tdenomination) {	
	
		System.out.println(tdenomination.getCountryName());
		System.out.println(tdenomination.getEnabled());
		System.out.println(tdenomination.getDenominationId());
		if (tdenomination.getEnabled() == 1) 
			tdenomination.setEnabled('1');
		else 
			tdenomination.setEnabled('0'); 
				
		
		TDenomination id=countryDemnRepo.findByDenominationCode(tdenomination.getDenominationCode());	
		
				
		if(id !=null) {
			tdenomination.setDenominationId(id.getDenominationId());
			return this.countryDemnRepo.save(tdenomination);	
		}else {			
			return this.countryDemnRepo.save(tdenomination);  
		}
		  
	}  
	
	@GetMapping(path = "/getDenominationCodeDetails/{country}")
	public List<CountryDenominationForm> getDenominationDetails(@PathVariable(value="country") String country) {
	
		String countryName = country.replace("\"", "");
		System.out.println(countryName);
		return countryDemnImpl.getDenominationCodeDetails(countryName);
	}

}
