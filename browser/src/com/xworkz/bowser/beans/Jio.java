package com.xworkz.bowser.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {

	@Autowired
	@Qualifier("firefox")
	private Browser browser;
	@Override
	public void getProvider() {
		
		System.out.println("jio is a tele service provider");
		browser.getBrowser();
		
	}
	
	
	

}
