package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOffice;
import com.sais.cashoffice.CashOfficeTest.master.model.CashOfficeDetForm;

@Repository
public interface CashOfficeSetUpRepository extends JpaRepository<TCashOffice, Long>{

	TCashOffice findByCashOfficeCode(String cashOfficeCode);

	TCashOffice findByCashOfficeId(long cashofficeId);

	TCashOffice findByCashOfficeCodeAndBranchCode(String cashOfficeCode, String branchCode);
	
	
	@Query(value =" select max(cash_office_id) from T_CASH_OFFICE",nativeQuery=true)
	public double cashOfficeId();

	//List<Object[]> findByCashOfficeId(double d);


}
