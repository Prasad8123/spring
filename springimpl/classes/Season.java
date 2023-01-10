package com.xworkz.spring.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	
	private String name;
	private String duration;
	private String startingMonth;
	
	public Season() {
		
		System.out.println("season created with spring");
		
	}
	
	@Value("Summer")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("3 months")
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Value("march")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public String getStartingMonth() {
		return startingMonth;
	}
}
