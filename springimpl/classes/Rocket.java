package com.xworkz.spring.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	@Value("PSLV mark-3")
	private String name;
	@Value("India")
	private String country;
	@Value("100")
	private double budget;
	
	
	
	public Rocket() {

		System.out.println("Rocket created by spring");
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public double getBudget() {
		return budget;
	}

	
}
