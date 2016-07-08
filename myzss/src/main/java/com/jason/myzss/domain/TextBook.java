package com.jason.myzss.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class TextBook {

	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private @ManyToOne @NotNull Subject subject;
	private @ManyToOne @NotNull Version version;
	private String bookName;
}
