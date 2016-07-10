package com.jason.myzss.web.admin.version;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.Version;
import com.jason.myzss.service.version.VersionService;

@RestController
@RequestMapping("/admin/version")
public class VersionController {
	
	@Autowired
	private VersionService versionService;

	@RequestMapping("/getVersion")
	public Iterable<Version> getVersionPage(@PageableDefault(size = 10) Pageable pageable){
		return versionService.findAll(pageable);
	}
}
