package com.xworkz.valentine.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ValentineWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		System.out.println("running getServletConfigClasses for ValentineWebInit..");
		return new Class[] {ValentineConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletConfigClasses for ValentineWebInit..");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		
		configurer.enable();
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}
	

}
