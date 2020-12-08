package com.sais.cashoffice.CashOfficeTest.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.User;

@Repository  
public interface UserManagement extends JpaRepository<User,Long>{
	

              
//    @Query(value = "select * from T_CASH_OFFICE_CASHIER where CASH_OFFICE_ID=:coId ", nativeQuery = true) 
    @Query(value = "select * from USERS  Where FIRST_NAME=?1",nativeQuery=true)
    User findByFirstName(String userFirstName);
    
    List<User> findAll();
    
    
    @Query(value =" SELECT USER_ID, USERNAME, BRANCH_CODE, FIRST_NAME, LAST_NAME, " +
    			  " (SELECT CASHIER_ID FROM T_CASHIERS WHERE LOGIN_ID=USERNAME) AS CASHIER_ID"+
    			  " FROM USERS WHERE USERNAME=?1 AND PASSWORD=?2",nativeQuery=true)
    public List<Object[]> userAuthenticate(String uName, String Pwd);
    
}
