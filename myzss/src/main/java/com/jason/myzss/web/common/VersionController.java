package com.jason.myzss.web.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.Version;
import com.jason.myzss.service.version.VersionService;

@RestController
@RequestMapping("/common")
public class VersionController {
	
	@Autowired
	private VersionService versionService;
	
	@RequestMapping("/subject/{subjectId}/versions")
	public List<Version> findBySubjectId(@PathVariable("subjectId")Long subjectId) {
		return versionService.findBySubjectId(subjectId);
	}
}
