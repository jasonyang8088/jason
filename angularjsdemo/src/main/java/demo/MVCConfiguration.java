package demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MVCConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/basic/jindu").setViewName("/basic/jindu");
		registry.addViewController("/basic/fenzukuang").setViewName("/basic/fenzukuang");
		registry.addViewController("/basic/tab").setViewName("/basic/tab");
		registry.addViewController("/basic/warning").setViewName("/basic/warning");
		registry.addViewController("/basic/h5basic").setViewName("/basic/h5basic");
	}
}
