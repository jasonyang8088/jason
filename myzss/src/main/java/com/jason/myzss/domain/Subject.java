package com.jason.myzss.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Subject {
	
	
	private @Id Long id;
	private Byte stage;
	private @Column(length=6) String subjectName;

}
