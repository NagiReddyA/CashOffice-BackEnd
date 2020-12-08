package com.sais.cashoffice.CashOfficeTest.admin.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.admin.model.BranchCode;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;
import com.sais.cashoffice.CashOfficeTest.admin.repository.UserManagement;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PaymentReceipt;
import com.sais.cashoffice.CashOfficeTest.admin.repository.BranchName;

@Service
public class UserManagementServiceImpl implements UserManagementService  {
	
	@Autowired
	private UserManagement usermanagementRepo;
	
	@Autowired 
	private BranchName branchNameRepo;

	@Override
	public List<User> getallusers() {
		
		return usermanagementRepo.findAll();
		
	}


	@Override
	public User saveUserDetails(User u) {
		// TODO Auto-generated method stub
		return usermanagementRepo.save(u);
	}


	@Override
	public User getUserDetailsByName(String name) {
		
		return usermanagementRepo.findByFirstName(name);
	}


	@Override
	public List<BranchCode> getallbranchnames() {
		// TODO Auto-generated method stub
		return branchNameRepo.findAll();
	}

	
//	@Override
//	public User userAuthenticate1(String uName, String Pwd) {		
//		return usermanagementRepo.userAuthenticate(uName, Pwd);
//	}
	
	
	public List<User> userAuthenticate(String uName, String Pwd){		
		List<User> appFormList1 = new ArrayList<User>();
	     List<Object[]> appList = usermanagementRepo.userAuthenticate(uName, Pwd);
	     if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				User appForm = new User();
				//System.out.println("UnAllocated Amount	:", appForm.setrcptNo((double) object[0]));
				appForm.setUserId((double) object[0]);
				appForm.setUsername((String) object[1]);	
				appForm.setBranchCode((String) object[2].toString());
				appForm.setFirstName((String) object[3].toString());
				appForm.setLastName((String) object[4].toString());
				appForm.setAttribute1((String) object[5].toString());
				appFormList1.add(appForm);	
				System.out.println("User Id:"+ object[0]);
				System.out.println("User Branch Code:"+ object[2].toString());
				System.out.println("User Name:"+ object[3].toString()+" "+object[4].toString());
			}	
		}
	    //System.out.println("User Name:"+ uName);
	    return appFormList1;
	}
}
