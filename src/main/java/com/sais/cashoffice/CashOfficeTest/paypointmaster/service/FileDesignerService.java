package com.sais.cashoffice.CashOfficeTest.paypointmaster.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.FileDesignerHdrForm;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.FileDesignerhdrLinesForm;

public interface FileDesignerService {
	ResponseEntity<?> saveFileFormatHdrDetails(FileDesignerhdrLinesForm form);

	List<FileDesignerHdrForm> findAllAssignedFileDetails();

	List<FileDesignerhdrLinesForm> findAllAssignedFieldDetails(long ppId);

	ResponseEntity<String> deleteFieldWithId(long id);

}
