package com.jason.myzss.service.bookNode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.myzss.domain.BookNode;
import com.jason.myzss.repository.jpa.BookNodeRepository;

@Service
public class BookNodeServiceImpl implements BookNodeService {
	
	@Autowired
	private BookNodeRepository bookNodeRepository;

	@Override
	public List<BookNode> findByBookId(Long id) {
		return bookNodeRepository.findByTextBookId(id);
	}

	@Override
	public List<BookNode> findByBookIdAndDepth(Long id, Byte depth) {
		return bookNodeRepository.findByTextBookIdAndDepth(id, depth);
	}

	@Override
	public void saveAndUpdate(List<BookNode> booknodes) {
		bookNodeRepository.save(booknodes);
	}

}
