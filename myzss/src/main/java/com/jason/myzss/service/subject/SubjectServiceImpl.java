package com.jason.myzss.service.subject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.myzss.domain.Subject;
import com.jason.myzss.repository.jpa.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public List<Subject> findAll() {
		return  subjectRepository.findAll();
	}

	@Override
	public List<Subject> findByStage(Byte stage) {
		return subjectRepository.findByStage(stage);
	}

	@Override
	public Subject getOnd(Long subjectId) {
		return subjectRepository.getOne(subjectId);
	}

}
