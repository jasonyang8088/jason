package com.jason.myzss.service.textBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.myzss.domain.TextBook;
import com.jason.myzss.repository.jpa.TextBookRepository;

@Service
public class TextBookServiceImpl implements TextBookService {
	
	@Autowired
	private TextBookRepository textBookRepository;

	@Override
	public Iterable<TextBook> findBookByVersionId(Long id) {
		return textBookRepository.findByVersionId(id);
	}

}
