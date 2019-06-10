package com.sgic.defecttrackers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.defecttrackers.entity.Project;


@Repository
public interface ProjectRepository extends JpaRepository<Project,Long>{

}
