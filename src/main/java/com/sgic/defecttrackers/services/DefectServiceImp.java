package com.sgic.defecttrackers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttrackers.entity.Defect;
import com.sgic.defecttrackers.repository.DefectRepository;



@Service
public class DefectServiceImp implements DefectService{
	

	@Autowired
	DefectRepository defRepository;
	
	@Override
	public Defect saveDefect(Defect defect) {
		return defRepository.save(defect);		
	}
}
