package com.sais.cashoffice.CashOfficeTest.master.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.entities.TAppActivity;
import com.sais.cashoffice.CashOfficeTest.entities.TApplication;
import com.sais.cashoffice.CashOfficeTest.master.model.AppActivitiesForm;
import com.sais.cashoffice.CashOfficeTest.master.model.AppSetUpForm;
import com.sais.cashoffice.CashOfficeTest.master.repository.ApplicationActivitiesRepository;
import com.sais.cashoffice.CashOfficeTest.master.repository.ApplicationSetUpRepository;
import com.sais.cashoffice.exception.ErrorDetails;
import com.sais.cashoffice.exception.Response;

@Service
public class ApplicationSetUpServiceImpl implements ApplicationSetUpService {

	@Autowired
	private ApplicationSetUpRepository appSetUpRepo;

	@Autowired
	private ApplicationActivitiesRepository appActivityRepo;

	@Autowired
	private ModelMapper modelmapper;

	@Override
	public List<AppSetUpForm> getAllApplications() {
		List<AppSetUpForm> appFormList = new ArrayList<AppSetUpForm>();
		List<TApplication> appList = appSetUpRepo.findAll();
		for (TApplication tapp : appList) {
			AppSetUpForm appForm = new AppSetUpForm();
			appForm.setApplicationCode(tapp.getAppCode());
			appForm.setApplicationDesc(tapp.getAppDesc());
			appForm.setAppId(tapp.getAppId());
			appForm.setStartDate(tapp.getCreationDate());
			appForm.setEndDate(tapp.getCreationDate());
			appFormList.add(appForm);
		}
		return appFormList;
	}

	@Override
	public List<AppActivitiesForm> getActivitesByAppId(String code) {
		List<AppActivitiesForm> appFormList = new ArrayList<AppActivitiesForm>();
		List<Object[]> appList = appActivityRepo.findByAppCode(code);
		if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				AppActivitiesForm appForm = new AppActivitiesForm();
				appForm.setAppActivityCode((String) object[0]);
				appForm.setAppActivityDesc((String) object[1]);
				appForm.setAppId(((BigInteger) object[4]).longValue());
				appForm.setAppActivityId(((BigInteger) object[3]).longValue());
				appForm.setEnabled((boolean) object[2].equals("true") ? true : false);
				appFormList.add(appForm);
			}
		}
		return appFormList;

	}

	@Override
	@Transactional
	public ResponseEntity<?> createActivity(AppActivitiesForm appActivityForm) {
		Response res = null;
		String message = "";
		TApplication app = modelmapper.map(appActivityForm, TApplication.class);
		try {
			if (appActivityForm.getAppId() == 0) {
				app.setCreationDate(new Date());
				TApplication id = appSetUpRepo.save(app);
				message = "saved new application with id" + id.getAppId();
				res=new Response(200,message);
				return new ResponseEntity<>(res, HttpStatus.OK);
			} else {
				Optional<TApplication> id = appSetUpRepo.findById(Long.valueOf(appActivityForm.getAppId()));
				if (id != null) {
					app.setAppId(id.get().getAppId());
					appSetUpRepo.save(app);
					message = "Application updated successfully with id" + id.get().getAppId();
				}
				TAppActivity appActivity = modelmapper.map(appActivityForm, TAppActivity.class);
				if (appActivity.getAppActivityCode() != null) {
					appActivity.setTApplication(appSetUpRepo.findById((long) appActivityForm.getAppId()).orElse(null));

					Optional<TAppActivity> activityId = appActivityRepo.findById(appActivityForm.getAppActivityId());
					if (activityId != null) {
						appActivity.setAppActivityId(activityId.get().getAppActivityId());
						appActivityRepo.save(appActivity);
						message = message + "Application Activity updated successfully with id"
								+ activityId.get().getAppActivityId();
					} else {
						appActivityRepo.save(appActivity);
						message = message +"Application Activity Created successfully with id"
								+ activityId.get().getAppActivityId();
					}
				}
				return new ResponseEntity<>(res, HttpStatus.OK);
			}
		} catch (Exception e) {
			message = "Failed to save application/activity !";
			ErrorDetails error = new ErrorDetails(new Date(), message, null);
			return new ResponseEntity<>(error, HttpStatus.EXPECTATION_FAILED);
		}
	}

}
