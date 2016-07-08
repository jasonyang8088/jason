package com.jason.myzss.domain;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Document {
	
	private Long id;
	private String docName;
	private Area area;
	private String year;
	private DocType docType;
	private BigInteger downloadCount;
	private BigInteger goodCount;
	private Date uploadTime;
	private Date checkTime;
	private Integer status;
	private List<BookNode> bookNodeList;
}
