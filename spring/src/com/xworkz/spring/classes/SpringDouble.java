package com.xworkz.spring.classes;


import org.springframework.stereotype.Component;

@Component
public class SpringDouble {

	
	public Double rate()
	{
		System.out.println("rate is registered with spring");
		Double ref=new Double(12.6);
		return ref;
	}
	
	public Double dosa()
	{
		System.out.println("dosa is registered with spring");
		return 40.0;
	}
	
	public Double loptop()
	{
		System.out.println("loptop is registered with spring");
		return 50000.0;
	}
}
