package com.jason.myzss.repository.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jason.myzss.domain.Version;


public interface VersionRepository extends CrudRepository<Version, Long> {
	
	public List<Version> findByDepth(Byte depth);
	public List<Version> findBySubjectStage(Byte stage);

}
