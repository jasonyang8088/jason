package com.jason.myzss.domain;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Document {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private String docName;
	private @ManyToOne Area area;
	private String year;
	private @ManyToOne DocType docType;
	private BigInteger downloadCount;
	private BigInteger goodCount;
	private Date uploadTime;
	private Date checkTime;
	private Byte status;
	private @ManyToMany List<BookNode> bookNodeList;
}
