package com.sgic.defecttrackers.dtomapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttrackers.dto.ProjectDTO;
import com.sgic.defecttrackers.entity.Project;
import com.sgic.defecttrackers.services.ProjectServiceImp;

@Service
public class ProjectDtoMapper {

	@Autowired
	private ProjectServiceImp projectServiceImpl;
	
	ModelMapper modelMapper = new ModelMapper();

	private ProjectDTO EntityToDTO(Project project) {
		ProjectDTO projectDTO = modelMapper.map(project, ProjectDTO.class);
		return projectDTO;
	}
	
	
	public Project saveProject(ProjectDTO projectDTO) {
		Project project = modelMapper.map(projectDTO, Project.class);
		return projectServiceImpl.saveProject(project);
	}
}
