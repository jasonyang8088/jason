package com.jason.myzss.repository.jpa;

import org.springframework.data.repository.CrudRepository;

import com.jason.myzss.domain.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long> {
	
	public Iterable<Subject> findByStage(Byte stage);

}

