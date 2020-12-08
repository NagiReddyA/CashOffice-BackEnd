package com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Service;

import java.math.BigDecimal;


import java.math.BigInteger;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.MisallocationsCorrection.Repository.MisallocationHdrRepository;


@Service
public class MisallocationHdrServiceImpl implements MisallocationHdrService {
	
	
	@Autowired
	public MisallocationHdrRepository mishdr;

	@Override
	public int misallochdrnewrecord(BigDecimal totalreversalamount, BigDecimal totalamount, String postingstatus,
			Date creationdate, String createdby, Date modificationdate, String modifiedby) {
	
		return mishdr.misallochdrnewrecord(totalreversalamount, totalamount, postingstatus, creationdate, createdby, modificationdate, modifiedby);
				
	}

	@Override
	public BigInteger misallocationid() {
	
		return mishdr.misallocationid();
	}

}
