package com.sais.cashoffice.CashOfficeTest.paypointmaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sais.cashoffice.CashOfficeTest.entities.TApplicRefValue;
import com.sais.cashoffice.CashOfficeTest.entities.TApplicRefValuePK;

public interface TApplicRefValueRepository extends JpaRepository<TApplicRefValue,TApplicRefValuePK> {

	public List<TApplicRefValue>  findByIdDomainCode(String domaincode);
}
