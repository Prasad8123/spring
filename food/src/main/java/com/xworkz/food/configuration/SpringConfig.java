package com.xworkz.food.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.food")
public class SpringConfig {
	
	public SpringConfig() {
		
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
