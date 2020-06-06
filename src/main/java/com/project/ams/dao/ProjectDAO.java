package com.project.ams.dao;

import java.util.List;

import com.project.ams.entity.Project;

public interface ProjectDAO {
	public List<Project> findAll();
	public Project findById(int theProjectCode);
	public void save(Project theProject);
	public void deleteById(int theProjectCode);
}
