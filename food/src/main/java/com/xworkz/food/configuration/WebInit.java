package com.xworkz.food.configuration;

import java.util.Arrays;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		System.out.println("Running getRootConfigClasses for WebInit...");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses for WebInit...");
      
		Class[] configuartionClass= {SpringConfig.class};
		System.out.println("configuartionClass :"+Arrays.toString(configuartionClass));
		return configuartionClass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings for WebInit...");

		return new String[] {"/"};
	}
	
      @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    
  		System.out.println("Running getServletMappings for WebInit...");
         configurer.enable();	 
    }
}
