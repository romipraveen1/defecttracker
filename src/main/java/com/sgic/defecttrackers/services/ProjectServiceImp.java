package com.sgic.defecttrackers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttrackers.entity.Project;
import com.sgic.defecttrackers.repository.ProjectRepository;

@Service
public class ProjectServiceImp implements ProjectService{

	@Autowired
 private ProjectRepository projectRepository;
	
	@Override
	public Project saveProject(Project project) {
		
		return projectRepository.save(project);
		
	}

}
