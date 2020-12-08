package com.sais.cashoffice.CashOfficeTest.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.Group_Authorities_Master;


@Repository
public interface UserGroup extends JpaRepository<Group_Authorities_Master,Long> {
                           
	List<Group_Authorities_Master> findAll();
	
	
}
