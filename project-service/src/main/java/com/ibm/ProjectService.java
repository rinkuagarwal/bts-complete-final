package com.ibm;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ProjectService {
	@Autowired
	ProjectRepository projectRepository;
	public String createProject(Project project) {
		Project savedProject = projectRepository.save(project);
		return savedProject.getId();
	}

	public List<Project> getProjects() {
		return projectRepository.findAll();
	}

	public Optional<Project> getProjectById(String projectId) {
		return projectRepository.findById(projectId);
	}

	public void updateProject(Project project) {
		projectRepository.save(project);
	}

}
