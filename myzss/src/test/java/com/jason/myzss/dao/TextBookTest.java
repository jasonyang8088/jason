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
			TextBook tbook1 = new TextBook();
			TextBook tbook2= new TextBook();
			if(v.getSubject().getStage().equals((byte)1)){
				tbook.setBookName("一年级");
				tbook1.setBookName("二年级");
				tbook2.setBookName("三年级");
			}else if(v.getSubject().getStage().equals((byte)2)){
				tbook.setBookName("七年级");
				tbook1.setBookName("八年级");
				tbook2.setBookName("九年级");
			}else if(v.getSubject().getStage().equals((byte)3)){
				tbook.setBookName("必修一");
				tbook1.setBookName("必修二");
				tbook2.setBookName("必修三");
			}
			tbook.setSubject(v.getSubject());
			tbook.setVersion(v);
			textbookRepository.save(tbook);
			tbook1.setSubject(v.getSubject());
			tbook1.setVersion(v);
			textbookRepository.save(tbook1);
			tbook2.setSubject(v.getSubject());
			tbook2.setVersion(v);
			textbookRepository.save(tbook2);
		}
	}
}
