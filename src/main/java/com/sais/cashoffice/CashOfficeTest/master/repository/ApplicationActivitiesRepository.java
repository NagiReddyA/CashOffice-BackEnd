package com.sais.cashoffice.CashOfficeTest.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.entities.TAppActivity;
import com.sais.cashoffice.CashOfficeTest.master.model.AppActivitiesForm;

@Repository
public interface ApplicationActivitiesRepository extends JpaRepository<TAppActivity, Long> {

	@Query(value = "select taa.APP_ACTIVITY_CODE AS appActivityCode,taa.APP_ACTIVITY_DESC AS appActivityDesc,"
			+ " taa.enabled AS enabled,taa.APP_ACTIVITY_ID AS appActivityId,taa.APP_ID AS appId "
			+ "FROM cash_office.T_APP_ACTIVITY taa,cash_office.T_APPLICATION ta "
			+ " where ta.app_id=taa.app_id and ta.app_code=:appId ",nativeQuery=true)
	public List<Object[]> findByAppCode(@Param(value = "appId") String appId);

}
 