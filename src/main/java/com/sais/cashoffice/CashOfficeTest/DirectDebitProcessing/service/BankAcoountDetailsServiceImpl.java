package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.BankAcoountDetails;
import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository.BankAcoountDetailsRepository;


@Service
public class BankAcoountDetailsServiceImpl implements BankAcoountDetailsService {

	@Autowired
	public BankAcoountDetailsRepository badr;
	
	
	@Override
	public List<BankAcoountDetails> getallbankaccountdetails() {
		
		return badr.getallbankaccountdetails();
	}

}
