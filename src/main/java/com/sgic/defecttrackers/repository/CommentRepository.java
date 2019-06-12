package com.sgic.defecttrackers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.defecttrackers.entity.Comments;


@Repository
public interface CommentRepository extends JpaRepository<Comments,Integer>{

}
