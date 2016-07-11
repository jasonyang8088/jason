package com.jason.myzss.service.subject;

import java.util.List;

import com.jason.myzss.domain.Subject;

public interface SubjectService {
	
	public List<Subject> findAll();
	
	public List<Subject> findByStage(Byte stage);

}
