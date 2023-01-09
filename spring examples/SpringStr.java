package com.xworkz.spring.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringStr {

	
	
    @Bean
    
	public String city()
	{
		System.out.println("ballari as registered with spring");
		String str=new String();
		return str;
	}
	
	@Bean
    public String restorant()
    {
    	System.out.println("empaire rastorant is registered with spring");
    	String str=new String();
    	return str;
    }
@Bean
	public String theater()
	{
		System.out.println("navarang theater is registered with spring");
		String str=new String();
		return str;
		
	}
	@Bean
	public String movie()
	{
		System.out.println("kgf is registered with spring");
		String str=new String();
		return str;
		
	}
	
	@Bean
	public String application()
	{
		System.out.println("eclips is registered with spring");
		String str= new String();
		return str;
	}
}
