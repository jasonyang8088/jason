package com.jason.myzss.repository.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jason.myzss.domain.TextBook;

public interface TextBookRepository extends JpaRepository<TextBook, Long> {
	
	public Iterable<TextBook> findByVersionId(Long id);

	public Page<TextBook> findByVersionId(Pageable pageable, Long versionId);

	public Page<TextBook> findBySubjectId(Pageable pageable, Long subjectId);

}
