package com.sais.cashoffice.CashOfficeTest.paypointmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sais.cashoffice.CashOfficeTest.entities.TPayPoint;

public interface PaypointRepository extends JpaRepository<TPayPoint,Long>
{
	TPayPoint findByPayPointId(long id);
}
