package com.sais.cashoffice.CashOfficeTest.paypointmaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sais.cashoffice.CashOfficeTest.entities.TPpCrFileFormatLine;
import com.sais.cashoffice.CashOfficeTest.paypointmaster.model.FileDesignerhdrLinesForm;
import com.sais.cashoffice.CashOfficeTest.paypointtransaction.model.CreditFileFieldFormatForm;

public interface TPpCrFileFormatLineRepository extends JpaRepository<TPpCrFileFormatLine, Long> {

	@Query(value = "SELECT count(*) from T_PP_CR_FILE_FORMAT_LINES where PP_FILE_ID = ?1", nativeQuery = true)
	Long getFieldSequenceByFileId(long fileId);

	@Query(value = "SELECT COALESCE(max(FIELD_SEQUENCE), 0) from T_PP_CR_FILE_FORMAT_LINES where PP_FILE_ID = ?1", nativeQuery = true)
	Long getMaxSequenceByFileId(long fileId);

	TPpCrFileFormatLine findByPpFileIdAndFieldName(Long paypointFileId, String fieldName);

	List<TPpCrFileFormatLine> findByPpFileId(long fileId);

	@Query(value = "select count(*) from T_PP_CR_FILE_FORMAT_LINES PPCRLINES,T_PP_CR_FILE_FORMAT_HDR   PPCRHDR "
			+ "WHERE PPCRLINES.PP_FILE_ID = PPCRHDR.PAYPOINT_FILE_ID AND PPCRHDR.PAYPOINT_ID = ?1", nativeQuery = true)
	long getFieldCount(long paypointId);

	/*
	 * ################################## observe below method to understand how we
	 * can run join queries and map the result to a non entity pojo class in this
	 * case CreditFileFieldFormatForm
	 */

	/*
	 * @Query(value =
	 * "SELECT hdr.paypoint_file_id fileId,hdr.paypoint_id paypointId," +
	 * "hdr.paypoint_name paypointName,hdr.file_name fileName," +
	 * "hdr.enabled enabled,line.line_type lineType,line.field_sequence fieldSequence,"
	 * +
	 * " line.field_name fieldName,line.`delimiter` `delimiter`,line.start_position startPosition,"
	 * +
	 * "line.end_position endPosition,line.file_type fileType,line.data_type dataType,"
	 * + "line.constants constants	FROM T_PP_CR_FILE_FORMAT_HDR hdr," +
	 * "T_PP_CR_FILE_FORMAT_LINES line where hdr.Paypoint_File_Id = line.pp_file_id AND "
	 * + " hdr.paypoint_id =?1 AND line.field_sequence=?2 AND line.line_type=?3",
	 * nativeQuery = true)
	 */
	@Query(nativeQuery = true)
	CreditFileFieldFormatForm getCreditFileFieldFormat(long paypointId, int sequence, String linetype);
}
