package com.sais.cashoffice.CashOfficeTest.paypointmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sais.cashoffice.CashOfficeTest.entities.TPpTemplate;

public interface PaypointTemplateRepository extends JpaRepository<TPpTemplate, Long> {

	TPpTemplate findByPaypointId(long ppId);

}
