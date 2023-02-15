package com.xworkz.webmvc.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentClass {
	
	
	public ComponentClass() {
		
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
