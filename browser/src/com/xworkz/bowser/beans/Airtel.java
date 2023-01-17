package com.xworkz.bowser.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider{

	@Autowired
	@Qualifier("chrome")
	public Browser browser;
	

	
	@Override
	public void getProvider() {
		System.out.println("Airtel is a tele services provider");
		browser.getBrowser();
	}
	
	

}
