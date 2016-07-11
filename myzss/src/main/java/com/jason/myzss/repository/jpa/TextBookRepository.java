package com.jason.myzss.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jason.myzss.domain.TextBook;

public interface TextBookRepository extends JpaRepository<TextBook, Long> {
	
	public List<TextBook> findByVersionId(Long versionId);

}
