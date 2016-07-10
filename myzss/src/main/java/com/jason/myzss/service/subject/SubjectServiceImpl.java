package com.jason.myzss.service.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.myzss.domain.Subject;
import com.jason.myzss.repository.jpa.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public Iterable<Subject> findAll() {
		Iterable<Subject> it = subjectRepository.findAll();
		return it;
	}

	@Override
	public Iterable<Subject> findByStage(Byte stage) {
		return subjectRepository.findByStage(stage);
	}

}
