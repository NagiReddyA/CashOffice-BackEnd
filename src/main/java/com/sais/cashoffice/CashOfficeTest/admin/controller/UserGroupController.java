package com.sais.cashoffice.CashOfficeTest.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.admin.model.Group_Authorities_Master;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;
import com.sais.cashoffice.CashOfficeTest.admin.service.UserGroupServiceImple;
import com.sais.cashoffice.CashOfficeTest.admin.service.UserManagementServiceImpl;




@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path="/api")
public class UserGroupController {
   
	 @Autowired
	private UserGroupServiceImple usergroupservice;
	
	 @GetMapping(path="/admin/usergroup")
	 public List<Group_Authorities_Master> fetchallgroupusers(){
		 
		 return usergroupservice.getallGroupAuthorities();
		 
	 }
	 
	
	
}
