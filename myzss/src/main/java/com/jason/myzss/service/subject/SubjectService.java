package com.jason.myzss.service.subject;

import com.jason.myzss.domain.Subject;

public interface SubjectService {
	
	public Iterable<Subject> findAll();
	
	public Iterable<Subject> findByStage(Byte stage);

}
