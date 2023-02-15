package com.xworkz.spring.classes;

import org.springframework.stereotype.Component;

@Component
public class Springstrbuild {
	
	
	public StringBuilder getString()
	{
		StringBuilder bd=new StringBuilder("banglore");
		System.out.println(bd.charAt(3));
		return bd;
	}
	
	public StringBuilder name()
	{
		StringBuilder bd=new StringBuilder("xworkz");
		
		System.out.println(bd.substring(3));
		return bd;
	}

}
