package com.xworkz.bakery.configuartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan("com.xworkz.bakery")
public class SpringConfig {
	
	
	public SpringConfig() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}

}
