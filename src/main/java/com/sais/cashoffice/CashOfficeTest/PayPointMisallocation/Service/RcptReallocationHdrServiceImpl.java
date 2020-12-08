package com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.PayPointMisallocation.Repository.RcptReallocationHdrRepository;


@Service
public class RcptReallocationHdrServiceImpl implements RcptReallocationHdrService {

	
	
	@Autowired
	public RcptReallocationHdrRepository rrhr;
	
	@Override
	public int insertrecordtoreallocationhdr(double recepitno, Date reallocdate, String postingstatus, String postedby,
			Date posteddate, double recepitamount, Date creationdate, String createdby, Date modifieddate,
			String modifiedby) {
		
		return rrhr.insertrecordtoreallocationhdr(recepitno, reallocdate, 
				                                   postingstatus, postedby, posteddate,
				                                   recepitamount, creationdate,
				                                   createdby, modifieddate, modifiedby);
	}

	@Override
	public int updatetreallochdr(double receiptno, double rcptamount, String modifiedby,
			Date modifiedtime, double reallhdrid) {
		
		return  rrhr.updatetreallochdr(receiptno, rcptamount, modifiedby, modifiedtime, reallhdrid);
	}

}
