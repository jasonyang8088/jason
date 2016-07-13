package com.jason.myzss.domain.authority;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class User {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private @Column(length=20)String userName;
	private @Column(length=30)String userPassword;
	private Date birthday;
	private @Column(length=40) String email;
	private @Column(length=20) String phoneNumber;
	private Date createTime;
	private Byte status;
	private @ManyToOne Organization organization;

}
