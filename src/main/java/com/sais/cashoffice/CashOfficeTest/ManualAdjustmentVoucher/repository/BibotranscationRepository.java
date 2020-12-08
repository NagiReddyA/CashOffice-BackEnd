package com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;
import com.sais.cashoffice.CashOfficeTest.ManualAdjustmentVoucher.model.MigTranscationbobiModel;
import com.sais.cashoffice.CashOfficeTest.entities.TBkStmtDetExclusion;

@Repository
public interface BibotranscationRepository extends JpaRepository<MigTranscationbobiModel,Integer> {
	
	@Query(value="select mb.payment_mode,mb.transaction_code,mb.cash_alloc_trn_id, "
+  "  mb.stmt_receipt_no_old,mb.branch_code,mb.bank_code,mb.bank_stmt_id,"
+   " mb.stmt_number,mb.account_number,mb.allocation_status,"
 +  "mb.accounting_date,mb.gross_amount,mb.allocated_amount,mb.comments "
 +   " from MIG_BOBI_UNALLOCATED_BK_STMTS mb where mb.bank_stmt_id =?1",nativeQuery=true)
	MigTranscationbobiModel getallbibodetails(double stmt);

}
