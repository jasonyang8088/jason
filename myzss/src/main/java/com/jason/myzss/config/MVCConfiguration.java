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
//		registry.addViewController("/admin/subject").setViewName("/admin/subject/index");
		
		registry.addViewController("/admin").setViewName("/admin/index");
		registry.addViewController("/admin/baseData").setViewName("/admin/baseData/baseDataIndex");
		registry.addViewController("/admin/document").setViewName("/admin/document/documentIndex");
	
		
		registry.addViewController("/admin/baseData/subjectIndex").setViewName("/admin/baseData/subjectIndex");
		registry.addViewController("/admin/baseData/versionIndex").setViewName("/admin/baseData/versionIndex");
		registry.addViewController("/admin/baseData/textBookIndex").setViewName("/admin/baseData/textBookIndex");
		registry.addViewController("/admin/baseData/bookNodeIndex").setViewName("/admin/baseData/bookNodeIndex");
	}
}
