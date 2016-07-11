package com.jason.myzss.web.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.BookNode;
import com.jason.myzss.service.bookNode.BookNodeService;

@RestController
@RequestMapping("/common")
public class BookNodeController {

	@Autowired
	private BookNodeService bookNodeService;
	
	@RequestMapping("/textbook/{textbookid}/booknodes")
	public List<BookNode> findByTextBookId(@PathVariable("textbookid")Long bookId){
		return bookNodeService.findByBookIdAndDepth(bookId,(byte)1);
	}
}
