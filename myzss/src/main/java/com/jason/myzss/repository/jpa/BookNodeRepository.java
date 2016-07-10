package com.jason.myzss.repository.jpa;

import org.springframework.data.repository.CrudRepository;

import com.jason.myzss.domain.BookNode;

public interface BookNodeRepository extends CrudRepository<BookNode, Long> {
	
	public Iterable<BookNode> findByTextBookId(Long id);
	public Iterable<BookNode> findByTextBookIdAndDepth(Long id,Byte depth);

}
