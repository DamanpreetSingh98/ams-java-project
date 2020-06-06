package com.project.ams.dao;

import java.util.List;

import com.project.ams.entity.Credential;

public interface CredentialDAO {
	
	public List<Credential> findAll();
	public Credential findById(int theId);
	public void save(Credential theCredential);
	public void deleteById(int theId);

}
