package com.jason.myzss.service.textBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	@Override
	public Page<TextBook> findAll(Pageable pageable) {
		return textBookRepository.findAll(pageable);
	}

	@Override
	public Page<TextBook> findByVersionId(Pageable pageable, Long versionId) {
		return textBookRepository.findByVersionId(pageable,versionId);
	}

	@Override
	public Page<TextBook> findBySubjectId(Pageable pageable, Long subjectId) {
		return textBookRepository.findBySubjectId(pageable,subjectId);
	}

}
