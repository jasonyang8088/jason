package com.jason.myzss.domain.authority;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserProfile {

	private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
	private @Column(length = 20) String phoneNumber;
	private Date birthday;
	private @Column(length=20)String firstName;
	private @Column(length=20)String lastName;
	private @Column(length=40) String email;
	private Date createTime;

}
