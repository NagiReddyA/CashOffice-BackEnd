package com.sais.cashoffice.CashOfficeTest.master.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sais.cashoffice.CashOfficeTest.entities.TAppActivity;
import com.sais.cashoffice.CashOfficeTest.entities.TApplication;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOffApp;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOffPymtMthd;
import com.sais.cashoffice.CashOfficeTest.entities.TCashOffice;
import com.sais.cashoffice.CashOfficeTest.entities.TCompanyOrgan;
import com.sais.cashoffice.CashOfficeTest.master.model.AppSetUpForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignApplicationForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignPaymentMethodForm;
import com.sais.cashoffice.CashOfficeTest.master.model.CashOfficeDetForm;
import com.sais.cashoffice.CashOfficeTest.master.repository.ApplicationSetUpRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CashOffPymtMethodRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CashOfficeAppRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CashOfficeSetUpRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.CompanyOrganRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.PaymentMethodRepository;

@Service
public class CashOfficeServiceImpl implements CashOfficeService{

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
		ArrayList<CashOfficeDetForm> coDetails=new ArrayList<CashOfficeDetForm>();
		List<TCashOffice> appList = cashOfficeSetUpRepo.findAll();
		for (TCashOffice tco : appList) {
			CashOfficeDetForm appForm = new CashOfficeDetForm();
			//System.out.println(tco.getBranchCode());
			TCompanyOrgan tc=coRepo.findByOrganCode(tco.getBranchCode());
			appForm.setBranchCode(tc.getAbbrName());
			appForm.setCashOfficeCode(tco.getCashOfficeCode());
			appForm.setCashOfficeDesc(tco.getCashOfficeDesc());
			appForm.setCashOfficeId(tco.getCashOfficeId());
			appForm.setBranchName(tc.getCompanyName());
			coDetails.add(appForm);			
		}
		return coDetails;
	}

	@Override
	@Transactional(readOnly = true)
	public List<TCompanyOrgan> getBranchesDetails() {
		return coRepo.findAll();
	}

	@Override
	@Transactional
	public long createCashOffice(CashOfficeDetForm coDetails) {
		TCashOffice id=null;
		TCashOffice coEntity = modelmapper.map(coDetails, TCashOffice.class);
		coEntity.setBranchCode(coRepo.findByAbbrName(coDetails.getBranchCode()).getOrganCode());
		//appActivity.setTApplication(appSetUpRepo.findById((long)appActivityForm.getAppId()).orElse(null));
		TCashOffice co=cashOfficeSetUpRepo.findByCashOfficeCodeAndBranchCode(coDetails.getCashOfficeCode(),coEntity.getBranchCode());
		if(co != null) {
			coEntity.setCashOfficeId(co.getCashOfficeId());
			 id = cashOfficeSetUpRepo.save(coEntity);
		}else {
			 id = cashOfficeSetUpRepo.save(coEntity);	
		}		
		return id.getCashOfficeId();
	}

	@Override
	public List<AssignApplicationForm> fetchAllApplicationsAssignedToCashOffice(String code) {
		TCashOffice tc=cashOfficeSetUpRepo.findByCashOfficeCode(code);
		List<TCashOffApp> apps=coAppRepo.findByCashOfficeId(tc.getCashOfficeId());
		List<AssignApplicationForm> assignList=new ArrayList<AssignApplicationForm>();
		for (TCashOffApp tco:apps) {
			AssignApplicationForm aa=new AssignApplicationForm();
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
	public long assignAppToCashOffice(AssignApplicationForm details) {
		TCashOffApp coaEntity = modelmapper.map(details, TCashOffApp.class);
		coaEntity.setTApplication(appSetUpRepo.findByAppCode(details.getApplicationCode()));
		coaEntity.setTCashOffice(cashOfficeSetUpRepo.findByCashOfficeCode(details.getCashOfficeCode()));
		TCashOffApp id = coAppRepo.save(coaEntity);
		return id.getCoAppId();
	}

	@Override
	public List<AssignPaymentMethodForm> fetchAllPaymentMethodsAsgndToCashOffice(String code) {
		TCashOffice tc=cashOfficeSetUpRepo.findByCashOfficeCode(code);
		List<TCashOffPymtMthd> apps=cashOffPymtRepo.findByCashOfficeId(tc.getCashOfficeId());
		List<AssignPaymentMethodForm> assignList=new ArrayList<AssignPaymentMethodForm>();
		for (TCashOffPymtMthd tco:apps) {
			AssignPaymentMethodForm aa=new AssignPaymentMethodForm();
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
	public long assignPymtMethodToCashOffice(AssignPaymentMethodForm assignForm) {
		TCashOffPymtMthd copEntity = modelmapper.map(assignForm, TCashOffPymtMthd.class);
		copEntity.setTPaymentMethod(paymentMethodRepo.findByPayMethodCode(assignForm.getPymtMethodCode()));
		copEntity.setTCashOffice(cashOfficeSetUpRepo.findByCashOfficeCode(assignForm.getCashOfficeCode()));
		TCashOffPymtMthd id = cashOffPymtRepo.save(copEntity);
		return id.getCoPymtMthdId();
	}

}
