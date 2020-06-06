package com.project.ams.service;

import java.util.List;

import com.project.ams.entity.Project;

public interface ProjectService {
	public List<Project> findAll();
	public Project findById(int theProjectCode);
	public void save(Project theProject);
	public void deleteById(int theProjectCode);
}
