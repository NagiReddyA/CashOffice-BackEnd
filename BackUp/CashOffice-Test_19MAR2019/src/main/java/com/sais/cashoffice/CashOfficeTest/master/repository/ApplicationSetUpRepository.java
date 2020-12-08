package com.sais.cashoffice.CashOfficeTest.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TApplication;

@Repository
public interface ApplicationSetUpRepository extends JpaRepository<TApplication, Long> {

	TApplication findByAppCode(String applicationCode);

	
}
