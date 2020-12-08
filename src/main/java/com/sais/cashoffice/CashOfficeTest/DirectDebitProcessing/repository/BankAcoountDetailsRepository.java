package com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.DirectDebitProcessing.Model.BankAcoountDetails;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;


@Repository
public interface BankAcoountDetailsRepository extends JpaRepository<BankAcoountDetails,Double> {
	
	@Query(value="SELECT * FROM VW_BANK_ACCOUNTS_INFO",nativeQuery=true)
	List<BankAcoountDetails> getallbankaccountdetails();

}
