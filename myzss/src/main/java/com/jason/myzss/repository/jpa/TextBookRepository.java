package com.jason.myzss.repository.jpa;

import org.springframework.data.repository.CrudRepository;

import com.jason.myzss.domain.TextBook;

public interface TextBookRepository extends CrudRepository<TextBook, Long> {
	
	public Iterable<TextBook> findByVersionId(Long id);

}
