package com.sais.cashoffice.CashOfficeTest.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffice;

@Repository
public interface CashOfficeSetUpRepository extends JpaRepository<TCashOffice, Long>{

	TCashOffice findByCashOfficeCode(String cashOfficeCode);

	TCashOffice findByCashOfficeId(long cashofficeId);

	TCashOffice findByCashOfficeCodeAndBranchCode(String cashOfficeCode, String branchCode);
	

}
