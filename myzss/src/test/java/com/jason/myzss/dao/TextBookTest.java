package com.jason.myzss.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jason.myzss.Application;
import com.jason.myzss.domain.TextBook;
import com.jason.myzss.domain.Version;
import com.jason.myzss.repository.jpa.TextBookRepository;
import com.jason.myzss.repository.jpa.VersionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@Transactional
public class TextBookTest {
	
	@Autowired
	private TextBookRepository textbookRepository;
	
//	@Autowired
//	private SubjectRepository subRepository;
	
	@Autowired
	private VersionRepository versionRepository;
	
	@Test
	@Rollback(false)
	public void saveBookTest(){
		TextBook tbook = new TextBook();
		tbook.setBookName("九年级下");
		Version version = versionRepository.findOne(Long.valueOf(2));
		tbook.setSubject(version.getSubject());
		tbook.setVersion(version);
		textbookRepository.save(tbook);
	}
}
