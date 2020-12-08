package com.sais.cashoffice.CashOfficeTest.cashofficeReports.entities;

import java.io.Serializable;
import java.util.Objects;

public class CORcashierAssignCompositeKey implements Serializable {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String branch_code;
	  private String cash_office_code;

	  public CORcashierAssignCompositeKey() {
	  }

	  public CORcashierAssignCompositeKey(String branch_code, String cash_office_code) {
	      this.branch_code = branch_code;
	      this.cash_office_code = cash_office_code;
	  }

	  @Override
	  public boolean equals(Object o) {
	      if (this == o) return true;
	      if (o == null || getClass() != o.getClass()) return false;
	      CORcashierAssignCompositeKey cash_office_code1 = (CORcashierAssignCompositeKey) o;
	      if (branch_code != cash_office_code1.branch_code) return false;
	      return cash_office_code == cash_office_code1.cash_office_code;
	  }

	  @Override
	  public int hashCode() {
	      return Objects.hash(branch_code, cash_office_code);
	  }
	}


