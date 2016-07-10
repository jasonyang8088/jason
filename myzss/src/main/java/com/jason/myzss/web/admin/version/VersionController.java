package com.jason.myzss.web.admin.version;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.Version;
import com.jason.myzss.service.version.VersionService;

@RestController
@RequestMapping("/admin/version")
public class VersionController {

	@Autowired
	private VersionService versionService;

	@RequestMapping("/getVersionPage")
	public Page<Version> getVersionPage(
			@RequestParam("stage") Byte stage, 
			@RequestParam("subjectId") Long id,
			@RequestParam("number") Integer page) {
		Pageable pageable = new PageRequest(page, 10);
		if(stage!=0&&id==0)return versionService.findByStage(pageable, stage);
		if(id!=0)return versionService.findBySubjectId(pageable, id);
		return versionService.findAll(pageable);
	}

	@RequestMapping("/getVersion/{stage}")
	public Page<Version> getVersionPageByStage(@PageableDefault(size = 10) Pageable pageable,
			@PathVariable("stage") Byte stage) {
		return versionService.findByStage(pageable, stage);
	}

	@RequestMapping("/getVersion/")
	public Page<Version> getVersionPage(@PageableDefault(size = 10) Pageable pageable,
			@PathVariable("stage") Byte stage) {
		return versionService.findByStage(pageable, stage);
	}

}
