package com.sgic.defecttrackers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttrackers.entity.Comments;

import com.sgic.defecttrackers.repository.CommentRepository;

@Service
public class CommentServiceImp implements CommentService {
	
	@Autowired
	CommentRepository comRepository;
	 
	@Override
	public Comments saveComment(Comments comments) {
		return comRepository.save(comments);		
	}

}
