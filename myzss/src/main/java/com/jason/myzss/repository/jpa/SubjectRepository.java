package com.jason.myzss.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jason.myzss.domain.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
	
	public List<Subject> findByStage(Byte stage);

}

