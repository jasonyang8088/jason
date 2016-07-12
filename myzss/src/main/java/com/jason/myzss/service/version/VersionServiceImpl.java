package com.jason.myzss.service.version;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

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

	@Override
	public void save(Version version) {
		Assert.notNull(version,"version must not to be null!");
		versionRepository.save(version);
	}

	@Override
	public void delete(Version version) {
		Assert.notNull(version,"version must not to be null!");
		versionRepository.delete(version);
	}

	@Override
	public void delete(Long id) {
		Assert.notNull(id,"id must not to be null!");
		versionRepository.delete(id);
	}

	@Override
	public Version find(Long id) {
		Assert.notNull(id,"id must not to be null!");
		return versionRepository.findOne(id);
	}

}
