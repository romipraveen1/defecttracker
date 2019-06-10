package com.sgic.defecttrackers.dtomapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttrackers.dto.DefectDTO;
import com.sgic.defecttrackers.entity.Defect;
import com.sgic.defecttrackers.services.DefectServiceImp;



@Service
public class DefectDtoMapper {
	
	@Autowired
	DefectServiceImp defectServiceImpl;
	ModelMapper modelMapper = new ModelMapper();
	
	private DefectDTO EntityToDTO(Defect defect) {
		DefectDTO defectDTO = modelMapper.map(defect, DefectDTO.class);
		return defectDTO;
	}
	
	public Defect saveDefect(DefectDTO defectDTO) {
		Defect defect = modelMapper.map(defectDTO, Defect.class);
		return defectServiceImpl.saveDefect(defect);
	}

}
