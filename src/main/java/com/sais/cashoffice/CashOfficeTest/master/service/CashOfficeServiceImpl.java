package com.sais.cashoffice.CashOfficeTest.master.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffApp;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOffPymtMthd;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOffice;
import com.sais.cashoffice.CashOfficeTest.entities.TCompanyOrgan;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignApplicationForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignPaymentMethodForm;
import com.sais.cashoffice.CashOfficeTest.master.model.CashOfficeDetForm;
import com.sais.cashoffice.CashOfficeTest.master.repository.ApplicationSetUpRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CashOffPymtMethodRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CashOfficeAppRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CashOfficeSetUpRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CompanyOrganRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.PaymentMethodRepository;
import com.sais.cashoffice.exception.DuplicateDataException;

@Service
public class CashOfficeServiceImpl implements CashOfficeService {

	@Autowired
	private CashOfficeSetUpRepository cashOfficeSetUpRepo;

	@Autowired
	private CompanyOrganRepository coRepo;

	@Autowired
	private ModelMapper modelmapper;

	@Autowired
	private CashOfficeAppRepository coAppRepo;

	@Autowired
	private ApplicationSetUpRepository appSetUpRepo;

	@Autowired
	private PaymentMethodRepository paymentMethodRepo;

	@Autowired
	private CashOffPymtMethodRepository cashOffPymtRepo;

