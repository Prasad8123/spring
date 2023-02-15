package com.xworkz.casino.configuartion;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		System.out.println("Running getRootConfigClasses for WebInit....");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		System.out.println("Running getServletConfigClasses for WebInit....");

		return new Class[]{SpringConfiguartion.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings for WebInit....");

		return null;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		
		System.out.println("Running configureDefaultServletHandling for WebInit....");
		configurer.enable();

		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}
}
