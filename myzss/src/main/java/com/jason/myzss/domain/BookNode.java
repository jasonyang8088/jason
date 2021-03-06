package com.jason.myzss.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class BookNode {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private @ManyToOne @NotNull TextBook textBook;
	private @NotNull Byte depth;
	private @Column(length=20) @NotNull String name;
	private @OneToMany(cascade=CascadeType.ALL)List<BookNode> bookNodes;
	private @JsonIgnore @ManyToMany (mappedBy="bookNodes")List<Document> documents;
	private Integer chapterId;
	private Integer nodeId;

}
