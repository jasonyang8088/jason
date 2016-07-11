package com.jason.myzss.web.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.BookNode;
import com.jason.myzss.domain.Subject;
import com.jason.myzss.domain.TextBook;
import com.jason.myzss.domain.Version;
import com.jason.myzss.service.bookNode.BookNodeService;
import com.jason.myzss.service.subject.SubjectService;
import com.jason.myzss.service.textBook.TextBookService;
import com.jason.myzss.service.version.VersionService;

@RestController
@RequestMapping("/teacher/resource")
public class ResourceRestController {
	
	@Autowired
	private SubjectService subjectService;
	
	@Autowired
	private VersionService versionService;
	
	@Autowired
	private TextBookService textBookService;
	
	@Autowired
	private BookNodeService bookNodeService;

	@RequestMapping("/getSubject/{stage}")
	public Iterable<Subject> getSubject(@PathVariable("stage") Byte stage){
		return subjectService.findByStage(stage);
	}
	
	@RequestMapping("/subjectId/{subjectId}/version")
	public Iterable<Version> findBySubjectId(@PathVariable("subjectId") Long subjectId){
		return versionService.findBySubjectId(subjectId);
	}
	
	@RequestMapping("/getTextBook/{versionId}")
	public Iterable<TextBook> getBook(@PathVariable("versionId") Long id){
		return textBookService.findByVersionId(id);
	}
	
	@RequestMapping("/getBookNode/{bookId}")
	public Iterable<BookNode> getBookNode(@PathVariable("bookId") Long id){
		return bookNodeService.findByBookIdAndDepth(id, (byte)1);
	}
}
