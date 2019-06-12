package com.sgic.defecttrackers.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttrackers.dto.CommentsDTO;

import com.sgic.defecttrackers.dtomapper.CommentDtoMapper;

@RestController
public class CommentController {

	@Autowired
	private CommentDtoMapper commentDtoMapper;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/SaveComment")
	public HttpStatus saveComment(@Valid @RequestBody CommentsDTO commentDTO) {
		commentDtoMapper.saveComment(commentDTO);
		return HttpStatus.CREATED;
	}
	
}
