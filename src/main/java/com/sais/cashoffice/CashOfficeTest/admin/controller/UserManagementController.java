package com.sais.cashoffice.CashOfficeTest.admin.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sais.cashoffice.CashOfficeTest.admin.model.BranchCode;
import com.sais.cashoffice.CashOfficeTest.admin.model.User;
import com.sais.cashoffice.CashOfficeTest.admin.service.UserManagementServiceImpl;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PaymentReceipt;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class UserManagementController {
	
	@Autowired
	private UserManagementServiceImpl usermanagementserviceimpl;
	
	
	
	@GetMapping(path = "/admin/branchnames")
    public List<BranchCode> fetchalldetailsofbranchname(){
		
		return usermanagementserviceimpl.getallbranchnames();
	}
	
	
	@GetMapping(path = "/admin/usermanagement")
     public List<User> fetchalldetailsofusers(){
		
		return usermanagementserviceimpl.getallusers();
	}
	
	  
	 @PostMapping(path="/admin/usersave")
	 @Transactional
	 public User saveuserDetails(@RequestParam("branchcode") String branchcode, @RequestBody User c){
		 
		 c.setBranchCode(branchcode);
		 
		 User id =  usermanagementserviceimpl.saveUserDetails(c);
		 
		 System.out.println(id.getUserId());
		 
		 return id;
	 }
	 
	 @Transactional
	 @PutMapping(path="/admin/usermanagement/userupdatedrecord",produces="application/json")
	 public ResponseEntity<User> updateRecord(@RequestParam("firstname") String firstname,@RequestBody User c){
	 User u = usermanagementserviceimpl.getUserDetailsByName(firstname);
   if(u == null) {
	 return ResponseEntity.ok().body(u);
	 } else {
	 
		 
	 u.setUsername(c.getUsername());  
		 u.setPassword(c.getPassword()); 
		 u.setFirstName(u.getFirstName());
		 u.setLastName(c.getLastName());   
		 u.setEnabled(u.getEnabled());
	 
         User updatedUser = usermanagementserviceimpl.saveUserDetails(u);		
	 
		 return ResponseEntity.ok().body(updatedUser);
	 }
}
	 
	 	@GetMapping(path = "/userAuthenticate",produces="application/json")
		public List<User> userAuthenticate(@RequestParam("uName") String uName,  @RequestParam("Pwd") String Pwd) {
			System.out.println("User Name:"+ uName);
			System.out.println("Password:"+ Pwd);
			return usermanagementserviceimpl.userAuthenticate(uName, Pwd);
		}
}

