package com.xworkz.egg.configuartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.egg")
public class EggConfig {
	
	
	public EggConfig() {
		
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver()
	{
		System.out.println("running view resolver......");
		
		InternalResourceViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean()
	{
		System.out.println("running LocalContainerEntityManagerFactoryBean.....");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
