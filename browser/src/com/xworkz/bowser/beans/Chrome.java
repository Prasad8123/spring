package com.xworkz.bowser.beans;

import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser{

	
	@Override
	public void getBrowser() {
		
		System.out.println("chrome is a browser it is devloped by google");
		
		
	}
	
	

}
