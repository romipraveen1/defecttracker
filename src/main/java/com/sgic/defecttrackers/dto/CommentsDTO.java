package com.sgic.defecttrackers.dto;

import java.util.Date;


import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

public class CommentsDTO {
	
	private Long commentId;
	private String comments;
	
//	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
//	private Date commentedDate;
	
	@Generated(GenerationTime.ALWAYS)
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date commentedDate = new java.sql.Date(new java.util.Date().getTime());
	
	private String defectId;
	
	public Long getCommentId() {
		return commentId;
	}
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getCommentedDate() {
		return commentedDate;
	}
	public void setCommentedDate(Date commentedDate) {
		this.commentedDate = commentedDate;
	}
	public String getDefectId() {
		return defectId;
	}
	public void setDefectId(String defectId) {
		this.defectId = defectId;
	}

}
