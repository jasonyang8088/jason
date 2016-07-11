package com.jason.myzss.service.textBook;

import java.util.List;

import com.jason.myzss.domain.TextBook;

public interface TextBookService {

	List<TextBook> findByVersionId(Long versionId);

}
