package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TCompanyOrgan;

@Repository
public interface CompanyOrganRepository extends JpaRepository<TCompanyOrgan, Long>{

	TCompanyOrgan findByOrganCode(String branchCode);

	List<TCompanyOrgan> findDistinctByOrganCodeNotIn(String branchCode);
	
	List<TCompanyOrgan> findDistinctByOrganIdNotIn(long BranchCode);

	TCompanyOrgan findByAbbrName(String branchCode);
	
	
	
	/*@Query(
			value="select * from T_COMPANY_ORGAN",
			nativeQuery=true)
	List<TCompanyOrgan> findAllBranches();*/
	//TCompanyOrgan findByOrganCodeAndOrganId(String branchCode);

}
