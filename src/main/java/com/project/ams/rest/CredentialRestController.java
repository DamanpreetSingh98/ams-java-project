package com.project.ams.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ams.entity.Credential;
import com.project.ams.service.CredentialService;

@RestController
@RequestMapping("/api")
public class CredentialRestController {
	
	private CredentialService credentialService;
	
	// Inject Employee DAO
	@Autowired
	public CredentialRestController(CredentialService theCredentialService) {
		credentialService = theCredentialService;
	}
	
	// Expose "/credentials" and return the List of Credentials 
	@GetMapping("/credentials")
	public List<Credential> findAll() {
		return credentialService.findAll();
	}
	
	// Add Mapping for GET /credentials/{employeeId}
	@GetMapping("/credentials/{employeeId}")
	public Credential getCredential(@PathVariable int employeeId) {
		Credential theCredential = credentialService.findById(employeeId);
		if(theCredential == null) {
			throw new RuntimeException("Employee id not found - " + employeeId);
		}
		return theCredential;
	}
	
	// Add Mapping for PUT /credentials - update credential details
	@PutMapping("/credentials")
	public Credential updateCredential(@RequestBody Credential theCredential) {
		credentialService.save(theCredential);
		return theCredential;
	}
	
	// Add Mapping for DELETE /credentials/{employeeId} - delete credential
	@DeleteMapping("/credentials/{employeeId}")
	public String deleteCredential(@PathVariable int employeeId) {
		Credential theCredential = credentialService.findById(employeeId);
		if(theCredential == null) {
			throw new RuntimeException("Employee id not found - " + employeeId);
		}
		credentialService.deleteById(employeeId);
		return "Deleted credentials of employee id - " + employeeId;
	}
}
