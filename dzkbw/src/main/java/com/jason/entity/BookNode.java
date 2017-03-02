package com.jason.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Where;

@Entity(name = "b_book_node")
public class BookNode {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@ManyToOne
	private TextBook textbook;

	private Byte depth;

	private String orderNo;

	private Byte status; // 0:失效 1：正常
	
	private Integer classId;

	private Integer zxxkNodeId;

	private String zxxkNodeName;

	private Byte zxxkSource;// 其它来源，1 学科网的ChapterId，2、学科网的NodeId

	private Integer zjNodeId;

	private String zjNodeName;

	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	private BookNode parent;

	@OneToMany(mappedBy = "parent")
	@Where(clause="status=1")
	private List<BookNode> childrens;

//	@OneToMany(mappedBy = "bookNode")
//	private List<KnowledgePoint> knowledgePoints;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TextBook getTextbook() {
		return textbook;
	}

	public void setTextbook(TextBook textbook) {
		this.textbook = textbook;
	}

	public Byte getDepth() {
		return depth;
	}

	public void setDepth(Byte depth) {
		this.depth = depth;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public BookNode getParent() {
		return parent;
	}

	public void setParent(BookNode parent) {
		this.parent = parent;
	}

	public List<BookNode> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<BookNode> childrens) {
		this.childrens = childrens;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

//	public List<KnowledgePoint> getKnowledgePoints() {
//		return knowledgePoints;
//	}
//
//	public void setKnowledgePoints(List<KnowledgePoint> knowledgePoints) {
//		this.knowledgePoints = knowledgePoints;
//	}

	public Integer getZxxkNodeId() {
		return zxxkNodeId;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public void setZxxkNodeId(Integer zxxkNodeId) {
		this.zxxkNodeId = zxxkNodeId;
	}

	public String getZxxkNodeName() {
		return zxxkNodeName;
	}

	public void setZxxkNodeName(String zxxkNodeName) {
		this.zxxkNodeName = zxxkNodeName;
	}

	public Byte getZxxkSource() {
		return zxxkSource;
	}

	public void setZxxkSource(Byte zxxkSource) {
		this.zxxkSource = zxxkSource;
	}

	public Integer getZjNodeId() {
		return zjNodeId;
	}

	public void setZjNodeId(Integer zjNodeId) {
		this.zjNodeId = zjNodeId;
	}

	public String getZjNodeName() {
		return zjNodeName;
	}

	public void setZjNodeName(String zjNodeName) {
		this.zjNodeName = zjNodeName;
	}

}
