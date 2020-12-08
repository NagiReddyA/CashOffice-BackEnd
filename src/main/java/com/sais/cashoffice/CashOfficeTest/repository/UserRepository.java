package com.sais.cashoffice.CashOfficeTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	
	User findByUserId(long userid);

	User findByUsername(String loginId);

}
