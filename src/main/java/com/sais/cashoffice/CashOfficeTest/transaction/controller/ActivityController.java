package com.sais.cashoffice.CashOfficeTest.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOffActivity1;
import com.sais.cashoffice.CashOfficeTest.transaction.model.ActivityForm;
import com.sais.cashoffice.CashOfficeTest.transaction.model.ActivityForm1;
import com.sais.cashoffice.CashOfficeTest.transaction.service.ActivityImpl;
import com.sais.cashoffice.CashOfficeTest.transaction.service.ActivityImplDe;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ActivityController {

	@Autowired
	private ActivityImpl activityImpl;

	@Autowired
	private ActivityImplDe tillactivityImpl;

	@GetMapping(path = "/Checkactivity/{userID}")
	public List<ActivityForm> getCheckActivity(@PathVariable(value = "userID") String userID) throws Exception {
		String ID = userID.replace("\"", "");
		return activityImpl.getCheckActivity(ID);
	}

	@GetMapping(path = "/getActivitydetails/{userID}")
	public List<ActivityForm> getAllActivitydetails(@PathVariable(value = "userID") String userID) throws Exception {
		String str = userID.replace("\"", "");
		return activityImpl.getAllActivityDetails(str);
	}

	@GetMapping(path = "/tillActivitydetails/{userID}")
	public List<ActivityForm1> getTillActivity(@PathVariable(value = "userID") String userID) throws Exception {
		String st = userID.replace("\"", "");
		List<ActivityForm1> list1 = activityImpl.getTillActivityDetails();
		List<ActivityForm1> list = tillactivityImpl.getTillDetails(st);
		System.out.println(list);
		System.out.println(list1);
		if (list1 == null) {
			System.out.println("till cashiers not opned");
			return list;

		} else {
			list.addAll(list1);
		}

		return list;
	}

	@GetMapping(path = "/userActivityDetails/{userID}")
	public List<ActivityForm> getUserCashOffDetails(@PathVariable(value = "userID") String userID) {
		String s = userID.replace("\"", "");
		List<ActivityForm> list = activityImpl.getUserActivityDetails(s);
		return list;
	}

	@PostMapping(path = "/getActivityId")
	public TCashOffActivity1 getActivityId(@RequestBody ActivityForm activity) throws Exception {

		return activityImpl.openActivity(activity);
	}

	@PostMapping(path = "/closeCashOffice/{userID}")
	public TCashOffActivity1 getCloseActivity(@PathVariable(value = "userID") String userID,
			@RequestBody ActivityForm activity) throws Exception {

		return activityImpl.closeActivity(userID, activity);
	}

	@PostMapping(path = "/authorizeTillCashier/{cashierActivityId}")
	public TCashOffActivity1 authorizeTillCashier(@PathVariable(value = "cashierActivityId") double cashierActivityId,
			@RequestBody ActivityForm1 activity) throws Exception {

		return activityImpl.authorizeTillCashiers(cashierActivityId, activity);
	}

}
