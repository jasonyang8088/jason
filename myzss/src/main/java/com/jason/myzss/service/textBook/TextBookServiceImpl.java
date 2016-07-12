package com.jason.myzss.service.textBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.jason.myzss.domain.TextBook;
import com.jason.myzss.repository.jpa.TextBookRepository;

@Service
public class TextBookServiceImpl implements TextBookService {

	@Autowired
	private TextBookRepository textBookRepository;

	@Override
	public List<TextBook> findByVersionId(Long versionId) {
		return textBookRepository.findByVersionId(versionId);
	}

	@Override
	public void save(TextBook textBook) {
		textBookRepository.save(textBook);
	}

	@Override
	public void delete(Long id) {
		Assert.notNull(id, "id for delete not to be null!");
		textBookRepository.delete(id);
	}

}
