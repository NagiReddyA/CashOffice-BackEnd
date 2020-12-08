package com.sais.cashoffice.CashOfficeTest.paypointReports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sais.cashoffice.CashOfficeTest.paypointReports.entities.OversAndUnders;

public interface OversAndUndersRepository extends JpaRepository<OversAndUnders, Long> {
	
	@Query(nativeQuery = true, value = "call P_OVERS_UNDERS(str_to_date(:p_period,'%Y-%m-%d') , :p_paypoint_id)")
	List<OversAndUnders> getReport(@Param("p_period") String period, @Param("p_paypoint_id")  int paypointID);
	
	@Query(nativeQuery = true, value = "SELECT PAYPOINT_ID FROM VW_PAYPOINTS")
	List<Object []> getPaypoint();
	
	@Query(nativeQuery = true, value = "select paypoint_name from v_paypoints where pay_point_id = :ppID")
	List<Object []> getPaypointName(@Param("ppID") int paypointID);


}
