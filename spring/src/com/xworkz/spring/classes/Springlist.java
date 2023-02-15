package com.xworkz.spring.classes;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Springlist {
	
	@Bean
	public void arrayList() {
		
		
		List<String> list= new ArrayList<String>();
		list.add("orian mall");
		list.add("GT mall");
		list.add("mantri mall");
		list.add("lulu mall");
		list.add("nexes mall");
	
		
		
		
		System.out.println(list.size());
		for(String str:list)
		{
			System.out.println(str);
			
		}
	}
	
	

}
