package com.jason.myzss.repository.jpa;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.jason.myzss.domain.Version;


public interface VersionRepository extends CrudRepository<Version, Long> {
	
	public List<Version> findBySubjectStage(Byte stage);
	public List<Version> findBySubjectId(Long id);
	public Page<Version> findAll(Pageable pageable);
	public Page<Version> findBySubjectStage(Pageable pageable,Byte stage);
	public Page<Version> findBySubjectId(Pageable pageable,Long subjectId);
}
