package com.xworkz.casino.configuartion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.casino")
public class SpringConfig {
	
	
	public SpringConfig() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}

}
