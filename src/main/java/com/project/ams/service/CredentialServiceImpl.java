package com.project.ams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.ams.dao.CredentialDAO;
import com.project.ams.entity.Credential;

@Service
public class CredentialServiceImpl implements CredentialService {

	private CredentialDAO credentialDAO;
	
	// Inject Employee DAO
	@Autowired
	public CredentialServiceImpl(CredentialDAO theCredentialDAO) {
		credentialDAO = theCredentialDAO;
	}
		
	@Override
	@Transactional
	public List<Credential> findAll() {
		return credentialDAO.findAll();
	}

	@Override
	@Transactional
	public Credential findById(int theId) {
		return credentialDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Credential theCredential) {
		credentialDAO.save(theCredential);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		credentialDAO.deleteById(theId);
	}

}
