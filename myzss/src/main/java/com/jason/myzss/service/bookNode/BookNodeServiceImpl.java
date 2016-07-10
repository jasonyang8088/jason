package com.jason.myzss.service.bookNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.myzss.domain.BookNode;
import com.jason.myzss.repository.jpa.BookNodeRepository;

@Service
public class BookNodeServiceImpl implements BookNodeService {
	
	@Autowired
	private BookNodeRepository bookNodeRepository;

	@Override
	public Iterable<BookNode> findByBookId(Long id) {
		return bookNodeRepository.findByTextBookId(id);
	}

	@Override
	public Iterable<BookNode> findByBookIdAndDepth(Long id, Byte depth) {
		return bookNodeRepository.findByTextBookIdAndDepth(id, depth);
	}

}
