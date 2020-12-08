package com.sais.cashoffice.CashOfficeTest.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository
public interface passwordReset extends JpaRepository<User,Long> {

	@Query(value ="select * from USERS where USERNAME=?1",nativeQuery = true)
	User findByUsername(String username);
	
}
