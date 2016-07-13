package com.jason.myzss.domain.authority;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Organization {

	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private @Column(length=30) String name;
	private @Column(length=50) String address;
	private @OneToOne User manager;
	private Date createTime;
	private @ManyToOne Alliance alliance;
	private Byte status;  			// 0-冻结	1-正常
	private Byte type;  			// 1-学校	2-培训机构	3-公司	4-出版社
	
}
