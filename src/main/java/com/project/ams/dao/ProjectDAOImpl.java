package com.project.ams.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.ams.entity.Project;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

	// Define Field for Entity Manager
	private EntityManager entityManager;
		
	// Set up Constructor Injection
	@Autowired
	public ProjectDAOImpl(EntityManager theEntityManger) {
		entityManager = theEntityManger;
	}
	
	@Override
	public List<Project> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Project> theQuery = currentSession.createQuery("from Project", Project.class);
		List<Project> Project = theQuery.getResultList();
		return Project;
	}

	@Override
	public Project findById(int theProjectCode) {
		Session currentSession = entityManager.unwrap(Session.class);
		Project theProject = currentSession.get(Project.class, theProjectCode);
		return theProject;
	}

	@Override
	public void save(Project theProject) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theProject);
	}

	@Override
	public void deleteById(int theProjectCode) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Project> theQuery = currentSession.createQuery("delete from Project where project_code=:projectCode");
		theQuery.setParameter("projectCode", theProjectCode);
		theQuery.executeUpdate();
	}

}
