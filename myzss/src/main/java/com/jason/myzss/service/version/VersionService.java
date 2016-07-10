package com.jason.myzss.service.version;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jason.myzss.domain.Version;

public interface VersionService {

	public Iterable<Version> findVersionBySubjectID(Long id);
	
	public Page<Version> findAll(Pageable pageable);
}
