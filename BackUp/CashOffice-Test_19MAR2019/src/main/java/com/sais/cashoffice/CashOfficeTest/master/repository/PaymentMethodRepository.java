package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TApplication;
import com.sais.cashoffice.CashOfficeTest.entities.TPaymentMethod;

@Repository
public interface PaymentMethodRepository extends JpaRepository<TPaymentMethod, Long> {

	public TPaymentMethod findByPayMethodId(long id);

	public TPaymentMethod findByPayMethodCode(String pymtMethodCode);
}
