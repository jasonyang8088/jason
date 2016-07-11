package com.jason.myzss.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jason.myzss.Application;
import com.jason.myzss.domain.BookNode;
import com.jason.myzss.domain.TextBook;
import com.jason.myzss.repository.jpa.BookNodeRepository;
import com.jason.myzss.repository.jpa.TextBookRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@Transactional
public class BookNodeTest {
	
	@Autowired
	private TextBookRepository textbookRepository;
	
	@Autowired
	private BookNodeRepository bookNodeRepository;

	@Test
	@Rollback(false)
	public void saveTest(){
		Iterable<TextBook> iter = textbookRepository.findAll();
		Iterator<TextBook> it = iter.iterator();
		while(it.hasNext()){
			TextBook book =it.next();
			BookNode node = new BookNode();
			node.setName("第一章 开始");
			node.setDepth((byte)1);
			node.setTextBook(book);
			BookNode node1 = new BookNode();
			node1.setName("第一节的内容");
			node1.setDepth((byte)2);
			node1.setTextBook(book);
			bookNodeRepository.save(node1);
			List<BookNode> list = new ArrayList<BookNode>();
			list.add(node1);
			node.setBookNodeList(list);
			bookNodeRepository.save(node);
			BookNode node11 = new BookNode();
			node11.setName("第二章的内容");
			node11.setDepth((byte)1);
			node11.setTextBook(book);
			BookNode node12 = new BookNode();
			node12.setName("第二节的内容");
			node12.setDepth((byte)2);
			node12.setTextBook(book);
			bookNodeRepository.save(node12);
			List<BookNode> list1 = new ArrayList<BookNode>();
			list1.add(node11);
			node.setBookNodeList(list1);
			bookNodeRepository.save(node11);
		}
	}
}
