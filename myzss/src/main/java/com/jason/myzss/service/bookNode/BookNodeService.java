package com.jason.myzss.service.bookNode;

import com.jason.myzss.domain.BookNode;

public interface BookNodeService {

	public Iterable<BookNode> findByBookId(Long id);
	public Iterable<BookNode> findByBookIdAndDepth(Long id,Byte depth);
}
