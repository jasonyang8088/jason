package com.jason.myzss.service.textBook;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jason.myzss.domain.TextBook;

public interface TextBookService {

	public Iterable<TextBook> findBookByVersionId(Long id);

	public Page<TextBook> findAll(Pageable pageable);

	public Page<TextBook> findByVersionId(Pageable pageable, Long versionId);

	public Page<TextBook> findBySubjectId(Pageable pageable, Long subjectId);

}
