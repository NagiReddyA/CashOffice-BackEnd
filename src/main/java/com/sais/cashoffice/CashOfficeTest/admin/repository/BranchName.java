package com.sais.cashoffice.CashOfficeTest.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sais.cashoffice.CashOfficeTest.admin.model.BranchCode;

@Repository
public interface BranchName extends JpaRepository<BranchCode,Long>{
	
	public List<BranchCode>  findAll();
	

}
