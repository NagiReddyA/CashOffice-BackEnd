package com.sais.cashoffice.CashOfficeTest.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TDenomination;

@Repository
public interface CountryDenominationRepository extends JpaRepository<TDenomination,Integer> {
	
	public TDenomination findByDenominationCode(String denominationCode);
	
	@Query(value=
			"select * from T_COUNTRY ",nativeQuery=true)
	public List<Object[]> getCountryDetails();
	
	@Query(value=
			" SELECT DENOMINATION_ID,DENOMINATION_CODE,ENABLED FROM T_DENOMINATION WHERE COUNTRY_NAME=?1",nativeQuery=true)
	public List<Object[]> getDenominationCodeDetails(String countryName);
}
