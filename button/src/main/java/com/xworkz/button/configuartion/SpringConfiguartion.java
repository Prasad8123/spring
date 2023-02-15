package com.xworkz.button.configuartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.button")
public class SpringConfiguartion {
	
	
	public SpringConfiguartion() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
		
	}
	
	    @Bean
        public ViewResolver viewResolver()
        {
        	InternalResourceViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
        	return resolver;
        }

}
