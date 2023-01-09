package com.xworkz.spring.classes;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Springstrbuff {

	@Bean
	public StringBuffer getString()
	{
		
		StringBuffer br =new StringBuffer("Banglore");
		return br;
		   
	}
	
	@Bean
	public StringBuffer test()
	{
		StringBuffer br=new StringBuffer("hi");
		br.append(" good morning");
		return br;
	}
	
	
	public StringBuffer name()
	{
		StringBuffer br=new StringBuffer("orian mall");
		System.out.println("str length : " +br.length());
		return br;
	}
	
	public StringBuffer ref()
	{
		StringBuffer br=new StringBuffer("prasad");
		br.reverse();
		return br;
	}
	
	
}
