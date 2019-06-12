package com.sgic.defecttrackers.dtomapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttrackers.dto.CommentsDTO;

import com.sgic.defecttrackers.entity.Comments;

import com.sgic.defecttrackers.services.CommentServiceImp;


@Service
public class CommentDtoMapper {
	
	
	@Autowired
	CommentServiceImp commentServiceImpl;
	ModelMapper modelMapper = new ModelMapper();
	
	private CommentsDTO EntityToDTO(Comments comment) {
		CommentsDTO commentDTO = modelMapper.map(comment, CommentsDTO.class);
		return commentDTO;
	}
	
	public Comments saveComment(CommentsDTO commentDTO) {
		Comments comment = modelMapper.map(commentDTO, Comments.class);
		return commentServiceImpl.saveComment(comment);
	}

}
