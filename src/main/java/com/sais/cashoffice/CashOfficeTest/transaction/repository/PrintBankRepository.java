package com.sais.cashoffice.CashOfficeTest.transaction.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TDepositSlip1;
import com.sais.cashoffice.CashOfficeTest.entities.TDepositedDenomination;

@Repository
public interface PrintBankRepository extends JpaRepository<TDepositSlip1, Long> {

	@Query(value = "call pe_Get_CashOffDet(?)", nativeQuery = true)
	public List<Object[]> getCashOffDetails(@Param(value = "userID") String userID);

	@Query(value = "select distinct DENOMINATION_CODE from T_DEPOSITED_DENOMINATION", nativeQuery = true)
	public String[] getDenominationDetails();

	@Query(value = " SELECT R.*, PM.PAY_METHOD_DESC "
			+ "  FROM T_RECEIPT R LEFT OUTER JOIN T_PAYMENT_METHODS PM ON R.PAY_METHOD_ID=PM.PAY_METHOD_ID "
			+ " WHERE R.RECEIPT_DATE=?1", nativeQuery = true)
	public List<Object[]> getReceipts(LocalDate localDate);

	@Query(value = "SELECT   CASH_OFF_ACTIVITY_ID,CASH_OFFICE_ID,coa.CASHIER_ID "
			+ " FROM T_CASH_OFF_ACTIVITY coa LEFT JOIN T_CASHIERS CA ON "
			+ " coa.CASHIER_ID=CA.CASHIER_ID  WHERE  CA.LOGIN_ID=?1 order by "
			+ " coa.CASH_OFF_ACTIVITY_ID desc limit 1", nativeQuery = true)
	public List<Object[]> getCashierDetails(@Param(value = "userID") String userID);

	@Query(value = " select max(DEPOSIT_SLIP_ID) FROM T_DEPOSIT_SLIP ", nativeQuery = true)
	public int getDepositId();

	@Query(value = " select DEPOSIT_SLIP_ID from cash_office.T_DEPOSIT_SLIP "
			+ " where CASHIER_ID =?1 and RECEIPTING_DATE =?2 order by DEPOSIT_SLIP_ID desc limit 1 ", nativeQuery = true)
	public double getDepositSlipId(double cashierId, LocalDate d);

	@Query(value = " select max(DEP_DENOMINATION_ID) from T_DEPOSITED_DENOMINATION ", nativeQuery = true)
	public double getDepDenominationId();

	public void save(TDepositedDenomination cashoffactivityEntity);
	
	@Query(value =" call pe_Create_Deposit_Slip(?1,?2,?3,?4,?5,?6)",nativeQuery=true)
	public void saveDepositslip(int cashOffActivityId, double CashOfficeId,double CashierId, LocalDate receiptingDate, LocalDate depositDate,
			String createdBy);  
 
}
