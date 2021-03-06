package com.jason.myzss.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MVCConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/teacher").setViewName("/teacher/index");
		registry.addViewController("/teacher/resource").setViewName("/teacher/resource/resourceIndex");
	
		
		registry.addViewController("/admin").setViewName("/admin/index");
		registry.addViewController("/admin/baseData").setViewName("/admin/baseData/baseDataIndex");
		registry.addViewController("/admin/document").setViewName("/admin/document/documentIndex");
		registry.addViewController("/admin/authority").setViewName("/admin/authority/index");
	
		
		registry.addViewController("/admin/baseData/subjectIndex").setViewName("/admin/baseData/subjectIndex");
		registry.addViewController("/admin/baseData/versionIndex").setViewName("/admin/baseData/versionIndex");
		registry.addViewController("/admin/baseData/textBookIndex").setViewName("/admin/baseData/textBookIndex");
		registry.addViewController("/admin/baseData/bookNodeIndex").setViewName("/admin/baseData/bookNodeIndex");
		
		
		registry.addViewController("/admin/authority/roleIndex").setViewName("/admin/authority/roleIndex");
		registry.addViewController("/admin/authority/userIndex").setViewName("/admin/authority/userIndex");
		registry.addViewController("/admin/authority/authorityIndex").setViewName("/admin/authority/authorityIndex");
		registry.addViewController("/admin/authority/userAddIndex").setViewName("/admin/authority/userAddIndex");
		registry.addViewController("/admin/authority/roleAuthorityIndex").setViewName("/admin/authority/roleAuthorityIndex");
	}
}
