package com.xworkz.webmvc.component;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.webmvc.configuartion.SpringConfig;


public class WebMvcinit extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		System.out.println("running getRootConfigClasses for WebMvcConfigurer");

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		System.out.println("running getServletConfigClasses for WebMvcConfigurer");
		
		Class[] ref= {SpringConfig.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings for WebMvcConfigurer");

		return null;
	}
	
	
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		
		System.out.println("running configureDefaultServletHandling for WebMvcConfigurer");
	

		configurer.enable();
		
	}

}
