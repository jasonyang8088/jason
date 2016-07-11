package com.jason.myzss.service.version;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.myzss.domain.Version;
import com.jason.myzss.repository.jpa.VersionRepository;

@Service
public class VersionServiceImpl implements VersionService {
	
	@Autowired
	private VersionRepository versionRepository;

	@Override
	public List<Version> findBySubjectId(Long subjectId) {
		return versionRepository.findBySubjectId(subjectId);
	}

}
