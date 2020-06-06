package com.project.ams.service;

import java.util.List;

import com.project.ams.entity.Credential;

public interface CredentialService {
	public List<Credential> findAll();
	public Credential findById(int theId);
	public void save(Credential theCredential);
	public void deleteById(int theId);
}
