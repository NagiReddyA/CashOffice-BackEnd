package com.sais.cashoffice.CashOfficeTest.transaction.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sais.cashoffice.CashOfficeTest.entities.TDepositSlip1;
import com.sais.cashoffice.CashOfficeTest.entities.TDepositedDenomination;
import com.sais.cashoffice.CashOfficeTest.transaction.model.ActivityForm;
import com.sais.cashoffice.CashOfficeTest.transaction.model.DenominationForm;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PrintBankForm;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PrintBankReceiptForm;
import com.sais.cashoffice.CashOfficeTest.transaction.repository.PrintBankRepository;

@Service
public class PrintBankServiceImpl implements PrintBankService {

	@Autowired
	private ModelMapper modelmapper;

	@Autowired
	private PrintBankRepository printbankRepo;

	@Override
	public List<PrintBankForm> getCashOffDet(String userID) {

		List<PrintBankForm> pList = new ArrayList<PrintBankForm>();
		PrintBankForm pform = new PrintBankForm();
		List<Object[]> objList = printbankRepo.getCashOffDetails(userID);
		if (objList != null && !objList.isEmpty()) {
			for (Object[] obj : objList) {

				pform.setCashOffice((String) obj[5]);
				pform.setCashier((String) obj[7]);
				LocalDate date = LocalDate.now();
				pform.setDepositDate(date);

			}
			pList.add(pform);
		} else {
			System.out.println("returning null");
		}

		return pList;
	}

	@Override
	public List<DenominationForm> getDenominationDetails() {
		List<DenominationForm> dList = new ArrayList<DenominationForm>();
		String s[] = printbankRepo.getDenominationDetails();
		for (String obj1 : s) {
			DenominationForm dform = new DenominationForm();
			dform.setDenominationCode(obj1);

			dList.add(dform);
		}

		return dList;
	}

	@Override
	public List<PrintBankReceiptForm> getReceiptDetails(LocalDate localDate) {
		List<PrintBankReceiptForm> pList = new ArrayList<PrintBankReceiptForm>();

		List<Object[]> objList = printbankRepo.getReceipts(localDate);
		if (objList != null && !objList.isEmpty()) {
			for (Object[] obj : objList) {
				PrintBankReceiptForm pform = new PrintBankReceiptForm();
				pform.setRcptTrnId((double) obj[0]);
				pform.setReceiptNo((double) obj[1]);
				pform.setReceiptDate((Date) obj[2]);
				pform.setReceiptAmount((BigDecimal) obj[3]);
				pform.setPayMethodId((double) obj[5]);
				pform.setCashOfficeId((double) obj[6]);
				pform.setCashierId((double) obj[7]);
				pform.setPostingStatus((char) obj[12]);
				pform.setPayMethodDesc((String) obj[30]);
				pList.add(pform);
			}

		} else {
			System.out.println("returning null");
			return null;
		}

		return pList;
	}

	LocalDate d;
	ActivityForm appForm = new ActivityForm();

	@Override
	public TDepositSlip1 getUserDetails(String userID, DenominationForm form) {

		TDepositSlip1 cashoffactivityEntity = modelmapper.map(form, TDepositSlip1.class);
		d = form.getReceiptDate();
		List<ActivityForm> appFormList1 = new ArrayList<ActivityForm>();
		//int depositId = printbankRepo.getDepositId();
		//depositId = depositId + 1;
		//cashoffactivityEntity.setDepositSlipId(depositId); 
		cashoffactivityEntity.setReceiptingDate(d);
		LocalDate date = LocalDate.now();
		cashoffactivityEntity.setDepositDate(date);
		List<Object[]> appList = printbankRepo.getCashierDetails(userID);

		if (appList != null && !appList.isEmpty()) {
			for (Object[] object : appList) {
				appForm.setCashOffActivityId((int) object[0]);
				appForm.setCashOfficeId((double) object[1]);
				appForm.setCashierId((double) object[2]);
				appFormList1.add(appForm);
			}
		}
		cashoffactivityEntity.setCashOffActivityId(appForm.getCashOffActivityId());
		cashoffactivityEntity.setCashOfficeId(appForm.getCashOfficeId());
		cashoffactivityEntity.setCashierId(appForm.getCashierId());
		printbankRepo.saveDepositslip(cashoffactivityEntity.getCashOffActivityId(),cashoffactivityEntity.getCashOfficeId(), 
				cashoffactivityEntity.getCashierId(),cashoffactivityEntity.getReceiptingDate(),cashoffactivityEntity.getDepositDate(),cashoffactivityEntity.getCreatedBy());
		return cashoffactivityEntity;
	}

	@Override
	public TDepositedDenomination saveReceipt(DenominationForm formData) {

		TDepositedDenomination cashoffactivityEntity = modelmapper.map(formData, TDepositedDenomination.class);
		int depositId = printbankRepo.getDepositId();
		Date d = new Date();
		cashoffactivityEntity.setCreationDate(d);
		cashoffactivityEntity.setModifiedDatetime(d);
		cashoffactivityEntity.setDenominationCode(formData.getDenominationcode());
		cashoffactivityEntity.setDepositedAmount(formData.getAmount());
		cashoffactivityEntity.setDepositSlipId(depositId);
		printbankRepo.save(cashoffactivityEntity);
		return cashoffactivityEntity;

	}

}
