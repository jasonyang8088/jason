package com.jason.myzss.service.version;

import java.util.List;

import com.jason.myzss.domain.Version;

public interface VersionService {

	List<Version> findBySubjectId(Long subjectId);
	
	void save(Version version);

	void delete(Version version);

	void delete(Long id);

	Version find(Long id);
	
}
