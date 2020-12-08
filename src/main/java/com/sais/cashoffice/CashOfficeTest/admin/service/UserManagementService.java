package com.sais.cashoffice.CashOfficeTest.admin.service;

import java.util.List;

import com.sais.cashoffice.CashOfficeTest.admin.model.BranchCode;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;


public interface UserManagementService {
	
	public List<User> getallusers();
	
	User saveUserDetails(User u);
	
	User getUserDetailsByName(String name);
	
	public List<BranchCode> getallbranchnames();
	
	public List<User> userAuthenticate(String uName, String Pwd);
}
