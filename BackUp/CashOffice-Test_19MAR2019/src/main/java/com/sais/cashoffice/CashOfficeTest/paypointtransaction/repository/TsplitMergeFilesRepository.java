package com.sais.cashoffice.CashOfficeTest.paypointtransaction.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sais.cashoffice.CashOfficeTest.entities.TSplitMergeFile;

public interface TsplitMergeFilesRepository extends JpaRepository<TSplitMergeFile, Long> {

	TSplitMergeFile findByFilename(String fileName);	

	List<TSplitMergeFile> findByPeriodAndPaypointIdAndSplit(Date period, Long paypointId, String Split);

	List<TSplitMergeFile> findByPeriodAndPaypointIdAndMerged(Date period, Long paypointId, String merge);

}
