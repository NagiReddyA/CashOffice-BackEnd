package com.sais.cashoffice.CashOfficeTest.master.controller;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sais.cashoffice.CashOfficeTest.entities.TCashOfficeCashier;
import com.sais.cashoffice.CashOfficeTest.entities.TCashier;
import com.sais.cashoffice.CashOfficeTest.master.model.AssignCashierForm;
import com.sais.cashoffice.CashOfficeTest.master.model.CashierDetailsForm;
import com.sais.cashoffice.CashOfficeTest.master.repository.CashierRepository;
import com.sais.cashoffice.CashOfficeTest.master.service.CashierService;
import com.sais.cashoffice.CashOfficeTest.master.service.CashierServiceImpl;
import com.sais.cashoffice.CashOfficeTest.repository.UserRepository;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PaymentReceipt;
import com.sais.cashoffice.CashOfficeTest.transaction.model.PolicyForm;
import com.sais.cashoffice.exception.ResourceNotFoundException;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/cashiers")
public class CashierController {

	@Autowired
	private CashierRepository employeeRepository;

	@Autowired
	private CashierService cashierService;

	@Autowired
	private CashierServiceImpl cashierServiceimpl;
	
	@Autowired
	private UserRepository user;

	@GetMapping()
	public List<CashierDetailsForm> getAllEmployees() {
		return cashierService.fetchAllCashierDetails();
	}

	@GetMapping("/{id}")
	public ResponseEntity<TCashier> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {

		TCashier employee = cashierService.findByCashierId(employeeId);
		if (employee == null) {
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		}

		// .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this
		// id :: " + employeeId));
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/createCashier")
	@Transactional
	public TCashier createEmployee(@Valid @RequestBody CashierDetailsForm employee) throws Exception {
		
		TCashier id = cashierService.createCashier(employee);
		// URI uri =
		// ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
		return id;
	}
	
	
	@PostMapping(path="/CreateUpdateCashier",consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> InsertRcptDtls(@RequestBody CashierDetailsForm dtls) {
		
		System.out.println("Cashier Code		:"+ dtls.getCashierCode());
		System.out.println("Cashier Name		:"+ dtls.getCashierName());
		System.out.println("Branch Code			:"+ dtls.getBranchCode());
		System.out.println("Login ID			:"+ dtls.getLoginId());
		System.out.println("Created By			:"+ dtls.getcreatedBy());
		
		Object out=cashierServiceimpl.InsertUpdateCashierDtls(dtls.getCashierCode(), dtls.getCashierName(), dtls.getBranchCode(), 
														dtls.getLoginId(), dtls.getcreatedBy());
		System.out.println(out);
		//return new ResponseEntity<String>(out.toString(), HttpStatus.OK);
		return ResponseEntity.ok().body(out); 
	}
	

	@PutMapping("/{id}")
	public ResponseEntity<TCashier> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@Valid @RequestBody TCashier employeeDetails) throws ResourceNotFoundException {
		TCashier employee = (TCashier) employeeRepository.findByCashierId(employeeId);
		// .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this
		// id :: " + employeeId));
		// employee.setEmailId(employeeDetails.getEmailId());
		// employee.setLastName(employeeDetails.getLastName());
		// employee.setFirstName(employeeDetails.getFirstName());
		final TCashier updatedEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		TCashier employee = employeeRepository.findByCashierId(employeeId);
		// .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this
		// id :: " + employeeId));
		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	@GetMapping("/assignedCashiers/{coId}")
	public List<AssignCashierForm> fetchAssignedCashiers(@PathVariable(value="coId") String cashofficeId){
		return cashierService.findAssignedCashiers(Long.valueOf(cashofficeId));
	}
	
	@PostMapping(value="/assignCashier")
	public ResponseEntity<TCashOfficeCashier>  assignCashierToCo( @RequestBody AssignCashierForm cashier) throws Exception{
		
		TCashOfficeCashier id = cashierService.assignCashier(cashier);
		return ResponseEntity.ok(id);
	}
	
}