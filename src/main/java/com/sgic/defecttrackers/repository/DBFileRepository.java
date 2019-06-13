package com.sgic.defecttrackers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.defecttrackers.entity.DBFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile,Long> {


}