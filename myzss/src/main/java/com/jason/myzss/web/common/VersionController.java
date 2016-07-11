package com.jason.myzss.web.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.Subject;
import com.jason.myzss.domain.Version;
import com.jason.myzss.service.subject.SubjectService;
import com.jason.myzss.service.version.VersionService;

@RestController
@RequestMapping("/common")
public class VersionController {
	
	@Autowired
	private VersionService versionService;
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping(value="/subject/{subjectId}/versions",method=RequestMethod.GET)
	public List<Version> findBySubjectId(@PathVariable("subjectId")Long subjectId) {
		return versionService.findBySubjectId(subjectId);
	}
	
	@RequestMapping(value="/version",method=RequestMethod.POST)
	public List<Version> saveVersion(@RequestBody Version version){
		System.out.println(version.getVersionName());
		version.setStatus((byte)1);
//		version.setSubject(subjectService.getOnd(subjectId));
		versionService.save(version);
		return versionService.findBySubjectId(version.getSubject().getId());
	}
}
