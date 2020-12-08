package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TCashier;

@Repository
public interface CashierRepository extends JpaRepository<TCashier, Long> {

	TCashier findByCashierId(Long employeeId);

	TCashier findByCashierCodeAndUser_UserId(String cashierCode, String loginId);

	TCashier findByCashierCodeAndCashierName(String cashierCode, String cashierName);

}
