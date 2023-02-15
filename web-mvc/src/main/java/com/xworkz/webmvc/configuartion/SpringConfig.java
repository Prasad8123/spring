package com.xworkz.webmvc.configuartion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.webmvc")
public class SpringConfig {
	
	
	public SpringConfig() {
		
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
