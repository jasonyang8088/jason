package com.jason.myzss.service.version;

import java.util.List;

import com.jason.myzss.domain.Version;

public interface VersionService {

	List<Version> findBySubjectId(Long subjectId);
	
}
