package com.jason.myzss.service.bookNode;

import java.util.List;

import com.jason.myzss.domain.BookNode;

public interface BookNodeService {

	public List<BookNode> findByBookId(Long id);
	public List<BookNode> findByBookIdAndDepth(Long id,Byte depth);
}
