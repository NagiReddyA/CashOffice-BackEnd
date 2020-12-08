package com.sais.cashoffice.CashOfficeTest.cashofficeReports.services;


import java.util.List;


import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORCashierAssignment;

//import org.springframework.data.jpa.repository.Query;




public interface CORCashierAssignmentService {
	
//	@Query(nativeQuery=true,value="call cashierAssign(:branch_code,:cash_office_code)")
	List<CORCashierAssignment> getCa(String branch_code,String cash_office_code);
	
	

}
