package com.jason.myzss.domain.authority;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class User {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private @Column(length=20)String userName;
	private @Column(length=30)String userPassword;
	private Boolean isLock;
	private @OneToOne Role role;
	private @OneToMany List<Authority> authoritys;
	private @OneToOne UserProfile userProfile;
	private @ManyToOne Organization organization;

}
