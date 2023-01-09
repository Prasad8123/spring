package com.xworkz.spring.classes;


import org.springframework.stereotype.Component;

@Component
public class SpringBoolean {
	
	
	public Boolean test()
	{
		System.out.println("banglore in karnataka");
		boolean isBangloreInKarnataka = true;
		return isBangloreInKarnataka;
		
	}
	
	public Boolean getString()
	{
		System.out.println("ballari is a hisatrical city");
	      return true;
	}
	
	
 public Boolean java()
 {
	 System.out.println("java is programing language");
	 return true;
 }
 
 public Boolean city()
 {
	 System.out.println("mumbai is a capital city of india");
	 return false;
 }
}
