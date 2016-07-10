package com.jason.myzss.web.admin.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.Subject;
import com.jason.myzss.service.subject.SubjectService;

@RestController
@RequestMapping("/admin/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/getSubject")
	public Iterable<Subject> getSubject(){
		return subjectService.findAll();
	}
	
	@RequestMapping("/getSubject/{stage}")
	public Iterable<Subject> getSubjectById(@PathVariable("stage")Byte stage){
		return subjectService.findByStage(stage);
	}
}
