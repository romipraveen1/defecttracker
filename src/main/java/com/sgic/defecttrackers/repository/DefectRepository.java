package com.sgic.defecttrackers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.defecttrackers.entity.Defect;


@Repository
public interface DefectRepository extends JpaRepository<Defect,Integer>{

}
