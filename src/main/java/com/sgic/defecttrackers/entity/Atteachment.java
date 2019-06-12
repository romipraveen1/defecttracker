package com.sgic.defecttrackers.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "defect", name = "atteachment")
public class Atteachment implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long atteachmentId;
	
	private String fileName;

    private String fileType;

    @Lob
    private byte[] data;

    @ManyToOne
	@JoinColumn(name="defectId", nullable=false)
	private Defect defect;
	
    

    public Defect getDefect() {
		return defect;
	}



	public void setDefect(Defect defect) {
		this.defect = defect;
	}



	public Atteachment(String fileName, String fileType, byte[] data) {
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
    
    

}
