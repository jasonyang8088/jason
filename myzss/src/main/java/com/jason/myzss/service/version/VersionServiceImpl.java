package com.jason.myzss.service.version;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.jason.myzss.domain.Version;
import com.jason.myzss.repository.jpa.VersionRepository;

@Service
public class VersionServiceImpl implements VersionService {
	
	@Autowired
	private VersionRepository versionRepository;

	@Override
	public Iterable<Version> findVersionBySubjectID(Long id) {
		return versionRepository.findBySubjectId(id);
	}

	@Override
	public Page<Version> findAll(Pageable pageable) {
		Assert.notNull(pageable, "Pageable must not be null!");
		return versionRepository.findAll(pageable);
	}

}
