package com.xworkz.egg.configuartion;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EggApplicationWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		System.out.println("running getServletConfigClasses for EggApplicationWebInit");
		return new Class[] {EggConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings for EggApplicationWebInit");
		return new String[] {"/"};
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

	  configurer.enable();
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}
}
