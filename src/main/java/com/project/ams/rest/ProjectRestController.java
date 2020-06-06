package com.project.ams.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ams.entity.Project;
import com.project.ams.service.ProjectService;

@RestController
@RequestMapping("/api")
public class ProjectRestController {
	
	private ProjectService projectService;
	
	// Inject Credential Service
	@Autowired
	public ProjectRestController(ProjectService theProjectService) {
		projectService = theProjectService;
	}
	
	// Expose "/projects" and return the List of Projects
	@GetMapping("/projects")
	public List<Project> findAll() {
		return projectService.findAll();
	}
	
	// Add Mapping for GET /projects/{projectCode}
	@GetMapping("/projects/{projectCode}")
	public Project getProject(@PathVariable int projectCode) {
		Project theProject = projectService.findById(projectCode);
		if(theProject == null) {
			throw new RuntimeException("Project Code not found - " + projectCode);
		}
		return theProject;
	}
	
	// Add Mapping for POST /projects
	@PostMapping("/projects")
	public Project addProject(@RequestBody Project theProject) {
		theProject.setProjectCode(0);
		projectService.save(theProject);
		return theProject;
	}
	
	// Add Mapping for PUT /projects - update project details
	@PutMapping("/projects")
	public Project updateProject(@RequestBody Project theProject) {
		projectService.save(theProject);
		return theProject;
	}
	
	// Add Mapping for DELETE /projects/{projectCode} - delete project
	@DeleteMapping("/projects/{projectCode}")
	public String deleteProject(@PathVariable int projectCode) {
		Project theProject = projectService.findById(projectCode);
		if(theProject == null) {
			throw new RuntimeException("Project Code not found - " + projectCode);
		}
		projectService.deleteById(projectCode);
		return "Deleted Project Code - " + projectCode;
	}
}
