package com.xworkz.bowser.configuartion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bowser.beans")
public class SpringConfig {
	
	public SpringConfig() {
		
		System.out.println("SpringConfig with no args....");

	}

}
