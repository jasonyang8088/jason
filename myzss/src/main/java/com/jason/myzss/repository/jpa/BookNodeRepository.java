package com.jason.myzss.repository.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jason.myzss.domain.BookNode;

public interface BookNodeRepository extends CrudRepository<BookNode, Long> {
	
	public List<BookNode> findByTextBookId(Long id);
	public List<BookNode> findByTextBookIdAndDepth(Long id,Byte depth);

}
