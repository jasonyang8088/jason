package com.jason.myzss.domain.authority;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Alliance {

	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private @Column(length=30) String name;
	private @OneToOne User manager;
	private Date createTime;
	private @OneToOne User creator;
}
