package com.jason.myzss.domain.authority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Authority {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private @Column(length=20) String name;
	private @Column(length=30) String sign;
}
