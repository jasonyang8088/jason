package com.jason.myzss.web.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.Version;
import com.jason.myzss.service.version.VersionService;

@RestController
@RequestMapping("/common")
public class VersionController {
	
	@Autowired
	private VersionService versionService;
	
//	@Autowired
//	private SubjectService subjectService;
	
	@RequestMapping(value="/subject/{subjectId}/versions",method=RequestMethod.GET)
	public List<Version> findBySubjectId(@PathVariable("subjectId")Long subjectId) {
		return versionService.findBySubjectId(subjectId);
	}
	
	@RequestMapping(value="/version",method=RequestMethod.POST)
	public List<Version> saveVersion(@RequestBody Version version){
		version.setStatus((byte)1);
		versionService.save(version);
		return versionService.findBySubjectId(version.getSubject().getId());
	}
	
	@RequestMapping(value="/version/{id}",method=RequestMethod.DELETE)
	public void deleteVersion(@PathVariable("id")Long id){
		versionService.delete(id);
	}
	
	@RequestMapping(value="/version/{id}",method=RequestMethod.PUT)
	public void updateVersion(@PathVariable("id")Long id,@RequestBody Version version){
		Version v =versionService.find(id);
		v.setVersionName(version.getVersionName());
		versionService.save(v);
	}
}
