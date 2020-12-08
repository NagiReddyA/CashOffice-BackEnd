package com.sais.cashoffice.CashOfficeTest.ManualAllocation.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Model.ManualAllocationToDtlProcedure;
import com.sais.cashoffice.CashOfficeTest.ManualAllocation.Repository.ManualAllocationToDtlProcedureRepository;

@Service
public class ManualAllocationToDtlProcedureServiceImpl implements ManualAllocationToDtlProcedureService {
	
	
	
	@Autowired
	private ManualAllocationToDtlProcedureRepository mptr;

	@Override
	public List<ManualAllocationToDtlProcedure> getmanualallocattodtl(String bankstmtflag, double receiptnum) {
		
		List<ManualAllocationToDtlProcedure> manualalloctodtl = new ArrayList<ManualAllocationToDtlProcedure>();
		
		List<Object[]> appi = mptr.getmanualallocattodtl(bankstmtflag, receiptnum);
		
		 if (appi != null & !appi.isEmpty()) {
				
				
		     for(Object[] object:appi) {
		    	 

		    	 
		    	 
		    	 
		    	    ManualAllocationToDtlProcedure maptodtl = new ManualAllocationToDtlProcedure();
		    	    
		    	    maptodtl.setManualhdrid((double) object[0] );
		    	    maptodtl.setReceiptno((double) object[1]);
		    	    maptodtl.setTotalallocatedamount((BigDecimal) object[2]);
		    	    maptodtl.setTotalunallocatdamo((Double) object[3]);
		    	    maptodtl.setTotallypoliciesamount((BigDecimal) object[4]);
		    	    maptodtl.setHdrpostingststus((String) object[5]);
		    	    maptodtl.setHdrpostingstatusmeaning((String) object[6]);
		    	    maptodtl.setAttribute1((String) object[7]);
		    	    maptodtl.setBankstmtflag((String) object[8]);	    	    
		    	    maptodtl.setManualhdrfromid((double) object[9]);
		    	    maptodtl.setPaypointid((BigDecimal) object[10]);
		    	    maptodtl.setPeriod((Date) object[11]);
		    	    maptodtl.setAllocatedamount((BigDecimal) object[12]);
		    	    maptodtl.setUnallocatedamount((BigDecimal) object[13]);
		    	    maptodtl.setGrossamount((BigDecimal) object[14]);
                    maptodtl.setRecepitamount((BigDecimal) object[15]);	
                    maptodtl.setPostingstatus((String) object[16]);              
                    maptodtl.setValuemeaning((String) object[17]);
                    maptodtl.setManualhdrtoid((double) object[18]);
                    maptodtl.setPolicycode((String) object[19]);
                    maptodtl.setPolicyperiod((Date) object[20] );
                    maptodtl.setPartyid((BigDecimal) object[21]);
                    maptodtl.setPayorname((String) object[22]);
                    maptodtl.setPurposeid((String) object[23]);
                    maptodtl.setPurposename((String) object[24]);
                    maptodtl.setExceptedamount((BigDecimal) object[25]);
                    maptodtl.setToallocatedamount((BigDecimal) object[26]);
                    maptodtl.setCollectionflag((String) object[27]);
                    maptodtl.setTopostingstatus((String) object[28]);
                    maptodtl.setTopostvaluemeaning((String) object[29]);
                    maptodtl.setPolicyid((double) object[30]);
                    
                    
                    manualalloctodtl.add(maptodtl);
		    	 
		     }
		     
		     
		 }
		
		
		
		
		return manualalloctodtl;
	}

}