	@Override
	public List<CashOfficeDetForm> getCashOfficeDetails() {
		List<CashOfficeDetForm> appFormList1 = new ArrayList<CashOfficeDetForm>();
		List<Object[]> appList = coAppRepo.getCashOfficeDtls();
		if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				CashOfficeDetForm appForm = new CashOfficeDetForm();
				appForm.setCashOfficeCode((String) object[0]);
				appForm.setCashOfficeDesc((String) object[1]);
				appForm.setBranchCode((String) object[2]);
				appForm.setBranchName((String) object[3]);
				appForm.setCashOfficeId((double) object[4]);
				appFormList1.add(appForm);
			}
		}
		return appFormList1;
	}

	@Override
	@Transactional(readOnly = true)
	public List<TCompanyOrgan> getBranchesDetails() {
		return coRepo.findAll();
	}

	
	@Override
	@Transactional
	public TCashOffice createCashOffice(CashOfficeDetForm coDetails) throws Exception {

		TCashOffice coEntity = modelmapper.map(coDetails, TCashOffice.class);
		String s = coRepo.getCode(coDetails.getBranchCode());
		coEntity.setBranchCode(s);
		TCashOffice appList= cashOfficeSetUpRepo.findByCashOfficeId((long) (coDetails.getCashOfficeId()));
		try {
			if (appList == null) {	
				coEntity.setCashOfficeCode(coDetails.getCashOfficeCode());
				coEntity.setCashOfficeDesc(coDetails.getCashOfficeDesc());
			} else {
				throw new DuplicateDataException("Already this cash office existed in trhrow exception ");
			}
		} catch (Exception e) {
			return null;
		} 
		 double d1= cashOfficeSetUpRepo.cashOfficeId();
		 long d2=((long) d1+1);  
		 coEntity.setCashOfficeId((d2)); 
		return cashOfficeSetUpRepo.save(coEntity);
	}

	@Override
	public List<AssignApplicationForm> fetchAllApplicationsAssignedToCashOffice(String code) {
		TCashOffice tc = cashOfficeSetUpRepo.findByCashOfficeCode(code);
		List<TCashOffApp> apps = coAppRepo.findByCashOfficeId(tc.getCashOfficeId());
		List<AssignApplicationForm> assignList = new ArrayList<AssignApplicationForm>();
		for (TCashOffApp tco : apps) {
			AssignApplicationForm aa = new AssignApplicationForm();
			aa.setAppId(tco.getTApplication().getAppId());
			aa.setCashOfficeCode(tco.getTCashOffice().getCashOfficeCode());
			aa.setApplicationCode(tco.getTApplication().getAppCode());
			aa.setApplicationDesc(tco.getTApplication().getAppDesc());
			aa.setStartDate(tco.getStartDate());
			aa.setEndDate(tco.getEndDate());
			assignList.add(aa);
		}

		return assignList;
	}

	@Override
	@Transactional
	public TCashOffApp assignAppToCashOffice(AssignApplicationForm details) throws Exception {
		TCashOffApp coaEntity = modelmapper.map(details, TCashOffApp.class);
		System.out.println(details.getApplicationCode());
		coaEntity.setTApplication(appSetUpRepo.findByAppCode(details.getApplicationCode()));
		TCashOffice tco = cashOfficeSetUpRepo.findByCashOfficeCode(details.getCashOfficeCode());
		coaEntity.setTCashOffice(tco);
		try {
			if (coAppRepo.findByAppIdAndCashOfficeId((long) details.getAppId(), Long.valueOf(tco.getCashOfficeId()))
					.stream().anyMatch(csr -> true)) {
				throw new DuplicateDataException("This Application code is already assigned to given CashOffice");

			} else {
				// return cashofficecashierRepo.save(cashierEntity);
				System.out.println("This Application code is  assigned to given CashOffice");
			}

		} catch (Exception e) {

			return null;
		}
		// TCashOffApp id = coAppRepo.save(coaEntity);
		return coAppRepo.save(coaEntity);
	}

	@Override
	public List<AssignPaymentMethodForm> fetchAllPaymentMethodsAsgndToCashOffice(String code) {
		TCashOffice tc = cashOfficeSetUpRepo.findByCashOfficeCode(code);
		List<TCashOffPymtMthd> apps = cashOffPymtRepo.findByCashOfficeId(tc.getCashOfficeId());
		List<AssignPaymentMethodForm> assignList = new ArrayList<AssignPaymentMethodForm>();
		for (TCashOffPymtMthd tco : apps) {
			AssignPaymentMethodForm aa = new AssignPaymentMethodForm();
			aa.setPayMethodId(tco.getTPaymentMethod().getPayMethodId());
			aa.setCashOfficeCode(tco.getTCashOffice().getCashOfficeCode());
			aa.setPymtMethodCode(tco.getTPaymentMethod().getPayMethodCode());
			aa.setPymtMethodDesc(tco.getTPaymentMethod().getPayMethodDesc());
			aa.setStartDate(tco.getStartDate());
			aa.setEndDate(tco.getEndDate());
			assignList.add(aa);
		}
		return assignList;
	}

	@Override
	@Transactional
	public TCashOffPymtMthd assignPymtMethodToCashOffice(AssignPaymentMethodForm assignForm) throws Exception {
		TCashOffPymtMthd copEntity = modelmapper.map(assignForm, TCashOffPymtMthd.class);
		copEntity.setTPaymentMethod(paymentMethodRepo.findByPayMethodCode(assignForm.getPymtMethodCode()));
		TCashOffice tco = cashOfficeSetUpRepo.findByCashOfficeCode(assignForm.getCashOfficeCode());
		copEntity.setTCashOffice(tco);
		System.out.println("paymethod id ===========>" + assignForm.getPayMethodId());
		try {
			if (cashOffPymtRepo.findByPymtMethodIdAndCashOfficeId((long) assignForm.getPayMethodId(),
					Long.valueOf(tco.getCashOfficeId())).stream().anyMatch(csr -> true)) {
				throw new DuplicateDataException("This payment method code is already assigned to given CashOffice");

			} else {
				// return cashofficecashierRepo.save(cashierEntity);
				System.out.println("This payment method  code is  assigned to given CashOffice");
			}

		} catch (Exception e) {

			return null;
		}
		// TCashOffPymtMthd id = cashOffPymtRepo.save(copEntity);
		return cashOffPymtRepo.save(copEntity);
	}

}
