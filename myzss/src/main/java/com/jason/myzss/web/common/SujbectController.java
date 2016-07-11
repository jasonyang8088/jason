package com.jason.myzss.web.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.Subject;
import com.jason.myzss.service.subject.SubjectService;

@RestController
@RequestMapping("/common")
public class SujbectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/subjects")
	public List<Subject> findAll(){
		return subjectService.findAll();
	}
	
	@RequestMapping("/stage/{stage}/subjects")
	public List<Subject> findByStage(@PathVariable("stage")Byte stage){
		return subjectService.findByStage(stage);
	}

}
