package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TApplication;
import com.sais.cashoffice.CashOfficeTest.master.model.AppSetUpForm;

@Repository
public interface ApplicationSetUpRepository extends JpaRepository<TApplication, Long> {

	TApplication findByAppCode(String applicationCode);

	@Query(value="CALL pe_Create_Application(?1,?2,?3,?4)",nativeQuery=true)
	public List<Object[]> InsertUpdateApplication(String App_code, String App_desc, char enabled, String Create_By);
	
	@Query(value="CALL pe_Create_App_Activity(?1,?2,?3,?4,?5)",nativeQuery=true)
	public List<Object[]> AddActivity(int App_id, String Act_code, String Act_desc, char enabled, String Create_By);
	
	
}
