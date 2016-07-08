package com.jason.myzss.domain;

import java.util.List;

import lombok.Data;

@Data
public class KnowledgePoint {
	
	private Long id;
	private Boolean isExam;
	private String name;
	private List<KnowledgePoint> knowledgePointList;
	private List<BookNode>  bookNodeList;
	private List<Document>	docList;
	private Subject subject;

}
