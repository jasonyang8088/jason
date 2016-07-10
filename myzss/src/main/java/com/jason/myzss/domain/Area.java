package com.jason.myzss.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Area {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private String areaName;

}
