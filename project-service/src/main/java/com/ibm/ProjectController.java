package com.ibm;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController // Bean
public class ProjectController {
	@Autowired // is used for DI
	ProjectService projectService; // DI
	@PostMapping("/project")
	@ResponseStatus(code = HttpStatus.CREATED)
	String createProject(@RequestBody @Valid Project project, BindingResult bindingResult) {
		validateModel(bindingResult);
		System.out.println(project);
		return projectService.createProject(project); // delegate
	}
    //DRY
	private void validateModel(Errors bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Somethign went wrong. Plesae retry");
		}
	}

	@GetMapping("/project")
	List<Project> getProjects() {
		return projectService.getProjects();
	}

	@GetMapping("/project/{id}")
	Optional<Project> getProjectById(@PathVariable("id") String projectId) {
		return projectService.getProjectById(projectId);
	}

	@PutMapping("/project/{id}")
	void updateProject(@RequestBody @Valid Project project, BindingResult bindingResult,
			@PathVariable("id") String projectId) {
		validateModel(bindingResult);
		System.out.println(projectId);
		project.setId(projectId);
		projectService.updateProject(project);
	}
}