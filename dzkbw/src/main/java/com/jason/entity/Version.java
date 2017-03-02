package com.jason.entity;

import java.text.Collator;
import java.util.List;
import java.util.Locale;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="b_version")
public class Version implements Comparable<Version>{
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	@ManyToOne
	private  Subject subject;
	
	@Column(length=20)
	private String versionName;
	
	private Byte status;
	
	private Integer orderId;
	
	@OneToMany(mappedBy="version",cascade= CascadeType.REMOVE)
	private List<TextBook> textbooks;
	
	private Integer zjId;
	
	private Integer zxxkId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	
	public List<TextBook> getTextbooks() {
		return textbooks;
	}
	public void setTextbooks(List<TextBook> textbooks) {
		this.textbooks = textbooks;
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
	
	public Integer getZjId() {
		return zjId;
	}
	public void setZjId(Integer zjId) {
		this.zjId = zjId;
	}
	
	public Integer getZxxkId() {
		return zxxkId;
	}
	public void setZxxkId(Integer zxxkId) {
		this.zxxkId = zxxkId;
	}
	
	@Override
	public int compareTo(Version o) {
		 Collator instance = Collator.getInstance(Locale.CHINA);
		 return instance.compare(this.getVersionName(), o.getVersionName());
	}
}
 