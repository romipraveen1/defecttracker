package com.sgic.defecttrackers.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttrackers.dto.ProjectDTO;
import com.sgic.defecttrackers.dtomapper.ProjectDtoMapper;


@RestController
public class ProjectController {
	
	@Autowired
 private ProjectDtoMapper projectDtoMapper;

	@PostMapping("/SaveProject")
	public HttpStatus saveProject(@Valid @RequestBody ProjectDTO projectDTO) {
		projectDtoMapper.saveProject(projectDTO);
		return HttpStatus.CREATED;
	}
}
