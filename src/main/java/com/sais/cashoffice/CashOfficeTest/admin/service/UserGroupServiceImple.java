package com.sais.cashoffice.CashOfficeTest.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.admin.model.Group_Authorities_Master;
import com.sais.cashoffice.CashOfficeTest.admin.repository.UserGroup;

@Service
public class UserGroupServiceImple implements UserGroupService {
	
	@Autowired
	private UserGroup usergroup;
	
	@Override
	public   List<Group_Authorities_Master> getallGroupAuthorities(){
		
	return	usergroup.findAll();
		
		
	}

	

}
