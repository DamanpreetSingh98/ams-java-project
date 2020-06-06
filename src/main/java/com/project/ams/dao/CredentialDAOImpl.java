package com.project.ams.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.ams.entity.Credential;

@Repository
public class CredentialDAOImpl implements CredentialDAO {

	// Define Field for Entity Manager
	private EntityManager entityManager;
		
	// Set up Constructor Injection
	@Autowired
	public CredentialDAOImpl(EntityManager theEntityManger) {
		entityManager = theEntityManger;
	}
	
	@Override
	public List<Credential> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Credential> theQuery = currentSession.createQuery("from Credential", Credential.class);
		List<Credential> credentials = theQuery.getResultList();
		return credentials;
	}

	@Override
	public Credential findById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Credential theCredentials = currentSession.get(Credential.class, theId);
		return theCredentials;
	}

	@Override
	public void save(Credential theCredential) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theCredential);
	}

	@Override
	public void deleteById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Credential> theQuery = currentSession.createQuery("delete from Credential where emp_num=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
	}

}
