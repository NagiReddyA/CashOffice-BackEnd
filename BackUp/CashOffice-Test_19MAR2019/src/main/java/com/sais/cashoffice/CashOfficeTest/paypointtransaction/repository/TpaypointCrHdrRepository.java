package com.sais.cashoffice.CashOfficeTest.paypointtransaction.repository;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sais.cashoffice.CashOfficeTest.entities.TPaypointCrHdr;

public interface TpaypointCrHdrRepository extends JpaRepository<TPaypointCrHdr, Long> {
	@Query(value = "SELECT COUNT(1)    FROM T_PAYPOINT_CR_HDR CRHD  WHERE CRHD.PAYPOINT_ID = ?1"
			+ "  AND TRUNCATE(CRHD.UPLOAD_PERIOD, 0) = TRUNCATE(?2 , 0) AND CRHD.FILE_STATUS IN ('U','I') ", nativeQuery = true)
	int getCreditRecordsUploadedCount(Long paypointId, Date period);

	@Query(value = "SELECT COUNT(1)    FROM T_PAYPOINT_CR_HDR CRHD  WHERE CRHD.PAYPOINT_ID = ?1"
			+ "  AND TRUNCATE(CRHD.UPLOAD_PERIOD, 0) = TRUNCATE(?2 , 0) AND CRHD.FILE_STATUS IN ('P') ", nativeQuery = true)
	int getCreditRecordsProcessedCount(Long paypointId, Date period);

	List<TPaypointCrHdr> findByPaypointIdAndUploadPeriodAndFileStatusIn(long paypointId,Date period,Set<String> status);
}
