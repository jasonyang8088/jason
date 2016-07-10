package com.jason.myzss.dao;

import java.util.Iterator;

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
		Iterable<Version> versions = versionRepository.findAll();
		Iterator<Version> iter = versions.iterator();
		while(iter.hasNext()){
			Version v = iter.next();
			TextBook tbook = new TextBook();
			if(v.getSubject().getStage().equals((byte)1)){
				tbook.setBookName("一年级");
			}else if(v.getSubject().getStage().equals((byte)2)){
				tbook.setBookName("九年级");
			}else if(v.getSubject().getStage().equals((byte)3)){
				tbook.setBookName("必修一");
			}
			tbook.setSubject(v.getSubject());
			tbook.setVersion(v);
			textbookRepository.save(tbook);
		}
	}
}
