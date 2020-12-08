package com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORPaymentMethod;

public interface CORPaymentMethodRepository extends JpaRepository<CORPaymentMethod, Long> {
	
	@Query(nativeQuery = true,value="select * from v_paymentmethod group by pay_method_code,branch_name")
	List<CORPaymentMethod> getPaymentMethod();

}
