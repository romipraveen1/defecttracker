package com.sgic.defecttrackers.dto;

import javax.persistence.Lob;

public class AtteachmentDTO {
	
private Long atteachmentId;
	
	private String fileName;
    private String fileType;
    @Lob
    private byte[] data;
    private String defectId;
    
	public AtteachmentDTO(String fileName, String fileType, byte[] data) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }

	public Long getAtteachmentId() {
		return atteachmentId;
	}

	public void setAtteachmentId(Long atteachmentId) {
		this.atteachmentId = atteachmentId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getDefectId() {
		return defectId;
	}

	public void setDefectId(String defectId) {
		this.defectId = defectId;
	}
	
	

}
