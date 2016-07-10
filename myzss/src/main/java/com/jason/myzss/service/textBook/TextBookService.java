package com.jason.myzss.service.textBook;

import com.jason.myzss.domain.TextBook;

public interface TextBookService {
	
	public Iterable<TextBook> findBookByVersionId(Long id);

}
