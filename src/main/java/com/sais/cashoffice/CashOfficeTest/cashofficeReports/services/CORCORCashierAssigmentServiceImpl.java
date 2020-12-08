package com.sais.cashoffice.CashOfficeTest.cashofficeReports.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities.CORCashierAssignment;
import com.sais.cashoffice.CashOfficeTest.cashofficeReports.repository.CORCashierAssignmentRepository;

@Service
public class CORCORCashierAssigmentServiceImpl implements CORCashierAssignmentService {

	@Autowired
	private CORCashierAssignmentRepository repository;

	@Autowired
	private EntityManager entityManager;

	
	private StoredProcedureQuery storedProcedureQuery;
	
	
	
	

	@SuppressWarnings("unchecked")
	
	@Override
	public List<CORCashierAssignment> getCa(String branch_code,String cash_office_code) {

		
//		List<CashierAssignment> ca = repository.getCa(branch_code, cash_office_code);
//		
//		return ca;
		storedProcedureQuery = this.entityManager.createNamedStoredProcedureQuery("ca");
		storedProcedureQuery.setParameter("branch_code", branch_code);
		storedProcedureQuery.setParameter("cash_office_code", cash_office_code);
		
		storedProcedureQuery.execute();
		
		
		List<CORCashierAssignment> result = storedProcedureQuery.getResultList();
		
		
		return result;
		
		
		
	}

	public CORCashierAssignmentRepository getRepository() {
		return repository;
	}

	public void setRepository(CORCashierAssignmentRepository repository) {
		this.repository = repository;
	}

}
