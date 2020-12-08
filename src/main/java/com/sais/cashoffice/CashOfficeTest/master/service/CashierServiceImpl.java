package com.sais.cashoffice.CashOfficeTest.master.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffice;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOfficeCashier;
import com.sais.cashoffice.CashOfficeTest.entities.TCashier;
import com.sais.cashoffice.CashOfficeTest.entities.TCompanyOrgan;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignCashierForm;
import com.sais.cashoffice.CashOfficeTest.master.model.CashierDetailsForm;
import com.sais.cashoffice.CashOfficeTest.master.repository.CashOfficeCashierRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CashOfficeSetUpRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CashierRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CompanyOrganRepository;
import com.sais.cashoffice.CashOfficeTest.repository.UserRepository;
import com.sais.cashoffice.exception.DuplicateDataException;

@Service
public class CashierServiceImpl implements CashierService {

	private static final Logger LOGGER = LogManager.getLogger(CashierServiceImpl.class);

	@Autowired
	private CashierRepository employeeRepository;

	@Autowired
	private CompanyOrganRepository coRepo;

	@Autowired
	private ModelMapper modelmapper;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private CashOfficeCashierRepository cashofficecashierRepo;

	@Autowired
	private CashOfficeSetUpRepository cashOfficeSetUpRepo;

	@Override
	public List<CashierDetailsForm> fetchAllCashierDetails() {
		
		List<CashierDetailsForm> appFormList1 = new ArrayList<CashierDetailsForm>();
	    List<Object[]> appList = employeeRepository.getCashierDtls();
	    if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				CashierDetailsForm appForm = new CashierDetailsForm();
				appForm.setCashierId((double) object[0]);
				appForm.setBranchCode((String) object[1]);
				appForm.setCashierCode((String) object[2]); 
				appForm.setCashierName((String) object[3]);
				appForm.setLoginId((String) object[4]);
				appForm.setBranchName((String) object[5]);
				appFormList1.add(appForm);				
			}	
	    }
		return appFormList1;			
	}

	@Override
	public TCashier findByCashierId(Long employeeId) {
		// TODO Auto-generated method stub
		return employeeRepository.findByCashierId(employeeId);
	}

	@Override
	@Transactional
	public TCashier createCashier(@Valid CashierDetailsForm employee) throws Exception {
		TCashier cashierEntity = modelmapper.map(employee, TCashier.class);
		cashierEntity.setUser(userRepo.findByUsername(employee.getLoginId()));
		cashierEntity.setBranchCode(coRepo.findByAbbrName(employee.getBranchCode()).getOrganCode());
		try {
			TCashier id = employeeRepository.findByCashierCodeAndCashierName(employee.getCashierCode(),
					employee.getCashierName());
			System.out.println("Cashier ID:"+id);
			if (id != null) {
				cashierEntity.setCashierId(id.getCashierId());
				return employeeRepository.save(cashierEntity);
			} else {
				return employeeRepository.save(cashierEntity);
			}
		} catch (Exception ex) {
			throw new Exception("There was an Error occured during saving cashier entity");
		}

	}

	@Override
	@Transactional
	public TCashOfficeCashier assignCashier(AssignCashierForm cashier) throws Exception {
		TCashOfficeCashier cashierEntity = modelmapper.map(cashier, TCashOfficeCashier.class);
//		long l = (long) cashier.getCashierId(); 
//		cashierEntity.setCashier(employeeRepository.findByCashierId(l));
//		System.out.println(cashierEntity.getCashier()); 
		TCashOffice tco = cashOfficeSetUpRepo.findByCashOfficeCode(cashier.getCashOfficeCode());
		cashierEntity.setCashOffice(tco);
		cashierEntity.setSeniorCashierYn((cashier.getIsSenior() == true) ? "1" : "0");
		try {
		if (cashofficecashierRepo
				.findByCashier_CashierIdAndCashOffice_CashOfficeId((long) cashier.getCashierId(),
						Long.valueOf(tco.getCashOfficeId()))
				.stream().anyMatch(csr -> true)) {	
			cashofficecashierRepo.updateEnddate(cashier.getEndDate(),(cashier.getIsSenior() == true) ? "1" : "0",cashier.getCoCashierid());
		//	throw new DuplicateDataException("This Cashier is already assigned to given CashOffice");
		
		} else {
			System.out.println("This Cashier is  assigned to given CashOffice");
		} 	
		}catch(Exception e)
		{		
			return null;
		}
		return cashofficecashierRepo.save(cashierEntity);
	} 

	@Override
	public List<AssignCashierForm> findAssignedCashiers(long cashOfficeId) {
		List<TCashOfficeCashier> assgndCashiers = cashofficecashierRepo.findByCashOfficeId(cashOfficeId);
		List<AssignCashierForm> cdfList = new ArrayList<AssignCashierForm>();
		for (TCashOfficeCashier tcoc : assgndCashiers) {
			AssignCashierForm cdf = new AssignCashierForm();
			TCashier tc = employeeRepository.findByCashierId(tcoc.getCashier().getCashierId());
			 System.out.println(tcoc.getSeniorCashierYn());
			Optional<TCompanyOrgan> optionalProject = Optional.ofNullable(coRepo.findByOrganCode(tc.getBranchCode()));
			if (optionalProject.isPresent()) {
				cdf.setCoCashierid((int) tcoc.getCoCashierId());
				cdf.setCashierId(tc.getCashierId());
				cdf.setCashierCode(tc.getCashierCode());
				cdf.setCashierName(tc.getCashierName());
				cdf.setBranchName(optionalProject.get().getCompanyName());
				cdf.setLoginId(tc.getUser().getUsername());
				cdf.setBranchCode(optionalProject.get().getAbbrName());
				cdf.setStartDate(tcoc.getStartDate());
				cdf.setEndDate(tcoc.getEndDate());
				cdf.setIsSenior(tcoc.getSeniorCashierYn().equals("1") ? true :false);
				cdfList.add(cdf);
			}

		}
		return cdfList;
	}
	
	public String InsertUpdateCashierDtls(String csh_code, String csh_name, String branch_code,
															String login_id, String created_by ){		
			//List<CashierDetailsForm> appFormList1 = new ArrayList<CashierDetailsForm>();
			String appList = employeeRepository.InsertUpdateCashier(csh_code,csh_name,branch_code,login_id,created_by);
//			if (appList != null && !appList.isEmpty()) {
//				for (Object[] object : appList) {
//					CashierDetailsForm appForm = new CashierDetailsForm();
//					appForm.setCashierName((String) object[0]);
//					appFormList1.add(appForm);				
//				}	
//		    }
			return appList;
}

}
