package com.jason.myzss.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Version {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private @ManyToOne Subject subject;
	private @Column(length=20)String versionName;
	private Byte status;
}
 