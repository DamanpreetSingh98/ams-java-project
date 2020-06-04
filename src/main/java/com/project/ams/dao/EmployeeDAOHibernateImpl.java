package com.project.ams.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.ams.entity.Employee;


@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	// Define Field for Entity Manager
	private EntityManager entityManager;
	
	// Set up Constructor Injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManger) {
		entityManager = theEntityManger;
	}
	
	@Override
	public List<Employee> findAll() {
		// get the current Hibernate Session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Create a Query 
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
		
		// Execute the Query
		List<Employee> employees = theQuery.getResultList();
		
		// Return the result 
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee theEmployee = currentSession.get(Employee.class, theId);
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> theQuery = currentSession.createQuery("delete from Employee where emp_num=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
	}

}
