package com.sais.cashoffice.CashOfficeTest.admin.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;
import com.sais.cashoffice.CashOfficeTest.admin.service.UserManagementServiceImpl;
import com.sais.cashoffice.CashOfficeTest.admin.service.passwordResetServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")

public class passwordResetController {
	
	@Autowired
	private passwordResetServiceImpl ps;
	
	@Autowired UserManagementServiceImpl usermanagementserviceimpl;
	
	
	@PutMapping(path="/admin/usermanagement/passwordreset")
	@Transactional
	public ResponseEntity<User> getdetails(@RequestParam("username") String username,@RequestBody User c) {
	
		User u = ps.getdetailsofauser(username);
		
		String passwordDetails = "Temp#1234";
		
		u.setPassword(passwordDetails);
		
		
		
		
		User updatedUser = usermanagementserviceimpl.saveUserDetails(u);		
		 
		 return ResponseEntity.ok().body(updatedUser);
		
		
		
	}
	
 
	
	
	
}
