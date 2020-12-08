package com.sais.cashoffice.CashOfficeTest.paypointtransaction.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sais.cashoffice.CashOfficeTest.entities.TPaypointDrHdr;

public interface TpaypointDrHdrRepository extends JpaRepository<TPaypointDrHdr, Long> {

	List<TPaypointDrHdr> findByPeriodAndFileStatus(Date period, String string);

	TPaypointDrHdr findByPaypointIdAndPeriodAndStrikeDateFromAndStrikeDateTo(long paypointId, Date period, Date strikeDateFrom, Date StrikeDateTo);

}
