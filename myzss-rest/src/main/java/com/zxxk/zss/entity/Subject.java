package com.zxxk.zss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Subject {
	
	private @Id Long id;
	private Byte stage;
	private @Column(length=6) String subjectName;

}
