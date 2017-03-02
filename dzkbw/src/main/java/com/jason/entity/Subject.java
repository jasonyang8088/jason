package com.jason.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="b_subject")
public class Subject {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  Long id;
	
	private Byte stage;		//1：小学  2：初中  3：高中
	
	private Byte status;  //1 :正常  -1：失效
	
	@Column(length=6)
	private String subjectName;
	
	private Integer zjId;
	
	private Integer zxxkId;
	
	@OneToMany(mappedBy="subject")
	private List<Version> versions;
	
	private String def;
	
	private String zjDef;
	
	private String relationDef;
	
	private String categoryDef;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getStage() {
		return stage;
	}

	public void setStage(Byte stage) {
		this.stage = stage;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Version> getVersions() {
		return versions;
	}

	public void setVersions(List<Version> versions) {
		this.versions = versions;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Integer getZjId() {
		return zjId;
	}

	public void setZjId(Integer zjId) {
		this.zjId = zjId;
	}

	public Integer getZxxkId() {
		return zxxkId;
	}

	public void setZxxkId(Integer zxxkId) {
		this.zxxkId = zxxkId;
	}

	public String getDef() {
		return def;
	}

	public void setDef(String def) {
		this.def = def;
	}

	public String getRelationDef() {
		return relationDef;
	}

	public void setRelationDef(String relationDef) {
		this.relationDef = relationDef;
	}

	public String getCategoryDef() {
		return categoryDef;
	}

	public void setCategoryDef(String categoryDef) {
		this.categoryDef = categoryDef;
	}

	public String getZjDef() {
		return zjDef;
	}

	public void setZjDef(String zjDef) {
		this.zjDef = zjDef;
	}

}
