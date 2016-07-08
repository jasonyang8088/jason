package com.jason.myzss.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Version {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private @ManyToOne Subject subject;
	private @Column(length=20)String versionName;
	private @OneToMany List<Version> versionList;
	private Byte depth;
}
