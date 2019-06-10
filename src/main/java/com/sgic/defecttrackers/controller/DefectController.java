package com.sgic.defecttrackers.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttrackers.dto.DefectDTO;

import com.sgic.defecttrackers.dtomapper.DefectDtoMapper;

@RestController
public class DefectController {

	@Autowired
	private DefectDtoMapper defectDtoMapper;

	@PostMapping("/SaveDefect")
	public HttpStatus saveDefect(@Valid @RequestBody DefectDTO defectDTO) {
		defectDtoMapper.saveDefect(defectDTO);
		return HttpStatus.CREATED;
	}
	
}
