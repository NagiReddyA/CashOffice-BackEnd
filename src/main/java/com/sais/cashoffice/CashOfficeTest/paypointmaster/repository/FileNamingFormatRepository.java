package com.sais.cashoffice.CashOfficeTest.paypointmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sais.cashoffice.CashOfficeTest.entities.TFileNamingFormat;

public interface FileNamingFormatRepository extends JpaRepository<TFileNamingFormat,Long>{

	TFileNamingFormat findByPaypointId(long ppId);

}
