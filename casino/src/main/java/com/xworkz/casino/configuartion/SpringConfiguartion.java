package com.xworkz.casino.configuartion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.casino")
public class SpringConfiguartion {
	
	
	public SpringConfiguartion() {
		
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
