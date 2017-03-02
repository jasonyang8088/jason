package com.jason.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="b_text_book")
public class TextBook {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	@ManyToOne
	private Subject subject;
	
	@ManyToOne
	private Version version;
	
	private Byte status;
	
	private Integer orderId;
	
	private Integer classId;
	
	private String zxxkName;
	
	private Integer zjId;
	
	private String zjName;
	
	@Column(length=20) 
	private String bookName;
	
	@OneToMany(mappedBy="textbook",cascade= CascadeType.REMOVE)
	private List<BookNode> booknodes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Version getVersion() {
		return version;
	}
	public void setVersion(Version version) {
		this.version = version;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public List<BookNode> getBooknodes() {
		return booknodes;
	}
	public void setBooknodes(List<BookNode> booknodes) {
		this.booknodes = booknodes;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getZxxkName() {
		return zxxkName;
	}
	public void setZxxkName(String zxxkName) {
		this.zxxkName = zxxkName;
	}
	public Integer getZjId() {
		return zjId;
	}
	public void setZjId(Integer zjId) {
		this.zjId = zjId;
	}
	public String getZjName() {
		return zjName;
	}
	public void setZjName(String zjName) {
		this.zjName = zjName;
	}
}
