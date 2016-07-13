package com.jason.myzss.domain.authority;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Role {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private @Column(length=20) String name;
	private @OneToMany List<Authority> authoritys;

}
