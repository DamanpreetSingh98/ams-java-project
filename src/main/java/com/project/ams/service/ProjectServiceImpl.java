package com.project.ams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.ams.dao.ProjectDAO;
import com.project.ams.entity.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

	private ProjectDAO projectDAO;
	
	// Inject Employee DAO
	@Autowired
	public ProjectServiceImpl(ProjectDAO theProjectDAO) {
		projectDAO = theProjectDAO;
	}
	
	@Override
	@Transactional
	public List<Project> findAll() {
		return projectDAO.findAll();
	}

	@Override
	@Transactional
	public Project findById(int theProjectCode) {
		return projectDAO.findById(theProjectCode);
	}

	@Override
	@Transactional
	public void save(Project theProject) {
		projectDAO.save(theProject);
	}

	@Override
	@Transactional
	public void deleteById(int theProjectCode) {
		projectDAO.deleteById(theProjectCode);
	}

}
