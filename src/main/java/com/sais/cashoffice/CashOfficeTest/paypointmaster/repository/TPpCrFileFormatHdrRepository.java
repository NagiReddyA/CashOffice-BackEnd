package com.sais.cashoffice.CashOfficeTest.paypointmaster.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sais.cashoffice.CashOfficeTest.entities.TPpCrFileFormatHdr;
import com.sais.cashoffice.CashOfficeTest.entities.TPpTemplate;

public interface TPpCrFileFormatHdrRepository extends JpaRepository<TPpCrFileFormatHdr, Long> {

	TPpCrFileFormatHdr findByPaypointId(long ppId);

	@Query(value = "SELECT UPPER(TRIM(T.CURRENCY))  FROM T_PP_CR_FILE_FORMAT_HDR T "
			+ " WHERE T.PAYPOINT_ID = ?1  AND T.PAYPOINT_ID IS NOT NULL AND T.CURRENCY IS NOT NULL ", nativeQuery = true)
	String findCurrencyByPaypointId(long ppId);
}
