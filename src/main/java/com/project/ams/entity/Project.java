package com.project.ams.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	  
	// Define Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="project_code")
	private int projectCode;
	
	@Column(name="project_name")
	private String projectName;
	
	
	// Define Constructor
	public Project() {}

	public Project(String projectName) {
		this.projectName = projectName;
	}

	
	// Define Getter/Setter
	public int getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(int projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	// Define toString Method
	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", projectName=" + projectName;
	}
}
